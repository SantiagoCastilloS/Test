package Practicas.Ejercicio_2;
public class Objeto {
    private int posicionX;
    private int posicionY;

    public Objeto(int posicionX, int posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public int getIzquierda(){
        int _newpos = posicionX - 1;
        return _newpos;
    }
    public int getDerecha(){
        int _newpos = posicionX + 1;
        return _newpos;
    }
    public int getArriba(){
        int _newpos = posicionY + 1;
        return _newpos;
    }
    public int getAbajo(){
        int _newpos = posicionY - 1;
        return _newpos;
    }


}
