package com.example.triparnabh.mymobileproject2;

import android.app.Activity;
import android.content.Intent;
import android.service.carrier.CarrierService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ViewImageActivity2 extends Activity {

    private int Cars[]= {R.drawable.audi, R.drawable.bmw,
                    R.drawable.honda, R.drawable.noddy, R.drawable.car, R.drawable.mercedes
                    , R.drawable.porsche,    R.drawable.volkswagon, R.drawable.swift};
     int a; // position of cars
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_image2);

        Intent intent1 = getIntent(); //receiving intent from GridLayout Acivity

        ImageView imageView = new ImageView(getApplicationContext());
        a=intent1.getIntExtra(GridLayout.EXTRA_RES_ID, 0);

        imageView.setImageResource(Cars[a]);
        //setting the image view
        setContentView(imageView);
    }
}
