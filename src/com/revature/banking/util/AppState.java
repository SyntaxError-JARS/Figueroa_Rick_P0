package com.revature.banking.util;

import com.revature.banking.menus.RegisterMenu;
import com.revature.banking.menus.WelcomeMenu;
import com.revature.banking.services.UsersServices;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AppState {

    private static boolean isRunning;
    //once we add register we will need private final MenuRouter router

    public AppState() {
        isRunning = true;
        BufferedReader terminalReader = new BufferedReader(new InputStreamReader(System.in));
        UsersServices usersServices = new UsersServices();

        WelcomeMenu welcomeMenu = new WelcomeMenu(terminalReader, usersServices);
        RegisterMenu registerMenu = new RegisterMenu(terminalReader);

    }

}
