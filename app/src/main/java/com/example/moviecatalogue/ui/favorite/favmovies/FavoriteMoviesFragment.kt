package com.example.moviecatalogue.ui.favorite.favmovies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moviecatalogue.databinding.FragmentMoviesBinding
import com.example.moviecatalogue.viewmodel.ViewModelFactory
import com.google.android.material.snackbar.Snackbar

class FavoriteMoviesFragment : Fragment() {
    private lateinit var fragmentFavMovieBinding: FragmentMoviesBinding
    private lateinit var favoriteMoviesAdapter: FavoriteMoviesAdapter
    private lateinit var viewModel: FavoriteMoviesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        fragmentFavMovieBinding = FragmentMoviesBinding.inflate(layoutInflater, container, false)
        return fragmentFavMovieBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {

            val factory = ViewModelFactory.getInstance(requireActivity())
            viewModel = ViewModelProvider(
                this, factory
            )[FavoriteMoviesViewModel::class.java]
            itemTouchHelper.attachToRecyclerView(fragmentFavMovieBinding.rvMovies)

            favoriteMoviesAdapter = FavoriteMoviesAdapter()

            fragmentFavMovieBinding.progressBar.visibility = View.VISIBLE
            viewModel.getFavoriteMovie().observe(viewLifecycleOwner, {
                fragmentFavMovieBinding.progressBar.visibility = View.GONE
                favoriteMoviesAdapter.submitList(it)
            })

            with(fragmentFavMovieBinding.rvMovies) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                this.adapter = favoriteMoviesAdapter
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
                val movieEntities = favoriteMoviesAdapter.getSwipedData(swipePosition)
                movieEntities?.let { viewModel.setFavorite(it) }
                val snackbar =
                    Snackbar.make(view as View, "Cancel deleting item?", Snackbar.LENGTH_LONG)
                snackbar.setAction("Yes") {
                    movieEntities?.let { viewModel.setFavorite(it) }
                }
                snackbar.show()
            }
        }
    })
}