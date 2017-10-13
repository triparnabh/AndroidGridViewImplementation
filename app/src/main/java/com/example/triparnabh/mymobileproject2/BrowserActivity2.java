package com.example.triparnabh.mymobileproject2;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.ArrayList;

public class BrowserActivity2 extends Activity {
    String urls[]={"https://www.audiusa.com/","https://www.bmwusa.com/","http://cars.disney.com/","https://www.honda.com",
            "https://www.mbusa.com/",
            "http://www.ebay.co.uk/bhp/noddy-car",
            "https://www.porsche.com/usa/",
            "https://www.marutisuzuki.com/dzire.aspx",
            "http://www.vw.com/"}; // for storing the web URLS and later accessing their position while using webview


    private ArrayList<Uri> mUriList1 = new ArrayList<Uri>();
    int b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser2);
        initializeCarUris1();
        Intent intent2 = getIntent();// receiving intent from GridLayout Activity
        b= intent2.getIntExtra(GridLayout.EXTRA_RES_ID, 0);
        Uri bUri = mUriList1.get(b);
        WebView view = (WebView) this.findViewById(R.id.wv);// for opening the browser in the same activity
        view.getSettings().setJavaScriptEnabled(true);
        view.setWebViewClient(new WebViewClient());
        view.loadUrl(urls[b]);
    }

    public void initializeCarUris1() {

        mUriList1.add(Uri.parse("https://www.audiusa.com/"));
        mUriList1.add(Uri.parse("https://www.bmwusa.com/"));
        mUriList1.add(Uri.parse("http://cars.disney.com/"));
        mUriList1.add(Uri.parse("https://www.honda.com"));
        mUriList1.add(Uri.parse("https://www.mbusa.com/"));
        mUriList1.add(Uri.parse("http://www.ebay.co.uk/bhp/noddy-car"));
        mUriList1.add(Uri.parse("https://www.porsche.com/usa/"));
        mUriList1.add(Uri.parse("https://www.marutisuzuki.com/dzire.aspx"));
        mUriList1.add(Uri.parse("http://www.vw.com/"));
    }
}
