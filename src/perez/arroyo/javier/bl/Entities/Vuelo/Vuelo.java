package perez.arroyo.javier.bl.Entities.Vuelo;

import java.time.LocalDate;
import java.util.Objects;

public class Vuelo {
    private String lineaAerea;
    private String aeropuerto;
    private String paisDeOrigen;
    private String horaLlegada;
    private String horaSalida;
    private String estado;
    private String paisDestino;
    private String salida;
    private String entrada;
    private String avion;

    public Vuelo() {
    }

    public Vuelo(String lineaAerea, String aeropuerto, String paisDeOrigen, String horaLlegada, String horaSalida, String estado, String paisDestino, String salida, String entrada, String avion) {
        this.lineaAerea = lineaAerea;
        this.aeropuerto = aeropuerto;
        this.paisDeOrigen = paisDeOrigen;
        this.horaLlegada = horaLlegada;
        this.horaSalida = horaSalida;
        this.estado = estado;
        this.paisDestino = paisDestino;
        this.salida = salida;
        this.entrada = entrada;
        this.avion = avion;
    }

    public String getLineaAerea() {
        return lineaAerea;
    }

    public void setLineaAerea(String lineaAerea) {
        this.lineaAerea = lineaAerea;
    }

    public String getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(String aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getAvion() {
        return avion;
    }

    public void setAvion(String avion) {
        this.avion = avion;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "lineaAerea='" + lineaAerea + '\'' +
                ", aeropuerto='" + aeropuerto + '\'' +
                ", paisDeOrigen='" + paisDeOrigen + '\'' +
                ", horaLlegada='" + horaLlegada + '\'' +
                ", horaSalida='" + horaSalida + '\'' +
                ", estado='" + estado + '\'' +
                ", paisDestino='" + paisDestino + '\'' +
                ", salida='" + salida + '\'' +
                ", entrada='" + entrada + '\'' +
                ", avion='" + avion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vuelo vuelo = (Vuelo) o;
        return Objects.equals(lineaAerea, vuelo.lineaAerea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lineaAerea);
    }
}
