package com.example.bottombarandtablayoutexample.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bottombarandtablayoutexample.R
import com.example.bottombarandtablayoutexample.fragment.HomogenousContentFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        initFragment()
    }

    private fun initFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frameContainerView, HomogenousContentFragment())
        transaction.commit()
    }
}