package com.example.lockydy.test2;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Timer;

public class Main4Activity extends Activity {


    private int images[] = new int[]{R.drawable.p01,
            R.drawable.p02, R.drawable.p03,R.drawable.p04, R.drawable.p05};
    private ImageView imageView;
    private int index = 0;   //计算
    private Timer timer = new Timer();
    private Timertask timertask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button button15 = (Button) findViewById(R.id.button15);
        imageView=(ImageView)findViewById(R.id.imageView5);
        timertask = new Timertask();
        timer.schedule(timertask,0,500);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(msg.what == 0x111){
                index++;
                imageView.setImageResource(images[index % 5]);
            }
        }
    };
    class Timertask extends java.util.TimerTask{
        @Override
        public void run(){
            handler.sendEmptyMessage(0x111);
        }
    }
};
