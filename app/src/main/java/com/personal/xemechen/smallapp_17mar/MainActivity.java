package com.personal.xemechen.smallapp_17mar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText et = (EditText) findViewById(R.id.editText);
        String newText = et == null? "" : et.getText().toString();
        if(newText.trim().length() > 0){
            Toast.makeText(this, "New Text Entered", Toast.LENGTH_SHORT).show();
            intent.putExtra(EXTRA_MESSAGE, newText);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Text required", Toast.LENGTH_SHORT).show();
        }
    }
}
