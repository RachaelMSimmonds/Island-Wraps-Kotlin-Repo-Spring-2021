package com.simmonds.rachael.islandwrapsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.simmonds.rachael.islandwrapsapp.viewmodels.AllMenuItemsViewModel
import com.simmonds.rachael.islandwrapsapp.databinding.FragmentWrapBinding
import com.simmonds.rachael.islandwrapsapp.entities.Items

//private const val CUSTOMER_ID = "customerId"
private const val ITEM_NAME = "itemName"

class WrapFragment : Fragment() {

    private var _binding: FragmentWrapBinding? = null
    private val binding get() = _binding!!

    var mAdapter: MenuItemAdapter? = null
    private var recyclerView : androidx.recyclerview.widget.RecyclerView? = null
    private var layoutManager: androidx.recyclerview.widget.RecyclerView.LayoutManager? = null

    //???
    var menuItemViewModel : AllMenuItemsViewModel? = null

    private var itemName: String = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //binding

        _binding = FragmentWrapBinding.inflate(inflater, container, false)

        //return binding.root
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_wrap, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            //customerId = it.getLong(CUSTOMER_ID)
            itemName = it.getString(ITEM_NAME,"")
        }
        menuItemViewModel = AllMenuItemsViewModel(activity?.application!!, itemName!!)

        mAdapter = MenuItemAdapter(this,
                mutableListOf<Invoice>())


        menuItemViewModel!!.getAllItems().observe(this, Observer {
            mAdapter!!.addAll(it ?: emptyList())
        })

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //binding.itemImage.setImageResource(requireArguments().getInt(ARG_IMAGE_ID))
        //set bundle when we create frag
        //binding.itemName.text = requireArguments().getString(ARG_TEXT_ID)
    }

    companion object {
        const val ARG_IMAGE_ID = "image_id"
        const val ARG_TEXT_ID = "text_id"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}