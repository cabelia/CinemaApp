package com.example.moviecatalogue.ui.series

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviecatalogue.databinding.FragmentSeriesBinding
import com.example.moviecatalogue.viewmodel.ViewModelFactory
import com.example.moviecatalogue.vo.Status


class SeriesFragment : Fragment() {
    private lateinit var fragmentSeriesBinding: FragmentSeriesBinding
    private lateinit var viewModel: SeriesViewModel
    private lateinit var seriesAdapter: SeriesAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentSeriesBinding = FragmentSeriesBinding.inflate(layoutInflater, container, false)
        return fragmentSeriesBinding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {

            val factory = ViewModelFactory.getInstance(requireActivity())
            viewModel = ViewModelProvider(
                this, factory
            )[SeriesViewModel::class.java]

            seriesAdapter = SeriesAdapter()

            fragmentSeriesBinding.progressBar.visibility = View.VISIBLE
            viewModel.getSeries().observe(viewLifecycleOwner, {
               if (it != null){
                   when(it.status){
                       Status.LOADING -> fragmentSeriesBinding.progressBar.visibility = View.VISIBLE
                       Status.SUCCESS -> {
                           fragmentSeriesBinding.progressBar.visibility = View.GONE
                           seriesAdapter.submitList(it.data)
                       }
                       Status.ERROR -> {
                           fragmentSeriesBinding.progressBar.visibility = View.GONE
                           Toast.makeText(context, "Error Loading Data", Toast.LENGTH_SHORT).show()
                       }
                   }
               }
            })

            with(fragmentSeriesBinding.rvSeries) {
                this.layoutManager = LinearLayoutManager(context)
                this.setHasFixedSize(true)
                this.adapter = seriesAdapter

            }
        }
    }
}
