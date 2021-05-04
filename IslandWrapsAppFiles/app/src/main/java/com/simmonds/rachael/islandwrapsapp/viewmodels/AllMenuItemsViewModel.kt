package com.simmonds.rachael.islandwrapsapp

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.french.bryan.roomdemo.InvoiceRepository
import com.simmonds.rachael.islandwrapsapp.ItemRepository
import com.simmonds.rachael.islandwrapsapp.entities.Invoice

class AllMenuItemsViewModel : AndroidViewModel {
    private var mItemRepository : ItemRepository? = null
    private var customerId: Long? = null


    constructor(application: Application, custId: Long) : super(application) {
        customerId = custId
        mItemRepository = ItemRepository(getApplication(), customerId!!)
    }


    fun getAllItems(): LiveData<List<Invoice>> {
        return mItemRepository!!.mAllInvoices
    }


    fun insertInvoice(invoice: Invoice) {
        mItemRepository!!.insertInvoice(invoice)
    }

    //other wrapper methods for inserting/deleting, etc.
//swipe to delete
    fun deleteInvoice(invoice: Invoice) {
        mItemRepository!!.deleteInvoice(invoice)
    }
//***
}