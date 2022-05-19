package com.revature.banking.menus;

import com.revature.banking.models.Users;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RegisterMenu extends Menu{

    //creating method for user input for registration
    public RegisterMenu(BufferedReader terminalReader) {
        super("Register", "/register", terminalReader);
    }

    @Override
    public void render() throws Exception {
        System.out.println("What is your First Name?");
        String firstName = terminalReader.readLine();

        System.out.println("What is your Last Name?");
        String lastName = terminalReader.readLine();

        System.out.println("Please enter your email.");
        String email = terminalReader.readLine();

        System.out.println("Please create a password.");
        String password = terminalReader.readLine();

//                    System.out.printf("First name: %s, Last name: %s, Email: %s, Password: %s",
//    firstName, lastName, email, password).println();

        //users1 is an object that is an instance of the users class, that is allowing the input
        // -->for registration in userselection to show.
        Users users1 = new Users(firstName, lastName, email, password);
        System.out.println(users1);

        File userPersist = new File("resources/data.txt");

        try(FileWriter fileWriter = new FileWriter(userPersist, true)){
            fileWriter.write(users1.toFileString() + "\n");
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
