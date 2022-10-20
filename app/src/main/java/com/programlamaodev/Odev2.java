package com.programlamaodev;

import static java.lang.Integer.parseInt;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Odev2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.odev2);
    }

    public void check(View v) {

        EditText[] editText = {findViewById(R.id.num1),
                findViewById(R.id.num2),
                findViewById(R.id.num3),
                findViewById(R.id.num4),
                findViewById(R.id.num5)};

        View[] view = {findViewById(R.id.res1),
                findViewById(R.id.res2),
                findViewById(R.id.res3),
                findViewById(R.id.res4),
                findViewById(R.id.res5)};

        for (int i = 0; editText.length > i; i++) {
            if (parseInt(editText[i].getEditableText().toString()) < 20) view[i].setBackgroundColor(Color.GREEN);
            else view[i].setBackgroundColor(Color.RED);
        }

    }
}
