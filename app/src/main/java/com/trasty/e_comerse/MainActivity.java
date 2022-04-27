package com.trasty.e_comerse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.trasty.e_comerse.adapter.CategoryAdapter;
import com.trasty.e_comerse.adapter.CourseAdapter;
import com.trasty.e_comerse.model.Category;
import com.trasty.e_comerse.model.Course;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView categoryRecycler, courseRecycler;
    CategoryAdapter categoryAdapter;
    @SuppressLint("StaticFieldLeak")
    static CourseAdapter courseAdapter;
    static List<Course> courseList = new ArrayList<>();
    static List<Course> fullCoursesList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "Games"));
        categoryList.add(new Category(2, "Sites"));
        categoryList.add(new Category(3, "Languages"));
        categoryList.add(new Category(4, "Other"));

        setCategoryRecycler(categoryList);

        courseList.add(new Course(1, "java", "Java developer", "1/01/2022", "Beginner", "#424345", "test", 3));
        courseList.add(new Course(2, "python", "Python developer", "1/02/2022", "Beginner", "#9FA52D", "test", 3));
        courseList.add(new Course(3, "unity", "Unity developer", "1/03/2022", "Beginner", "#65173D", "test", 1));
        courseList.add(new Course(4, "front_end", "Front-end developer", "1/04/2022", "Beginner", "#B04935", "test", 2));

        fullCoursesList.addAll(courseList);

        setCourseRecycler(courseList);
    }

    public void openShoppingCard(View view){
        Intent intent = new Intent(this, OrderPage.class);
        startActivity(intent);
    }

    private void setCourseRecycler(List<Course> courseList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        courseRecycler = findViewById(R.id.courseRecycler);
        courseRecycler.setLayoutManager(layoutManager);

        courseAdapter = new CourseAdapter(this, courseList);
        courseRecycler.setAdapter(courseAdapter);
    }

    private void setCategoryRecycler(List<Category> categoryList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        categoryRecycler = findViewById(R.id.categoryRecycler);
        categoryRecycler.setLayoutManager(layoutManager);

        categoryAdapter = new CategoryAdapter(this, categoryList);
        categoryRecycler.setAdapter(categoryAdapter);

    }

    public static void showCoursesByCategory(int category) {

        courseList.clear();
        courseList.addAll(fullCoursesList);

        List<Course> filterCourses = new ArrayList<>();

        for (Course c: courseList) {
            if (c.getCategory() == category) {
                filterCourses.add(c);
            }
        }

        courseList.clear();
        courseList.addAll(filterCourses);

        courseAdapter.notifyDataSetChanged();
    }

}