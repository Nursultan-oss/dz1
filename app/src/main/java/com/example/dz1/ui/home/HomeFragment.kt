package com.example.dz1.ui.home

import android.R
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageSwitcher
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.dz1.databinding.FragmentHomeBinding
import java.time.temporal.TemporalAdjusters.previous


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    lateinit var select: Button
    var previous:android.widget.Button? = null
    var next:android.widget.Button? = null
    var imageView: ImageSwitcher? = null
    var PICK_IMAGE_MULTIPLE = 1
    var imageEncoded: String? = null
    var total: TextView? = null
    var mArrayUri: ArrayList<Uri>? = null
    var position = 0
    var imagesEncodedList: kotlin.collections.List<String>? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root








    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}