package org.eu.twoox.autoev;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView refreshButtonnet = (TextView) findViewById(R.id.net_button);
        TextView refreshButtonos = (TextView) findViewById(R.id.os_button);
        TextView refreshButtondb = (TextView) findViewById(R.id.db_button);
        TextView refreshButtonsap = (TextView) findViewById(R.id.sap_button);
        refreshButtonnet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent i = new Intent(getApplicationContext(), net.class);
                 startActivity(i);
            }
        });
        refreshButtonos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), db.class);
                startActivity(i);
            }
        });
        refreshButtondb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), os.class);
                startActivity(i);
            }
        });
        refreshButtonsap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), sap.class);
                startActivity(i);
            }
        });
    }
//    public void RandomizerNet(View view) {
//
//        Random r = new Random();
//        int Low = 1;
//        int High = 5;
//        int Result = r.nextInt(High - Low) + Low;
//
//        switch (Integer.valueOf(Result)) {
//            case 1:
//                setContentView(R.layout.netl1);
//                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//                break;
//            case 2:
//                setContentView(R.layout.netl2);
//                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//                break;
//            case 3:
//                setContentView(R.layout.netl3);
//                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//                break;
//            case 4:
//                setContentView(R.layout.netl4);
//                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//                break;
//            default:
//                setContentView(R.layout.activity_main);
//                break;
//        }
//    }
//    public void RandomizerOS(View view) {
//
//        Random r = new Random();
//        int Low = 1;
//        int High = 5;
//        int Result = r.nextInt(High - Low) + Low;
//
//        switch (Integer.valueOf(Result)) {
//            case 1:
//                setContentView(R.layout.os1);
//                break;
//            case 2:
//                setContentView(R.layout.os2);
//                break;
//            case 3:
//                setContentView(R.layout.os3);
//                break;
//            case 4:
//                setContentView(R.layout.os4);
//                break;
//            default:
//                setContentView(R.layout.activity_main);
//                break;
//        }
//    }
//    public void RandomizerDB(View view) {
//
//        Random r = new Random();
//        int Low = 1;
//        int High = 5;
//        int Result = r.nextInt(High - Low) + Low;
//
//        switch (Integer.valueOf(Result)) {
//            case 1:
//                setContentView(R.layout.db1);
//                break;
//            case 2:
//                setContentView(R.layout.db2);
//                break;
//            case 3:
//                setContentView(R.layout.db3);
//                break;
//            case 4:
//                setContentView(R.layout.db4);
//                break;
//            default:
//                setContentView(R.layout.activity_main);
//                break;
//        }
//    }
//    public void RandomizerSAP(View view) {
//
//        Random r = new Random();
//        int Low = 1;
//        int High = 5;
//        int Result = r.nextInt(High - Low) + Low;
//
//        switch (Integer.valueOf(Result)) {
//            case 1:
//                setContentView(R.layout.sap1);
//                break;
//            case 2:
//                setContentView(R.layout.sap2);
//                break;
//            case 3:
//                setContentView(R.layout.sap3);
//                break;
//            case 4:
//                setContentView(R.layout.sap4);
//                break;
//            default:
//                setContentView(R.layout.activity_main);
//                break;
//        }
    }