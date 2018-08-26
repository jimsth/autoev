package org.eu.twoox.autoev;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.util.Random;

public class os extends AppCompatActivity {
    public String[] mColors = { "283593", "ffea00", "00c853" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os);

        Random r = new Random();
        int Low = 1;
        int High = 5;
        int Result = r.nextInt(High - Low) + Low;

        switch (Integer.valueOf(Result)) {
            case 1:
                setContentView(R.layout.os1);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                ImageView iv_osl11 = (ImageView) findViewById(R.id.iv_osl11);
                iv_osl11.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_osl12 = (ImageView) findViewById(R.id.iv_osl12);
                iv_osl12.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_osl13 = (ImageView) findViewById(R.id.iv_osl13);
                iv_osl13.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                break;
            case 2:
                setContentView(R.layout.os2);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                ImageView iv_osl21 = (ImageView) findViewById(R.id.iv_osl21);
                iv_osl21.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_osl22 = (ImageView) findViewById(R.id.iv_osl22);
                iv_osl22.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_osl23 = (ImageView) findViewById(R.id.iv_osl23);
                iv_osl23.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_osl24 = (ImageView) findViewById(R.id.iv_osl24);
                iv_osl24.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_osl25 = (ImageView) findViewById(R.id.iv_osl25);
                iv_osl25.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_osl26 = (ImageView) findViewById(R.id.iv_osl26);
                iv_osl26.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                break;
            case 3:
                setContentView(R.layout.os3);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                ImageView iv_osl31 = (ImageView) findViewById(R.id.iv_osl31);
                iv_osl31.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_osl32 = (ImageView) findViewById(R.id.iv_osl32);
                iv_osl32.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_osl33 = (ImageView) findViewById(R.id.iv_osl33);
                iv_osl33.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_osl34 = (ImageView) findViewById(R.id.iv_osl34);
                iv_osl34.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_osl35 = (ImageView) findViewById(R.id.iv_osl35);
                iv_osl35.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_osl36 = (ImageView) findViewById(R.id.iv_osl36);
                iv_osl36.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                break;
            case 4:
                setContentView(R.layout.os4);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                ImageView iv_osl41 = (ImageView) findViewById(R.id.iv_osl41);
                iv_osl41.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_osl42 = (ImageView) findViewById(R.id.iv_osl42);
                iv_osl42.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_osl43 = (ImageView) findViewById(R.id.iv_osl43);
                iv_osl43.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                break;
            default:
                setContentView(R.layout.activity_main);
                break;
        }
    }
}

