package com.isc.appexamene.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.isc.appexamene.R
import com.isc.appexamene.databinding.FragmentHomeBinding
import com.isc.appexamene.viewmodel.CondominioViewModel

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null


    private lateinit var condominioViewModel: CondominioViewModel


    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        condominioViewModel =
            ViewModelProvider(this).get(condominioViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.floatingActionButton.setOnClickListener {
            findNavController().navigate(R.id.action_settings)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}