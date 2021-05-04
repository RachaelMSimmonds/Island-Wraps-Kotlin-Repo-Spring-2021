package com.simmonds.rachael.islandwrapsapp

import android.app.Application
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.MutableLiveData
import com.french.bryan.roomdemo.entities.Invoice
import com.simmonds.rachael.islandwrapsapp.entities.Invoice
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext


class ItemRepository(var application: Application, var custId: Long):LifecycleObserver, CoroutineScope {

    private var _allInvoices: List<Invoice> = listOf<Invoice>()
    var mAllInvoices : MutableLiveData<List<Invoice>> = MutableLiveData()
    private val job: Job = Job()
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + job

    private var database : RoomExampleDatabase = RoomExampleDatabase.getInstance(application,GlobalScope,application.resources)

    init {
        launch {
            //Execute all the long running tasks here
            _allInvoices = database.invoiceDao().findByCustomerId(custId)
            mAllInvoices.postValue(_allInvoices)
        }
    } //init

    fun insertInvoice(invoice: Invoice) {
        launch {
            database.invoiceDao().insert(invoice)
            //need to update live data, we are just going to get them all
            //probably should do more efficient way
            _allInvoices = database.invoiceDao().findByCustomerId(custId)
            mAllInvoices.postValue(_allInvoices)
        }
    }

    fun insertAllInvoices(invoices: List<Invoice>) {
        launch {
            database.invoiceDao().insertAll(invoices)
            _allInvoices = database.invoiceDao().findByCustomerId(custId)
            mAllInvoices.postValue(_allInvoices)
        }
    }

    //additional wrappers for update/delete, etc
//*** swipe to delete
    fun deleteInvoice(invoice: Invoice) {
        launch {
            database.invoiceDao().delete(invoice)
            //need to update live data, we are just going to get them all
            //probably should do more efficient way
            _allInvoices = database.invoiceDao().findByCustomerId(custId)
            mAllInvoices.postValue(_allInvoices)
        }
    }
//***
}