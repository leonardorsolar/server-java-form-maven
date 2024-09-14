package com.example.server_java_form_maven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioCreateController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
