package com.github.cagatayalt.splashandonboarding.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.github.cagatayalt.splashandonboarding.R
import kotlinx.android.synthetic.main.fragment_onboarding_first_screen.view.*


class OnboardingFirstScreen : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_onboarding_first_screen, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        view.onboarding1Btn.setOnClickListener {
            viewPager?.currentItem=1
        }

        return view

    }

}