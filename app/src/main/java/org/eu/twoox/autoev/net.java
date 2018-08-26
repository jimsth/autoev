package org.eu.twoox.autoev;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.util.Random;

public class net extends AppCompatActivity {
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
                setContentView(R.layout.netl1);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                ImageView iv_netl1 = (ImageView) findViewById(R.id.iv_netl1);
                iv_netl1.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                break;
            case 2:
                setContentView(R.layout.netl2);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                ImageView iv_netl21 = (ImageView) findViewById(R.id.iv_netl21);
                iv_netl21.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_netl22 = (ImageView) findViewById(R.id.iv_netl22);
                iv_netl22.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_netl23 = (ImageView) findViewById(R.id.iv_netl23);
                iv_netl23.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_net24 = (ImageView) findViewById(R.id.iv_netl24);
                iv_net24.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                break;
            case 3:
                setContentView(R.layout.netl3);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                ImageView iv_netl31 = (ImageView) findViewById(R.id.iv_netl31);
                iv_netl31.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_netl32 = (ImageView) findViewById(R.id.iv_netl32);
                iv_netl32.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_netl33 = (ImageView) findViewById(R.id.iv_netl33);
                iv_netl33.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                break;
            case 4:
                setContentView(R.layout.netl4);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                ImageView iv_netl41 = (ImageView) findViewById(R.id.iv_netl41);
                iv_netl41.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                ImageView iv_netl42 = (ImageView) findViewById(R.id.iv_netl42);
                iv_netl42.setBackgroundColor(Color.parseColor ("#"+mColors[new Random().nextInt(3)]));
                break;
            default:
                setContentView(R.layout.activity_main);
                break;
        }
    }
}
