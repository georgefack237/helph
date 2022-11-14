package com.health13.helps.presentation.onboarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.health13.helps.R
import com.health13.helps.presentation.adapters.ViewPagerAdapter
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator

class OnBoardingActivity : AppCompatActivity() {
    lateinit var viewPager: ViewPager
    lateinit var  nextPageBtn: Button
    lateinit var  skip: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)


        nextPageBtn = findViewById(R.id.nextPage)
        val previousPage: ImageView = findViewById(R.id.previousPage)


        val dotsIndicator: SpringDotsIndicator = findViewById(R.id.dots_indicator)

        viewPager = findViewById(R.id.viewPager)
        val adapter = ViewPagerAdapter(supportFragmentManager)
        viewPager.adapter =  adapter

        dotsIndicator.attachTo(viewPager)



        previousPage.setOnClickListener {
            movePreviousTopSlideShow()
        }


        nextPageBtn.setOnClickListener {
            moveNextTopSlideShow(it)
        }
    }

    private fun moveNextTopSlideShow(view: View) {
        if (viewPager.currentItem == viewPager.childCount) {

            if (viewPager.childCount > 0) {
                viewPager.setCurrentItem(0, true)
            }
        } else {
            //it doesn't matter if you're already in the last item
            viewPager.setCurrentItem(viewPager.currentItem + 1, true)
        }
    }


    private fun movePreviousTopSlideShow() {
        viewPager.setCurrentItem(viewPager.currentItem - 1, true)
    }
}