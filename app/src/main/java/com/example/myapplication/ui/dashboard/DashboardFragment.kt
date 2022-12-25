package com.example.myapplication.ui.dashboard

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class DashboardFragment : Fragment(R.layout.fragment_dashboard){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.amountTextView).text =
            DashboardFragmentArgs.fromBundle(requireArguments()).amount.toString()

    }
}