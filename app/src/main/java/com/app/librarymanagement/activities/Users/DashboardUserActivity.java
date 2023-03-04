package com.app.librarymanagement.activities.Users;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.app.librarymanagement.R;
import com.app.librarymanagement.activities.LoginActivity;

public class DashboardUserActivity extends AppCompatActivity {

    Button findBtn,btnMyShelf,myDues,btnAuthors,btnProfile,signOutBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dashboard);

        signOutBtn = findViewById(R.id.signOutBtn);
        findBtn = findViewById(R.id.findBtn);
        btnMyShelf = findViewById(R.id.btnMyShelves);
        myDues = findViewById(R.id.myDues);
        findBtn = findViewById(R.id.findBtn);
        btnAuthors = findViewById(R.id.btnAuthors);
        btnProfile = findViewById(R.id.btnProfile);

        findBtn.setOnClickListener(view->{
            startActivity(new Intent(this, FindBooksActivity.class));
        });
        btnAuthors.setOnClickListener(view->{
            startActivity(new Intent(this, AuthorsActivity.class));
        });
        btnMyShelf.setOnClickListener(view->{
            startActivity(new Intent(this, MyShelvesActivity.class));
        });
        myDues.setOnClickListener(view->{
            startActivity(new Intent(this, MyDuesActivity.class));
        });
        btnProfile.setOnClickListener(view->{
            Toast.makeText(this,"coming soon!",Toast.LENGTH_SHORT).show();
        });
        signOutBtn.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });
    }
}
