package com.example.moviecatalogue.ui.detail

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.moviecatalogue.R
import com.example.moviecatalogue.data.source.local.entity.MovieEntity
import com.example.moviecatalogue.databinding.ActivityDetailMovieBinding
import com.example.moviecatalogue.viewmodel.ViewModelFactory
import com.example.moviecatalogue.vo.Status


class DetailMovieActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailMovieBinding
    private lateinit var viewModel: DetailFilmViewModel
    private var menu: Menu? = null

    companion object {
        const val EXTRA_MOVIE = "extra_movie"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.apply {
            title = "Detail Movie"
            setDisplayHomeAsUpEnabled(true)
        }

        val factory = ViewModelFactory.getInstance(this)
        viewModel = ViewModelProvider(
            this, factory
        )[DetailFilmViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val filmId = extras.getString(EXTRA_MOVIE)
            if (filmId != null) {

                binding.progressBar.visibility = View.VISIBLE

                viewModel.selectedMovie(filmId)
                viewModel.mMovie.observe(this, { moviesWithId ->
                    if (moviesWithId != null) {
                        when (moviesWithId.status) {
                            Status.LOADING -> binding.progressBar.visibility =
                                View.VISIBLE
                            Status.SUCCESS -> if (moviesWithId.data != null) {
                                binding.progressBar.visibility = View.GONE
                                populateMovie(moviesWithId.data.mMovies)
                            }
                            Status.ERROR -> {
                                binding.progressBar.visibility = View.GONE
                                Toast.makeText(
                                    applicationContext,
                                    "Error Loading Data",
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                        }
                    }
                })
            }
        }
    }

    private fun populateMovie(movieEntity: MovieEntity) {
        Glide.with(this)
            .load(movieEntity.image)
            .apply(
                RequestOptions.placeholderOf(R.drawable.img_loading)
                .error(R.drawable.img_error))
            .into(binding.imgMovies)

        binding.tvTitle.text = movieEntity.title
        binding.tvGenre.text = movieEntity.genre
        binding.tvStars.text = movieEntity.stars
        binding.tvRuntime.text = movieEntity.runtime
        binding.tvLanguage.text = movieEntity.oriLanguage
        binding.tvRelease.text = movieEntity.release
        binding.tvProduction.text = movieEntity.production
        binding.tvOverview.text = movieEntity.overview
        binding.tvDirector.text = movieEntity.director
        binding.tvWriter.text = movieEntity.writer
        binding.tvRating.text = movieEntity.rating

        Glide.with(this)
            .load(movieEntity.image1)
            .apply(RequestOptions.placeholderOf(R.drawable.img_loading)
                .error(R.drawable.img_error))
            .into(binding.img1)
        Glide.with(this)
            .load(movieEntity.image2)
            .apply(RequestOptions.placeholderOf(R.drawable.img_loading)
                .error(R.drawable.img_error))
            .into(binding.img2)
        Glide.with(this)
            .load(movieEntity.image3)
            .apply(RequestOptions.placeholderOf(R.drawable.img_loading)
                .error(R.drawable.img_error))
            .into(binding.img3)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.add_fav_bar, menu)
        this.menu = menu
        viewModel.mMovie.observe(this, { movies ->
            if (movies != null) {
                when (movies.status) {
                    Status.LOADING -> binding.progressBar.visibility =
                        View.VISIBLE
                    Status.SUCCESS -> if (movies.data != null) {
                        binding.progressBar.visibility = View.GONE
                        val state = movies.data.mMovies.favFilm
                        setFavoriteState(state)
                    }
                    Status.ERROR -> {
                        binding.progressBar.visibility = View.GONE
                        Toast.makeText(applicationContext, "Error Loading Data", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }
        })
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.click_favorite) {
            viewModel.getFavoriteMovie()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun setFavoriteState(state: Boolean) {
        if (menu == null) return
        val menuItem = menu?.findItem(R.id.click_favorite)
        if (state) {
            menuItem?.icon = ContextCompat.getDrawable(this, R.drawable.ic_baseline_star_yellow)
        } else {
            menuItem?.icon = ContextCompat.getDrawable(this, R.drawable.ic_baseline_star_outline_24)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}