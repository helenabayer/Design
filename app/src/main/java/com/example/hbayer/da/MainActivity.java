package com.example.hbayer.da;

import android.content.Intent;
import android.net.Uri;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    long abgelaufeneZeit;
    public final String SmsSenden="06509808173";
    Button start = (Button) findViewById(R.id.btnWanderungStarten);
    Button ende = (Button)findViewById(R.id.btnWanderungBeenden);
    Chronometer chronometer = (Chronometer) findViewById(R.id.chronometer);


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.startseite);


     }

    public void btnWanderungStarten(final View sources) {
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

        abgelaufeneZeit= 0;
        start.setOnClickListener(this);
        ende.setOnClickListener(this);



    }
    public void btnWanderungAbbrechenGedrueck(final View sources)
    {
        setContentView(R.layout.datenanalyse);
    }
    public void btnWanderungFortsetzenGedrueck(final View sources)
    {
        setContentView(R.layout.datenanzeigen



        );
    }


    public void btnWanderungBeendenGedrueck(final View sources) {
        long zeitbeendet;
        zeitbeendet = System.currentTimeMillis();
        long endZeit = zeitbeendet - abgelaufeneZeit;
        //zeitaufzeichnung.setText((int) endZeit);
        setContentView(R.layout.datenanalyse);
    }
    public void btnNotfallkontaktgedrueckt(final View sources) {
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
        View.OnClickListener mStopListener = new View.OnClickListener() {
            public void onClick(View v) {
                chronometer.stop();
            }
        };

    }

    public void btnKontaktHinzufuegenGedrueckt(final View sources)
    {
        EditText vn= (EditText)findViewById(R.id.etVorname);
        EditText nn= (EditText)findViewById(R.id.etNachname);
        EditText telNr= (EditText)findViewById(R.id.etTelefonnummer);
        String anruf= telNr.toString();
        EditText email= (EditText)findViewById(R.id.etEmail);
        CheckBox smsCheck = (CheckBox)findViewById(R.id.cbSMS);
        CheckBox emailCheck= (CheckBox)findViewById(R.id.cbEmail);
////        //NotfallKontaktDaten kontaktDaten= new NotfallKontaktDaten(
//                //kontaktDaten.vorname=vn.toString(),
//                //kontaktDaten.nachname=nn.toString(),
//                //kontaktDaten.telefonnummer=anruf,
//                //kontaktDaten.emailadresse=email.toString(),
//               // kontaktDaten.smsTrue=smsCheck,
//                //kontaktDaten.emailTrue=emailCheck;
//
//
//
//       // );
//
////        //Anruf
////        Intent intent = new Intent();
////        //intent.setAction(Intent.ACTION_CALL);
////        //intent.setData(Uri.parse("tel:"+telNr.toString()));
////        //startActivity(intent);
////        if(smsCheck.isChecked())
////        {
////            //SMS senden
////            SmsManager manager= SmsManager.getDefault();
////            String smsText = "Test Trekking Companion";
////            manager.sendTextMessage(SmsSenden, null, smsText, null, null);
////        }
////        if(emailCheck.isChecked())
////        {
////            //Email senden
////            intent.setAction(Intent.ACTION_SEND);
////            intent.setType("message/rfc822");
////            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{("helena.bayer98@gmail.com")});
////            intent.putExtra(Intent.EXTRA_SUBJECT, "Warnung!!");
////            intent.putExtra(Intent.EXTRA_TEXT, "Der Benutzer der Trekking Companion App ist gestürzt!!");
////
////        }
////        if(smsCheck.isChecked()&&emailCheck.isChecked())
////        {
////            //SMS senden
////            SmsManager manager= SmsManager.getDefault();
////            String smsText = "Test Trekking Companion";
////            manager.sendTextMessage(SmsSenden, null, smsText, null, null);
////
////            //Email senden
////            intent.setAction(Intent.ACTION_SEND);
////            intent.setType("message/rfc822");
////            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{("helena.bayer98@gmail.com")});
////            intent.putExtra(Intent.EXTRA_SUBJECT, "Warnung!!");
////            intent.putExtra(Intent.EXTRA_TEXT, "Der Benutzer der Trekking Companion App ist gestürzt!!");
////        }

        setContentView(R.layout.startseite);

}
    public void zuLangePause(final View sources)
    {
        final TextView sekAnzahl= (TextView)findViewById(R.id.tVSekundenAnzahl);
        final CountDownTimer start = new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                sekAnzahl.setText((int) (millisUntilFinished / 1000));
            }

            public void onFinish() {
            sekAnzahl.setText("");            }
        }.start();

    }


    @Override
    public void onClick(View v) {

    }

    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public void onStop() {
        super.onStop();


    }
}
