package com.example.fragment_practice

import android.os.Bundle
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
        Toast.makeText(requireContext(), "onCreate Called", Toast.LENGTH_SHORT).show()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FirstFragmentXmlBinding.inflate(inflater, container, false)
        Toast.makeText(requireContext(), "onCreateView Called", Toast.LENGTH_SHORT).show()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(requireContext(), "onViewCreated Called", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(requireContext(), "onStart Called", Toast.LENGTH_SHORT).show()
    }
    override fun onResume() {
        super.onResume()
        Toast.makeText(requireContext(), "onResume Called", Toast.LENGTH_SHORT).show()
    }
}






//
//class FirstFragment : Fragment() {
//
//    private lateinit var binding: FirstFragmentXmlBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        Toast.makeText(requireContext(), "onCreate Called", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        binding = FirstFragmentXmlBinding.inflate(inflater, container, false)
//        Toast.makeText(requireContext(), "onCreateView Called", Toast.LENGTH_SHORT).show()
//        return binding.root
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        Toast.makeText(requireContext(), "onViewCreated Called", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onStart() {
//        super.onStart()
//        Toast.makeText(requireContext(), "onStart Called", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Toast.makeText(requireContext(), "onResume Called", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Toast.makeText(requireContext(), "onPause Called", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Toast.makeText(requireContext(), "onStop Called", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        Toast.makeText(requireContext(), "onDestroyView Called", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Toast.makeText(requireContext(), "onDestroy Called", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onDetach() {
//        super.onDetach()
//        Toast.makeText(requireContext(), "onDetach Called", Toast.LENGTH_SHORT).show()
//    }
//}
