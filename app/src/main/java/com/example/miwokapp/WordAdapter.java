package com.example.miwokapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceID;
    public WordAdapter(Context context, ArrayList<Word> pWords , int mcolor) {
        super(context,0, pWords);
        mColorResourceID=mcolor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word local_word = getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(local_word.getmMiwokTranslation());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(local_word.getmDefaultTranslation());
        ImageView imageview =(ImageView)listItemView.findViewById(R.id.image);
        if(local_word.hasImage()){
            imageview.setImageResource(local_word.getmImageResourceID());
            imageview.setVisibility(View.VISIBLE);
        }
        else{
            imageview.setVisibility(View.GONE);
        }
        //set backgroung dinamically for all activity
        View textContainer = listItemView.findViewById(R.id.text_contaianer);
        int color = ContextCompat.getColor(getContext(), mColorResourceID);
        textContainer.setBackgroundColor(color);
        return listItemView;


    }
}
