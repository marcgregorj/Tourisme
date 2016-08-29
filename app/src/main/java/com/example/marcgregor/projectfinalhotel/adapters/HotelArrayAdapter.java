package com.example.marcgregor.projectfinalhotel.adapters;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.example.marcgregor.projectfinalhotel.models.Hotel;

import java.util.List;

/**
 * Created by Marc Gregor on 8/21/2016.
 */
public class HotelArrayAdapter extends ArrayAdapter<Hotel> {

    public HotelArrayAdapter(Context context, List<Hotel> hotels){
        super(context, android.R.layout.simple_list_item_1, hotels);
    }
}
