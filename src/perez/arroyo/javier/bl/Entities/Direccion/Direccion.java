package perez.arroyo.javier.bl.Entities.Direccion;

import java.util.Objects;

public class Direccion {
    private String provincia;
    private String canton;
    private String distrito;
    private String detalle;

    public Direccion() {
    }

    public Direccion(String provincia, String canton, String distrito, String detalle) {
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.detalle = detalle;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "provincia='" + provincia + '\'' +
                ", canton='" + canton + '\'' +
                ", distrito='" + distrito + '\'' +
                ", detalle='" + detalle + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Direccion direccion = (Direccion) o;
        return Objects.equals(distrito, direccion.distrito);
    }

    @Override
    public int hashCode() {
        return Objects.hash(distrito);
    }
}
