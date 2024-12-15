package ar.unnoba.edu.ipoo.Vista;

import ar.unnoba.edu.ipoo.Controlador.*;
import javax.swing.*;
import javax.swing.tree.FixedHeightLayoutCache;
import java.awt.*;

public class UI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Conversor de Monedas");
        frame.setSize(300, 300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));
        frame.add(panel, BorderLayout.CENTER);

        JLabel labelMonedaOrigen = new JLabel("Moneda Origen:");
        JComboBox<String> monedaOrigen = new JComboBox<>(new String[]{"ARS", "USD", "JPY", "EUR"});

        JLabel labelMonedaDestino = new JLabel("Moneda Destino:");
        JComboBox<String> monedaDestino = new JComboBox<>(new String[]{"ARS", "USD", "JPY", "EUR"});

        JLabel labelCantidad = new JLabel("Cantidad:");
        JTextField cantidad = new JTextField();

        JButton convertir = new JButton("Convertir");
        JLabel resultado = new JLabel("Resultado: ");



        panel.add(labelMonedaOrigen);
        panel.add(monedaOrigen);
        panel.add(labelMonedaDestino);
        panel.add(monedaDestino);
        panel.add(labelCantidad);
        panel.add(cantidad);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel2.add(convertir);

        frame.add(panel2, BorderLayout.SOUTH);

        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel3.add(resultado);

        // aca va la logica del resultado.

        JLabel cantidadConvertida = new JLabel();
        ConversorDeMonedas conversor = new ConversorDeMonedas();

        convertir.addActionListener(e -> {
            double cantidadOrigen = Double.parseDouble(cantidad.getText());
            String monedaOrigenSeleccionada = (String) monedaOrigen.getSelectedItem();
            String monedaDestinoSeleccionada = (String) monedaDestino.getSelectedItem();

            double resultadoConversion = conversor.convertir(cantidadOrigen, conversor.obtenerMoneda(monedaOrigenSeleccionada), conversor.obtenerMoneda(monedaDestinoSeleccionada));
            resultadoConversion = Math.round(resultadoConversion * 100.0) / 100.0;
            cantidadConvertida.setText(String.valueOf(resultadoConversion));
        });

        panel3.add(cantidadConvertida);


        // aca termina
        frame.add(panel3, BorderLayout.SOUTH);

        frame.setVisible(true);
        }
}
