package practica.manejo.hilo.cibertec.sextociclo_t.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import practica.manejo.hilo.cibertec.sextociclo_t.service.JoyaService;

import java.io.IOException;

@RestController
public class JoyaController {


    private final JoyaService joyaService;

    public JoyaController(JoyaService joyaService) {
        this.joyaService = joyaService;
    }
    @GetMapping("/crear-joyas-async")
    public String crearJoyasAsync() throws InterruptedException, IOException {


    return "";}
}

