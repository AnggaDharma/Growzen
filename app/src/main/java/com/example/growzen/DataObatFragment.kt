package com.example.growzen

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.lifecycle.ViewModelProvider
import com.example.growzen.Database.DatabaseNote
import com.example.growzen.Entity.DataObat
import com.example.growzen.databinding.FragmentDataObatBinding


//class DataObatFragment : Fragment() {
//
////    private lateinit var dao: Dao
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_data_obat, container, false)
//    }
//
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        val next = view.findViewById<Button>(R.id.btn_next)
//
//        next.setOnClickListener {
//            // Ambil nilai dari antarmuka pengguna
//            val jenisObat = view.findViewById<Spinner>(R.id.ED_JenisObat).selectedItem.toString()
//            val namaObat = view.findViewById<EditText>(R.id.ED_NamaObat).text.toString()
//            val stokObat = view.findViewById<EditText>(R.id.ED_Stok).text.toString()
//            val dosisObat = view.findViewById<EditText>(R.id.ED_Dosis).text.toString()
//
//            // Validasi entri pengguna (Anda dapat menambahkan validasi tambahan sesuai kebutuhan)
//
//            // Buat objek DataObat
//            val dataObat = DataObat(
//                namaObat = namaObat,
//                jenisObat = jenisObat,
//                dosis = dosisObat,
//                stok = stokObat.toInt() // Konversi String ke Int
//            )
//
//            // Panggil fungsi untuk menyimpan data ke database
//            saveDataToDatabase(dataObat)
//        }
//    }
//
//    private fun saveDataToDatabase(dataObat: DataObat) {
//    Log.d("SaveData", "Saving data to database: $dataObat")
//        // Panggil ViewModel atau Repository untuk menyimpan data ke database
//        val viewModel = ViewModelProvider(this).get(DataObatViewModel::class.java)
//        viewModel.insertDataObat(dataObat)
//
//        // Setelah menyimpan data, beralih ke TambahObat2Activity
//        val intent = Intent(activity, TambahObat2Activity::class.java)
//        startActivity(intent)
//
//        // Optionally, you can finish the current activity if needed
//        activity?.finish()
//    }
//
//}


class DataObatFragment : Fragment() {
    private lateinit var binding: FragmentDataObatBinding
//    private lateinit var spinnerJenisObat: Spinner
//    private lateinit var edStok: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDataObatBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        spinnerJenisObat = binding.EDJenisObat
//        edStok = binding.EDStok
//
//        val jenisObatAdapter = ArrayAdapter.createFromResource(
//            requireContext(),
//            R.array.jenis_obat_array,
//            android.R.layout.simple_spinner_item
//        )
//        jenisObatAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        spinnerJenisObat.adapter = jenisObatAdapter




        binding.btnNext.setOnClickListener {
            val intent = Intent(requireContext(), TambahObat2Activity::class.java)
            startActivity(intent)
//            addData(noteViewModel())
        }
    }

//    private fun noteViewModel(): DataObatViewModel {
//        val database = DatabaseNote(requireContext())
//        val repo = DataObatRepository(database)
//        val factory = ViewModelFactory(repo)
//        return ViewModelProvider(this, factory)[DataObatViewModel::class.java]
//    }
//
//    private fun addData(vm: DataObatViewModel) {
//
//        val selectedJenisObat: String = spinnerJenisObat.selectedItem.toString()
//        try {
//            // Parse stok to integer
//            val stok: Int = edStok.text.toString().toInt()
//
//            // Insert data to database
//            vm.insertDataObat(DataObat(
//                namaObat = binding.EDNamaObat.text.toString(),
//                jenisObat = selectedJenisObat,
//                dosis = binding.EDDosis.text.toString(),
//                stok = stok
//            ))
//
//            // Navigate to the MainActivity
//            val intent = Intent(requireContext(), MainActivity::class.java)
//            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
//            startActivity(intent)
//        } catch (e: NumberFormatException) {
//            // Handle invalid number input
//            // You can show a toast or other UI feedback
//            // For simplicity, I'm just logging the error here
//            e.printStackTrace()
//        }



//        vm.insertDataObat(DataObat(
//            namaObat = binding.EDNamaObat.text.toString(),
//            jenisObat = binding.EDJenisObat.text.toString(),
//            dosis = binding.EDDosis.text.toString(),
//            stok = binding.EDStok.text.toString()
//        )).let {
//            val intent = Intent(requireContext(), MainActivity::class.java)
//            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
//            startActivity(intent)
//        }

}