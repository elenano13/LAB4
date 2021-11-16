import java.util.Random; 

public class ClaseC extends Radio implements ExclusivoC {
    
    public void cambiarLlamadaEspera(int num){
        System.out.println("Se ha puesto su llamada con en espera. "); 
    } 
    public void pronosticoTiempo(){
        Random rand = new Random(); 
        int upperbound1 = 11;
        int upperbound2 = 28; 
        int int_random1 = rand.nextInt(upperbound1); 
        int int_random2 = rand.nextInt (upperbound2); 

        System.out.println("La temperatura mínima para hoy es de: "+ int_random1+"mientras que la máxima es de"+int_random2);


    }

}
