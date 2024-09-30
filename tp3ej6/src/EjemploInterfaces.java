import ar.unnoba.edu.ipoo.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EjemploInterfaces {

    public void acelerarVehiculo(Vehiculo vehiculo) {
        vehiculo.acelerar();
    }

    public void detenerVehiculo(Vehiculo vehiculo) {
        vehiculo.detener();
    }

    public static void main(String[] args) {
        Automovil automovil = new Automovil();
        Bicicleta bicicleta = new Bicicleta();

        EjemploInterfaces ejemplo = new EjemploInterfaces();

        ejemplo.acelerarVehiculo(automovil);
        ejemplo.detenerVehiculo(automovil);
        ejemplo.acelerarVehiculo(bicicleta);
        ejemplo.detenerVehiculo(bicicleta);

    }
}