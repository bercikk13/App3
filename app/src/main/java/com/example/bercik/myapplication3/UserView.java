package com.example.bercik.myapplication3;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class UserView extends RelativeLayout {

    private TextView nameTextView;
    private TextView descriptionTextView;
    private ImageView imageImageView;

    public UserView(Context context) {
        super(context);

        init();
    }

    public UserView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public UserView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();

    }


    public void setData(String name, String description, int image) {
        nameTextView.setText(name);
        descriptionTextView.setText(description);
        imageImageView.setImageResource(image);
    }


    public void init() {
        inflate(getContext(), R.layout.view_user, this);
        this.nameTextView = (TextView) findViewById(R.id.textViewName);
        this.descriptionTextView = (TextView) findViewById(R.id.textViewDesc);
        this.imageImageView = (ImageView) findViewById(R.id.image1);

    }


}