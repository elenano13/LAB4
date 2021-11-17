

class RadioClaseS extends Radio implements ExclusivoClaseS {
	//Constructor
	public RadioClaseS(String modo, int volumen){
		super(modo, volumen);
	}
	
	public String CambiarBocinas(int opcion){
		String mensaje = "";
		if(opcion==1){
			mensaje = "Se cambio a bocinas\n";
		} else if(opcion==2){
			mensaje = "Se cambio a auriculares\n";
		}
		return mensaje;
	}
	
	public String PlanificarViajes(String lugar){
		String mensaje = "Planeando viaje a "+lugar+".\n";
		return mensaje;
	}
}