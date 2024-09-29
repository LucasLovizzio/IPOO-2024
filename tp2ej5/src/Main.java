import ar.unnoba.edu.ipoo.*;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Lucas");

        Mobiliario mobiliarioArtDeco = new MobiliarioArtDeco();
        Mobiliario mobiliarioModerno = new MobiliarioModerno();
        Mobiliario mobiliarioVictoriano = new MobiliarioVictoriano();

        cliente1.comprarMesa(mobiliarioArtDeco);
        cliente1.comprarSilla(mobiliarioVictoriano);
        cliente1.comprarSofa(mobiliarioModerno);

    }
}