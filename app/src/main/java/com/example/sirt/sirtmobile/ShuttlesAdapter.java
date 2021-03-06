package com.example.sirt.sirtmobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Vini Mishra on 16-May-17.
 */

public class ShuttlesAdapter extends ArrayAdapter<MainAdapter> {
    public ShuttlesAdapter(Context context, ArrayList<MainAdapter> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_shuttle_list_item, parent, false);
        }

        MainAdapter currentWord = getItem(position);

        TextView busName = (TextView) listItemView.findViewById(R.id.bus_name);
        busName.setText(currentWord.getBusName());

        TextView busNumber = (TextView) listItemView.findViewById(R.id.bus_number);
        busNumber.setText(currentWord.getBusNumber());

        return listItemView;
    }

}