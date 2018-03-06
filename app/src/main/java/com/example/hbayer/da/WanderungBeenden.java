package com.example.hbayer.da;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WanderungBeenden extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datenanalyse);
        long abgelaufeneZeit=0;
        long zeitbeendet;
        zeitbeendet = System.currentTimeMillis();
        long endZeit = zeitbeendet - abgelaufeneZeit;
        //zeitaufzeichnung.setText((int) endZeit);

    }
}
