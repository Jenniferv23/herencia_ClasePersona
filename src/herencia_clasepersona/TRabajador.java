
package herencia_clasepersona;

public class TRabajador extends Persona {
    private int salario;
    
    public TRabajador(int edad,String nombre,int telefono,int salario){
        super(edad,nombre,telefono);
        this.salario = salario;    
    }

    public void mostrarDatos(){
        System.out.println("Edad: "+getEdad()+
                "\nNombre: "+getNombre()+
                "\nTelefono: "+getTelefono()+
                "\nSalario: "+salario);
    }
}
