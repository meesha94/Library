package org.example;

import org.json.CDL;
import java.io.BufferedReader;
import java.util.HashSet;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
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
}




