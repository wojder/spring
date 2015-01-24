
package com.mycompany.mavenproject1;

import org.springframework.stereotype.Service;


//@Motor(type = DieselEngine.class)
public class DieselEngine implements Engine {

    @Override
    public void start() {
        System.out.println("kleklek, Diesel engine start");
    }

    @Override
    public void stop() {
        System.out.println("Diesel engine stop");
       
    }
    
    public void init(){
        System.out.println("Before engine start");
    }
    
}
