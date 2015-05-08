package com.example.bercik.myapplication3;

import android.app.Activity;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class FirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstactivity);

        Button Item1 = (Button) findViewById(R.id.button1);
        Button Item2 = (Button) findViewById(R.id.button2);

        final TextView name1 = (TextView) findViewById(R.id.textViewName);
        final TextView desc = (TextView) findViewById(R.id.textViewDesc);

        final ImageView image = (ImageView) findViewById(R.id.image1);

        Item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name1.setText("Imie pierwsze");
                desc.setText("Opis1 Opis1 Opis1 Opis1 Opis1 Opis1 Opis1 Opis1 Opis1 Opis1 Opis1 Opis1 Opis1 Opis1 Opis1 Opis1 Opis1 Opis1" +
                        "Opis1 Opis1 Opis1 Opis1 Opis1 Opis1Opis1 Opis1 Opis1 Opis1 Opis1 Opis1Opis1 Opis1 Opis1 Opis1 Opis1 Opis1");


                image.setImageResource(R.drawable.car);

            }
        });


        Item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name1.setText("Nazawa druga");
                desc.setText("Opis2 Opis2 opis2 opis2 opis2 Opis2 Opis2 opis2 opis2 opis2Opis2 Opis2 opis2 opis2 opis2" +
                        "Opis2 Opis2 opis2 opis2 opis2Opis2 Opis2 opis2 opis2 opis2Opis2 Opis2 opis2 opis2 opis2");
                image.setImageResource(R.drawable.plane);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_first, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
