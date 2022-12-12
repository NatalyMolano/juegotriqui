package juego_triqui;
class ejecutar
{
    public static void main(String[] args)
    {
        System.out.println("\nBienvenido al juego de TRIQUI\n");
        juego mosEjecutar = new juego();
        mosEjecutar.llenarTablero();
        mosEjecutar.eleccionMaquina();
        
    }
    
}