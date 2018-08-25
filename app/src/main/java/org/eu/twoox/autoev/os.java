package org.eu.twoox.autoev;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Random;

public class os extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_net);

        Random r = new Random();
        int Low = 1;
        int High = 5;
        int Result = r.nextInt(High - Low) + Low;

        switch (Integer.valueOf(Result)) {
            case 1:
                setContentView(R.layout.os1);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                break;
            case 2:
                setContentView(R.layout.os2);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                break;
            case 3:
                setContentView(R.layout.os3);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                break;
            case 4:
                setContentView(R.layout.os4);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                break;
            default:
                setContentView(R.layout.activity_main);
                break;
        }
    }
}
