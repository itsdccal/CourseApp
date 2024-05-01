package com.example.courseapp.Activity;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.courseapp.Adapter.CoursesAdapter;
import com.example.courseapp.Domain.CoursesDomain;
import com.example.courseapp.R;

import java.util.ArrayList;

public class CourseListActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterCourseList;
    private RecyclerView recyclerViewCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_list);
        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<CoursesDomain> items = new ArrayList<>();
        items.add(new CoursesDomain("Advanced certification program in AI",1000000 , "ic_1"));
        items.add(new CoursesDomain("Google Cloud Platform Architecture", 2000000, "ic_2"));
        items.add(new CoursesDomain("Fundamental of Java Programming", 3000000, "ic_3"));
        items.add(new CoursesDomain("Introduction to UI design history", 4000000, "ic_4"));
        items.add(new CoursesDomain("PG Program in Big Data Engineering", 5000000, "ic_5"));

        recyclerViewCourse=findViewById(R.id.view);
        recyclerViewCourse.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));

        adapterCourseList = new CoursesAdapter(items);
        recyclerViewCourse.setAdapter(adapterCourseList);
    }
}