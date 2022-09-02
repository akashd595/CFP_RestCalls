package com.bridgelabz.greetingapp.model;

import javax.persistence.*;

@Entity
public class Greeting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private int id;
    private String firstName;
    private String lastName;
    private String message;
    public Greeting(int id, String firstName, String lastName, String message){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.message = message;
    }
    public Greeting(String firstName, String lastName, String message){

        this.firstName = firstName;
        this.lastName = lastName;
        this.message = message;
    }
    public Greeting() {

    }

    public int getId() {
        return id;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return firstName+" "+lastName;
    }
}
