package org.example;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Coche coche = new Coche("123ABC", "Rojo", "Toyota", "neumático", "puerta", "motor", "parabrisas", "asiento");
        Moto moto = new Moto("456DEF", "Negro", "Honda", "manillar", "farola", "rueda", "freno", "espejo");
        Tractor tractor = new Tractor("456DEF", "Amarillo", "Honda", "manillar", "farola", "rueda", "freno", "espejo");
        Grua grua = new Grua("456DEF", "Blanco", "Honda", "manillar", "farola", "rueda", "freno", "espejo");
        Camion camion = new Camion("456DEF", "Azul", "Honda", "manillar", "farola", "rueda", "freno", "espejo");

        // Crear lista de vehículos
        Vehiculo[] vehiculos = {coche, moto, tractor, grua, camion};

        // Menú para seleccionar vehículo
        String[] opciones = {"Coche", "Moto", "Tractor", "Grua", "Camion"};
        int num =  JOptionPane.showOptionDialog(null, "Seleccione un vehículo", "Menú - Taller", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        String seleccion = opciones[num];

        // Seleccionar vehículo y reparar una pieza
        switch (seleccion) {
            case "Coche":
                repararPiezaVehiculo(coche);
                break;
            case "Moto":
                repararPiezaVehiculo(moto);
                break;
            case "Tractor":
                repararPiezaVehiculo(tractor);
                break;
            case "Grua":
                repararPiezaVehiculo(grua);
                break;
            case "Camion":
                repararPiezaVehiculo(camion);
                break;
            default:
                System.out.println("Vehículo no encontrado");
        }
    }

    // Método para reparar una pieza de un vehículo
    public static void repararPiezaVehiculo(Vehiculo vehiculo) {
        String[] piezas = {"pieza1", "pieza2", "pieza3", "pieza4", "pieza5"};
        int num2 = JOptionPane.showOptionDialog(null, "Seleccione una pieza a reparar", "Selección de Pieza", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, piezas, piezas[0]);
        String seleccion = piezas[num2];

        vehiculo.reparar(seleccion);
    }

}




