package com.example.tombenkemounandroidkotlin.presentation.Main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import com.example.tombenkemounandroidkotlin.KotlinRecyclerViewEx
import com.example.tombenkemounandroidkotlin.MenusActivity
import com.example.tombenkemounandroidkotlin.R
import com.example.tombenkemounandroidkotlin.Signup_Form
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        create_account_button.setOnClickListener {
            startActivity(Intent(this, newAccount::class.java))
        }
        Menus.setOnClickListener {
            startActivity(Intent(this, MenusActivity::class.java))
        }




        mainViewModel.loginLiveData.observe(this, Observer {
            when (it) {
                is LoginSuccess -> {
                    //navigation
                    //startListActivity()
                    startActivity(Intent(this, KotlinRecyclerViewEx::class.java))
                }
                LoginError -> {
                    MaterialAlertDialogBuilder(this)
                        .setTitle("Erreur compte inconnu")
                        .setMessage("Compte Inconnu")
                        .setPositiveButton("OK") { dialog, which ->
                            dialog.dismiss()
                        }
                        .show()

                }

            }
        })

        login_button.setOnClickListener {
            mainViewModel.onClickLogin(
                Login_edit.text.toString().trim()
                //Password_edit.text.toString()
            )
        }

        create_account_button.setOnClickListener {
            //startListActivity()
            startCreateActivity()
        }
    }

    private fun startCreateActivity() {
        val intent = Intent(this, Signup_Form::class.java)
        this.startActivity(intent)
    }
   /* private fun startListActivity() {
        val intent = Intent(this, newAccount::class.java)
        this.startActivity(intent)
    }*/
}
