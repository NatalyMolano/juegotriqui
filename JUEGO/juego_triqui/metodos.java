package juego_triqui;
import java.util.*;
public abstract class metodos {
    Random aleatorio = new Random();
    Scanner lectura = new Scanner(System.in);
    public abstract void llenarTablero();
    public abstract void eleccionMaquina();
    public abstract void mostrartablero();
    public abstract void eleccionJugador();
    public abstract void comprobrar();
}
