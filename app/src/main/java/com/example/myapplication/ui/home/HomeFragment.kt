package com.example.myapplication.ui.home

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.myapplication.R

class HomeFragment : Fragment(R.layout.fragment_home){

    private lateinit var amountEditText: EditText
    private lateinit var sendButton: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        amountEditText = view.findViewById(R.id.amountEditText)
        sendButton = view.findViewById(R.id.sendButton)

        val navController = Navigation.findNavController(view)

        sendButton.setOnClickListener {
            val amount = amountEditText.text.toString()

            if (amount.isEmpty()){
                return@setOnClickListener
            }

            val amount2 = amount.toInt()

            val action = HomeFragmentDirections.actionNavigationHomeToNavigationDashboard(amount2)

            navController.navigate(action)
        }

    }
}