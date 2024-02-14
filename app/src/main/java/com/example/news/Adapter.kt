package com.example.news

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class Adapter(var pics: Array<Int>,var context: Activity) : RecyclerView.Adapter<Adapter.ViewHolder>() {
private lateinit var clicklistener: OnItemClickListener
interface OnItemClickListener {
    fun itemClickListener(position: Int);
}
    fun itemClickListener(listener: OnItemClickListener){
     clicklistener = listener
    }

    class ViewHolder (itemView: View,clickListener: OnItemClickListener): RecyclerView.ViewHolder(itemView){
        val headingText = itemView.findViewById<TextView>(R.id.headingText)
        val image = itemView.findViewById<ShapeableImageView>(R.id.image)
        init {
            itemView.setOnClickListener{
                clickListener.itemClickListener(adapterPosition)
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item ,parent,false)
        return ViewHolder(itemView,clicklistener)
    }

    override fun getItemCount(): Int {
            return 6
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      holder.image.setImageResource(pics[position])
    }


}