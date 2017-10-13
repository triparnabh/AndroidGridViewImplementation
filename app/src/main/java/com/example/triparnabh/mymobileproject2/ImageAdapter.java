package com.example.triparnabh.mymobileproject2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by triparnabh on 01-10-2017.
 */

public class ImageAdapter extends BaseAdapter {

    /*private static final int PADDING = 8;
    private static final int WIDTH = 85;
    private static final int HEIGHT = 85;*/
    private Context mContext;
    private List<Integer> mThumbIds;
    private String[] mCarList;

    public ImageAdapter(Context c, String[] mCarList, List<Integer> ids) {
        mContext = c;
        this.mCarList=mCarList;
        this.mThumbIds = ids;
    }

    @Override
    public int getCount() {

        return mThumbIds.size();
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds.get(position);
    }

    @Override
    public long getItemId(int position) {
        return mThumbIds.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View gridview1;


        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            gridview1 = new View(mContext);
            gridview1 = inflater.inflate(R.layout.display, null);
            //Inflating the view of the app
            TextView textView = (TextView) gridview1.findViewById(R.id.textView2);
            ImageView imageView1 = (ImageView) gridview1.findViewById(R.id.imageView);
            /*imageView.setLayoutParams(new GridView.LayoutParams(WIDTH, HEIGHT));
            imageView.setPadding(PADDING, PADDING, PADDING, PADDING);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);*/
            textView.setText(mCarList[position]);

            imageView1.setImageResource(mThumbIds.get(position));
        }
         else {
            gridview1= (View) convertView;
        }
            return gridview1;
        }
}

