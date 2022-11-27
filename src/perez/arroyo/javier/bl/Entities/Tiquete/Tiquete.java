package perez.arroyo.javier.bl.Entities.Tiquete;

import java.time.LocalDate;
import java.util.Objects;

public class Tiquete {
    private LocalDate fecha;
    private String aeropuertoDeOrigen;
    private String aeropuertoDeDestino;
    private int codigoDePais;
    private int codigoDeAeropuerto;
    private String numeroDeAsiento;
    private double precioDeTiquete;
    private String numeroDeVuelo;
    private String tipoDeAsiento;

    public Tiquete() {
    }

    public Tiquete(LocalDate fecha, String aeropuertoDeOrigen, String aeropuertoDeDestino, int codigoDePais, int codigoDeAeropuerto, String numeroDeAsiento, double precioDeTiquete, String numeroDeVuelo, String tipoDeAsiento) {
        this.fecha = fecha;
        this.aeropuertoDeOrigen = aeropuertoDeOrigen;
        this.aeropuertoDeDestino = aeropuertoDeDestino;
        this.codigoDePais = codigoDePais;
        this.codigoDeAeropuerto = codigoDeAeropuerto;
        this.numeroDeAsiento = numeroDeAsiento;
        this.precioDeTiquete = precioDeTiquete;
        this.numeroDeVuelo = numeroDeVuelo;
        this.tipoDeAsiento = tipoDeAsiento;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getAeropuertoDeOrigen() {
        return aeropuertoDeOrigen;
    }

    public void setAeropuertoDeOrigen(String aeropuertoDeOrigen) {
        this.aeropuertoDeOrigen = aeropuertoDeOrigen;
    }

    public String getAeropuertoDeDestino() {
        return aeropuertoDeDestino;
    }

    public void setAeropuertoDeDestino(String aeropuertoDeDestino) {
        this.aeropuertoDeDestino = aeropuertoDeDestino;
    }

    public int getCodigoDePais() {
        return codigoDePais;
    }

    public void setCodigoDePais(int codigoDePais) {
        this.codigoDePais = codigoDePais;
    }

    public int getCodigoDeAeropuerto() {
        return codigoDeAeropuerto;
    }

    public void setCodigoDeAeropuerto(int codigoDeAeropuerto) {
        this.codigoDeAeropuerto = codigoDeAeropuerto;
    }

    public String getNumeroDeAsiento() {
        return numeroDeAsiento;
    }

    public void setNumeroDeAsiento(String numeroDeAsiento) {
        this.numeroDeAsiento = numeroDeAsiento;
    }

    public double getPrecioDeTiquete() {
        return precioDeTiquete;
    }

    public void setPrecioDeTiquete(double precioDeTiquete) {
        this.precioDeTiquete = precioDeTiquete;
    }

    public String getNumeroDeVuelo() {
        return numeroDeVuelo;
    }

    public void setNumeroDeVuelo(String numeroDeVuelo) {
        this.numeroDeVuelo = numeroDeVuelo;
    }

    public String getTipoDeAsiento() {
        return tipoDeAsiento;
    }

    public void setTipoDeAsiento(String tipoDeAsiento) {
        this.tipoDeAsiento = tipoDeAsiento;
    }

    @Override
    public String toString() {
        return "Tiquete{" +
                "fecha=" + fecha +
                ", aeropuertoDeOrigen='" + aeropuertoDeOrigen + '\'' +
                ", aeropuertoDeDestino='" + aeropuertoDeDestino + '\'' +
                ", codigoDePais=" + codigoDePais +
                ", codigoDeAeropuerto=" + codigoDeAeropuerto +
                ", numeroDeAsiento='" + numeroDeAsiento + '\'' +
                ", precioDeTiquete=" + precioDeTiquete +
                ", numeroDeVuelo='" + numeroDeVuelo + '\'' +
                ", tipoDeAsiento='" + tipoDeAsiento + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tiquete tiquete = (Tiquete) o;
        return Objects.equals(fecha, tiquete.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fecha);
    }
}
