package com.example.growzen

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.growzen.databinding.FragmentDataObatBinding
import com.example.growzen.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentProfileBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

     binding.keluar.setOnClickListener {
         val intent = Intent(requireContext(), LoginActivity :: class.java)
         startActivity(intent)
     }

        binding.about.setOnClickListener {
            val intent=Intent(requireContext(),AboutActivity::class.java)
            startActivity(intent)
        }
        binding.imgPp.setOnClickListener {
            val intent=Intent(requireContext(),EditProfileActivity::class.java)
            startActivity(intent)
        }
        binding.tvName.setOnClickListener {
            val intent=Intent(requireContext(),EditProfileActivity::class.java)
            startActivity(intent)
        }


        binding.Share.setOnClickListener {
            shareContent("Teks yang akan di-share")
        }

    }

    private fun shareContent(content: String) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, content)

        startActivity(Intent.createChooser(intent, "Bagikan melalui"))
    }


}
