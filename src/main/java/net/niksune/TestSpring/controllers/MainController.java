package net.niksune.TestSpring.controllers;

import net.niksune.TestSpring.beans.Animal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @GetMapping("/getAnimal")
    public Animal animal(){
        return new Animal(42,"Robert","Dino",57);
    }


}
