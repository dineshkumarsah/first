package com.dineshbhumca.first;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

   @GetMapping("/hello")
    public String getHello(){
       return "Hellow";

   }
}
