package ar.unnoba.edu.ipoo;

public class FullDataBagException extends Exception {
    public FullDataBagException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "ERROR : " + this.getClass().getName() + ". La DataBag esta llena.";
    }
}
