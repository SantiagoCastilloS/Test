package Practicas.Ejercicio_2;
import javax.swing.JOptionPane;
public class Main {
    public static void main (String [] args){
        Objeto O;
        int posX, posY;
        String movimiento;
        posX = Integer.parseInt(JOptionPane.showInputDialog("Digite la posicion X en el tablero de ajedrez del objeto"));
        posY = Integer.parseInt(JOptionPane.showInputDialog("Digite la posicion Y en el tablero de ajedrez del objeto"));
        movimiento = JOptionPane.showInputDialog(null,"Ingrese en mayusculas la direccion a mover al objeto");
        O = new Objeto(posX,posY);
        if ( movimiento.equals("DERECHA") && posX != 8 ){
            System.out.println("La nueva posicion del objeto es: " + "(" + O.getDerecha() + " ; " + posY + ")");
        } else if ( movimiento.equals("IZQUIERDA") && posX != 1 ) {
            System.out.println("La nueva posicion del objeto es: " + "(" + O.getIzquierda() + " ; " + posY + ")");
        } else if ( movimiento.equals("ARRIBA") && posY != 8 ) {
            System.out.println("La nueva posicion del objeto es: " + "(" + posX + " ; " + O.getArriba() + ")");
        } else if ( movimiento.equals("ABAJO") && posY != 1 ) {
            System.out.println("La nueva posicion del objeto es: " + "(" + posX + " ; " + O.getAbajo() + ")");
        } else {
            System.out.println("Error al ingresar...");
        }
    }
}
