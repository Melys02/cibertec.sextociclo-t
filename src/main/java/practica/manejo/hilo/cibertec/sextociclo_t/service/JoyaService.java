package practica.manejo.hilo.cibertec.sextociclo_t.service;

import java.util.Random;

public class JoyaService {

    // Método para generar información aleatoria de una joya
    private String generarInformacionJoya() {
        String[] tiposDeJoyas = {"Anillo", "Collar", "Pulsera", "Pendiente", "Broche"};
        String[] materiales = {"Oro", "Plata", "Platino", "Diamante", "Esmeralda"};
        String tipo = tiposDeJoyas[new Random().nextInt(tiposDeJoyas.length)];
        String material = materiales[new Random().nextInt(materiales.length)];
        double precio = new Random().nextDouble() * 1000 + 100;  // Precio entre 100 y 1100

        return "Tipo: " + tipo + "\nMaterial: " + material + "\nPrecio: $" + String.format("%.2f", precio);
    }



}
