package com.simmonds.rachael.islandwrapsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import com.simmonds.rachael.islandwrapsapp.databinding.FragmentWrapBinding

class WrapFragment : Fragment() {
    private var _binding: FragmentWrapBinding? = null
    private val binding get() = _binding!!

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //binding.itemImage.setImageResource(requireArguments().getInt(ARG_IMAGE_ID))
        //set bundle when we create frag
        //binding.itemName.text = requireArguments().getString(ARG_TEXT_ID)
    }

    //function to show specific menu items
    fun showMenuItems(view: View) {
        val fragment = WrapFragment()
        val args = Bundle()
        when(view.id) {
            R.id.wraps -> {
                args.putInt(WrapFragment.ARG_IMAGE_ID,R.drawable.wraps)
                args.putString(WrapFragment.ARG_TEXT_ID, "Jerk Chicken, Barbecue Chicken, Grilled Chicken, Curry Chicken, Veggie")
            }
            R.id.plates -> {
                args.putInt(WrapFragment.ARG_IMAGE_ID,R.drawable.rubbish)
                args.putString(WrapFragment.ARG_TEXT_ID, "Jerk Chicken, Barbecue Chicken, Grilled Chicken, Curry Chicken, Veggie")
            }
            R.id.salads -> {
                args.putInt(WrapFragment.ARG_IMAGE_ID,R.drawable.salads)
                args.putString(WrapFragment.ARG_TEXT_ID, "Jerk Chicken, Barbecue Chicken, Grilled Chicken, Curry Chicken, Veggie")
            }
            R.id.dinner -> {
                args.putInt(WrapFragment.ARG_IMAGE_ID,R.drawable.dinner)
                args.putString(WrapFragment.ARG_TEXT_ID, "Jerk Chicken, Oxtail, Curry Goat, Fried Fish, Vegan")
            }
            R.id.specials -> {
                args.putInt(WrapFragment.ARG_IMAGE_ID,R.drawable.special)
                args.putString(WrapFragment.ARG_TEXT_ID, "1, 2, 3, 4, 5")
            }
            R.id.sides -> {
                args.putInt(WrapFragment.ARG_IMAGE_ID,R.drawable.side)
                args.putString(WrapFragment.ARG_TEXT_ID, "Fried Plantains, Fried Dumplings, Festivals, Garden Salad, Soup")
            }
            R.id.bevs -> {
                args.putInt(WrapFragment.ARG_IMAGE_ID,R.drawable.drink)
                args.putString(WrapFragment.ARG_TEXT_ID, "Orange Lemonade, Strawberry Lemonade, Hibiscus Sorrel, Carrot Juice, Ginger Beer")
            }

        }//when
        fragment.arguments = args
        childFragmentManager.beginTransaction().replace(R.id.content,fragment).commit()
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