package com.sqs.alfaservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlfaController {

    @GetMapping("/")
    public String executar() {
	return "MS-ALFA-RESPOSTA 0";
    }
}
