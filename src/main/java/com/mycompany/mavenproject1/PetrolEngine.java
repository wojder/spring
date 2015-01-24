package com.mycompany.mavenproject1;


//@Motor(type = PetrolEngine.class)
public class PetrolEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Petrol engine started");
   }

    @Override
    public void stop() {
        System.out.println("Petrol engine stopped");
    }
}
