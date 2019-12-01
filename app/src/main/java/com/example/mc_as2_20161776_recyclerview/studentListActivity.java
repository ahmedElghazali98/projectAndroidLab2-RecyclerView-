package com.example.mc_as2_20161776_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

public class studentListActivity extends AppCompatActivity {

    RecyclerView studentsList_rv;
    studentAdapter studentAdapter;

    List<student> studentList  = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);

        studentList.add(new student("std123 ","Ahmed Elghazali","first", (float) 88.8));//
        studentList.add(new student("std5454 ","Ahmed Ail","first", (float) 73.8));//
        studentList.add(new student("std646 ","Ahmed Omar","first", (float) 78.8));//
        studentList.add(new student("std754 ","Ahmed Eyad","first", (float) 98.8));//
        studentList.add(new student("std694 ","Enas Elghazali","first", (float) 68.8));//
        studentList.add(new student("std695469 ","nada Elghazali","first", (float) 83.8));//


        studentsList_rv = findViewById(R.id.studentList_rv);
        studentsList_rv.setLayoutManager(new LinearLayoutManager(this));
        studentAdapter = new studentAdapter(this ,studentList);
        studentsList_rv.setAdapter(studentAdapter);
    }
}
