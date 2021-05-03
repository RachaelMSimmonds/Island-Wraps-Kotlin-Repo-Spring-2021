package com.simmonds.rachael.islandwrapsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.simmonds.rachael.islandwrapsapp.databinding.FragmentWrapBinding

class MenuFragment : Fragment() {

    private var _binding: FragmentWrapBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    //i think how to do the menu
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.wraps.setOnClickListener {
            //what is MenuFragmentDirections??
            //val nextAction = MenuFragmentDirections.nextAction(

            //)
        }
        //Navigation.findNavController(it).navigate(nextAction)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}