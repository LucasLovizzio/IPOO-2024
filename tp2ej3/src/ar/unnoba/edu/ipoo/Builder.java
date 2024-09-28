package ar.unnoba.edu.ipoo;

public abstract class Builder {

    private Pan pan;

    public Builder(Pan pan){
        this.pan = pan;
    }

    public Pan getPan() {
        return pan;
    }

    public void setPan(Pan pan) {
        this.pan = pan;
    }

    public abstract void usarHarina();

    public void comprobarTemperatura(){
        System.out.println("Comprobando temperatura...");
    }

    public void prepararLevadura(){
        System.out.println("Preparando levadura..");
    }

    public void anadirAgua(){
        System.out.println("Añadiend agua y mezclando..");
    }

    public void amasar(){
        System.out.println("Amasando..");
    }

    public void reposar(){
        System.out.println("Reposando..");
    }

    public void cortarMasa(){
        System.out.println("Cortando masa..");
    }

    public void horno(){
        System.out.println("Al horno..");
    }

}
