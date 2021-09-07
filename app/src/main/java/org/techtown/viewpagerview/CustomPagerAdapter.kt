package org.techtown.viewpagerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.techtown.viewpagerview.databinding.ItemViewpagerBinding

class CustomPagerAdapter:RecyclerView.Adapter<Holder>() {
    var textList = listOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
      val binding = ItemViewpagerBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return Holder(binding)
    }

    override fun getItemCount(): Int {
        return textList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val text = textList[position]
        holder.setText(text)
    }
}


class Holder(val binding: ItemViewpagerBinding):RecyclerView.ViewHolder(binding.root)
{//홀더에서 binding파라미터를 전역변수로 사용하기 위해서 앞에 val 키워드를 사용하는 것을 꼭 기억해라.
    fun setText(text:String){
        binding.textView.text = text
    }

}
