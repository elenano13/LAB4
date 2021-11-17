/**RadioClaseS.java 
*@author Elena Rodríguez 21774 
*@version 16/11/2021
*Clase RadioClaseS que hereda de Radio e implementa ExclusivoClaseS   
*/

class RadioClaseS extends Radio implements ExclusivoClaseS {
	//Constructor
	public RadioClaseS(String modo, int volumen){
		super(modo, volumen);
	}
	
	public void CambiarBocinas(int opcion){
		/** 
		*Método CambiarBocinas void que selecciona la opcion segun el usuario
		*@param opcion int con el numero de la opcion
		*/
		String mensaje = "";
		if(opcion==1){
			mensaje = "Se cambio a bocinas\n";
		} else if(opcion==2){
			mensaje = "Se cambio a auriculares\n";
		}
		System.out.println(mensaje);
	}
	
	public void PlanificarViajes(){
		/** 
		*Método PlanificarViajes 
		*/
		System.out.println("Planificando viaje");
	}
	
	public void TelefonoEspecial(int num){
		/** 
		*Método TelefonoEspecial
		*@param num int
		*/
		CambiarBocinas(num);
	}
	
	public void Productividad(){
		/** 
		*Método Productividad
		*/
		PlanificarViajes();
	}
}
