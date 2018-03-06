package com.example.hbayer.da;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.androidplot.xy.XYPlot;

public class Luftdruck extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datenanzeigengeklickt);
        XYPlot plot;
        plot = (XYPlot) findViewById(R.id.plot);
        plot.setTitle("Luftdruck");
        plot.setDomainLabel("Zeit");
        plot.setRangeLabel("bar");
    }
}
