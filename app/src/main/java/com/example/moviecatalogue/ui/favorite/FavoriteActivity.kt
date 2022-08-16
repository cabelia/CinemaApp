package com.example.moviecatalogue.ui.favorite

import android.os.Bundle
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.moviecatalogue.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class FavoriteActivity : AppCompatActivity() {

    companion object {
        @StringRes
        private val TAB_TITLE = intArrayOf(
            R.string.tab_movies,
            R.string.tab_series,
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite)

        val sectionPagerFavAdapter = SectionPagerFavAdapter(this)
        val viewPager: ViewPager2 = findViewById(R.id.view_pager_fav)
        viewPager.adapter = sectionPagerFavAdapter
        val tabs: TabLayout = findViewById(R.id.tabFav)
        TabLayoutMediator(tabs, viewPager) { tab, position ->
            tab.text = resources.getString(TAB_TITLE[position])
        }.attach()
    }
}
