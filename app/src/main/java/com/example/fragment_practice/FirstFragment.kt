package com.example.fragment_practice

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragment_practice.databinding.FirstFragmentXmlBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FirstFragmentXmlBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Log404", "onCreate Called")
        // Toast.makeText(requireContext(), "onCreate Called", Toast.LENGTH_SHORT).show()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FirstFragmentXmlBinding.inflate(inflater, container, false)
        Log.d("Log404", "onCreateView Called")
        //Toast.makeText(requireContext(), "onCreateView Called", Toast.LENGTH_SHORT).show()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Log404", "onViewCreated Called")
        // Toast.makeText(requireContext(), "onViewCreated Called", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d("Log404", "onStart Called")
        // Toast.makeText(requireContext(), "onStart Called", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("Log404", "onResume Called")
        //Toast.makeText(requireContext(), "onResume Called", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("Log404", "onPause Called")
        // Toast.makeText(requireContext(), "onPause Called", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("Log404", "onStop Called")
        // Toast.makeText(requireContext(), "onStop Called", Toast.LENGTH_SHORT).show()
    }


}
