package org.example;
import javax.swing.JOptionPane;
import java.sql.Struct;

public class Vehiculo {
    private String matricula;
    private String color;
    private String marca;

    public Vehiculo(String matricula, String color, String marca) {
        this.matricula = matricula;
        this.color = color;
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //metodos

    public void reparar(String pieza) {
        JOptionPane.showMessageDialog(null, "La pieza: " + pieza + ", del vehículo: " + this.marca + " se reparó con éxito", "Reparación Exitosa", JOptionPane.INFORMATION_MESSAGE);
    }



}
