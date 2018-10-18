package afomic.com.firsttenprime

import afomic.com.firsttenprime.adapters.PrimeNumberAdapter
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var primeNumberTable: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        primeNumberTable = findViewById(R.id.rv_multiplication_table)
        setUpView()
    }

    private fun setUpView() {
        val adapter = PrimeNumberAdapter(this@MainActivity)
        primeNumberTable.layoutManager = LinearLayoutManager(this@MainActivity)
        primeNumberTable.adapter = adapter
    }
}
