package com.simmonds.rachael.islandwrapsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.simmonds.rachael.islandwrapsapp.databinding.ActivityMainBinding

//class MenuItemAdapter(private var fragment: WrapFragment, private var mData: List<Items>)
   // : androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder>() {

//    private var _binding: FragmentMenuItemAdapterBinding? = null
//    private val binding get() = _binding!!
//
//    fun addAll(invoices: List<Items>) {
//        mData = invoices
//        notifyDataSetChanged()
//    }
//
//    inner class ViewHolder(itemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView)  {
//
//        var itemDescription: TextView
//        var itemName: TextView
//
//        init {
//            itemDescription = itemView.itemDescription
//            itemName = itemView.itemName
//        }
//    }
//
//    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//        val v: View
//        val vh: androidx.recyclerview.widget.RecyclerView.ViewHolder
//            v = LayoutInflater.from(viewGroup.context)
//                    .inflate(R.layout.fragment_wrap, viewGroup, false)
//            vh = ViewHolder(v)
//
//        return vh
//    }
//}