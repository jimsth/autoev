package org.eu.twoox.autoev;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.util.Random;

public class db extends AppCompatActivity {
    public String[] mColors = { "283593", "ffea00", "00c853" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_db);

        Random r = new Random();
        int Low = 1;
        int High = 5;
        int Result = r.nextInt(High - Low) + Low;

        switch (Integer.valueOf(Result)) {
            case 1:
                setContentView(R.layout.db1);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                ImageView iv_dbl11 = (ImageView) findViewById(R.id.iv_dbl11);
                iv_dbl11.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_dbl12 = (ImageView) findViewById(R.id.iv_dbl12);
                iv_dbl12.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_dbl13 = (ImageView) findViewById(R.id.iv_dbl13);
                iv_dbl13.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_dbl14 = (ImageView) findViewById(R.id.iv_dbl14);
                iv_dbl14.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_dbl15 = (ImageView) findViewById(R.id.iv_dbl15);
                iv_dbl15.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                break;
            case 2:
                setContentView(R.layout.db2);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                ImageView iv_dbl21 = (ImageView) findViewById(R.id.iv_dbl21);
                iv_dbl21.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_dbl22 = (ImageView) findViewById(R.id.iv_dbl22);
                iv_dbl22.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_dbl23 = (ImageView) findViewById(R.id.iv_dbl23);
                iv_dbl23.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_dbl24 = (ImageView) findViewById(R.id.iv_dbl24);
                iv_dbl24.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_dbl25 = (ImageView) findViewById(R.id.iv_dbl25);
                iv_dbl25.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_dbl26 = (ImageView) findViewById(R.id.iv_dbl26);
                iv_dbl26.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_dbl27 = (ImageView) findViewById(R.id.iv_dbl27);
                iv_dbl27.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_dbl28 = (ImageView) findViewById(R.id.iv_dbl28);
                iv_dbl28.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_dbl29 = (ImageView) findViewById(R.id.iv_dbl29);
                iv_dbl29.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_dbl210 = (ImageView) findViewById(R.id.iv_dbl210);
                iv_dbl210.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                break;
            case 3:
                setContentView(R.layout.db3);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                ImageView iv_dbl31 = (ImageView) findViewById(R.id.iv_dbl31);
                iv_dbl31.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_dbl32 = (ImageView) findViewById(R.id.iv_dbl32);
                iv_dbl32.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_dbl33 = (ImageView) findViewById(R.id.iv_dbl33);
                iv_dbl33.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_dbl34 = (ImageView) findViewById(R.id.iv_dbl34);
                iv_dbl34.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_dbl35 = (ImageView) findViewById(R.id.iv_dbl35);
                iv_dbl35.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_dbl36 = (ImageView) findViewById(R.id.iv_dbl36);
                iv_dbl36.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_dbl37 = (ImageView) findViewById(R.id.iv_dbl37);
                iv_dbl37.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_dbl38 = (ImageView) findViewById(R.id.iv_dbl38);
                iv_dbl38.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_dbl39 = (ImageView) findViewById(R.id.iv_dbl39);
                iv_dbl39.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                break;
            case 4:
                setContentView(R.layout.db4);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                ImageView iv_dbl41 = (ImageView) findViewById(R.id.iv_dbl41);
                iv_dbl41.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_dbl42 = (ImageView) findViewById(R.id.iv_dbl42);
                iv_dbl42.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_dbl43 = (ImageView) findViewById(R.id.iv_dbl43);
                iv_dbl43.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_dbl44 = (ImageView) findViewById(R.id.iv_dbl44);
                iv_dbl44.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_dbl45 = (ImageView) findViewById(R.id.iv_dbl45);
                iv_dbl45.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_dbl46 = (ImageView) findViewById(R.id.iv_dbl46);
                iv_dbl46.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_dbl47 = (ImageView) findViewById(R.id.iv_dbl47);
                iv_dbl47.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                break;
            default:
                setContentView(R.layout.activity_main);
                break;
        }
    }
}