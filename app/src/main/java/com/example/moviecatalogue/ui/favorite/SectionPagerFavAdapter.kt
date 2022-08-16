package com.example.moviecatalogue.ui.favorite

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.moviecatalogue.ui.favorite.favmovies.FavoriteMoviesFragment
import com.example.moviecatalogue.ui.favorite.favseries.FavoriteSeriesFragment

class SectionPagerFavAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FavoriteMoviesFragment()
            1 -> FavoriteSeriesFragment()
            else -> Fragment()
        }
    }

    override fun getItemCount(): Int = 2
}
