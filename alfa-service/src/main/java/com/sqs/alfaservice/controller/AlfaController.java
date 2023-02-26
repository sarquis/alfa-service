package com.sqs.alfaservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AlfaController {

    @GetMapping
    public String salvarArquivo() {
	return "MS-ALFA-RESPONSE";
    }
}
