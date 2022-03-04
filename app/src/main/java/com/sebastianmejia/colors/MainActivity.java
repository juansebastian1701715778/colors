package com.sebastianmejia.colors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView lblTargetColor = null;
    private TextView lblProposedColor = null;
    private SeekBar sbrRed = null;
    private SeekBar sbrGreen = null;
    private SeekBar sbrBlue = null;
    private TextView lblRedValue = null;
    private TextView lblGreenValue = null;
    private TextView lblBlueValue = null;
    private Button btnGetScore = null;
    private Button btnNewColor = null;

    private ColorsGame colorsGame = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void initViews(){
        lblTargetColor = findViewById(R.id.TargetColor);
        lblProposedColor = findViewById(R.id.ProposedColor);
        sbrRed = findViewById(R.id.sbrRed);
        sbrGreen = findViewById(R.id.sbrGreen);
        sbrBlue = findViewById(R.id.sbrBlue);
        lblRedValue = findViewById(R.id.RedValue);
        lblGreenValue = findViewById(R.id.GreenValue);
        lblBlueValue = findViewById(R.id.BlueValue);
        btnGetScore = findViewById(R.id.btnGetScore);
        btnNewColor = findViewById(R.id.btnNewColor);

    }

    public void initEvents(){

    }
}