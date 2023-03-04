package com.app.librarymanagement.activities.Admin;

import static com.app.librarymanagement.helpers.common_helper.getBooksData;
import static com.app.librarymanagement.helpers.common_helper.getRequestedBooksData;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.librarymanagement.R;
import com.app.librarymanagement.models.Book;
import com.app.librarymanagement.models.BookRequest;
import com.app.librarymanagement.models.adapters.BooksAdapter;
import com.app.librarymanagement.models.adapters.BooksRequestsAdapter;

import java.util.List;

public class RequestedBooksActivity extends AppCompatActivity {
    BooksRequestsAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_requests);
        setUpRecyclerView();
        findViewById(R.id.btnBack).setOnClickListener(view->{
            this.finish();
        });
    }

    public void setUpRecyclerView(){
        List<BookRequest> list = getRequestedBooksData();
        recyclerView = findViewById(R.id.ListBooksRequests);
        adapter = new BooksRequestsAdapter(list, getApplicationContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
