package com.github.cagatayalt.splashandonboarding.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.cagatayalt.splashandonboarding.databinding.FragmentViewPagerBinding
import com.github.cagatayalt.splashandonboarding.onboarding.screens.OnboardingFirstScreen
import com.github.cagatayalt.splashandonboarding.onboarding.screens.OnboardingSecondScreen
import com.github.cagatayalt.splashandonboarding.onboarding.screens.OnboardingThirdScreen

class ViewPagerFragment : Fragment() {
    private var _binding: FragmentViewPagerBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentViewPagerBinding.inflate(inflater,container,false)
        val view = binding.root

        val fragmentList = arrayListOf<Fragment>(
            OnboardingFirstScreen(),
            OnboardingSecondScreen(),
            OnboardingThirdScreen()
        )
        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )
        binding.viewPager.adapter = adapter


        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}