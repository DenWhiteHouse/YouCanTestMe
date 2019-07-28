package com.example.youcantestme

import com.example.youcantestme.data.TestRepoInterface
import com.example.youcantestme.data.TestRepository
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    // MyViewModel ViewModel
    viewModel { TestViewModel() }
}