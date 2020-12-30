package com.example.tombenkemounandroidkotlin.presentation.Main

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.example.tombenkemounandroidkotlin.R
import com.example.tombenkemounandroidkotlin.domain.entity.PokemonResponse
import com.example.tombenkemounandroidkotlin.presentation.Main.AdapterList.ViewHolder
import com.squareup.picasso.Picasso

class AdapterList(
    Dataset: List<PokemonResponse>
) : RecyclerView.Adapter<AdapterList.ViewHolder>(){
    private val values = Dataset

    class ViewHolder(
        layout: View
    ): RecyclerView.ViewHolder(layout) {
        var Header: TextView = layout.findViewById<View>(R.id.Line1) as TextView
        var Footer: TextView = layout.findViewById<View>(R.id.Line2) as TextView


    }
    @NonNull
    @Override
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        val v: View = inflater.inflate(R.layout.layout, parent, false)
        return ViewHolder(v)
    }

    @SuppressLint("")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentCharacter: PokemonResponse = values?.get(position)
        if (currentCharacter != null){
            holder.Header.text = currentCharacter.name
            holder.Footer.text =  currentCharacter.id + " de Type :"+ currentCharacter.type

        }
    }

    override fun getItemCount(): Int {
        return values.size
    }
}