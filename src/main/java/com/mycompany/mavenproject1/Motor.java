package com.mycompany.mavenproject1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Qualifier
//@Scope("prototype")
//@Component
//@Retention(RetentionPolicy.RUNTIME)
//@Target({ElementType.TYPE, ElementType.PARAMETER})
public @interface Motor {
    
    Class type();
    
}
