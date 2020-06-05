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
import kotlinx.android.synthetic.main.fragment_homogenous_content.*

class HomogenousContentFragment : Fragment() {

    private val viewModel by viewModels<HomogenousContentViewModel>()

    private lateinit var viewPagerAdapter: HomogenousContentViewPagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_homogenous_content, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpViews()
        initObservers()
    }

    private fun setUpViews() {
        viewPagerAdapter = HomogenousContentViewPagerAdapter(QuoteDiffUtilItemCallback())
        viewPager.adapter = viewPagerAdapter

        // we use this instead of setUpWithViewpager() (as in viewpager v1)
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