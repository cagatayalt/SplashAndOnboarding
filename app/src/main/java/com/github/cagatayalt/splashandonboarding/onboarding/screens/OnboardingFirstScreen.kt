package com.github.cagatayalt.splashandonboarding.onboarding.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.github.cagatayalt.splashandonboarding.R
import com.github.cagatayalt.splashandonboarding.databinding.FragmentOnboardingFirstScreenBinding


class OnboardingFirstScreen : Fragment() {
    private var _binding : FragmentOnboardingFirstScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOnboardingFirstScreenBinding.inflate(inflater, container, false)
        val view = binding.root

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.onboarding1Btn.setOnClickListener {
            viewPager?.currentItem=1
        }

        return view

    }

}