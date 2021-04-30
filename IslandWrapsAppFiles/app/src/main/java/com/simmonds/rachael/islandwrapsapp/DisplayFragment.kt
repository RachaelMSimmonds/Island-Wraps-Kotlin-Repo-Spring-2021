package edu.rit.fragmentsfinalexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import edu.rit.fragmentsfinalexample.databinding.FragmentDisplayBinding

class DisplayFragment : Fragment() {
    private var _binding: FragmentDisplayBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //binding
        _binding = FragmentDisplayBinding.inflate(inflater, container, false)
        return binding.root
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_display, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.characterImage.setImageResource(arguments!!.getInt(ARG_IMAGE_ID))
        //set bundle when we create frag
        binding.characterName.text = arguments!!.getString(ARG_TEXT_ID)
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