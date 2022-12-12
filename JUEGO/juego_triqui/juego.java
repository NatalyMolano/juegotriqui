package juego_triqui;
public class juego extends metodos 
{
    String [][] posicion = new String[3][3];
    int i,g,contador;
    public juego(){}
    public juego(int i, int g, int contador) {
        this.i = i;
        this.g = g;
        this.contador = contador;
    }
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }
    public int getG() {
        return g;
    }
    public void setG(int g) {
        this.g = g;
    }
    public int getContador() {
        return contador;
    }
    public void setContador(int contador) {
        this.contador = contador;
    }
    public void llenarTablero()
    {
        for(int f=0; f<3 ;f++ ) { for(int c=0; c<3 ;c++ ) { posicion[f][c] = "*" ; } }
    }
    public void eleccionMaquina()
    {
        
        i = aleatorio.nextInt(3);
        g = aleatorio.nextInt(3);
        if(posicion[i][g]=="X" || posicion[i][g]=="O")
        {
            eleccionMaquina();
        }
        else
        {
            posicion[i][g] = "O";
        }
        mostrartablero();
        eleccionJugador();
    }
    public void mostrartablero()
    {
        for(int f=0; f<3 ;f++ )
        {   
            System.out.println("");
            for(int c=0; c<3 ;c++ )
            {   
                System.out.print("| "+posicion[f][c] +" |");
                
            }
        };
    }
    public void eleccionJugador()
    {
        comprobrar();
        for(int f=0; f<3 ;f++ )
        {   
            System.out.println("");
            for(int c=0; c<3 ;c++ )
            {   
                if(posicion[f][c]=="O" || posicion[f][c]=="X")
                {
                    System.out.print("|Fila " + f + " Columana " +c +" Ocupada|");
                }
                else{
                    System.out.print("|Fila " + f + " Columana " +c +" Disponible|");
                }
            } 
        }
        System.out.println("\nIngrese el numero de la fila que desea marcar");
        i = lectura.nextInt();
        System.out.println("Ingrese el numero de la columna que desea marcar");
        g = lectura.nextInt();
        if(posicion[i][g] == "O" ||posicion[i][g] == "X")
        {
            System.out.println("Ese campo ya esta elejido escoja nuevamente");
            eleccionJugador();
        }
        posicion[i][g]= "X";
        eleccionMaquina();
    }
    public void comprobrar()
    {  
        
            if(posicion[1][0] == "X" && posicion[1][1] == "X" && posicion[1][2] == "X" || posicion[0][0] == "X" && posicion[0][1] == "X" && posicion[0][2] == "X" || posicion[2][0] == "X" && posicion[2][1] == "X" && posicion[2][2] == "X" || posicion[0][1] == "X" && posicion[1][1] == "X" && posicion[2][1] == "X" || posicion[0][0] == "X" && posicion[1][0] == "X" && posicion[2][0] == "X" || posicion[0][2] == "X" && posicion[1][2] == "X" && posicion[1][2] == "X"|| posicion[0][0] == "X" && posicion[1][1] == "X" && posicion[2][2] == "X"|| posicion[0][2] == "X" && posicion[1][1] == "X" && posicion[2][0] == "X")
            {
                System.out.println("\nFELICIDADES GANO");
                System.exit(0);
                
            }
            else if(posicion[1][0] == "O" && posicion[1][1] == "O" && posicion[1][2] == "O" || posicion[0][0] == "O" && posicion[0][1] == "O" && posicion[0][2] == "O" || posicion[2][0] == "O" && posicion[2][1] == "O" && posicion[2][2] == "O" || posicion[0][0] == "O"&& posicion[1][0] == "O" && posicion[2][0] == "O" ||  posicion[0][1] == "O"&& posicion[1][1] == "O" && posicion[2][1] == "O" ||  posicion[0][2] == "O"&& posicion[1][2] == "O" && posicion[2][2] == "O"|| posicion[0][0] == "O" && posicion[1][1] == "O" && posicion[2][2] == "O"|| posicion[0][2] == "O" && posicion[1][1] == "O" && posicion[2][0] == "O")
            {
                System.out.println("\nPERDIO");
                System.exit(0);
            }
            else if(contador==5 )
            {
                
                System.out.println("EMPATE");
                System.exit(0);
            }
            else
            {
                contador=contador+1;
            }
           
    }

}
