package com.example.hbayer.da;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

/**
 * Created by hbayer on 05.01.2018.
 */
public class NotfallKontaktDaten {

    public NotfallKontaktDaten(String vorname, String nachname, String telefonnummer, String emailadresse, boolean smsTrue, boolean emailTrue)
    {
        this.vorname = vorname;
        this.nachname = nachname;
        this.telefonnummer = telefonnummer;
        this.emailadresse = emailadresse;
        this.smsTrue = smsTrue;
        this.emailTrue = emailTrue;
    }

    String vorname;
    String nachname;
    String telefonnummer;
    String emailadresse;
    boolean smsTrue=true;
    boolean emailTrue=true;

}
