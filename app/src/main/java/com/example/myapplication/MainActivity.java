package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int x = 0;
    public void fade(View view){

         Log.i("info", "test");

        ImageView bartimageView = findViewById(R.id.bartimageView);

        ImageView homerimageView = findViewById(R.id.homerimageView);

        if(x % 2 == 0) {
            bartimageView.animate().alpha(0).setDuration(2000);
            homerimageView.animate().alpha(1).setDuration(2000);
              x++;
        }else{
            homerimageView.animate().alpha(0).setDuration(2000);
            bartimageView.animate().alpha(1).setDuration(2000);
            x++;

        }


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
