package com.example.moviecatalogue.ui.series

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.moviecatalogue.R
import com.example.moviecatalogue.data.source.local.entity.SeriesEntity
import com.example.moviecatalogue.databinding.ListFilmBinding
import com.example.moviecatalogue.ui.detail.DetailSeriesActivity

class SeriesAdapter : PagedListAdapter<SeriesEntity, SeriesAdapter.ItemViewHolder>(DIFF_CALLBACK) {
    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<SeriesEntity>() {
            override fun areItemsTheSame(oldItem: SeriesEntity, newItem: SeriesEntity): Boolean {
                return oldItem.filmId == newItem.filmId
            }

            override fun areContentsTheSame(oldItem: SeriesEntity, newItem: SeriesEntity): Boolean {
                return oldItem == newItem
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemsSeriesBinding =
            ListFilmBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(itemsSeriesBinding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val series = getItem(position)
        if (series != null) {
            holder.bind(series)
        }
    }

    class ItemViewHolder(private val binding: ListFilmBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(series: SeriesEntity) {
            with(binding) {
                tvTitle.text = series.title
                tvStars.text = series.stars
                tvOverview.text = series.overview
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailSeriesActivity::class.java)
                    intent.putExtra(DetailSeriesActivity.EXTRA_SERIES, series.filmId)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load(series.image)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.img_loading)
                        .error(R.drawable.img_error))
                    .into(imgFilm)
            }
        }
    }
}