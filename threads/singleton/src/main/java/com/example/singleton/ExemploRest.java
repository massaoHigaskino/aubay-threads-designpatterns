package com.example.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/*
for(;;) {var xhr = new XMLHttpRequest();
xhr.onreadystatechange = function() {};
xhr.open('GET', 'http://localhost:8080/teste');
xhr.send()}
 */

@RestController
public class ExemploRest {

    private ExemploSingleton exemploSingleton;

    @GetMapping(value = "/teste")
    public void teste() {
        exemploSingleton = ExemploSingleton.getInstance();
        exemploSingleton.teste();
    }

}