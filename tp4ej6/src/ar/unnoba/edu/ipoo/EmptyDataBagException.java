package ar.unnoba.edu.ipoo;

public class EmptyDataBagException extends Exception {
    public EmptyDataBagException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "ERROR : " + this.getClass().getName() + ". La DataBag esta vacia.";
    }
}
