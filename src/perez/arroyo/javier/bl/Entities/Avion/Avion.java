package perez.arroyo.javier.bl.Entities.Avion;

import java.util.Objects;

public class Avion {
    private int placa;
    private String marca;
    private String modelo;
    private int capacida;

    public Avion() {
    }

    public Avion(int placa, String marca, String modelo, int capacida) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.capacida = capacida;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacida() {
        return capacida;
    }

    public void setCapacida(int capacida) {
        this.capacida = capacida;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "placa=" + placa +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacida=" + capacida +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Avion avion = (Avion) o;
        return placa == avion.placa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa);
    }
}
