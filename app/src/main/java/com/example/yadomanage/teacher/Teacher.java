package com.example.yadomanage.teacher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yadomanage.R;

public class Teacher extends AppCompatActivity {
    TextView tlastname,tfirstname,temail,tpasswd,tcpasswd ,tlogin;
    RadioGroup radioGroup;
    RadioButton radioButton;
    Button btnregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);

        tlogin = (TextView) findViewById(R.id.txtlogin);
        tlastname = findViewById(R.id.txthogv);
        tfirstname = findViewById(R.id.txttengv);
        temail = findViewById(R.id.txtemail);
        tpasswd = findViewById(R.id.txtmkgv);
        tcpasswd= findViewById(R.id.txtcmkgv);
        radioGroup = findViewById(R.id.radioGroup);
        radioButton = findViewById(radioGroup.getCheckedRadioButtonId());
        btnregister =findViewById(R.id.btntaotkgv);

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tlastname.getText().toString()==""){
                    Toast.makeText(getApplicationContext(),"Nhap thong tin de",Toast.LENGTH_LONG).show();
                }
            }
        });



        tlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TeacherLogin = new Intent(Teacher.this, TeacherLogin.class);
                startActivity(TeacherLogin);
            }
        });
    }
}