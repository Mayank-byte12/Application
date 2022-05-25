package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

class MainActivity extends AppCompatActivity {
    EditText nameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.etName);
        Employee employee = new Employee("mayank",23,true);
        employee.seteName("nikhil");
        Student abdul = new Student("ansari",123,true);
    }

    public void handleClick(View view) {
        String name = nameEditText.getText().toString();
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
        Intent hIntent = new Intent(MainActivity.this, Activity.class);
        startActivity(hIntent);
    }
}