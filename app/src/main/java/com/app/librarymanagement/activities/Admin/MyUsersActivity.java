package com.app.librarymanagement.activities.Admin;

import static com.app.librarymanagement.helpers.common_helper.getUsersData;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.librarymanagement.R;
import com.app.librarymanagement.models.User;
import com.app.librarymanagement.models.adapters.UsersAdapter;

import java.util.ArrayList;
import java.util.List;

public class MyUsersActivity extends AppCompatActivity {
    UsersAdapter adapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_users);
        setUpRecyclerView();
        findViewById(R.id.btnBack).setOnClickListener(view->{
            this.finish();
        });
    }

    public void setUpRecyclerView(){
        List<User> list = getUsersData();
        RecyclerView recyclerView = findViewById(R.id.ListMyUsers);
        adapter = new UsersAdapter(list, getApplicationContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
