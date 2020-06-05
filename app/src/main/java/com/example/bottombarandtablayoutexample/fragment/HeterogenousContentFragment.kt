package com.example.bottombarandtablayoutexample.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.bottombarandtablayoutexample.R
import com.example.bottombarandtablayoutexample.adapter.HeterogenousContentViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_tab_layout.*

class FirstFragment : Fragment(R.layout.fragment_first)
class SecondFragment : Fragment(R.layout.fragment_second)
class ThirdFragment : Fragment(R.layout.fragment_third)
class FourthFragment : Fragment(R.layout.fragment_fourth)

class HeterogenousContentFragment : Fragment(R.layout.fragment_tab_layout) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpViews()
    }

    private fun setUpViews() {
        activity?.let { safeActivity ->
            viewPager.adapter = HeterogenousContentViewPagerAdapter(safeActivity)
        }

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = when (position) {
                0 -> "First"
                1 -> "Second"
                2 -> "Third"
                3 -> "Fourth"
                else -> "Blank"
            }
        }.attach()
    }
}