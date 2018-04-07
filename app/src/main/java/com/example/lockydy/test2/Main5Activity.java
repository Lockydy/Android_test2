package com.example.lockydy.test2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main5Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Button button19=(Button)findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
