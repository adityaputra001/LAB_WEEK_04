package com.example.lab_week_04

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class CafeAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    // Titles for each tab
    private val TABS_FIXED = listOf(
        R.string.starbucks_title,
        R.string.janjijiwa_title,
        R.string.kopikenangan_title,
    )

    // Matching descriptions for each cafe
    private val DESCRIPTIONS = listOf(
        R.string.starbucks_desc,
        R.string.janjijiwa_desc,
        R.string.kopikenangan_desc,
    )

    override fun getItemCount(): Int = TABS_FIXED.size

    override fun createFragment(position: Int): Fragment {
        // Pass the description resource ID instead of hardcoding text
        return CafeDetailFragment.newInstance(
            getDescriptionResId(position)
        )
    }

    fun getTabTitle(position: Int): Int = TABS_FIXED[position]

    fun getDescriptionResId(position: Int): Int = DESCRIPTIONS[position]
}
