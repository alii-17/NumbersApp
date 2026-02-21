package com.example.numbersapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.numbersapp.databinding.ItemNumberBinding

class NumbersAdapter(private val numbers: List<NumberModel>) :
    RecyclerView.Adapter<NumbersAdapter.NumberViewHolder>() {

    inner class NumberViewHolder(private val binding: ItemNumberBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(numberModel: NumberModel) {
            binding.number = numberModel
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        val binding = ItemNumberBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return NumberViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.bind(numbers[position])
    }

    override fun getItemCount(): Int = numbers.size
}
