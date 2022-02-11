package com.example.progress_dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    Button openDialog;

    ProgressDialog progressDialog;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        openDialog = findViewById(R.id.BTN);
        openDialog.setOnClickListener(this);
    }


    public void onClick(View v)
    {
        if (v == openDialog)
        {
            progressDialog = ProgressDialog.show(this, "title", "loading"
                    ,true, true);

            progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progressDialog.setMessage("loading...");

        }
    }



}