package com.example.pj4test.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pj4test.databinding.SuccessBinding

class SuccessFragment: Fragment() {
    private var _successBinding: SuccessBinding? = null

    private val successBinding
        get() = _successBinding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _successBinding = SuccessBinding.inflate(inflater, container, false)

        return successBinding.root
    }
}