package com.example.tombenkemounandroidkotlin;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tombenkemounandroidkotlin.presentation.Main.ActivityList;
import com.example.tombenkemounandroidkotlin.presentation.Main.ActivityList;
import com.example.tombenkemounandroidkotlin.presentation.Main.MainActivity;


public class MenusActivity extends Activity {

    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menusactivity);

        button = (Button) findViewById(R.id.Createbuttonaccount);
        button2 = (Button) findViewById(R.id.accountbutton);
        button3 = (Button) findViewById(R.id.buttonAPI);
        button4 = (Button) findViewById(R.id.buttonsetting);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });

        }
        public void openActivity2(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

        public void openActivity(){
        Intent intent = new Intent(this, Signup_Form.class);
        startActivity(intent);
        }
        public void openActivity3(){
            Intent intent = new Intent(this, KotlinRecyclerViewEx.class);
            startActivity(intent);

        }

    public void openActivity4(){
        Intent intent = new Intent(this, ActivityList.class);
        startActivity(intent);

    }

    }

