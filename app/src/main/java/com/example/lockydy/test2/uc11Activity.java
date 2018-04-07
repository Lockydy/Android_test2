package com.example.lockydy.test2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class uc11Activity extends Activity {

    View layoutMain=null;
    View layoutsecond=null;
    View layoutthird=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater=this.getLayoutInflater();
        layoutMain=inflater.inflate(R.layout.activity_main2,null);
        layoutsecond=inflater.inflate(R.layout.activity_uc11,null);
        layoutthird=inflater.inflate(R.layout.activity_uc12,null);
        setContentView(R.layout.activity_uc11);
        Button button6=(Button)findViewById(R.id.button6);
        Button button7=(Button)findViewById(R.id.button7);
        Button button8=(Button)findViewById(R.id.button8);
        Button button9=(Button)findViewById(R.id.button9);

        button6.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(uc11Activity.this,uc11Activity.class);
                startActivity(intent);
            }
        });
        button7.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v){
                Intent intent=new Intent(uc11Activity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

        button8.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(uc11Activity.this,uc12Activity.class);
                startActivity(intent);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent=new Intent(uc11Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    };
}
