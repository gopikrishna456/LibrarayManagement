package com.app.librarymanagement.activities.Admin;

import static com.app.librarymanagement.helpers.common_helper.getBooksData;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.librarymanagement.R;
import com.app.librarymanagement.models.Author;
import com.app.librarymanagement.models.Book;
import com.app.librarymanagement.models.adapters.AuthorsAdapter;
import com.app.librarymanagement.models.adapters.BooksAdapter;

import java.util.ArrayList;
import java.util.List;

public class BooksActivity extends AppCompatActivity {
    BooksAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);
        setUpRecyclerView();
        findViewById(R.id.btnBack).setOnClickListener(view->{
            this.finish();
        });
        ImageView addBook = findViewById(R.id.addBook);
        addBook.setOnClickListener(view ->{
            startActivity(new Intent(this,AddBookActivity.class));
        });
    }

    public void setUpRecyclerView(){
        List<Book> list = getBooksData();
        recyclerView = findViewById(R.id.ListMyBooks);
        adapter = new BooksAdapter(list, getApplicationContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
