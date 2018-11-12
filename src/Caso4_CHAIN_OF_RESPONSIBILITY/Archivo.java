package Caso4_CHAIN_OF_RESPONSIBILITY;


public class Archivo {

    private String nombre;
    private String formato;
    private String direccionPath;
    private String[] metaDatos; // Información que contiene el archivo

    public Archivo(String nombre, String formato, String direccionPath, String... args) {
        this.nombre = nombre;
        this.formato = formato;
        this.direccionPath = direccionPath;
        this.metaDatos = args;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getDireccionPath() {
        return direccionPath;
    }

    public void setDireccionPath(String direccionPath) {
        this.direccionPath = direccionPath;
    }

    public String[] getMetaDatos() {
        return metaDatos;
    }
}
