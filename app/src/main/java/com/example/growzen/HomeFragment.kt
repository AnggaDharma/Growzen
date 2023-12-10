package com.example.growzen

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val Notifikasi = view.findViewById<ImageView>(R.id.notifikasi)
        Notifikasi.setOnClickListener {
            val intent = Intent(activity, NotifikasiActivity::class.java)
            startActivity(intent)
        }

        val artikel = view.findViewById<TextView>(R.id.textView49)
        artikel.setOnClickListener {
            val intent = Intent(activity, ArtikelActivity::class.java)
            startActivity(intent)
        }

        val tablet = view.findViewById<LinearLayout>(R.id.linearLayout13)
        tablet.setOnClickListener {
            val  tablet = Intent(activity, DataObatTabletActivity ::class.java )
            startActivity(tablet)
        }

        val pil = view.findViewById<LinearLayout>(R.id.pil)
        pil.setOnClickListener {
            val pil = Intent(activity, PilActivity::class.java)
            startActivity(pil)
        }

        val sirup = view.findViewById<LinearLayout>(R.id.linearLayout14)
        sirup.setOnClickListener {
            val sirup = Intent(activity, SirupActivity::class.java)
            startActivity(sirup)
        }

//        view.findViewById<View>(R.id.im_tablet).setOnClickListener {
//            navigateToObatList("tablet")
//        }
//
//        view.findViewById<View>(R.id.im_pil).setOnClickListener {
//            navigateToObatList("pil")
//        }
//
//        view.findViewById<View>(R.id.imageView25).setOnClickListener {
//            navigateToObatList("sirup")
//        }

    }

//    private fun navigateToObatList(jenisObat: String) {
//        val intent = Intent(requireActivity(), DataObatActivity::class.java)
//        intent.putExtra("jenisObat", jenisObat)
//        startActivity(intent)
//    }



    companion object {

        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}