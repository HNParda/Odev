package com.programlamaodev;

import static java.lang.Integer.parseInt;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Odev1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.odev1);
    }

    public void check(View v) {

        EditText[] editText = {findViewById(R.id.num1),
                findViewById(R.id.num2),
                findViewById(R.id.num3),
                findViewById(R.id.num4),
                findViewById(R.id.num5)};

        StringBuilder s = new StringBuilder("  ");

        for (EditText text : editText) {
            String temp = text.getEditableText().toString();
            if (parseInt(temp) < 20) s.append(temp).append("  ");
        }

        ((TextView)findViewById(R.id.text)).setText(s);
    }

}
