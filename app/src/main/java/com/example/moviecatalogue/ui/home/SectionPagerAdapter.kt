package com.example.moviecatalogue.ui.home

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.moviecatalogue.ui.movies.MoviesFragment
import com.example.moviecatalogue.ui.series.SeriesFragment

class SectionsPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> MoviesFragment()
            1 -> SeriesFragment()
            else -> Fragment()
        }
    }
    override fun getItemCount(): Int = 2
}