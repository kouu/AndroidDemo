package jp.co.mantee.drawerapplication.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import jp.co.mantee.drawerapplication.databinding.RecycleItemBinding

class MyRecycleAdapter(
    private val list: List<ItemData>
) : RecyclerView.Adapter<MyRecycleAdapter.MyViewHolder>() {

    inner class MyViewHolder(private val binding: RecycleItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ItemData) {
            binding.titleText.text = item.title
            binding.subtitleText.text = item.subtitle
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = RecycleItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.count()
    }
}