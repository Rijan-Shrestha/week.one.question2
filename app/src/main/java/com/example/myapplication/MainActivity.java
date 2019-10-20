package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    RadioButton radioButton1,radioButton2,radioButton3;
    ImageView imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButton1=findViewById(R.id.rbiot);
        radioButton2=findViewById(R.id.rbandroid);
        radioButton3=findViewById(R.id.rbweb);
        imageview=findViewById(R.id.IV);

        radioButton1.setOnClickListener(this);
        radioButton2.setOnClickListener(this);
        radioButton3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.rbandroid :
                imageview.setImageResource(R.drawable.tiger);
                break;
            case R.id.rbiot :
                imageview.setImageResource(R.drawable.sittingbird);
            case R.id.rbweb :
                imageview.setImageResource(R.drawable.snake);
        }
    }
}
