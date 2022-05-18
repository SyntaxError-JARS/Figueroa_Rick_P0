package com.revature.banking.menus;

import com.revature.banking.services.AccountServices;

import java.io.BufferedReader;

public class WelcomeMenu extends Menu{

    private AccountServices usersServices;

    public WelcomeMenu(BufferedReader terminalReader, AccountServices usersServices) {
      super("Welcome", "/Welcome", terminalReader);
      this.usersServices = usersServices;
    }

    public void render() throws Exception{

            System.out.println("This is the begining of the Banking Application");

            String welcome = "Welcome to the Bank";
            String option1 = "1) Login";
            String option2 = "2) Register";
            String option3 = "3) Exit";

            System.out.println(welcome + "\n" + option1 + "\n" + option2 + "\n" + option3);


                System.out.println("Please Select number from above\n >");
                String userSelection = terminalReader.readLine();

                switch (userSelection){
                    case "1":
                        System.out.println("User has Selected Login...");
                        //loginInput();

                        break;
                    case "2":
                        System.out.println("User has Selected Register...");
                        //userInput();

                        break;
                    case "3":
                        System.out.println("User has Selected Exit...");
                        //shut down application here
                        break;
                    default:
                        System.out.println("No valid user input provided");
                        break;
                }


    }

}
