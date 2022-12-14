package perez.arroyo.javier.bl.Entities.Usuario;

import java.time.LocalDate;
import java.util.Objects;

public class Usuario {
    private String nombre;
    private String apellido;
    private int cedula;
    private String correo;
    private String direccion;
    private String nacionalidad;
    private LocalDate fechaDeNacimiento;
    private LocalDate edad;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, int cedula, String correo, String direccion, String nacionalidad, LocalDate fechaDeNacimiento, LocalDate edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
        this.direccion = direccion;
        this.nacionalidad = nacionalidad;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public LocalDate getEdad() {
        return edad;
    }

    public void setEdad(LocalDate edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula=" + cedula +
                ", correo='" + correo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                ", edad=" + edad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return cedula == usuario.cedula;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cedula);
    }
}
