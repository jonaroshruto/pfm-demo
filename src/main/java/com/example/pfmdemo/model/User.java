package com.example.pfmdemo.model;



import jakarta.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;



@Document("users")
public class User {

    @Id
    private String ID;


    private String firstName;
    private String lastName;
    private int userAge;
    @Field(name ="emailAddress")
    private String emailAddress;
    private String password;


    public User() {

    }
    public User(String firstName, String lastName, int userAge, String emailAddress, String password){
        this.firstName=firstName;
        this.lastName=lastName;
        this.userAge=userAge;
        this.emailAddress=emailAddress;
        this.password=password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }


    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
