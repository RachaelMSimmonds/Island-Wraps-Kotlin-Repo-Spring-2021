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

    private var _binding: FragmentMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMenuBinding.inflate(inflater, container, false)

        //when item categories are clicked, specific menu activities appear
        binding.wraps.setOnClickListener {
            val intent = Intent(activity, WrapActivity::class.java)
            activity?.startActivity(intent)
        }

        binding.plates.setOnClickListener {
            val intent = Intent(activity, PlateActivity::class.java)
            activity?.startActivity(intent)
        }

        binding.salads.setOnClickListener {
            val intent = Intent(activity, SaladActivity::class.java)
            activity?.startActivity(intent)
        }

        binding.dinner.setOnClickListener {
            val intent = Intent(activity, DinnerActivity::class.java)
            activity?.startActivity(intent)
        }

        binding.specials.setOnClickListener {
            val intent = Intent(activity, SpecialActivity::class.java)
            activity?.startActivity(intent)
        }

        binding.sides.setOnClickListener {
            val intent = Intent(activity, SideActivity::class.java)
            activity?.startActivity(intent)
        }

        binding.bevs.setOnClickListener {
            val intent = Intent(activity, BeverageActivity::class.java)
            activity?.startActivity(intent)
        }
        return binding.root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}