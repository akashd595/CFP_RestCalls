package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.Greeting;


import java.util.List;
import java.util.Optional;

public interface IGreetings {

    public Greeting addGreeting(Greeting greets);

    public Optional<Greeting> findGreetingID(int id);
    public void deleteGreetingID(int id);

    public List<Greeting> findAllGreets();
}
