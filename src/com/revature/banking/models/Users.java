package com.revature.banking.models;

public class Users {

    //attributes, variables, state,
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    //constructors
    public Users(){
        super(); //this is the parent class object constructor being called
    }

    //this is shadowing user input from the private attribute with the provided arguments
    public Users(String firstName, String lastName, String email, String password){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }


    //methods

    //this is returning the input value into the terminal or the system output
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String toFileString(){
        StringBuilder mutableString = new StringBuilder();
        mutableString
                .append(firstName)
                .append(",")
                .append(lastName)
                .append(",")
                .append(email)
                .append(",")
                .append(password)
                .append(",");
        return mutableString.toString();
    }



    //to-string method this is allowing the user input to print out at the end
    @Override
    public String toString() {
        return "Users{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
