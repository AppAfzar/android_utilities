package com.appafzar.utility.helper;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.appcompat.widget.AppCompatTextView;

import com.appafzar.utility.R;

public class Tools {

    public static void toastMessage(Activity activity, String msg) {
        // Inflating the layout for the toast
        LayoutInflater inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, (ViewGroup) activity.findViewById(R.id.toast_custom));

        AppCompatTextView text = layout.findViewById(R.id.tvtoast);

        // Setting the text to be displayed in the Toast
        text.setText(msg);

        // Setting the color of the Text to be displayed in the toast
        // text.setTextColor(Color.rgb(0, 132, 219));

        // Creating the Toast
        Toast toast = new Toast(activity);

        // Setting the position of the Toast
        // toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);

        // Setting the duration of the Toast
        toast.setDuration(Toast.LENGTH_SHORT);

        // Setting the Inflated Layout to the Toast and show
        toast.setView(layout);
        toast.show();
    }
}
