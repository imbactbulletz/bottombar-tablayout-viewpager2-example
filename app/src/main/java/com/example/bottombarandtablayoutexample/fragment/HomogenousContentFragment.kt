package com.example.bottombarandtablayoutexample.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import com.example.bottombarandtablayoutexample.R
import com.example.bottombarandtablayoutexample.adapter.HomogenousContentViewPagerAdapter
import com.example.bottombarandtablayoutexample.adapter.diffutil.QuoteDiffUtilItemCallback
import com.example.bottombarandtablayoutexample.viewmodel.HomogenousContentViewModel
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_tab_layout.*

class HomogenousContentFragment : Fragment(R.layout.fragment_tab_layout) {

    private val viewModel by viewModels<HomogenousContentViewModel>()

    private lateinit var viewPagerAdapter: HomogenousContentViewPagerAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpViews()
        initObservers()
    }

    private fun setUpViews() {
        viewPagerAdapter = HomogenousContentViewPagerAdapter(QuoteDiffUtilItemCallback())
        viewPager.adapter = viewPagerAdapter

        // we use this instead of setUpWithViewpager() like we used to in viewpager v1
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = position.toString()
        }.attach()
    }

    private fun initObservers() {
        viewModel.getQuotesList().observe(viewLifecycleOwner) {
            viewPagerAdapter.submitList(it)
        }
    }
}