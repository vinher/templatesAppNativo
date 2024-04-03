package com.kev.templateapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.kev.templateapp.databinding.ActivityMainBinding
import com.kev.templateapp.databinding.FragmentLoginScreenBinding
import kotlinx.coroutines.Dispatchers.Main


class LoginScreen : AppCompatActivity() {
    private lateinit var binding:FragmentLoginScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentLoginScreenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.initLogin.setOnClickListener {
            Toast.makeText(this,"Puchado",Toast.LENGTH_LONG).show()
            val i = Intent(application,MainActivity::class.java)
            startActivity(i)
            finish()
        }
    }


}