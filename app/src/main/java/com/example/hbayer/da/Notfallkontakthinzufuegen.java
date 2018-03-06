package com.example.hbayer.da;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Notfallkontakthinzufuegen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notfallkontakthinzufuegen);

        /*final long StartListener;
        start.setOnClickListener(StartListener);
        final TextView vergangeneZeit = (TextView)findViewById(R.id.tvZeitaufzeichnungSeitBeginn);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartListener = SystemClock.uptimeMillis();
       */  //   }
        //   }); {
           /* @Override
            public void onClick(View v) {
                StartListener = SystemClock.uptimeMillis();
                chronometer.setBase(SystemClock.elapsedRealtime());
                chronometer.start();
                vergangeneZeit.setText((CharSequence) chronometer);
                }
        };*/

        /*View.OnClickListener mStopListener = new View.OnClickListener() {
            public void onClick(View v) {
                Button start = (Button) findViewById(R.id.btnWanderungStarten);
                Button ende = (Button) findViewById(R.id.btnWanderungBeenden);
                Chronometer chronometer = (Chronometer) findViewById(R.id.chronometer);chronometer.stop();
            }
        };*/

    }
}
