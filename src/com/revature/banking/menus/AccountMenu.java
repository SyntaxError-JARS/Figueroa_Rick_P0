package com.revature.banking.menus;

import java.io.BufferedReader;

public class AccountMenu extends Menu{
    public AccountMenu(BufferedReader terminalReader) {
        super("Account", "/account", terminalReader);
    }

    @Override
    public void render() throws Exception {



        String welcome = "Welcome to the Bank";
        String option1 = "1) View Balance";
        String option2 = "2) Deposit";
        String option3 = "3) Withdraw";
        String option4 = "4) Exit";

        System.out.println(welcome + "\n" + option1 + "\n" + option2 + "\n" + option3 + "\n" + option4);


        System.out.println("Please Select number from above\n >");
        String userSelection = terminalReader.readLine();

        switch (userSelection){
            case "1":
                System.out.println("User has Selected View Balance");
                //balanceInput();

                break;
            case "2":
                System.out.println("User has Selected Deposit");
                //depositInput();

                break;
            case "3":
                System.out.println("User has Selected Withdraw");
                //withdrawInput();
                break;

                case "4":
                System.out.println("User has Selected Exit...");
                //shut down application here
                break;

            default:
                System.out.println("No valid user input provided");
                break;
        }

    }
}
