package practica.manejo.hilo.cibertec.sextociclo_t.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

    // Método para crear archivo con demora
    private void crearArchivoConDemora(int delayInSeconds, String fileName) throws InterruptedException, IOException {
        // Simular la demora
        Thread.sleep(delayInSeconds * 1000);

        // Crear archivo con información aleatoria sobre una joya
        File file = new File(fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            String informacionJoya = generarInformacionJoya();
            writer.write("Información de la joya:\n" + informacionJoya);
        }

        System.out.println("Archivo de joya creado: " + fileName);
    }




}
