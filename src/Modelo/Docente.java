package Modelo;

public class Docente {
    private String nombre;
    private String especialidad;

    public Docente(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public void  mostrarPerfil(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);

    }

}


