package com.kir.test.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.kir.test.R
import com.kir.test.presentation.news.NewsAdapter

class NewsActivity : AppCompatActivity() {

    private val viewModel = NewsViewModel()
    private val recyclerView by lazy { findViewById<RecyclerView>(R.id.recycler) }
    private val megaButton by lazy { findViewById<FloatingActionButton>(R.id.megaButton) }
    private val adapter by lazy { NewsAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
    }

    override fun onStart() {
        super.onStart()
        initViews()
        initObservers()
    }

    private fun initViews() {
        recyclerView.adapter = adapter

        megaButton.setOnClickListener {
            viewModel.onMegaButtonClicked()
        }
    }

    private fun initObservers() {
        viewModel.news.observe(this) { items ->
            adapter.submitList(items)
        }
    }
}