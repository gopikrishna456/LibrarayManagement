package com.app.librarymanagement.activities.Admin;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.app.librarymanagement.R;

public class RequestedBookDetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_request_view);
        findViewById(R.id.btnBack).setOnClickListener(view->{
            this.finish();
        });
    }
}
