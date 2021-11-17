/**ModoRadio.java 
*@author Elena Rodríguez 21774 
*@version 16/11/2021
*Interfaz que contiene los metodos del Modo Radio  
*/

public interface ModoRadio{
	String CambiarFM_AM(int cambio); //Retorna un String con las instrucciones 
	String CambiarEmisora(int opcion); //Retorna un String con las instrucciones 
	String GuardarEmisora(String emisora);
	String CargarEmisora(String emisora);
	
}
