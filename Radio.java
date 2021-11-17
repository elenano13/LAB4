/**Radio.java 
*@version 18/10/2021
*Clase Radio funciona como clase madre   
*/
import java.util.ArrayList;
//Clase madre
abstract class Radio implements ModoRadio, ModoReproduccion{
	//Variables de instancia
	protected String Modo, ModoSintonizacion;
	protected int Volumen;
	protected int Numlista=1;
	protected int numCancion =1;
	protected double Emisora;
	protected boolean estado = false; //Apagado
	protected ArrayList<String> Emisoras = new ArrayList<>();
	protected ArrayList<ArrayList<String>> ListasReproduccion = new ArrayList<>();
	
	//Inicializar algunas listas
	private ArrayList<String> Lista1 = new ArrayList<String>();
	private ArrayList<String> Lista2 = new ArrayList<String>();
	

	

	//Constructor
	public Radio(String modo, int volumen){
		Modo= modo;
		Volumen = volumen;
	}
	
	public void IniciarListas(){
		Lista1.add("CANCIONES VARIAS");
		Lista1.add("Nombre : Magic\n Duracion: 3:41\n Autor: Coldplay\n Genero: Pop\n");
		Lista1.add("Nombre : Red\n Duracion: 2:43\n Autor: Taylor Swift\n Genero: Pop\n");
		Lista1.add("Nombre : El Tucanazo\n Duracion: 2:43\n Autor: Los Tucanes de Tijuana\n Genero: Cumbia\n");
		Lista1.add("Nombre : Mis Sentimientos\n Duracion: 2:54\n Autor: Los Angeles Azules\n Genero: Cumbia\n");
		Lista1.add("Nombre : Doin' it Right\n Duracion: 2::43\n Autor: Daft Punk\n Genero: Electronica\n");
		ListasReproduccion.add(Lista1);
		Lista1.add("CANCIONES 2");
		Lista2.add(("Nombre : Navidad sin ti\n"+"Duracion: 3:32\n"+"Autor: Los Bukis\n"+"Genero: Baladas\n"));
		Lista2.add("Nombre : La feria de Cepillin\n Duracion: 2:32\n Autor: Cepillin\n Genero: Infantil\n");
		Lista2.add("Nombre : Hasta que te conoci\n Duracion: 3:32\n Autor: Juan Gabriel\n Genero: Regional mexicano\n");
		Lista2.add("Nombre : Noviembre sin ti\n Duracion: 2:32\n Autor: Reik\n Genero: Pop\n");
		Lista2.add("Nombre : Se me perdio la cadenita\n Duracion: 2:43\n Autor: La Sonora Dinamita\n Genero: Cumbia\n");
		ListasReproduccion.add(Lista2);
		
	}
	
	public String EncenderApagar(){
		String mensaje = "";
		if(estado==true){
			estado = false ;//Se apagó
			mensaje = "El radio se apagó";
		} else if(estado==false){
			estado = true; //Se enciende
			mensaje = "El radio se encendio";
		}
		return mensaje;
	}
	 public String CambiarVolumen(int opcion){
		 String mensaje = "";
		 if(opcion==1){
		 //Subir volumen
			 Volumen = Volumen+1;
		 } else if(opcion==2){
			 Volumen = Volumen-1;
		 }
		 mensaje = "El volumen es "+Volumen+".\n ";
		 return mensaje;
	 }
	 
	 public String CambiarFM_AM(int cambio){
		 if(cambio==1){
			ModoSintonizacion = "AM";
		} else if(cambio==2){
			ModoSintonizacion = "FM";
		}
		String mensaje = "\nEl radio esta en modo "+ModoSintonizacion+".\n";
		return mensaje;
	 }
	
	public String CambiarEmisora(int opcion){
		 String mensaje = "";
		 if(opcion==1 || opcion <200){
		 //Aumenta
			 Emisora = Emisora+0.5;
			 mensaje = "La nueva emisora "+Emisora+".\n ";
		 } else if(opcion==2 || opcion>0){
			 Emisora = Volumen-0.5;
			 mensaje = "La nueva emisora "+Emisora+".\n ";
		 } else{
			 mensaje  = "OPCION INCORRECTA, NO SE PUDO CAMBIAR DE EMISORA "+Emisora+".\n ";
		 }
		 return mensaje;
	 }
	 
	 public String GuardarEmisora(String emi){
		 String mensaje = "";
		 if (Emisoras.contains(emi)){
			 mensaje = "La emisora "+emi+" ya se encuentra guardada\n";
		 } else {
			 Emisoras.add(emi);
			 mensaje = "Se guardo la emisora "+emi+".\n";
		 }
		 return mensaje;
	 }
	 
	 public String CargarEmisora(String emi){
		 String mensaje = "Se cargo la emisora "+emi+".\n";
		 return mensaje;
	 }
	
	public String SeleccionarListaReproduccion(int num){
		Numlista = num-1;
		String nombre = ListasReproduccion.get(Numlista).get(0);
		return nombre;
	}
	
	public String CambiarCancion(int num){
		if (num==1){
			numCancion = numCancion+1;
		} else if (num==2 || num>0){
			numCancion = numCancion-1;
		}
		String mensaje = "Se cambio al numero de la cancion "+numCancion+".\n";
		return mensaje;
	}
	
	public String EscucharCancion(int num){
		String cancion = ListasReproduccion.get(Numlista).get(num);
		String Mensaje = "ESCUCHANDO...\n "+cancion;
		return Mensaje;
	}
	
	
}
	
