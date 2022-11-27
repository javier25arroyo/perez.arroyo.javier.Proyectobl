package perez.arroyo.javier.bl.Entities.LineaAerea;

import java.util.Objects;

public class LineaAerea {
    private String nombreComercial;
    private int Juridica;
    private String nombreDeLaEmpresaDuenna;

    public LineaAerea() {
    }

    public LineaAerea(String nombreComercial, int juridica, String nombreDeLaEmpresaDuenna) {
        this.nombreComercial = nombreComercial;
        Juridica = juridica;
        this.nombreDeLaEmpresaDuenna = nombreDeLaEmpresaDuenna;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public int getJuridica() {
        return Juridica;
    }

    public void setJuridica(int juridica) {
        Juridica = juridica;
    }

    public String getNombreDeLaEmpresaDuenna() {
        return nombreDeLaEmpresaDuenna;
    }

    public void setNombreDeLaEmpresaDuenna(String nombreDeLaEmpresaDuenna) {
        this.nombreDeLaEmpresaDuenna = nombreDeLaEmpresaDuenna;
    }

    @Override
    public String toString() {
        return "LineaAerea{" +
                "nombreComercial='" + nombreComercial + '\'' +
                ", Juridica=" + Juridica +
                ", nombreDeLaEmpresaDuenna='" + nombreDeLaEmpresaDuenna + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineaAerea that = (LineaAerea) o;
        return Objects.equals(nombreComercial, that.nombreComercial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreComercial);
    }
}
