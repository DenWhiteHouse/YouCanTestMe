package com.example.youcantestme.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.Observer
import com.example.youcantestme.R
import com.example.youcantestme.TestViewModel
import com.example.youcantestme.databinding.TestFragmentBinding
import java.util.*

class TestFragment : Fragment() {

    private lateinit var viewModel: TestViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Inflate the layout for this fragment
        val binding: TestFragmentBinding = DataBindingUtil.inflate(
            inflater, R.layout.test_fragment, container, false
        )

        // Get the viewmodel
        viewModel = ViewModelProviders.of(this).get(TestViewModel::class.java)
        binding.setLifecycleOwner(this)
        binding.viewModel = viewModel

        viewModel.onGetButtonPressedStatus.observe(this, Observer{hasBeenPressed ->
            if(hasBeenPressed){
                binding.numberTextView.setText(viewModel.stringList.get(1))
                viewModel.setGetButtonFalse()
            }

        })


        return binding.root
    }
}