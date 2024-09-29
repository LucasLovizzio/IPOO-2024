package ar.unnoba.edu.ipoo;

public class MobiliarioArtDeco extends Mobiliario{

    public MobiliarioArtDeco() {
        super();
    }

    @Override
    public Silla crearSilla() {
        System.out.println("Creando Silla ArtDeco");
        return new SillaArtDeco();
    }

    @Override
    public Mesa crearMesa() {
        System.out.println("Creando Mesa ArtDeco");
        return new MesaArtDeco();
    }

    @Override
    public Sofa crearSofa() {
        System.out.println("Creando Sofa ArtDeco");
        return new SofaArtDeco();
    }
}
