package com.example.opilane.a19122017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class ButtonsActivity extends AppCompatActivity {
    TextView textview,textView;
    Switch aSwitch

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);

        textview=findViewById(R.id.textview);
        textview=findViewById(R.id.textview);
        aSwitch=findViewById(R.id.switchButton);



    public void changeState(View view) {
    boolean checked= ((ToggleButton)view).isChecked();
    if (checked){
        View textview2;
        textview2.setVisibility(View.VISIBLE);
        textview2.set


    }else {
        textview.setVisibility(View.INVISIBLE);
    }



    }}