package ar.unnoba.edu.ipoo;

import java.util.ArrayList;
import java.util.List;

public class GraphEditor {

    List<FiguraGeometrica> figurasGeometricas;
    public GraphEditor() {
        figurasGeometricas = new ArrayList<>();
    }

    public GraphEditor(List<FiguraGeometrica> figurasGeometricas) {
        this.figurasGeometricas = figurasGeometricas;
    }

    public void anadirFigurasGeometricas(FiguraGeometrica figuraGeometrica) {
        figurasGeometricas.add(figuraGeometrica);
    }
    
    public void eliminarUltimaFiguraGeometrica() {
        figurasGeometricas.removeLast();
    }

    public double sumaAreaDeFiguras() {
        double area = 0;
        for (FiguraGeometrica figura : figurasGeometricas) {
            area += figura.calcularArea();
        }
        return area;
    }

    


}
