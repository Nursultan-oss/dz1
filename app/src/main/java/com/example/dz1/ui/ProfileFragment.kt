package com.example.dz1.ui

import android.content.Intent
import android.net.Uri
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.launch
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity
import com.example.dz1.ProfileViewModel
import com.example.dz1.R

import com.example.dz1.databinding.FragmentHomeBinding
import com.example.dz1.databinding.FragmentProfileBinding
import com.google.android.gms.instantapps.Launcher

class ProfileFragment : Fragment() {
   private  lateinit var  launcher: ActivityResultLauncher<Intent>
    private lateinit var binding:FragmentProfileBinding

    companion object {
        fun newInstance() = ProfileFragment()

    }









    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding =  FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



      initLauncher()
        binding.imageViewBtn.setOnClickListener{
            val intent =  Intent ()
            intent.action = Intent.ACTION_PICK
            intent.type="image/*"
            launcher.launch(intent)
        }
    }

    private fun initLauncher() {
             launcher = registerForActivityResult(
                 ActivityResultContracts.StartActivityForResult()) {
                 if (it.resultCode == AppCompatActivity.RESULT_OK){
                     val image = it.data?.data
                     if(image != null){
                         binding.imageViewBtn.setImageURI(image)
                     }
                 }
             }
    }

}




