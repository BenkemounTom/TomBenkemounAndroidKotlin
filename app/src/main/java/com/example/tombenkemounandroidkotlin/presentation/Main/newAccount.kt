package com.example.tombenkemounandroidkotlin.presentation.Main

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tombenkemounandroidkotlin.R
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import org.koin.android.ext.android.inject
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_new_account.*

class newAccount : AppCompatActivity() {



   /* private val createAccountViewModel: newAccountViewmodel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_account)

        createAccountViewModel.createLiveData.observe(this, Observer {
            when(it){
                is CreateSuccess -> {
                    Toast.makeText(this, "Account Created", Toast.LENGTH_SHORT).show()
                    startLoginActivity()
                }
                NoEmail -> {
                    MaterialAlertDialogBuilder(this)
                        .setTitle("Email Error")
                        .setMessage("Please enter an email address")
                        .setPositiveButton("OK") { dialog, which ->
                            dialog.dismiss()
                        }
                        .show()
                }
                InvalidEmail -> {
                    MaterialAlertDialogBuilder(this)
                        .setTitle("Email Error")
                        .setMessage("email is invalid.\nPlease enter a valid email address")
                        .setPositiveButton("OK") { dialog, which ->
                            dialog.dismiss()
                        }
                        .show()
                }
                NoPassword -> {
                    MaterialAlertDialogBuilder(this)
                        .setTitle("Password Error")
                        .setMessage("Please enter a password")
                        .setPositiveButton("OK") { dialog, which ->
                            dialog.dismiss()
                        }
                        .show()
                }
                }
            }
        })
        */
}