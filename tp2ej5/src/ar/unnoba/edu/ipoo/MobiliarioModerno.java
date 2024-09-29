package ar.unnoba.edu.ipoo;

public class MobiliarioModerno extends Mobiliario{

    public MobiliarioModerno() {
        super();
    }

    @Override
    public Silla crearSilla() {
        System.out.println("Creando Silla Moderna");
        return new SillaModerna();
    }

    @Override
    public Mesa crearMesa() {
        System.out.println("Creando Mesa Moderna");
        return new MesaModerna();
    }

    @Override
    public Sofa crearSofa() {
        System.out.println("Creando Sofa Moderno");
        return new SofaModerno();
    }
}
