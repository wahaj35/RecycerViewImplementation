package com.example.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.news.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView :RecyclerView
    lateinit var newsArrayList: ArrayList<News>
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
         recyclerView = binding.RecyclerView
        val pics = arrayOf<Int>(R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6,
        )
        val newsHeading = arrayOf("This is news1", "This is news2" ,"This is news3" ,"This is news4","This is news5","This is news6")
        recyclerView = binding.RecyclerView
         recyclerView.layoutManager = LinearLayoutManager(this)
        newsArrayList = arrayListOf<News>()
//        for(index in newsHeading.indices){
//            val news = News(newsHeading[index],pics[index])
//            newsArrayList.add(news)
//        }
        val adapter = Adapter(pics,this)
        recyclerView.adapter = adapter
        recyclerView.setOnClickListener { Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show() }
    }
}