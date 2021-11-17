/**ModoReproduccion.java 
*@author Elena Rodríguez 21774 
*@version 16/11/2021
*Interfaz que contiene los metodos del Modo Reproduccion 
*/

public interface ModoReproduccion{
	String SeleccionarListaReproduccion(int lista); //Retorna un String con las instrucciones 
	String CambiarCancion(int direccion); //Retorna un String con las instrucciones 
	String EscucharCancion(int num);
	
}
