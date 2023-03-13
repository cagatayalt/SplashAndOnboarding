package com.github.cagatayalt.splashandonboarding.onboarding.screens

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.github.cagatayalt.splashandonboarding.R
import com.github.cagatayalt.splashandonboarding.databinding.FragmentOnboardingThirdScreenBinding

class OnboardingThirdScreen : Fragment() {
    private var _binding: FragmentOnboardingThirdScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOnboardingThirdScreenBinding.inflate(inflater, container, false)
        val view = binding.root

        initClickListeners()

        return view
    }


    private fun onBoardingFinished() {
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished",true)
        editor.apply()
    }

    private fun initClickListeners() {
        binding.onboarding3Btn.setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerFragment_to_homeFragment)
            onBoardingFinished()
        }
    }

}