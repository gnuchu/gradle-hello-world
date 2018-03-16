package com.verint.hello;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static String main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        
        Greeter greeter = new Greeter();
        return greeter.sayHello();
    }
    public String sayHello() {
        Greeter greeter = new Greeter();
        return greeter.sayHello();
    }
}