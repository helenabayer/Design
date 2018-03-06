package com.example.hbayer.da;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.androidplot.xy.XYPlot;

/**
 * Created by hbayer on 28.02.2018.
 */
public class Graph extends Activity {
    private XYPlot plot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datenanzeigengeklickt);
    }
    public void btnTemperaturGedrueckt(final View sources) {
        setContentView(R.layout.datenanzeigengeklickt);
    }

    public void btnGeschwindigkeitGedrueckt(final View sources) {
        setContentView(R.layout.datenanzeigengeklickt);
    }

    public void btnHoehenmeterGedrueckt(final View sources) {
        setContentView(R.layout.datenanzeigengeklickt);
    }

    public void btnPolltenflugdatenGedrueckt(final View sources) {
        setContentView(R.layout.datenanzeigengeklickt);
    }

    public void btnLuftdrukGedrueckt(final View sources) {
        setContentView(R.layout.datenanzeigengeklickt);
    }

    public void btnGoogleMapsGedrueckt(final View sources) {
        setContentView(R.layout.datenanzeigengeklickt);
    }
}
