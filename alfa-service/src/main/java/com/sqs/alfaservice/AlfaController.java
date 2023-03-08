package com.sqs.alfaservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlfaController {

    @GetMapping("/alfa")
    public String executar() {
	return "MS-ALFA-RESPOSTA 0";
    }
}
