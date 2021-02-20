package com.technoabinash.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button defaultBtn, gravityBtn, nestedBtn, centerBtn, topBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        defaultBtn = findViewById(R.id.defaultBtn);
        gravityBtn = findViewById(R.id.gravityBtn);
        nestedBtn = findViewById(R.id.nestedBtn);
        centerBtn = findViewById(R.id.centerBtn);
        topBtn = findViewById(R.id.topBtn);

        defaultBtn.setOnClickListener(view -> {
            Toast.makeText(this, "default toast", Toast.LENGTH_SHORT).show();
        });
        gravityBtn.setOnClickListener(view -> {
            Toast toast=  Toast.makeText(this, "center toast", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);
            toast.show();
        });
        nestedBtn.setOnClickListener(view -> {
            Toast toast=  Toast.makeText(this, "bottom and right toast", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.BOTTOM | Gravity.RIGHT,0,0);
            toast.show();
        });
        centerBtn.setOnClickListener(view -> {
            Toast toast=  Toast.makeText(this, "center and right toast", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER | Gravity.RIGHT,0,0);
            toast.show();
        });
        topBtn.setOnClickListener(view -> {
            Toast toast=  Toast.makeText(this, "top toast", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP,0,0);
            toast.show();
        });
    }
}