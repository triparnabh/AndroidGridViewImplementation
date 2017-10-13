package com.example.triparnabh.mymobileproject2;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class ViewImageActivity extends Activity {

    private ArrayList<Uri> mUriList = new ArrayList<Uri>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_image);

        Intent intent = getIntent();

        final ImageView imageView = new ImageView(getApplicationContext());

        imageView.setImageResource(intent.getIntExtra(GridLayout.EXTRA_RES_ID, 0));
        final int pods=intent.getIntExtra("Position2", 0);
        setContentView(imageView);

        imageView.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){
                initializeCarUris();
                Intent aIntent = new Intent();
                Uri aUri = mUriList.get(pods);
                aIntent.setData(aUri);
                aIntent.addCategory(Intent.CATEGORY_BROWSABLE);
                startActivity(aIntent);


            }
        });
    }
        public void initializeCarUris() {

        mUriList.add(Uri.parse("https://www.audiusa.com/"));
        mUriList.add(Uri.parse("https://www.bmwusa.com/"));
        mUriList.add(Uri.parse("http://cars.disney.com/"));
        mUriList.add(Uri.parse("https://www.honda.com"));
        mUriList.add(Uri.parse("https://www.mbusa.com/"));
        mUriList.add(Uri.parse("http://www.ebay.co.uk/bhp/noddy-car"));
        mUriList.add(Uri.parse("https://www.porsche.com/usa/"));
        mUriList.add(Uri.parse("https://www.marutisuzuki.com/dzire.aspx"));
        mUriList.add(Uri.parse("http://www.vw.com/"));
    }

}
