package practica.manejo.hilo.cibertec.sextociclo_t.controller;


import org.springframework.web.bind.annotation.RestController;
import practica.manejo.hilo.cibertec.sextociclo_t.service.JoyaService;

@RestController
public class JoyaController {


    private final JoyaService joyaService;

    public JoyaController(JoyaService joyaService) {
        this.joyaService = joyaService;
    }

}

