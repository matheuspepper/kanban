package com.example.kanban.ui // (ou o nome do seu pacote, ex: com.example.kanban.ui)

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kanban.R
import com.example.kanban.databinding.FragmentSplashBinding // Ajuste se seu binding tiver outro nome

class SplashFragment : Fragment() {

    private var _binding: FragmentSplashBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Linha exata da Figura 64
        Handler(Looper.getMainLooper()).postDelayed({ checkAuth() }, 3000)
    }

    private fun checkAuth() {
        findNavController().navigate(R.id.action_fragment_splash_to_authentication)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}