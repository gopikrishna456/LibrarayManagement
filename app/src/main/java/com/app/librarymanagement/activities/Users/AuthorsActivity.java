package com.app.librarymanagement.activities.Users;

import static com.app.librarymanagement.helpers.common_helper.getAuthorsData;
import static com.app.librarymanagement.helpers.common_helper.getBooksData;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.librarymanagement.R;
import com.app.librarymanagement.models.Author;
import com.app.librarymanagement.models.Book;
import com.app.librarymanagement.models.adapters.AuthorsAdapter;
import com.app.librarymanagement.models.adapters.FindBookAdapter;

import java.util.List;

public class AuthorsActivity extends AppCompatActivity {
    AuthorsAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_authors);
        setUpRecyclerView();
        findViewById(R.id.btnBack).setOnClickListener(view->{
            this.finish();
        });
    }
    public void setUpRecyclerView(){
        List<Author> list = getAuthorsData();
        recyclerView = findViewById(R.id.ListMyAuthors);
        adapter = new AuthorsAdapter(list, getApplicationContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
