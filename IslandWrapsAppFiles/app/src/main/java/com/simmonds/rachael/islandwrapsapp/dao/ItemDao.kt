package com.french.bryan.roomdemo.dao

//import androidx.room.*
//import com.french.bryan.roomdemo.entities.Invoice

//@Dao
//interface ItemDao :BaseDao<Invoice> {
//
//    @Query("SELECT * FROM invoiceData")
//    suspend fun getAll(): List<Invoice>
//
//    @Query("SELECT * FROM invoiceData WHERE invoiceNum IN (:invoiceNums)")
//    suspend fun loadAllByIds(invoiceNums: Array<Int>): List<Invoice>
//
//    @Query("SELECT * FROM invoiceData WHERE customerId = :custId")
//    suspend fun findByCustomerId(custId: Long): List<Invoice>
//
//    @Insert
//    suspend fun insertAll(bills: List<Invoice>)

// in BaseDAO
//    @Insert
//    fun insert(bill: Invoice)
//
//    @Delete
//    fun delete(bill: Invoice)

//}