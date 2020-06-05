package com.example.bottombarandtablayoutexample.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.bottombarandtablayoutexample.R
import com.example.bottombarandtablayoutexample.fragment.HeterogenousContentFragment
import com.example.bottombarandtablayoutexample.fragment.HomogenousContentFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        setUpBottomBar()
    }

    private fun setUpBottomBar() {
        bottomBar.onItemSelected = { position ->
            when (position) {
                0 -> displayFragment(HomogenousContentFragment())
                1 -> displayFragment(HeterogenousContentFragment())
            }
        }

        bottomBar.onItemSelected?.invoke(0)
    }

    private fun displayFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainerView, fragment)
        transaction.commit()
    }
}