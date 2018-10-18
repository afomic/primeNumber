package afomic.com.firsttenprime.adapters

import afomic.com.firsttenprime.R
import afomic.com.firsttenprime.helpers.PrimeHelper
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class PrimeNumberAdapter(val context: Context) : RecyclerView.Adapter<PrimeNumberAdapter.PrimeNumberViewHolder>() {
    private val primeList = PrimeHelper.getFirstTenPrimeNumber();

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): PrimeNumberViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_prime_multiples, p0, false);
        return PrimeNumberViewHolder(view)
    }

    override fun getItemCount() = primeList.size

    override fun onBindViewHolder(p0: PrimeNumberViewHolder, p1: Int) {
        p0.bind(primeList[p1])
    }

    class PrimeNumberViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val primeNumberTextView: TextView = itemView.findViewById(R.id.tv_prime_number)
        val multipleOneTextView: TextView = itemView.findViewById(R.id.tv_multiple_1)
        val multipleTwoTextView: TextView = itemView.findViewById(R.id.tv_multiple_2)
        val multipleThreeTextView: TextView = itemView.findViewById(R.id.tv_multiple_3)
        val multipleFourTextView: TextView = itemView.findViewById(R.id.tv_multiple_4)
        val multipleFiveTextView: TextView = itemView.findViewById(R.id.tv_multiple_5)
        val multipleSixTextView: TextView = itemView.findViewById(R.id.tv_multiple_6)
        val multipleSevenTextView: TextView = itemView.findViewById(R.id.tv_multiple_7)
        val multipleEightTextView: TextView = itemView.findViewById(R.id.tv_multiple_8)
        val multipleNineTextView: TextView = itemView.findViewById(R.id.tv_multiple_9)
        val multipleTenTextView: TextView = itemView.findViewById(R.id.tv_multiple_10)
        fun bind(prime: Int) {
            val multipleList = PrimeHelper.getPrimeMultiple(prime)
            primeNumberTextView.text = prime.toString()
            multipleOneTextView.text = multipleList[0].toString()
            multipleTwoTextView.text = multipleList[1].toString()
            multipleThreeTextView.text = multipleList[2].toString()
            multipleFourTextView.text = multipleList[3].toString()
            multipleFiveTextView.text = multipleList[4].toString()
            multipleSixTextView.text = multipleList[5].toString()
            multipleSevenTextView.text = multipleList[6].toString()
            multipleEightTextView.text = multipleList[7].toString()
            multipleNineTextView.text = multipleList[8].toString()
            multipleTenTextView.text = multipleList[9].toString()
        }
    }
}