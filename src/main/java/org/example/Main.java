package org.example;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LibraryDatabase db = new LibraryDatabase();
        db.csvToJson();

        List<Book> books;
        Type listType = new TypeToken<List<Book>>() {
        }.getType();
        try {
            books = new Gson().fromJson(new FileReader("/Users/meeshaanwar/Desktop/puffin/library/library.json"), listType);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(books.toString());

    }
}