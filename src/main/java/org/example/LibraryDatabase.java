package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.CDL;

import java.io.*;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class LibraryDatabase {
    public void csvToJson() {
        // Read csv data file and store it in a string
        InputStream is = LibraryDatabase.class.getResourceAsStream("/library.csv");
        String csv = new BufferedReader(
                new InputStreamReader(Objects.requireNonNull(is), StandardCharsets.UTF_8))
                .lines()
                .collect(Collectors.joining("\n"));

        try {
            // Convert csv text to JSON string, and save it
            // to a data.json file.
            String json = CDL.toJSONArray(csv).toString(2);
            Files.write(Path.of("library.json"), json.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void JsonToJava() {
        List<Book> books;

        Type listType = new TypeToken<List<Book>>() {
        }.getType();
        try {
            books = new Gson().fromJson(new FileReader("/Users/meeshaanwar/Desktop/puffin/library/library.json"), listType);
            System.out.println(books.toString().replace(",", ""));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}




