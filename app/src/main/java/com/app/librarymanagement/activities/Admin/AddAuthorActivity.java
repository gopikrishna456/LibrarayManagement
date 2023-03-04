package com.app.librarymanagement.activities.Admin;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.app.librarymanagement.R;

public class AddAuthorActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_author);
        findViewById(R.id.btnBack).setOnClickListener(view->{
            startActivity(new Intent(this,DashboardAdminActivity.class));
        });
        findViewById(R.id.btnAddBook).setOnClickListener(view->{
            startActivity(new Intent(this,AuthorsActivity.class));
        });
    }
}
