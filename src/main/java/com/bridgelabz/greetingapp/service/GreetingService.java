package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.repository.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.websocket.server.ServerEndpoint;

@Service
public class GreetingService implements IGreetings{
    @Autowired
    GreetingRepo greetingRepo;
    public Greeting addGreeting(Greeting greets){
        return greetingRepo.save(greets);
    }
}
