package com.example.kirstiebooras.navbarexample;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MarketAppActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Context context = this;
        setContentView(R.layout.activity_market_app);
        NavBar navbar = (NavBar) findViewById(R.id.navBar);

        navbar.setButton1("Button 1", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Button 1 clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        navbar.setButton2("Button 2", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Button 2 clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        navbar.setButton3("Button 3", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Button 3 clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_market_app, menu);
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
