package com.ilyasyildirim.bulmacaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {

        super.onPause();
        ImageView resim2 = findViewById(R.id.panelView);
        resim2.setImageResource(R.drawable.resim1);
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    int a = 3;
    public void resimDegistir(View view){

        TextView yazi = findViewById(R.id.yazilarrr);
        yazi.setText(Integer.toString(a));
        if(a%2 == 0) {
            ImageView resim = findViewById(R.id.panelView);
            resim.setImageResource(R.drawable.resim1);
            a++;
        }
        else{
            ImageView resim = findViewById(R.id.panelView);
            resim.setImageResource(R.drawable.resim2);
            a++;
        }


    }
}