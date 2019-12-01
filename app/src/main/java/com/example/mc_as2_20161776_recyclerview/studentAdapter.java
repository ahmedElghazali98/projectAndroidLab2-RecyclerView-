package com.example.mc_as2_20161776_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import android.content.Intent;

import static com.example.mc_as2_20161776_recyclerview.R.id.student_id_des;

public class studentAdapter extends RecyclerView.Adapter<studentAdapter.studenVh> {


    Context context ;
    List<student> studentList;

    public studentAdapter(Context context ,  List<student> studentList) {
        this.context = context;
        this.studentList = studentList;
    }


    @NonNull
    @Override
    public studentAdapter.studenVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(context).inflate(R.layout.studen_row , parent , false);
        return new studenVh(view);
    }

    @Override
    public void onBindViewHolder(@NonNull studenVh holder, int position) {
        final String id = studentList.get(position).getId();
        final String name = studentList.get(position).getName();
        final String level = studentList.get(position).getLevel();
        final float avg = studentList.get(position).getAvg();

        final String avgStr= avg+"";
        holder.setData(studentList.get(position));
        holder.RelativeLayout_row_student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context,student_des.class);
                intent.putExtra("id", id);
                intent.putExtra("name", name);
                intent.putExtra("level", level);
                intent.putExtra("avg", avgStr);

                context.startActivity(intent);



            }
        });

    }


    @Override
    public int getItemCount() {
        return studentList.size();
    }



    class studenVh extends RecyclerView.ViewHolder{
        TextView  student_name , studen_level , student_avg;
        RelativeLayout RelativeLayout_row_student ;
        public studenVh(@NonNull View itemView) {
            super(itemView);
            student_name = itemView.findViewById(R.id.student_name);
            studen_level = itemView.findViewById(R.id.studen_level);
            student_avg = itemView.findViewById(R.id.student_avg);
            RelativeLayout_row_student = itemView.findViewById(R.id.RelativeLayout_row_student);

        }

        public void setData(student std) {
            student_name.setText(std.getName());
            studen_level.setText("Level:"+std.getLevel());
            student_avg.setText("Avg:"+std.getAvg()+"%");

        }
    }



}
