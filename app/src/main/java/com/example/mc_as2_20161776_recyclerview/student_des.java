package com.example.mc_as2_20161776_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class student_des extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_student_des);

        String id = getIntent().getStringExtra("id");
        String name = getIntent().getStringExtra("name");
        String level = getIntent().getStringExtra("level");
        String avg = getIntent().getStringExtra("avg");

        TextView student_id_dss,student_name_dss,student_level_dss ,student_avg_dss;
        student_id_dss = (TextView)findViewById(R.id.student_id_des);
        student_name_dss = (TextView)findViewById(R.id.student_name_des);
        student_level_dss =(TextView) findViewById(R.id.student_level_des);
        student_avg_dss = (TextView)findViewById(R.id.student_avg_des);

        student_id_dss.setText("Id: " +id);
        student_name_dss.setText("Name: "+name);
        student_level_dss.setText("Level: "+level);
        student_avg_dss.setText("Avg: "+avg);

    }
}
