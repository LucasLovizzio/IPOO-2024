import java.util.LinkedList;
import java.util.Queue;

public class ColaDeTrabajo {

    private Queue<Trabajo> lista = new LinkedList<>();
    private String nombre;

    public ColaDeTrabajo(String nombre) {
        this.nombre = nombre;
    }

    public Trabajo sacar() {
        if (lista.isEmpty()) {
            throw new SinTrabajoEnColaException("La cola esta vacia" , nombre);
        }
        return lista.peek();
    }

}
