package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class ListaBSMController {

    @GetMapping
    public String bsm() {
        return "Mentalidades: \n\n- Orientação ao futuro\n- Persistência\n- Responsabilidade Pessoal\n- Mentabilidade de Crescimento\n\nCompetências comportamentais: \n\n- Comunicação\n- Proatividade\n- Orientação ao Detalhe\n- Trabalho em equipe";
    }
}