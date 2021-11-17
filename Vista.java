/**Vista.java 
*@author Elena Rodríguez 21774 
*@version 1/11/2021
*Clase Vista utilizada en el main Controlador.  
*/
import java.util.Scanner;
import java.util.InputMismatchException;

class Vista{
	private Scanner scan;
	
	public Vista(){
		/** 
		*Contructor que inicia el scanner
		*/
		scan = new Scanner(System.in);
	}
	
	public void bienvenida(){
		/** 
		*Método bienvenida void que saluda al usuario 
		*/
		System.out.println("Bienvenido al Radio\n");
	}
	

	public int ElegirTipoRadio(){
		/** 
		*Método menu int que le presenta las opciones al usuario 
		*@return opcion int con el numero de la opcion
		*/
		boolean flag = false;
		int opcion=0;
		while (flag==false){
			try{
				System.out.println("\nElija la accion que desea hacer?\n" + "1. Clase S\n" + "2. Clase A\n"+"3.Clase C\n");
				opcion = scan.nextInt();
			} catch (InputMismatchException ex){
				System.out.println("Debe ingresar un numero entero");
				scan.next();
				continue;
			}
			if (opcion==1 || opcion==2 || opcion==3){
				flag=true;
			} else {
				System.out.println("OPCION INCORRECTA");
			}
		}
		return opcion;
	}
	
	public int IngresarVolumen(){
		/** 
		*Método menu int que le presenta las opciones al usuario 
		*@return opcion int con el numero de la opcion
		*/

		int opcion=0;
		try{
			System.out.println("\nIngrese un volumen inicial para su radio");
			opcion = scan.nextInt();
		} catch (InputMismatchException ex){
			System.out.println("Debe ingresar un numero entero");
		}
		return opcion;
		}
		
		
	public boolean Estado(){
		/*
		*Método menu int que le presenta las opciones al usuario 
		*@return opcion int con el numero de la opcion
		*/
		boolean flag = false;
		int opcion=0;
		boolean res=false;
		while (flag==false){
			try{
				System.out.println("\nDesea encender el radio?\n" + "1. Si\n" + "2. No\n");
				opcion = scan.nextInt();
			} catch (InputMismatchException ex){
				System.out.println("Debe ingresar un numero entero");
				scan.next();
				continue;
			}
			if (opcion==1){
				res = true;
				flag=true;
			} else if (opcion==2){
				res = false;
				flag=true;
			}else {
				System.out.println("OPCION INCORRECTA");
			}
		}
		return res;
	}
	
	public void Mostrar(String info){
		/** 
		*Método menu int que le presenta las opciones al usuario 
		*@return opcion int con el numero de la opcion
		*/
		System.out.println(info);
	}
	
	public int menu(){
		/** 
		*Método menu int que le presenta las opciones al usuario 
		*@return opcion int con el numero de la opcion
		*/
		boolean flag = false;
		int opcion=0;
		while (flag==false){
			try{
				System.out.println("\nElija el modo del radio\n" + "1. Modo Radio\n" + "2. Modo Reproduccion\n"+"3.Modo Telefono\n"+"4.Modo Productividad\n"+"5.Salir");
				opcion = scan.nextInt();
			} catch (InputMismatchException ex){
				System.out.println("Debe ingresar un numero entero");
				scan.next();
				continue;
			}
			if (opcion==1 || opcion==2 || opcion==3 || opcion==4|| opcion==5){
				flag=true;
			} else {
				System.out.println("OPCION INCORRECTA");
			}
		}
		return opcion;
	}
	
	public int MenuModoRadio(){
		/** 
		*Método menu int que le presenta las opciones al usuario 
		*@return opcion int con el numero de la opcion
		*/
		boolean flag = false;
		int opcion=0;
		while (flag==false){
			try{
				System.out.println("\nElija la opcion dentro del modo RADIO\n" + "1. Cambiar de FM a AM\n" + "2. Cambiar emisoras\n"+"3.Guardar emisoras\n"+"4.Cargar emisora\n"+"5.Cambiar volumen\n"+"6.Apagar\n"+"7.Salir\n");
				opcion = scan.nextInt();
			} catch (InputMismatchException ex){
				System.out.println("Debe ingresar un numero entero");
				scan.next();
				continue;
			}
			if (opcion==1 || opcion==2 || opcion==3 || opcion==4 || opcion==5 || opcion==6 || opcion==7){
				flag=true;
			} else {
				System.out.println("OPCION INCORRECTA");
			}
		}
		return opcion;
	}
	
	public int MenuModoReproduccion(){
		/** 
		*Método menu int que le presenta las opciones al usuario 
		*@return opcion int con el numero de la opcion
		*/
		boolean flag = false;
		int opcion=0;
		while (flag==false){
			try{
				System.out.println("\nElija la opcion dentro del modo REPRODUCCION\n" + "1. Seleccionar lista de reproducción\n" + "2. Cambiar canción\n"+"3.Escuchar canción\n"+"4.Cambiar volumen\n"+"5.Apagar\n"+"6.Salir\n");
				opcion = scan.nextInt();
			} catch (InputMismatchException ex){
				System.out.println("Debe ingresar un numero entero");
				scan.next();
				continue;
			}
			if (opcion==1 || opcion==2 || opcion==3 || opcion==4 || opcion==5 || opcion==6 ){
				flag=true;
			} else {
				System.out.println("OPCION INCORRECTA");
			}
		}
		return opcion;
	}
	
	public int AMFM(){
		/** 
		*Método menu int que le presenta las opciones al usuario 
		*@return opcion int con el numero de la opcion
		*/
		boolean flag = false;
		int opcion=0;
		while (flag==false){
			try{
				System.out.println("\nElija\n" + "1. AM\n" + "2. FM\n");
				opcion = scan.nextInt();
			} catch (InputMismatchException ex){
				System.out.println("Debe ingresar un numero entero");
				scan.next();
				continue;
			}
			if (opcion==1 || opcion==2){
				flag=true;
			} else {
				System.out.println("OPCION INCORRECTA");
			}
		}
		return opcion;
	}
	
	public int Cambiar(){
		/** 
		*Método menu int que le presenta las opciones al usuario 
		*@return opcion int con el numero de la opcion
		*/
		boolean flag = false;
		int opcion=0;
		while (flag==false){
			try{
				System.out.println("\nElija\n" + "1. Subir\n" + "2. Bajar\n");
				opcion = scan.nextInt();
			} catch (InputMismatchException ex){
				System.out.println("Debe ingresar un numero entero");
				scan.next();
				continue;
			}
			if (opcion==1 || opcion==2){
				flag=true;
			} else {
				System.out.println("OPCION INCORRECTA");
			}
		}
		return opcion;
	}
	
	public String IngresarEmisora(){
		/** 
		*Método PedirAutor que le pregunta al usuario el nombre del autor del post
		*@return autor String con el nombre
		*/
		System.out.println("Ingrese la emisora");
		String emi = scan.next();
		return emi;
	}
	
	public int ElegirNumLista(){
		/** 
		*Método menu int que le presenta las opciones al usuario 
		*@return opcion int con el numero de la opcion
		*/
		boolean flag = false;
		int opcion=0;
		while (flag==false){
			try{
				System.out.println("\nElija\n" + "1. Lista 1\n" + "2. Lista 2\n");
				opcion = scan.nextInt();
			} catch (InputMismatchException ex){
				System.out.println("Debe ingresar un numero entero");
				scan.next();
				continue;
			}
			if (opcion==1 || opcion==2){
				flag=true;
			} else {
				System.out.println("OPCION INCORRECTA");
			}
		}
		return opcion;
	}
	
	public int IngresarNumCancion(){
		/** 
		*Método menu int que le presenta las opciones al usuario 
		*@return opcion int con el numero de la opcion
		*/
		boolean flag = false;
		int opcion=0;
		while (flag==false){
			try{
				System.out.println("\nElija el numero de la cancion (debe ser del 1 al 5)\n");
				opcion = scan.nextInt();
			} catch (InputMismatchException ex){
				System.out.println("Debe ingresar un numero entero");
				scan.next();
				continue;
			}
			if (opcion==1 || opcion==2 ||opcion==3 || opcion==4 || opcion==5 ){
				flag=true;
			} else {
				System.out.println("OPCION INCORRECTA");
			}
		}
		return opcion;
	}
	
	public int DesConTel(){
		/** 
		*Método menu int que le presenta las opciones al usuario 
		*@return opcion int con el numero de la opcion
		*/
		boolean flag = false;
		int opcion=0;
		while (flag==false){
			try{
				System.out.println("\nElija\n" + "1. Conectar 1\n" + "2. Desconectar 2\n");
				opcion = scan.nextInt();
			} catch (InputMismatchException ex){
				System.out.println("Debe ingresar un numero entero");
				scan.next();
				continue;
			}
			if (opcion==1 || opcion==2){
				flag=true;
			} else {
				System.out.println("OPCION INCORRECTA");
			}
		}
		return opcion;
	}
	
	public int IngresarNumero(){
		/** 
		*Método menu int que le presenta las opciones al usuario 
		*@return opcion int con el numero de la opcion
		*/

		int opcion=0;
		try{
			System.out.println("\nIngrese el numero");
			opcion = scan.nextInt();
		} catch (InputMismatchException ex){
			System.out.println("Debe ingresar un numero entero");
		}
		return opcion;
		}
	
	public int Bocinas(){
		/** 
		*Método menu int que le presenta las opciones al usuario 
		*@return opcion int con el numero de la opcion
		*/
		boolean flag = false;
		int opcion=0;
		while (flag==false){
			try{
				System.out.println("\nElija\n" + "1. Bocinas \n" + "2. Auriculares\n");
				opcion = scan.nextInt();
			} catch (InputMismatchException ex){
				System.out.println("Debe ingresar un numero entero");
				scan.next();
				continue;
			}
			if (opcion==1 || opcion==2){
				flag=true;
			} else {
				System.out.println("OPCION INCORRECTA");
			}
		}
		return opcion;
	}
	
	public int MenuModoTelefono(){
		/** 
		*Método menu int que le presenta las opciones al usuario 
		*@return opcion int con el numero de la opcion
		*/
		boolean flag = false;
		int opcion=0;
		while (flag==false){
			try{
				System.out.println("\nElija la opcion dentro del modo TELEFONO\n" + "1. Conectar/Desconectar teléfono\n" + "2. Mostrar contactos\n"+"3.Llamar a contacto\n"+"4.Finalizar llamada\n"+"5.CLASE S - Cambiar a bocinas o auriculares CLASE A. Llamar al último contacto con el que se habló. CLASE C. Cambiar a llamada en espera \n"+"7. Apagar\n"+"6.Salir\n");
				opcion = scan.nextInt();
			} catch (InputMismatchException ex){
				System.out.println("Debe ingresar un numero entero");
				scan.next();
				continue;
			}
			if (opcion==1 || opcion==2 || opcion==3 || opcion==4 || opcion==5 || opcion==6 || opcion==7 ){
				flag=true;
			} else {
				System.out.println("OPCION INCORRECTA");
			}
		}
		return opcion;
	}
	
	public int MenuModoP(){
		/** 
		*Método menu int que le presenta las opciones al usuario 
		*@return opcion int con el numero de la opcion
		*/
		boolean flag = false;
		int opcion=0;
		while (flag==false){
			try{
				System.out.println("\nMODO PRODUCTIVIDAD\n 1. Clase S: Planificar viajes\n Clase A. Ver tarjetas de presentacion\n Clase C: Ver pronostico del tiempo"+"2. Apagar\n"+"3.Salir\n");
				opcion = scan.nextInt();
			} catch (InputMismatchException ex){
				System.out.println("Debe ingresar un numero entero");
				scan.next();
				continue;
			}
			if (opcion==1 || opcion==2 || opcion==3){
				flag=true;
			} else {
				System.out.println("OPCION INCORRECTA");
			}
		}
		return opcion;
	}
	
		
	}
