
package interdispositivoselectronicos;

/**
 *
 * @author cyn
 */
public class Main {
    public static void main (String[]args){
        //objetos
        Telefono telUno=new Telefono();
        Computadora compuUno=new Computadora();
        
        telUno.encender();
        telUno.apagar();
        telUno.reiniciar();
        
        compuUno.encender();
        compuUno.apagar();
        compuUno.reiniciar();
    }
}
