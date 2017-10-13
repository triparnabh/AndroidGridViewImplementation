package com.example.triparnabh.mymobileproject2;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DealerListActivity extends ListActivity {

    String[] Audi = {"Audi Dealer, West Lexington Street", "Audi Vehicle Dealer, South Morgan", "Michael and Sons Vehicles, 400 North Ashland Avenue"};
    String[] BMW = {"BMW Dealer Bros., Michigan Avenue Beach", "BMW Dealer Pvt Ltd, South Polk Street", "BMW Michael and Sons Vehicles, 601 North Ashland Avenue"};
    String[] Car = {"Car Dealers and Sons, North Avenue Central", "Car Dealer and Bros, South Clark Street", "Washington Bros Car Dealers, South Ashland Avenue"};
    String[] Honda = {"Honda Dealer, Little Italy Colony", "Honda Pvt Ltd, South Morgan", "Audi Dealer Latest, Ashland Avenue"};
    String[] Mercedes = {"Mercedes Dealers and Bros, North Avenue Beach", "Mercedes Dealer, 851South South Morgan", "Washington Pvt Ltd, 114 West Taylor Street"};
    String[] Noddy = {"Noddy Toy Car Dealer, North Avenue Beach", "Noddy Cars, 450 South Morgan", "Noddy Dealer Pvt Ltd,  850 South Loomis Street"};
    String[] Porsche = {"Porsche Manufacturer, 2401 South May Street", "Porsche Sons & Pvt Ltd, 931 May Street", "Porsche Sons and Ltd, 222 North Ashland Avenue"};
    String[] Swift = {"Maruti Suzuki Dealer, 3407 Central Avenue", "Maruti Dealer New, South Morgan", "Audi Dealer Latest, 901 South Ashland Avenue"};
    String[] Volkswagon = {"Volkswagon Dealer, 450 North Avenue Beach", "Volkswagon Sons and Pvt Ltd, 657 South Morgan", "Audi Dealer Latest, 545 North Ashland Avenue"};

    int c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Intent aintent = getIntent(); //receiving the intent from Gridlayout activity
        c = aintent.getIntExtra("EXTRA_RES_ID", 0);

        switch (c) {
            case 0:
                setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_dealer_list, Audi));
                ListView lv = getListView();
                lv.setTextFilterEnabled(true);
                break;
            case 1:
                setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_dealer_list, BMW));
                ListView lv1 = getListView();
                lv1.setTextFilterEnabled(true);
                break;
            case 2:
                setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_dealer_list, Car));
                ListView lv2 = getListView();
                lv2.setTextFilterEnabled(true);
                break;
            case 3:
                setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_dealer_list, Honda));
                ListView lv3 = getListView();
                lv3.setTextFilterEnabled(true);
                break;
            case 4:
                setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_dealer_list, Mercedes));
                ListView lv4 = getListView();
                lv4.setTextFilterEnabled(true);
                break;
            case 5:
                setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_dealer_list, Noddy));
                ListView lv5 = getListView();
                lv5.setTextFilterEnabled(true);
                break;
            case 6:
                setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_dealer_list, Porsche));
                ListView lv6 = getListView();
                lv6.setTextFilterEnabled(true);
                break;
            case 7:
                setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_dealer_list, Swift));
                ListView lv7 = getListView();
                lv7.setTextFilterEnabled(true);
                break;
            case 8:
                setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_dealer_list, Volkswagon));
                ListView lv8 = getListView();
                lv8.setTextFilterEnabled(true);
                break;
        }

    }
}