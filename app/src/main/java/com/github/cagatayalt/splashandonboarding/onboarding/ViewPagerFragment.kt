package com.github.cagatayalt.splashandonboarding.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.cagatayalt.splashandonboarding.R
import com.github.cagatayalt.splashandonboarding.onboarding.screens.OnboardingFirstScreen
import com.github.cagatayalt.splashandonboarding.onboarding.screens.OnboardingSecondScreen
import com.github.cagatayalt.splashandonboarding.onboarding.screens.OnboardingThirdScreen
import kotlinx.android.synthetic.main.fragment_view_pager.view.*

class ViewPagerFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)
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

        view.viewPager.adapter = adapter

        return view
    }

}