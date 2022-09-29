package principal;

public class Principal 
{
    
    public static void main(String[] args) 
    {
        Cancion hilo1 = new Cancion();
        Thread hilo2 = new Thread(new Multiplicacion());
        
        hilo1.start();
        hilo2.start();
    }
    
}
