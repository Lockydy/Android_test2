package com.example.lockydy.test2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button button14=(Button)findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
