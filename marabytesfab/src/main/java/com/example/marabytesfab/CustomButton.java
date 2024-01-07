package com.example.marabytesfab;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.marabytesfab.R;

public class CustomButton extends RelativeLayout {

    private Button button;

    public CustomButton(Context context) {
        super(context);
        init(context, null);
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        // Inflate the layout
        View.inflate(context, R.layout.custom_fab_layout, this);

        // Initialize button
        button = findViewById(R.id.button);

        // Set default background color
        setBackgroundColor(Color.parseColor("#FF4081")); // Example color

        // Set click listener for testing
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button click
                // You can add code here to change background color and text
                // Example: setBackgroundColor(Color.BLUE);
                //          setText("New Text");
            }
        });
    }

    // Method to set background color programmatically
    public void setBackgroundColor(int color) {
        button.setBackgroundColor(color);
    }

    // Method to set text programmatically
    public void setText(String text) {
        button.setText(text);
    }
}
