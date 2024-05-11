package com.example.eleventhguidedexercise;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ge11IntentResultActivity extends AppCompatActivity {
    TextView name, age, gender, subjects, job, thesis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ge11_intent_result);
        init();
        showResults();
    }
    public void init(){
        name = findViewById(R.id.tvNameGE11);
        age = findViewById(R.id.tvAgeGE11);
        gender = findViewById(R.id.tvGenderGE11);
        subjects = findViewById(R.id.tvSubjectsGE11);
        job = findViewById(R.id.tvJobGE11);
        thesis = findViewById(R.id.tvThesisGE11);
    }
    public void showResults(){
        name.setText("Name: " + getIntent().getStringExtra("id_name"));
        age.setText("Age: " +getIntent().getStringExtra("id_age"));
        gender.setText("Gender: " +getIntent().getStringExtra("id_gender"));
        subjects.setText("Subjects: \n" +getIntent().getStringExtra("id_subjects"));
        job.setText("Job: " +getIntent().getStringExtra("id_job"));
        thesis.setText("Thesis Topic: " +getIntent().getStringExtra("id_thesis"));
    }
}
