package org.eu.twoox.autoev;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.util.Random;

public class sap extends AppCompatActivity {
    public String[] mColors = { "283593", "ffea00", "00c853" };
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
                setContentView(R.layout.sap1);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                ImageView iv_sapl11 = (ImageView) findViewById(R.id.iv_sapl11);
                iv_sapl11.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_sapl12 = (ImageView) findViewById(R.id.iv_sapl12);
                iv_sapl12.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_sapl13 = (ImageView) findViewById(R.id.iv_sapl13);
                iv_sapl13.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_sapl14 = (ImageView) findViewById(R.id.iv_sapl14);
                iv_sapl14.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_sapl15 = (ImageView) findViewById(R.id.iv_sapl15);
                iv_sapl15.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_sapl16 = (ImageView) findViewById(R.id.iv_sapl16);
                iv_sapl16.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_sapl17 = (ImageView) findViewById(R.id.iv_sapl17);
                iv_sapl17.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                break;
            case 2:
                setContentView(R.layout.sap2);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                ImageView iv_sapl21 = (ImageView) findViewById(R.id.iv_sapl21);
                iv_sapl21.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_sapl22 = (ImageView) findViewById(R.id.iv_sapl22);
                iv_sapl22.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_sapl23 = (ImageView) findViewById(R.id.iv_sapl23);
                iv_sapl23.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_sapl24 = (ImageView) findViewById(R.id.iv_sapl24);
                iv_sapl24.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_sapl25 = (ImageView) findViewById(R.id.iv_sapl25);
                iv_sapl25.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_sapl26 = (ImageView) findViewById(R.id.iv_sapl26);
                iv_sapl26.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_sapl27 = (ImageView) findViewById(R.id.iv_sapl27);
                iv_sapl27.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_sapl28 = (ImageView) findViewById(R.id.iv_sapl28);
                iv_sapl28.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_sapl29 = (ImageView) findViewById(R.id.iv_sapl29);
                iv_sapl29.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_sapl210 = (ImageView) findViewById(R.id.iv_sapl210);
                iv_sapl210.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                break;
            case 3:
                setContentView(R.layout.sap3);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                ImageView iv_sapl31 = (ImageView) findViewById(R.id.iv_sapl31);
                iv_sapl31.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_sapl32 = (ImageView) findViewById(R.id.iv_sapl32);
                iv_sapl32.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_sapl33 = (ImageView) findViewById(R.id.iv_sapl33);
                iv_sapl33.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_sapl34 = (ImageView) findViewById(R.id.iv_sapl34);
                iv_sapl34.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_sapl35 = (ImageView) findViewById(R.id.iv_sapl35);
                iv_sapl35.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_sapl36 = (ImageView) findViewById(R.id.iv_sapl36);
                iv_sapl36.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_sapl37 = (ImageView) findViewById(R.id.iv_sapl37);
                iv_sapl37.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                break;
            case 4:
                setContentView(R.layout.sap4);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                ImageView iv_sapl41 = (ImageView) findViewById(R.id.iv_sapl41);
                iv_sapl41.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_sapl42 = (ImageView) findViewById(R.id.iv_sapl42);
                iv_sapl42.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_sapl43 = (ImageView) findViewById(R.id.iv_sapl43);
                iv_sapl43.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_sapl44 = (ImageView) findViewById(R.id.iv_sapl44);
                iv_sapl44.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_sapl45 = (ImageView) findViewById(R.id.iv_sapl45);
                iv_sapl45.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                break;
            default:
                setContentView(R.layout.activity_main);
                break;
        }
    }
}