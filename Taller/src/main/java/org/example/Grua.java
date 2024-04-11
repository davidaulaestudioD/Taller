package org.example;

public class Grua extends Vehiculo {
    private String pieza1;
    private String pieza2;
    private String pieza3;
    private String pieza4;
    private String pieza5;

    public Grua(String matricula, String color, String marca, String pieza1, String pieza2, String pieza3, String pieza4, String pieza5) {
        super(matricula, color, marca);
        this.pieza1 = pieza1;
        this.pieza2 = pieza2;
        this.pieza3 = pieza3;
        this.pieza4 = pieza4;
        this.pieza5 = pieza5;
    }

    public String getPieza1() {
        return pieza1;
    }

    public void setPieza1(String pieza1) {
        this.pieza1 = pieza1;
    }

    public String getPieza2() {
        return pieza2;
    }

    public void setPieza2(String pieza2) {
        this.pieza2 = pieza2;
    }

    public String getPieza3() {
        return pieza3;
    }

    public void setPieza3(String pieza3) {
        this.pieza3 = pieza3;
    }

    public String getPieza4() {
        return pieza4;
    }

    public void setPieza4(String pieza4) {
        this.pieza4 = pieza4;
    }

    public String getPieza5() {
        return pieza5;
    }

    public void setPieza5(String pieza5) {
        this.pieza5 = pieza5;
    }

    //metodo
    @Override
    public void reparar(String pieza) {
        String nombrePieza = null;
        switch (pieza) {
            case "pieza1":
                nombrePieza = this.pieza1;
                this.pieza1 = "reparada";
                break;
            case "pieza2":
                nombrePieza = this.pieza2;
                this.pieza2 = "reparada";
                break;
            case "pieza3":
                nombrePieza = this.pieza3;
                this.pieza3 = "reparada";
                break;
            case "pieza4":
                nombrePieza = this.pieza4;
                this.pieza4 = "reparada";
                break;
            case "pieza5":
                nombrePieza = this.pieza5;
                this.pieza5 = "reparada";
                break;
            default:
                System.out.println("Pieza no encontrada");
        }
        super.reparar(nombrePieza);
    }

}