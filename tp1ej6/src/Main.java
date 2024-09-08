//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import ar.unnoba.edu.ar.Clima;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Creación de un objeto Clima con datos de ejemplo
        Clima clima = new Clima(
                "Buenos Aires",       // Ciudad
                "Buenos Aires",       // Provincia
                "Argentina",          // País
                25.3,                 // Temperatura actual
                18.0,                 // Temperatura mínima del día
                28.5,                 // Temperatura máxima del día
                'C',                  // Escala (Celsius)
                1013.25,              // Presión atmosférica (hPa)
                15.0,                 // Velocidad del viento (km/h)
                "Noroeste",           // Dirección del viento
                60,                   // Humedad (%)
                10000,                // Visibilidad (metros)
                LocalDateTime.now()    // Última actualización (hora actual)
        );

        // Imprimir los datos iniciales del clima
        System.out.println("Datos iniciales del clima:");
        System.out.println(clima);

        // Modificar algunos atributos del objeto Clima
        clima.setTemperaturaActual(26.1);
        clima.setVelocidadViento(10.0);
        clima.setHumedad(55);
        clima.setUltimaActualizacion(LocalDateTime.now());

        // Imprimir los datos actualizados del clima
        System.out.println("\nDatos actualizados del clima:");
        System.out.println(clima);

        // Verificar el uso de getters
        System.out.println("\nObteniendo algunos valores específicos:");
        System.out.println("Ciudad: " + clima.getCiudad());
        System.out.println("Temperatura actual: " + clima.getTemperaturaActual() + "°" + clima.getEscala());
        System.out.println("Velocidad del viento: " + clima.getVelocidadViento() + " km/h");
        System.out.println("Humedad: " + clima.getHumedad() + "%");
        System.out.println("Última actualización: " + clima.getUltimaActualizacion());
    }
}
