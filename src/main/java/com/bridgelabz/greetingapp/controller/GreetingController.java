package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.service.GreetingService;
import com.bridgelabz.greetingapp.service.IGreetings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
//@GetMapping("/greeting")
@RequestMapping("/greeting")
public class GreetingController {
    private static final String template = "Hello, %s %s" ;
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    IGreetings greets;

    @Autowired
    GreetingService greetingService;
    //uc1 --> http://localhost:8080/greeting?name=Akash
//    @GetMapping(value = {"","/","/hello"})
//    public Greeting greeting(@RequestParam(value="name", defaultValue="world") String name){
//        return new Greeting(counter.incrementAndGet(),
//                   String.format(template, name));
//    }
//
//    //http://localhost:8080/greeting/param/Akash
//    @GetMapping("/param/{name}")
//    public Greeting greetingParam(@PathVariable String name){
//        return new Greeting(counter.incrementAndGet(),
//                   String.format(template, name));
//    }
//
//    //http://localhost:8080/greeting/post
//    @PostMapping("/post")
//    public Greeting sayHelloUc4(@RequestBody String name){
//        return new Greeting(counter.incrementAndGet(),
//                   String.format(template, name));
//    }

//    @PostMapping("/post")
//    public Greeting createSecGreeting(@RequestBody Greeting msg){
//        return new Greeting(counter.incrementAndGet(),
//                   String.format(template, msg));
//    }
    //    //http://localhost:8080/greeting/post
    //    //http://localhost:8080/greeting/param/Akash

//    @GetMapping("/post")
//    public Greeting sayHelloUc3(@RequestBody Greeting name){
//
//        return new Greeting(counter.incrementAndGet(),
//                            name.getFirstName(),name.getLastName(),
//                            String.format(template, name.getFirstName(), name.getLastName()));
//    }
    @PostMapping("/add")
    public Greeting addGreeting(@RequestBody Greeting msg){
        return greets.addGreeting(msg);
    }

}
