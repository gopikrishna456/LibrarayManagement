package com.app.librarymanagement.activities.Admin;

import static com.app.librarymanagement.helpers.common_helper.getBooksData;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.librarymanagement.R;
import com.app.librarymanagement.models.Book;
import com.app.librarymanagement.models.adapters.FindBookAdapter;
import java.util.List;

public class AuthorDetailsActivity extends AppCompatActivity {
    FindBookAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author_details);
        findViewById(R.id.btnBack).setOnClickListener(view->{
            this.finish();
        });
        setUpRecyclerView();
    }

    public void setUpRecyclerView(){
        List<Book> list = getBooksData();
        recyclerView = findViewById(R.id.ListMyBooks);
        adapter = new FindBookAdapter(list, getApplicationContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
