package com.simmonds.rachael.islandwrapsapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import androidx.navigation.Navigation
import com.simmonds.rachael.islandwrapsapp.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {
  
    //private var recyclerView : RecyclerView? = null
    //private var layoutManager: RecyclerView.LayoutManager? = null

    private var _binding: FragmentMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMenuBinding.inflate(inflater, container, false)

        binding.wraps.setOnClickListener {
            val intent = Intent(activity, WrapFragment::class.java)
            activity?.startActivity(intent)
        }
        return binding.root
        //return inflater.inflate(R.layout.fragment_menu, container, false)

    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.fragment_menu)
//
//        //menu items clickable
//        val wraps = findViewById<Button>(R.id.wraps)
//
//        binding.wraps.setOnClickListener {
//            val intent = Intent(activity, WrapFragment::class.java)
//            activity?.startActivity(intent)
//        }
//    }


    //open the correct part of the menu using recyclerView
//    override fun onItemClicked(custId: Long, custName: String) {
//        //need to make changes to wrap fragment still
//        val fragment = WrapFragment.newInstance(custId,custName)
//        requireActivity().supportFragmentManager
//                .beginTransaction()
//                .setCustomAnimations(R.anim.design_bottom_sheet_slide_in, R.anim.design_bottom_sheet_slide_out)
//                .add(R.id.content, fragment, fragment.javaClass.getSimpleName())
//                .addToBackStack(fragment.javaClass.getSimpleName())
//                .commit()
//
//    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}