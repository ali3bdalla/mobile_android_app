package com.example.problemfix;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }


    public void toServiceCreation(View view) {
        Intent intent =new Intent(this,ServiceCreationActivity.class);
        startActivity(intent);
    }




}


