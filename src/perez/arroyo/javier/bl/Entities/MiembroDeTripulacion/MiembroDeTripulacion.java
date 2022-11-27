package perez.arroyo.javier.bl.Entities.MiembroDeTripulacion;

import java.util.Objects;

public class MiembroDeTripulacion {
    private String genero;
    private int experiencia;
    private int graduacion;
    private int licencia;
    private String puesto;
    private String nombre;
    private String nacionalidad;
    private int identificacion;
    private String correo;
    private String apellido;
    private int telefono;
    private String Direccion;

    public MiembroDeTripulacion() {
    }

    public MiembroDeTripulacion(String genero, int experiencia, int graduacion, int licencia, String puesto, String nombre, String nacionalidad, int identificacion, String correo, String apellido, int telefono, String direccion) {
        this.genero = genero;
        this.experiencia = experiencia;
        this.graduacion = graduacion;
        this.licencia = licencia;
        this.puesto = puesto;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.identificacion = identificacion;
        this.correo = correo;
        this.apellido = apellido;
        this.telefono = telefono;
        Direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getGraduacion() {
        return graduacion;
    }

    public void setGraduacion(int graduacion) {
        this.graduacion = graduacion;
    }

    public int getLicencia() {
        return licencia;
    }

    public void setLicencia(int licencia) {
        this.licencia = licencia;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    @Override
    public String toString() {
        return "MiembroDeTripulacion{" +
                "genero='" + genero + '\'' +
                ", experiencia=" + experiencia +
                ", graduacion=" + graduacion +
                ", licencia=" + licencia +
                ", puesto='" + puesto + '\'' +
                ", nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", identificacion=" + identificacion +
                ", correo='" + correo + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono=" + telefono +
                ", Direccion='" + Direccion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MiembroDeTripulacion that = (MiembroDeTripulacion) o;
        return identificacion == that.identificacion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificacion);
    }
}
