package com.example.numbersapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.numbersapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val numbers = listOf(
            NumberModel("One",    "واحد",  R.drawable.number_one),
            NumberModel("Two",    "اثنان", R.drawable.number_two),
            NumberModel("Three",  "ثلاثة", R.drawable.number_three),
            NumberModel("Four",   "أربعة", R.drawable.number_four),
            NumberModel("Five",   "خمسة",  R.drawable.number_five),
            NumberModel("Six",    "ستة",   R.drawable.number_six),
            NumberModel("Seven",  "سبعة",  R.drawable.number_seven),
            NumberModel("Eight",  "ثمانية",R.drawable.number_eight),
            NumberModel("Nine",   "تسعة",  R.drawable.number_nine),
            NumberModel("Ten",    "عشرة",  R.drawable.number_ten)
        )

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = NumbersAdapter(numbers)
        }
    }
}
