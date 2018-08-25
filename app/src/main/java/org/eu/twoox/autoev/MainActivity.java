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
}