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
import com.example.moviecatalogue.data.source.local.entity.SeriesEntity
import com.example.moviecatalogue.databinding.ActivityDetailSeriesBinding
import com.example.moviecatalogue.viewmodel.ViewModelFactory
import com.example.moviecatalogue.vo.Status

class DetailSeriesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailSeriesBinding
    private lateinit var viewModel: DetailFilmViewModel
    private var menu: Menu? = null

    companion object {
        const val EXTRA_SERIES = "extra_series"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailSeriesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.apply {
            title = "Detail Series"
            setDisplayHomeAsUpEnabled(true)
        }

        val factory = ViewModelFactory.getInstance(this)
        viewModel = ViewModelProvider(
            this, factory
        )[DetailFilmViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val filmId = extras.getString(EXTRA_SERIES)
            if (filmId != null) {

                binding.progressBar.visibility = View.VISIBLE

                viewModel.selectedSeries(filmId)
                viewModel.mSeries.observe(this, { seriesWithId ->
                    if (seriesWithId != null) {
                        when (seriesWithId.status) {
                            Status.LOADING -> binding.progressBar.visibility =
                                View.VISIBLE
                            Status.SUCCESS -> if (seriesWithId.data != null) {
                                binding.progressBar.visibility = View.GONE
                                populateSeries(seriesWithId.data.mSeries)
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

    private fun populateSeries(seriesEntity: SeriesEntity) {
        Glide.with(this)
            .load(seriesEntity.image)
            .apply(
                RequestOptions.placeholderOf(R.drawable.img_loading)
                .error(R.drawable.img_error))
            .into(binding.imgSeries)

        binding.tvTitle.text = seriesEntity.title
        binding.tvGenre.text = seriesEntity.genre
        binding.tvStars.text = seriesEntity.stars
        binding.tvEpisodes.text = seriesEntity.episode
        binding.tvLanguage.text = seriesEntity.oriLanguage
        binding.tvRelease.text = seriesEntity.release
        binding.tvProduction.text = seriesEntity.production
        binding.tvOverview.text = seriesEntity.overview
        binding.tvProducer.text = seriesEntity.producers

        Glide.with(this)
            .load(seriesEntity.image1)
            .apply(RequestOptions.placeholderOf(R.drawable.img_loading)
                .error(R.drawable.img_error))
            .into(binding.img1)
        Glide.with(this)
            .load(seriesEntity.image2)
            .apply(RequestOptions.placeholderOf(R.drawable.img_loading)
                .error(R.drawable.img_error))
            .into(binding.img2)
        Glide.with(this)
            .load(seriesEntity.image3)
            .apply(RequestOptions.placeholderOf(R.drawable.img_loading)
                .error(R.drawable.img_error))
            .into(binding.img3)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.add_fav_bar, menu)
        this.menu = menu
        viewModel.mSeries.observe(this, { series ->
            if (series != null) {
                when (series.status) {
                    Status.LOADING -> binding.progressBar.visibility =
                        View.VISIBLE
                    Status.SUCCESS -> if (series.data != null) {
                        binding.progressBar.visibility = View.GONE
                        val state = series.data.mSeries.favFilm
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
            viewModel.getFavoriteSeries()
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
