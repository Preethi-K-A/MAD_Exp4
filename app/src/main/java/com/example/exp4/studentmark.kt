package com.example.exp4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment

class MarkDetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_stud_mark_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sslcEditText = view.findViewById<EditText>(R.id.editTextSSLC)
        val hscEditText = view.findViewById<EditText>(R.id.editTextHSC)
        val ugEditText = view.findViewById<EditText>(R.id.editTextUG)

    }
}