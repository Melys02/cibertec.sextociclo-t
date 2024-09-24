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
        // Ejecutar las funciones asíncronamente
        joyaService.crearJoya1();  // Demora de 10 segundos
        joyaService.crearJoya2();  // Demora de 5 segundos
        joyaService.crearJoya3();  // Demora de 7 segundos

        return "Las funciones de creación de joyas se están ejecutando de manera asíncrona.";
    }
}

