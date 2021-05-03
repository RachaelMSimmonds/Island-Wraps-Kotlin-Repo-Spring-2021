package com.simmonds.rachael.islandwrapsapp

import android.view.View
import android.widget.TextView

class MenuItemAdapter {
    inner class ViewHolder(itemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView)  {

        var itemDescription: TextView
        var itemName: TextView

        init {
            itemDescription = itemView.itemDescription
            itemName = itemView.itemName
        }
    }
}