package com.example.youcantestme.fragments

import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("text")
fun setText(textView: TextView, text: String) {
    textView.setText(text)
}
