package com.example.kirstiebooras.navbarexample;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by kirstiebooras on 5/24/16.
 */
public class NavBar extends LinearLayout {

    private Button button1;
    private Button button2;
    private Button button3;

    public NavBar(Context context) {
        super(context);
        setupView(context);
    }

    public NavBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        setupView(context);
    }

    public NavBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setupView(context);
    }

    public void setButton1(String text, OnClickListener listener) {
        button1.setText(text);
        button1.setOnClickListener(listener);
    }

    public void setButton2(String text, OnClickListener listener) {
        button2.setText(text);
        button2.setOnClickListener(listener);
    }

    public void setButton3(String text, OnClickListener listener) {
        button3.setText(text);
        button3.setOnClickListener(listener);
    }

    private void setupView(Context context) {
        setOrientation(HORIZONTAL);
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.nav_bar, this, true);

        button1 = (Button) getChildAt(0);
        button2 = (Button) getChildAt(1);
        button3 = (Button) getChildAt(2);
    }
}
