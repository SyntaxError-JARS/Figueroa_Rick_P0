package com.revature.banking.services;

import com.revature.banking.daos.UsersDao;
import com.revature.banking.models.Users;

import java.io.IOException;


public class UsersServices {


    private UsersDao usersDao = new UsersDao();

    public void readUsers(){
    Users[] users = new Users[0];
    try {
        users = usersDao.findAll();
    } catch (IOException e) {
        e.printStackTrace();
    }
    for (int i = 0; i < users.length; i++) {
        Users user = users[i];
        System.out.println(user.toString());
        }

    }

}
