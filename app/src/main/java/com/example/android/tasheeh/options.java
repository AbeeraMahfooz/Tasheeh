package com.example.android.tasheeh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import android.widget.Button;

public class options extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
    }
    public void uploadImage(View view)
    {
        Intent i = new Intent(this, upload.class);
        startActivity(i);
    }
    public void writeText(View view)
    {
        Intent j = new Intent(this, text.class);
        startActivity(j);
    }
}
