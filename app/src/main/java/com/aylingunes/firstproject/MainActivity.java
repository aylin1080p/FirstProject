package com.aylingunes.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { // first method
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // onclick method in class
    public void changeImage(View view){ // görünüm çağrısı -->
        ImageView imageView =   findViewById(R.id.imageView);   // sınıftan nesne türetme
        // nesneyi bul id den ve atamasını yap
        Button button = findViewById(R.id.button); // activityde tanımlı, ilave kod
        imageView.setImageResource(R.drawable.tohum);
    }





} // classend
