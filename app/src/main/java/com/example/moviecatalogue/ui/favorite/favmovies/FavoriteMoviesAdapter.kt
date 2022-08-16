package com.example.moviecatalogue.ui.favorite.favmovies

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.moviecatalogue.R
import com.example.moviecatalogue.data.source.local.entity.MovieEntity
import com.example.moviecatalogue.databinding.ListFilmBinding
import com.example.moviecatalogue.ui.detail.DetailMovieActivity

class FavoriteMoviesAdapter :
    PagedListAdapter<MovieEntity, FavoriteMoviesAdapter.ItemViewHolder>(DIFF_CALLBACK) {

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<MovieEntity>() {
            override fun areItemsTheSame(oldItem: MovieEntity, newItem: MovieEntity): Boolean {
                return oldItem.filmId == newItem.filmId
            }

            override fun areContentsTheSame(oldItem: MovieEntity, newItem: MovieEntity): Boolean {
                return oldItem == newItem
            }
        }
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val favMovie = getItem(position)
        if (favMovie != null) {
            holder.bind(favMovie)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ItemViewHolder {
        val itemFavMovieBinding =
            ListFilmBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(itemFavMovieBinding)
    }

    fun getSwipedData(swipedPosition: Int): MovieEntity? = getItem(swipedPosition)

    class ItemViewHolder(private val binding: ListFilmBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(favMovie: MovieEntity) {
            with(binding) {
                tvTitle.text = favMovie.title
                tvStars.text = favMovie.stars
                tvOverview.text = favMovie.overview
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailMovieActivity::class.java)
                    intent.putExtra(DetailMovieActivity.EXTRA_MOVIE, favMovie.filmId)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load(favMovie.image)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.img_loading)
                        .error(R.drawable.img_error))
                    .into(imgFilm)

            }
        }
    }
}