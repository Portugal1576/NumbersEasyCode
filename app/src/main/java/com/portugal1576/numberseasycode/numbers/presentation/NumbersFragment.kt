package com.portugal1576.numberseasycode.numbers.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.portugal1576.numberseasycode.R
import com.portugal1576.numberseasycode.databinding.FragmentNumbersBinding


class NumbersFragment : Fragment() {

    private lateinit var binding: FragmentNumbersBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNumbersBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.progressBar.visibility = View.GONE
        binding.getFactButton.setOnClickListener {
//            TODO
        }
    }
}