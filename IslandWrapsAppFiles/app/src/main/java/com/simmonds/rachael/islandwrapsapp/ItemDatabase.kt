package com.simmonds.rachael.islandwrapsapp

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import android.content.Context
import android.content.res.Resources
import com.french.bryan.roomdemo.dao.CustomerDao
import com.french.bryan.roomdemo.dao.ItemDao
import com.french.bryan.roomdemo.entities.Customer
import com.simmonds.rachael.islandwrapsapp.entities.Invoice
import kotlinx.coroutines.CoroutineScope

@Database(entities = [(Customer::class), (Invoice::class)],
        version = 1, exportSchema = false)
abstract class ItemDatabase : RoomDatabase() {

    abstract fun customerDao(): CustomerDao

    abstract fun invoiceDao(): ItemDao

    companion object {

        @Volatile
        private var INSTANCE: ItemDatabase? = null

        fun getInstance(context: Context, coroutineScope: CoroutineScope, resources: Resources): ItemDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }

            synchronized(this) {
                val instance = Room.databaseBuilder(context.applicationContext,
                        ItemDatabase::class.java,
                        "customer.db")
                        .fallbackToDestructiveMigration()
                        .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}
