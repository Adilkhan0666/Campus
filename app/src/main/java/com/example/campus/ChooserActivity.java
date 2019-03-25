package com.example.campus;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class ChooserActivity extends AppCompatActivity {
    RadioButton faculty_radiobutton,student_radiobutton;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooser);
        getSupportActionBar().hide();
        textView=findViewById(R.id.underline);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        faculty_radiobutton=findViewById(R.id.faculty_radio_button);
        student_radiobutton=findViewById(R.id.student_radio_button);

        faculty_radiobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooserActivity.this,LoginPage.class));
                finish();

            }
        });


        student_radiobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooserActivity.this,MainActivity.class));
                finish();

            }
        });
    }
}
