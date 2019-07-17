package com.example.youcantestme.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.youcantestme.R
import com.example.youcantestme.databinding.TestFragmentBinding

class TestFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Inflate the layout for this fragment
        val binding: TestFragmentBinding = DataBindingUtil.inflate(
            inflater, R.layout.test_fragment, container, false
        )
        return binding.root
    }
}