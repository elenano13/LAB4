/**Controlador.java 
*@author Elena Rodríguez 21774 
*@version 22/08/2021
*Clase Driver program que se utiliza como director de orquesta   
*/

class Controlador{
	public static void main(String[] args){
		/** 
		*Método main que inicializa los objetos 
		*@param f int que indica el número de la familia que cumple con las características
		*@datos String con los datos del perro que se desea asignar
		*/
		Vista vista = new Vista();
		Radio radio = null;
		int numradio, volumen;
		int opcion = 0;
		boolean estado = false;
		String mensaje = "";
		vista.bienvenida();
		numradio = vista.ElegirTipoRadio();
		volumen = vista.IngresarVolumen();
		if (numradio==1){
			//ClaseS
			radio = new RadioClaseS("ClaseS", volumen);
		} else if (numradio==2){
			//ClaseA
			radio = new ClaseA("ClaseA", volumen);
		} else if (numradio==3){
			//ClaseC
			radio = new ClaseC("ClaseC", volumen);
		}
		
		estado = vista.Estado();
		while (estado==true){
			while (opcion != 5){
				opcion = vista.menu();
				if (opcion == 1){
					// ModoRadio
					int opcionModoRadio = vista.MenuModoRadio();
					while (opcionModoRadio != 7){
						if (opcionModoRadio==1){
							//FM o AM
							int num = vista.AMFM();
							mensaje = radio.CambiarFM_AM(num);
							vista.Mostrar(mensaje);
							break;
						} else if (opcionModoRadio==2){
							//Cambiar emisora
							int num = vista.Cambiar();
							mensaje = radio.CambiarEmisora(num);
							vista.Mostrar(mensaje);
							break;
						} else if (opcionModoRadio==3){
							//Guardar Emisora
							String emi = vista.IngresarEmisora();
							mensaje = radio.GuardarEmisora(emi);
							vista.Mostrar(mensaje);
							break;
						} else if (opcionModoRadio==4){
							//Cargar Emisora
							String emi = vista.IngresarEmisora();
							mensaje = radio.CargarEmisora(emi);
							vista.Mostrar(mensaje);
							break;
						} else if (opcionModoRadio==5){
							//Subir Volumen
							int num = vista.Cambiar();
							mensaje = radio.CambiarVolumen(num);
							vista.Mostrar(mensaje);
							break;
						} else if (opcionModoRadio==6){
							//Apagar
							mensaje = radio.EncenderApagar();
							vista.Mostrar(mensaje);
							estado = false;
						} else if (opcionModoRadio==7){
							//Salir Modo Radio
						}
					
					}
				} else if (opcion == 2){
					// ModoReproduccion
					int opcionModoReproduccion = vista.MenuModoReproduccion();
					radio.IniciarListas();
					while (opcionModoReproduccion != 6){
						if (opcionModoReproduccion==1){
							//Elegir lista
							int num = vista.ElegirNumLista();
							mensaje = radio.Lista(num);
							vista.Mostrar(mensaje);
							break;
						} else if (opcionModoReproduccion==2){
							//Cambiar cancion
							int num = vista.Cambiar();
							mensaje = radio.CambiarCancion(num);
							vista.Mostrar(mensaje);
							break;
						} else if (opcionModoReproduccion==3){
							//Escuchar cancion
							int can = vista.IngresarNumCancion();
							mensaje = radio.EscucharCancion(can);
							vista.Mostrar(mensaje);
							break;
						} else if (opcionModoReproduccion==4){
							//Subir Volumen
							int num = vista.Cambiar();
							mensaje = radio.CambiarVolumen(num);
							vista.Mostrar(mensaje);
							break;
						} else if (opcionModoReproduccion==5){
							//Apagar
							mensaje = radio.EncenderApagar();
							vista.Mostrar(mensaje);
							estado = false;
						} else if (opcionModoReproduccion==6){
							//Salir Modo Reproduccion
						}
					
					}
				} else if (opcion == 3){
					// ModoTelefono
					int opcionModoTelefono = vista.MenuModoTelefono();
					radio.IniciarListas();
					while (opcionModoTelefono != 6){
						if (opcionModoTelefono==1){
							//Conectar Desconectar
							int num = vista.DesConTel();
							if (num==1){
								radio.conectar();
							} else if (num==2){
								radio.desconectar();
							}
							break;
						} else if (opcionModoTelefono==2){
							//Mostrar Contactos
							radio.mostrarContactos();
							break;
						} else if (opcionModoTelefono==3){
							//Llamar a contacto
							int num = vista.IngresarNumero();
							radio.llamar(num);
							break;
						} else if (opcionModoTelefono==4){
							//Subir Volumen
							int num = vista.IngresarNumero();
							radio.finalizarLlamada(num);
							break;
						} else if (opcionModoTelefono==5){
							//Extra
							int num = 0;
							if (numradio==1){
								//Cambiar bocinas
								num = vista.Bocinas();
							} else if (numradio==2){
								//Llamar al ultimo contacto
								num = vista.IngresarNumero();
							} else if (numradio==3){
								//Cambiar bocinas
								num = vista.IngresarNumCancion();
							}
							radio.TelefonoEspecial(num);
							break;
						} else if (opcionModoTelefono==6){
							//Apagar 
							mensaje = radio.EncenderApagar();
							vista.Mostrar(mensaje);
							estado = false;
						} else if (opcionModoTelefono==7){
							//Salir Modo Reproduccion
						}
					
					}
				} else if (opcion == 4){
					// ModoProductividad
					int opcionModoP = vista.MenuModoP();
					radio.IniciarListas();
					while (opcionModoP != 6){
						if (opcionModoP==1){
							//Modo productividad
							radio.Productividad();
							break;
						} else if (opcionModoP==6){
							//Apagar 
							mensaje = radio.EncenderApagar();
							vista.Mostrar(mensaje);
							estado = false;
						} else if (opcionModoP==7){
							//Salir Modo Reproduccion
						}
					
					}
				} else if (opcion ==5){
					System.exit(0);
				}
			}
		}
}
}
		
