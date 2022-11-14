package com.health13.helps.presentation.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.health13.helps.presentation.onboarding.OnBoarding1
import com.health13.helps.presentation.onboarding.OnBoarding2
import com.health13.helps.presentation.onboarding.OnBoarding3

class ViewPagerAdapter(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager) {


    private val fragments = listOf(
        OnBoarding1(),
        OnBoarding2(),
        OnBoarding3()
    )
    override fun getCount() = fragments.size

    override fun getItem(position: Int): Fragment {
       return  fragments[position]
    }
}