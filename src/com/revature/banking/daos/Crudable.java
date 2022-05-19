package com.revature.banking.daos;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Crudable <T>{

    //Create
    T create(T newObject);

    //Read
    T[] findAll() throws IOException;
    T findById(String id);

    //update
    boolean update(T updateObj);

    //Delete
    boolean delete(String id);

}
