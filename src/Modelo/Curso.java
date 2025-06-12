package Modelo;

abstract class Curso {
    protected String nombre;
    protected String duracion;
    protected double precio;
    protected Docente docente;

    public Curso(String nombre, String duracion, double precio, Docente docente) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
        this.docente = docente;
    }

    public String getNombre() { return nombre;}
    public String getDuracion() { return duracion;}
    public double getPrecio() { return precio;}
    public Docente getDocente() { return docente;}

    public void mostrarInformacion(){
        System.out.println("Nombre del Curso: " + nombre);
        System.out.println("Duracion: " + duracion);
        System.out.println("Precio: $" + precio);
        if (docente != null) {
            System.out.println("Docente: " + getDocente());
        }else {
            System.out.println("Docente no asignado");
        }
    }
    public void asignarDocente(Docente docente){
        this.docente = docente;
    }
}
