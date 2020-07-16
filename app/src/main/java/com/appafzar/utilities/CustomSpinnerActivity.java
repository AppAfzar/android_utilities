package com.appafzar.utilities;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.appafzar.utility.activity.BaseActivity;

public class CustomSpinnerActivity extends BaseActivity {

    // Declaring the String Array with the Text Data for the Spinners
    String[] Languages = {"Select a Language", "C# Language", "JAVA Language",
            "Katlin Language", "PHP Language"};

    // Declaring the Integer Array with resource Id's of Images for the Spinners
    Integer[] images = {0, R.drawable.prog_c, R.drawable.prog_java,
            R.drawable.prog_katlin, R.drawable.prog_php};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_spinner);

        // Declaring and typecasting a Spinner
        Spinner mySpinner = (Spinner) findViewById(R.id.mSpinner);

        // Setting a Custom Adapter to the Spinner
        mySpinner.setAdapter(new MyAdapter(this, R.layout.custom_spinner_item, Languages));

    }

    // Creating an Adapter Class
    public class MyAdapter extends ArrayAdapter<String> {

        public MyAdapter(Context context, int textViewResourceId, String[] objects) {
            super(context, textViewResourceId, objects);
        }

        public View getCustomView(int position, View convertView,
                                  ViewGroup parent) {

            // Inflating the layout for the custom_spinner_item Spinner
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.custom_spinner_item, parent, false);

            // Declaring and Typecasting the textView in the inflated layout
            TextView tvLanguage = (TextView) layout
                    .findViewById(R.id.tvLanguage);

            // Setting the text using the array
            tvLanguage.setText(Languages[position]);

            // Setting the color of the text
            tvLanguage.setTextColor(Color.rgb(75, 180, 225));

            // Declaring and Typecasting the imageView in the inflated layout
            ImageView img = (ImageView) layout.findViewById(R.id.imgLanguage);

            // Setting an image using the id's in the array
            img.setImageResource(images[position]);

            // Setting Special atrributes for 1st element
            if (position == 0) {
                // Removing the image view
                img.setVisibility(View.GONE);
                // Setting the size of the text
                tvLanguage.setTextSize(20f);
                // Setting the text Color
                tvLanguage.setTextColor(Color.BLACK);

            }

            return layout;
        }

        // It gets a View that displays in the drop down popup the data at the specified position
        @Override
        public View getDropDownView(int position, View convertView,
                                    ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }

        // It gets a View that displays the data at the specified position
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }
    }
}