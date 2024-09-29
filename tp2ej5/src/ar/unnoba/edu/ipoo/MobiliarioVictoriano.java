package ar.unnoba.edu.ipoo;

public class MobiliarioVictoriano extends Mobiliario {

    public MobiliarioVictoriano() {
        super();
    }

    @Override
    public Silla crearSilla() {
        System.out.println("Creando Silla Victoriana");
        return new SillaVictoriana();
    }

    @Override
    public Mesa crearMesa() {
        System.out.println("Creando Mesa Victoriana");
        return new MesaVictoriana();
    }

    @Override
    public Sofa crearSofa() {
        System.out.println("Creando Sofa Victoriano");
        return new SofaVictoriano();
    }
}
