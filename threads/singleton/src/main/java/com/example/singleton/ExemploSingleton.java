package com.example.singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.util.concurrent.atomic.AtomicInteger;

public class ExemploSingleton {

    private static ExemploSingleton instance;

    @Bean
    @Scope("singleton")
    public static ExemploSingleton getInstance() {
        if(instance == null) {
            instance = new ExemploSingleton();
        }
        return instance;
    }


    private AtomicInteger total = new AtomicInteger(0);
    
	public  void teste() {
	    for (int i = 0; i < 1000; i++) {
            total.set(total.get()+i);
        }
        System.out.println("O total é: "+total);
	}
    
}