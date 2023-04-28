package Practicas.Ejercicio_1;
import javax.swing.JOptionPane;
import java.sql.SQLOutput;

public class Main {
    public static void main (String[] args){
        Cuadrilatero c;
        double lado1, lado2;

        lado1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el lado1 :D"));
        lado2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el lado2 :D"));

        if ( lado1 == lado2 )
            c = new Cuadrilatero (lado1);
        else
            c = new Cuadrilatero (lado1,lado2);
        System.out.println("El perimetro es: " + c.getPerimetro());
        System.out.println("El area es: " + c.getArea());
    }
}
