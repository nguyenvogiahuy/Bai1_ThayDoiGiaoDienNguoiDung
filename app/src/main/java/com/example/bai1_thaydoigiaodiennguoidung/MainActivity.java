package com.example.bai1_thaydoigiaodiennguoidung;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText PTT,PTE;
Button BTH;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button BTH = (Button) findViewById(R.id.BTH);
        EditText PTT = (EditText) findViewById(R.id.PTT);
        EditText PTE = (EditText) findViewById(R.id.PTE);
    }
    public void BTH (View view)
    {
        System.exit (0);
    }

    }
