package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ListaObjetivosController {

    @GetMapping
    public String objetivos() {
        return "Objetivos de aprendizagem: \n\n1 - Aprender Spring Boot\n2 - Aprender a usar o Insomnia\n3 - Aprender a usar o JPA\n4 - Aprender a usar o Swagger";
    }
}
