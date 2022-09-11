
package herencia_clasepersona;

public class Persona {
    private int edad;
    private String nombre;
    private int telefono; 

    public Persona(int edad, String nombre, int telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    } 
 
 }
