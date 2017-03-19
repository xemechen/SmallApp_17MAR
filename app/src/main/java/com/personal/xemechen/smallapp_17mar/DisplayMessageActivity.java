package com.personal.xemechen.smallapp_17mar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String newText = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(newText);
    }
}
