package com.example.triparnabh.mymobileproject2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class GridLayout extends Activity {

    protected static final String EXTRA_RES_ID = "POS";
    int position3;
    private String[] mCarList = {"Audi", "Bmw", "Car", "Honda","Mercedes","Noddy","Porsche","Swift","Volkswagon"};

    private ArrayList<Integer> mThumbIds = new ArrayList<Integer>(
            Arrays.asList(R.drawable.audi, R.drawable.bmw,
                    R.drawable.honda, R.drawable.noddy, R.drawable.car, R.drawable.mercedes
            , R.drawable.porsche, R.drawable.volkswagon, R.drawable.swift));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);

        ImageAdapter adapter = new ImageAdapter(GridLayout.this, mCarList,mThumbIds);

        final GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(adapter);


        gridview.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                Intent intent = new Intent(GridLayout.this, ViewImageActivity.class);
                intent.putExtra(EXTRA_RES_ID, (int) id);
                intent.putExtra("Position2", position);

                startActivity(intent);

            }

            });

        registerForContextMenu(gridview);

        gridview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(){
            public boolean onItemLongClick(AdapterView<?> parent,View v,int position, long id) {

                position3 = position;
                return false;
            }
        });
    }
    @Override // creating the menu
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item){
        switch (item.getItemId()){ // receiving item id for each particular switch case
            case R.id.item_option1: // option for viewing the zoomed image
                Intent intent1 = new Intent(GridLayout.this, ViewImageActivity2.class);
                intent1.putExtra(EXTRA_RES_ID, (int) position3);
                startActivity(intent1);
                break;

            case R.id.item_option2:// option for going to the browser and viewing the car details
                Intent intent2 = new Intent(GridLayout.this, BrowserActivity2.class);
                intent2.putExtra(EXTRA_RES_ID, 0);
                startActivity(intent2);
                break;

            case R.id.item_option3: // option for viewing the dealers list
                Intent intent3 = new Intent(GridLayout.this, DealerListActivity.class);
                intent3.putExtra(EXTRA_RES_ID, position3);
                startActivity(intent3);

                break;

        }
        return true;

    }

}
