
package herencia_clasepersona;

public class Herencia_ClasePersona {

    public static void main(String[] args) {
       Cliente cliente = new Cliente(22,"Jennifer",3164,33);
       cliente.mostrarDatos();
       
       TRabajador trabajador = new TRabajador(15,"Ramon",3215,20000);
       trabajador.mostrarDatos();
       
       
    }
    
}
