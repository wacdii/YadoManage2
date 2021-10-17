package com.example.yadomanage.teacher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.yadomanage.R;

public class TeacherLogin extends AppCompatActivity {
    Button btndangnhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_login);

        btndangnhap = (Button) findViewById(R.id.btndangnhap);

        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TeacherHome = new Intent(TeacherLogin.this,TeacherHome.class);
                startActivity(TeacherHome);
            }
        });
    }
}