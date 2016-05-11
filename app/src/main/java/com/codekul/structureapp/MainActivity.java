package com.codekul.structureapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout.LayoutParams paramsLayout =new LinearLayout.LayoutParams(500,500);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setLayoutParams(paramsLayout);

        LinearLayout.LayoutParams paramsButton = new LinearLayout.LayoutParams(200,150);
        Button btnOkay = new Button(this);
        btnOkay.setLayoutParams(paramsButton);
        btnOkay.setText("Okay");
        linearLayout.addView(btnOkay);

        setContentView(linearLayout);
    }
}
