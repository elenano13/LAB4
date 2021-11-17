/**ModoRadio.java 
*@author Elena Rodríguez 21774 
*@version 22/08/2021
*Interfaz que contiene los metodos del Modo Radio  
*/

public interface ModoReproduccion{
	String SeleccionarListaReproduccion(int lista); //Retorna un String con las instrucciones 
	String CambiarCancion(int direccion); //Retorna un String con las instrucciones 
	String EscucharCancion(int num);
	
}