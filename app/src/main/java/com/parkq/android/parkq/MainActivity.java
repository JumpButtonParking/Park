package com.parkq.android.parkq;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.Date;
import java.text.DateFormat;


public class MainActivity extends ActionBarActivity {
    Button btn1;
    Button btn2;

    // Chris - Testing push to see if works.... Mar 29 7:46
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_parking);

        btn1 = (Button) findViewById(R.id.hd_btn);
        btn2 = (Button) findViewById(R.id.wm_btn);

//       // TextView mytext = (TextView) findViewById(R.id.sunset_park_id);
//        TextView booked_local_sunset = (TextView) findViewById(R.id.booked_location_sunset);
//        Typeface mytype = Typeface.createFromAsset(this.getAssets(),"Lato-Black.ttf");
//       // mytext.setTypeface(mytype);
//        booked_local_sunset.setTypeface(mytype);
//
//        Spinner payment_spinner = (Spinner) findViewById(R.id.credit_card_spinner);
//        // Create an ArrayAdapter using the string array and a default spinner layout
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.credit_cards, android.R.layout.simple_spinner_item);
//        // Specify the layout to use when the list of choices appears
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        // Apply the adapter to the spinner
//        payment_spinner.setAdapter(adapter);
//
//        //puts the time curent time on the app
//        TextView curr_time = (TextView) findViewById(R.id.booked_current_time);
//        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
//        curr_time.setText(currentDateTimeString);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void WMBtnClicked(View v) {
        btn2.setBackgroundColor(Color.WHITE);
        btn1.setBackgroundColor(Color.parseColor("#D8D8D8"));
    }

    public void HDBtnClicked(View v) {
        btn1.setBackgroundColor(Color.WHITE);
        btn2.setBackgroundColor(Color.parseColor("#D8D8D8"));
    }
}
