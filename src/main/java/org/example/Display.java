package org.example;

import java.util.Scanner;

public class Display {

    Scanner scanner = new Scanner(System.in);
    public void welcomeMessage(){
        LibraryDatabase db = new LibraryDatabase();
        db.csvToJson();
        System.out.println("Welcome to the library");
        System.out.println("Would you like to see all the books in the library?");
        String answer = scanner.next();
        if(answer.equalsIgnoreCase("yes")){
            db.JsonToJava();
        } else if(answer.equalsIgnoreCase("no")){
            System.out.println("Have a great day");
        } else {
            System.out.println("Not a valid answer");
        }

    }

}
