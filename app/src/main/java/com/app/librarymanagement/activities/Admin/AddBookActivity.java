package com.app.librarymanagement.activities.Admin;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.app.librarymanagement.R;

public class AddBookActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book);
        findViewById(R.id.btnBack).setOnClickListener(view->{
            this.finish();
        });
        findViewById(R.id.btnAddBook).setOnClickListener(view->{
            startActivity(new Intent(this,BooksActivity.class));
        });
    }
}
