package br.com.fiap.library.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping
    public String hello(){
        return "Hello Word";
    }

}
