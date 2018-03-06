package com.example.hbayer.da;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.SystemClock;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.androidplot.ui.widget.TextLabelWidget;
import com.androidplot.xy.XYPlot;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.RunnableFuture;
import android.app.Activity;
import android.graphics.*;
import android.os.Bundle;

import com.androidplot.util.PixelUtils;
import com.androidplot.xy.SimpleXYSeries;
import com.androidplot.xy.XYSeries;
import com.androidplot.xy.*;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.*;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public final String SmsSenden = "06509808173";
   /* Button start = (Button) findViewById(R.id.btnWanderungStarten);
    Button ende = (Button) findViewById(R.id.btnWanderungBeenden);
    Chronometer chronometer = (Chronometer) findViewById(R.id.chronometer);*/
    Boolean pressedOnce=false;
    Boolean canClose= true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.startseite);
        Button start = (Button) findViewById(R.id.btnWanderungStarten);
        Button ende = (Button) findViewById(R.id.btnWanderungBeenden);
        Chronometer chronometer = (Chronometer) findViewById(R.id.chronometer);

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == event.KEYCODE_BACK) {
            if (!pressedOnce) {
                pressedOnce = true;
                Toast.makeText(getApplicationContext(), "Zum beenden erneut drücken!!", Toast.LENGTH_SHORT).show();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        pressedOnce = false;
                    }
                }, 4000);
            } else if (pressedOnce) {
                pressedOnce = false;
                onBackPressed();
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }



    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //int i = getFragmentManager().getBackStackEntryCount();
        //if (i > 0) {
         //   getFragmentManager().popBackStack();
        // if (i == 1) {
              //  ImageView ivStart = (ImageView) findViewById(R.id.ivStart);
               // ivStart.setColorFilter(Color.rgb(255, 255, 255), android.graphics.PorterDuff.Mode.MULTIPLY);
         //   }
       // } //else
            //super.onBackPressed();

    }




    public void btnWanderungStarten(final View sources) {

        startActivity(new Intent(MainActivity.this, Datenanzeigen.class));
    }




    public void btnNotfallkontaktgedrueckt(final View sources) {

        startActivity(new Intent(MainActivity.this, Notfallkontakthinzufuegen.class));

    }

    public void btnKontaktHinzufuegenGedrueckt(final View sources) {
      /*  EditText vn = (EditText) findViewById(R.id.etVorname);
        EditText nn = (EditText) findViewById(R.id.etNachname);
        EditText telNr = (EditText) findViewById(R.id.etTelefonnummer);
        String anruf = telNr.toString();
        EditText email = (EditText) findViewById(R.id.etEmail);
        CheckBox smsCheck = (CheckBox) findViewById(R.id.cbSMS);
        CheckBox emailCheck = (CheckBox) findViewById(R.id.cbEmail);*/
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

    public void zuLangePause(final View sources) {

        startActivity(new Intent(MainActivity.this, ZulangePause.class));

    }

    public void sturzWahrgenommen(final View sources) {

        startActivity(new Intent(MainActivity.this, Sturz.class));


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
