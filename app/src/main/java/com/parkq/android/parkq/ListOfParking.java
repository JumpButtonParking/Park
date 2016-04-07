package com.parkq.android.parkq;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListOfParking extends MainActivity {
    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_parking);

        btn1 = (Button) findViewById(R.id.hd_btn);
        btn2 = (Button) findViewById(R.id.wm_btn);
    }

}
