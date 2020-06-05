package com.example.bottombarandtablayoutexample.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.bottombarandtablayoutexample.fragment.FirstFragment
import com.example.bottombarandtablayoutexample.fragment.FourthFragment
import com.example.bottombarandtablayoutexample.fragment.SecondFragment
import com.example.bottombarandtablayoutexample.fragment.ThirdFragment
import java.lang.NullPointerException

class HeterogenousContentViewPagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {

    companion object {
        private const val NUM_PAGES = 4
    }

    override fun getItemCount(): Int = NUM_PAGES

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            2 -> ThirdFragment()
            3 -> FourthFragment()
            else -> throw NullPointerException("Invalid position has been requested.")
        }
    }
}