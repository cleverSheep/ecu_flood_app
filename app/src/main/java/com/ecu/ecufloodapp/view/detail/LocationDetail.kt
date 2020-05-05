package com.ecu.testingmap.view.detail

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.ui.setupWithNavController
import com.ecu.ecufloodapp.R

class LocationDetail : Fragment() {

    companion object {
        fun newInstance() = LocationDetail()
    }

    private lateinit var viewModel: LocationDetailViewModel
    private val args: LocationDetailArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.location_detail_fragment, container, false)
        val toolbar = view.findViewById<Toolbar>(R.id.toolbar_detail)
        toolbar.title = args.sensorName
        toolbar.setupWithNavController(findNavController())
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(LocationDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
