package com.mycompany.mavenproject1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.mycompany.mavenproject1")
public class BeansConfig {
    
    @Scope("prototype")
    @Bean
    public  DieselEngine dieselEngine(){
    return new DieselEngine();
    }
    
    @Scope("prototype")
    @Bean
    public  PetrolEngine petrolEngine(){
    return new PetrolEngine();
    }
    
    @Bean
    @Scope("prototype")
    public Car carWithDiesel(DieselEngine dieselEngine){
    
        return new Car(dieselEngine);
    
    }
    
    @Bean
    @Scope("prototype")
    public Car carWithPetrol(PetrolEngine petrolEngine){
    
        return new Car(petrolEngine);
    
    }
}
