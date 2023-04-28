package Practicas.Ejercicio_1;

public class Cuadrilatero {
    // Atributos
    private double lado1;
    private double lado2;
    // Metodos
    public Cuadrilatero (double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public Cuadrilatero (double lado1){
        this.lado1 = this.lado2 = lado1;
    }
    public double getPerimetro(){
        double  perimetro = 2*(lado1 + lado2);
        return perimetro;
    }
    public double getArea(){
        double area = lado1*lado2;
        return area;
    }
}
