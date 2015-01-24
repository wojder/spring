package com.mycompany.mavenproject1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("prototype")
//@Component("car")
public class Car {
    
    private Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }

//    @Autowired
    public void setEngine(/*@Motor(type = DieselEngine.class)*/Engine engine) {
        this.engine = engine;
    }

    public void go() {
    engine.start();
        System.out.println("---------->");
    }
}
