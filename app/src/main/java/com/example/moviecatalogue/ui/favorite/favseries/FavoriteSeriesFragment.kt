package com.example.moviecatalogue.ui.favorite.favseries

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moviecatalogue.databinding.FragmentSeriesBinding
import com.example.moviecatalogue.viewmodel.ViewModelFactory
import com.google.android.material.snackbar.Snackbar

class FavoriteSeriesFragment : Fragment() {
    private lateinit var fragmentFavSeriesBinding: FragmentSeriesBinding
    private lateinit var viewModel: FavoriteSeriesViewModel
    private lateinit var favoriteSeriesAdapter: FavoriteSeriesAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        fragmentFavSeriesBinding = FragmentSeriesBinding.inflate(layoutInflater, container, false)
        return fragmentFavSeriesBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        itemTouchHelper.attachToRecyclerView(fragmentFavSeriesBinding.rvSeries)
        if (activity != null) {

            val factory = ViewModelFactory.getInstance(requireActivity())
            viewModel = ViewModelProvider(
                this, factory
            )[FavoriteSeriesViewModel::class.java]

            favoriteSeriesAdapter = FavoriteSeriesAdapter()

            fragmentFavSeriesBinding.progressBar.visibility = View.VISIBLE
            viewModel.getFavoriteSeries().observe(viewLifecycleOwner, {
                fragmentFavSeriesBinding.progressBar.visibility = View.GONE
                favoriteSeriesAdapter.submitList(it)
            })

            with(fragmentFavSeriesBinding.rvSeries) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                this.adapter = favoriteSeriesAdapter
            }
        }
    }

    private val itemTouchHelper = ItemTouchHelper(object : ItemTouchHelper.Callback() {
        override fun getMovementFlags(
            recyclerView: RecyclerView,
            viewHolder: RecyclerView.ViewHolder
        ): Int =
            makeMovementFlags(0, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT)

        override fun onMove(
            recyclerView: RecyclerView,
            viewHolder: RecyclerView.ViewHolder,
            target: RecyclerView.ViewHolder
        ): Boolean = true

        override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
            if (view != null) {
                val swipePosition = viewHolder.absoluteAdapterPosition
                val seriesEntities = favoriteSeriesAdapter.getSwipedData(swipePosition)
                seriesEntities?.let { viewModel.setFavorite(it) }
                val snackbar =
                    Snackbar.make(view as View, "Cancel deleting item?", Snackbar.LENGTH_LONG)
                snackbar.setAction("Yes") {
                    seriesEntities?.let { viewModel.setFavorite(it) }
                }
                snackbar.show()
            }
        }
    })
}
