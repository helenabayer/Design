package com.example.hbayer.da;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.androidplot.xy.XYPlot;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Datenanzeigen extends AppCompatActivity {
    long abgelaufeneZeit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datenanzeigen);

        Calendar kalender = Calendar.getInstance();
        //TextView uhrzeit = (TextView) findViewById(R.id.tvUhrzeit);
        TextView datum = (TextView) findViewById(R.id.tvDatum);
        TextView zeitaufzeichnungStart = (TextView) findViewById(R.id.tvZeitaufzeichnungSeitBeginn);
//        Button btnStart;
//        Button btnStopp;

        //Zeitmessung seit Wanderungsbeginn
        SimpleDateFormat zeitformat = new SimpleDateFormat("HH:mm:ss");
        zeitaufzeichnungStart.setText(zeitformat.format(kalender.getTimeInMillis()));
        SimpleDateFormat zeitaufzeichnungAktuell = new SimpleDateFormat("HH:mm:ss");
        // SimpleDateFormat vergangeneZeit = zeitaufzeichnungStart-zeitaufzeichnungAktuell;
        //uhrzeit
        //SimpleDateFormat zeitformat = new SimpleDateFormat("HH:mm:ss");
        //uhrzeit.setText(zeitformat.format(kalender.getTime()));
        //datum
        SimpleDateFormat datumsformat = new SimpleDateFormat("EEEE', 'dd.MM.yyyy");
        datum.setText(datumsformat.format(kalender.getTime()));
        //StartStoppUhr
        //btnStart = (Button) findViewById(R.id.btnWanderungStarten);
        //btnStopp = (Button) findViewById(R.id.btnWanderungBeenden);
        //abgelaufeneZeit = 0;
        //btnStart.setOnClickListener(this);
        //btnStopp.setOnClickListener(this);

        abgelaufeneZeit = 0;
    }


    public void btnTemperaturGedrueckt(final View sources) {
        startActivity(new Intent(Datenanzeigen.this, Temperatur.class));

    }

    public void btnGeschwindigkeitGedrueckt(final View sources) {
        startActivity(new Intent(Datenanzeigen.this, Geschwindigkeit.class));

    }

    public void btnHoehenmeterGedrueckt(final View sources) {
        startActivity(new Intent(Datenanzeigen.this, Hoehenmeter.class));

    }

    public void btnPolltenflugdatenGedrueckt(final View sources) {
        startActivity(new Intent(Datenanzeigen.this, Pollenflugdaten.class));

    }

    public void btnLuftdrukGedrueckt(final View sources) {
        startActivity(new Intent(Datenanzeigen.this, Luftdruck.class));

    }

    public void btnGoogleMapsGedrueckt(final View sources) {
        startActivity(new Intent(Datenanzeigen.this, GoogleMaps.class));

    }

    public void btnWanderungBeendenGedrueck(final View sources) {
        startActivity(new Intent(Datenanzeigen.this, WanderungBeenden.class));

    }

}

