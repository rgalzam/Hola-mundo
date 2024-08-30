package com.tecmilenio.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button helloButton = findViewById(R.id.helloButton);
        TextView textView1 = findViewById(R.id.textView1);

       helloButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               textView1.setText("Hola Mundo");
           }
       });

    }
}