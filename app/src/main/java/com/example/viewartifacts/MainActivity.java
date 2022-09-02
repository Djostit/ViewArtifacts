package com.example.viewartifacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Spinner spinner;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        spinner = findViewById(R.id.spinner);
        imageView = findViewById(R.id.imageView);
    }

    public void ReadDescription(View view) {
        SetImage(spinner.getSelectedItemPosition());
        textView.setText(GetDescription(spinner.getSelectedItemPosition()));
    }

    private String GetDescription(int selectedItemPosition) {
        String[] stringArray = getResources().getStringArray(R.array.dep_artifacts);
        return stringArray[selectedItemPosition];
    }

    private void SetImage(int selectedItemPosition){
        switch (selectedItemPosition){
            case 0:
                imageView.setImageResource(R.drawable.one);
                break;
            case 1:
                imageView.setImageResource(R.drawable.two);
                break;
            case 2:
                imageView.setImageResource(R.drawable.three);
                break;
            case 3:
                imageView.setImageResource(R.drawable.four);
                break;
            case 4:
                imageView.setImageResource(R.drawable.five);
                break;
        }

    }
}