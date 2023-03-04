package com.app.librarymanagement.models.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.app.librarymanagement.R;
import com.app.librarymanagement.activities.Admin.AuthorDetailsActivity;
import com.app.librarymanagement.activities.Admin.BookDetailsActivity;
import com.app.librarymanagement.models.Author;
import com.app.librarymanagement.models.Book;
import com.app.librarymanagement.models.User;

import java.util.Collections;
import java.util.List;

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.MyBook> {
    List<Book> list = Collections.emptyList();
    Context mContext;
    public BooksAdapter(List<Book> list, Context context){
        this.list = list;
        this.mContext = context;
    }

    @NonNull
    @Override
    public MyBook onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_item, parent, false);
        return new BooksAdapter.MyBook(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyBook holder, int position) {
        Book book = list.get(position);
        holder.tvBookName.setText(book.getName());
        holder.tvShortDesc.setText(book.getShortDescription());
        holder.tvPublish.setText(book.getPublished());
        holder.tvRating.setRating(Float.parseFloat(book.getRating()));
        holder.bookCard.setOnClickListener(view->{
            view.getContext().startActivity(new Intent(view.getContext(), BookDetailsActivity.class));
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    static class MyBook extends RecyclerView.ViewHolder{
        // Here we hold the MyDoctorItems
        TextView tvBookName, tvPublish,tvShortDesc,tvLongDesc;
        ImageView imgBook;
        CardView bookCard;
        RatingBar tvRating;
        public MyBook(@NonNull View itemView) {
            super(itemView);
            tvBookName = itemView.findViewById(R.id.view_book_name);
            tvShortDesc = itemView.findViewById(R.id.view_book_short_desc);
            tvPublish = itemView.findViewById(R.id.book_published);
            tvRating = itemView.findViewById(R.id.book_view_rating);
            imgBook = itemView.findViewById(R.id.book_item_image);
            bookCard = itemView.findViewById(R.id.bookCard);
        }
    }
}
