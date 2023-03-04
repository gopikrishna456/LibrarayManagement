package com.app.librarymanagement.helpers;

import com.app.librarymanagement.models.Author;
import com.app.librarymanagement.models.Book;
import com.app.librarymanagement.models.BookRequest;
import com.app.librarymanagement.models.User;

import java.util.ArrayList;
import java.util.List;

public class common_helper {
    public static boolean getAdminLogin(String email, String password){
        return email.equals("admin@gmail.com") && password.equals("admin123");
    }
    public static boolean getUserLogin(String email, String password){
        return email.equals("user@gmail.com") && password.equals("user123");
    }
    public static List<Book> getBooksData(){
        List<Book> list = new ArrayList<>();
        list.add(new Book(1,"Book1",
                "",
                "",
                "3.5",
                "01-01-2020",
                10,
                15)
        );
        list.add(new Book(2,"Book2",
                "",
                "",
                "3.5",
                "25-11-2015",
                15,
                25)
        );
        return list;
    }

    public static List<BookRequest> getRequestedBooksData(){
        List<BookRequest> list = new ArrayList<>();
        list.add(new BookRequest(1,
                1,
                1,
                "Book 1",
                "User 1",
                "01-03-2023",
                "3.5")
        );
        list.add(new BookRequest(2,
                2,
                2,
                "Book 2",
                "User 2",
                "02-03-2023",
                "3.5")
        );
        return list;
    }

    public static List<BookRequest> getOverdueBooksData(){
        List<BookRequest> list = new ArrayList<>();

        list.add(new BookRequest(2,
                2,
                2,
                "Book 2",
                "User 2",
                "02-03-2023",
                "3.5")
        );
        return list;
    }

    public static List<Author> getAuthorsData(){
        List<Author> list = new ArrayList<>();
        list.add(new Author(1,"Author 1",
                "3.5",
                45,"male")
        );
        list.add(new Author(2,"Author 2",
                "4.5",
                25,"female")
        );
        return list;
    }

    public static List<User> getUsersData()
    {
        List<User> list = new ArrayList<>();
        list.add(new User(1,
                "User1",
                "6/asd jhaiushda",
                "0123456789",
                "user1@gmail.com",
                25,
                "male")
        );
        list.add(new User(2,
                "User2",
                "1/F12 asasa",
                "9876543210",
                "user2@gmail.com",
                22,
                "female")
        );
        return list;
    }
}
