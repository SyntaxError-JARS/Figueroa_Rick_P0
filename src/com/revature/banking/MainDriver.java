package com.revature.banking;

import com.revature.banking.models.Users;

import java.io.*;
//catches input from the console into the bufferreader

public class MainDriver {

    //used BufferedReader to accommodate user input for each option in the welcome menu creates dependency for our methods




    //creating method for login
    static void loginInput() throws IOException {
        System.out.println("Please enter your email.");
        String email = terminalraader.readLine();

        System.out.println("Please enter your password.");
        String password = terminalraader.readLine();


        System.out.printf("One Minute while we load your Account",email, password).println();
    }//need to create something to redirect to banking app to AccountActions table


    //creating method for user input for registration
    static void userInput() throws IOException {


    }

}
