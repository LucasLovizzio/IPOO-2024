import ar.unnoba.edu.ipoo.Chofer;
import ar.unnoba.edu.ipoo.Colectivo;
import ar.unnoba.edu.ipoo.Cooperativa;
import ar.unnoba.edu.ipoo.Persona;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Colectivo colectivo1 = new Colectivo("ABC123", "Mercedes-Benz", 30, 20);
        Colectivo colectivo2 = new Colectivo("XYZ789", "Scania", 50, 20);
        Colectivo colectivo3 = new Colectivo("LMN456", "Volvo", 40, 50);

        Persona persona1 = new Persona("Juan", "Roberts");
        Persona persona2 = new Persona("Carlos", "Gardel");
        Persona persona3 = new Persona("Lionel", "Messi");

        Chofer chofer1 = new Chofer(persona1, colectivo1);
        Chofer chofer2 = new Chofer(persona2, colectivo2);
        Chofer chofer3 = new Chofer(persona3, colectivo3);

        Cooperativa cooperativa = new Cooperativa();

        cooperativa.agregarChofer(chofer1);
        cooperativa.agregarChofer(chofer2);
        cooperativa.agregarChofer(chofer3);

        Chofer choferAsignado = cooperativa.realizarViaje(25, 10.5f);
        System.out.println("Chofer asignado para el viaje: " + choferAsignado.getPersona().getNombre());

        choferAsignado = cooperativa.realizarViaje(35, 20.0f);
        System.out.println("Chofer asignado para el viaje: " + choferAsignado.getPersona().getNombre());

        Colectivo mayorKilometrajeColectivo = cooperativa.mayorKilometraje();
        System.out.println("Colectivo con mayor kilometraje: " + mayorKilometrajeColectivo.getKilometraje() + "kms");
    }
}