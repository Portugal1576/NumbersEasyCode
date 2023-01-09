package com.portugal1576.numberseasycode.main.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.portugal1576.numberseasycode.R
import com.portugal1576.numberseasycode.databinding.ActivityMainBinding
import com.portugal1576.numberseasycode.numbers.presentation.NumbersFragment
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, NumbersFragment())
            .commit()
    }
}