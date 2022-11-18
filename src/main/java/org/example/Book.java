package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;


public class Book {
    public int id;
    public String name;
    public String author;
    public boolean loaned;

    public Book() {
    }

    public Book(int id, String name, String author, boolean loaned)  {
        this.id = id;
        this.name = name;
        this.author = author;
        this.loaned = loaned;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isLoaned() {
        return loaned;
    }

    public void setLoaned(boolean loaned) {
        this.loaned = loaned;
    }


    @Override
    public String toString() {
        return
                "ID: " + id +
                "  Title: '" + name + '\'' +
                "   Author: " + author  +
                "   Loaned: " + loaned + "\n"
                ;
    }
}
