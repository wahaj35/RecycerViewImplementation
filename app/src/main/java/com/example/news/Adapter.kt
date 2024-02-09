package com.example.news

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class Adapter(var pics: Array<Int>,var context: Activity) : RecyclerView.Adapter<Adapter.ViewHolder>() {



    class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        val headingText = itemView.findViewById<TextView>(R.id.headingText)
        val image = itemView.findViewById<ShapeableImageView>(R.id.image)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item ,parent,false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
            return 6
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      holder.image.setImageResource(pics[position])
    }


}