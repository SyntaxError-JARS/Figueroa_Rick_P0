package com.revature.banking.daos;

import com.revature.banking.models.Users;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UsersDao implements Crudable<Users>{

//using generic to create crud method
    @Override
    public Users create(Users newObject) {
        return null;
    }

    @Override
    public Users[] findAll() throws IOException {

            FileReader fileReader = new FileReader("resources/data.txt");
            BufferedReader reader = new BufferedReader(fileReader);

            Users[] user = new Users[10];

            String line = reader.readLine();
            int index = 0;

            while (line != null){
                String[] usersInfo = line.split(",");

                String firstName = usersInfo[0];
                String lastName = usersInfo[1];
                String email = usersInfo[2];
                String password = usersInfo[3];

                Users users = new Users(firstName, lastName, email, password);
                user[index] = users;

                index++;
                line = reader.readLine();
            }
            reader.close();
            return user;

    }

    @Override
    public Users findById(String id) {
        return null;
    }

    @Override
    public boolean update(Users updateObj) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }
}
