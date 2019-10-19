package com.example.forminput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tgl;
    RadioButton rb1, rb2;
    CheckBox ck1, ck2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tgl=findViewById(R.id.toggleButton);
        rb1=findViewById(R.id.radio1);
        rb2=findViewById(R.id.radio2);
        ck1=findViewById(R.id.checkBox);
        ck2=findViewById(R.id.checkBox2);

        rb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast toast = Toast.makeText(MainActivity.this, "ON", Toast.LENGTH_SHORT);
                toast.show();

                Toast.makeText(MainActivity.this, "You Turn ON", Toast.LENGTH_LONG).show();
            }
        });

        ck2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(MainActivity.this, "ON", Toast.LENGTH_SHORT).show();

                Toast.makeText(MainActivity.this, "You turn ON", Toast.LENGTH_SHORT).show();

                Toast.makeText(MainActivity.this,ck2.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        tgl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tgl.isChecked())
                    Toast.makeText(MainActivity.this, "You Turn ON", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
