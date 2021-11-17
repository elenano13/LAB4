/**
 * Una clase que implementa los métodos específicos para loa autos de clase A
 * @version 1.0 15/11/2021
 * @author Dulce Gonzalez 
 */

import java.util.ArrayList;
class ClaseA extends Radio implements ExclusivoA {
	
	public ClaseA(String modo, int volumen){
		super(modo, volumen);
	}

    public void llamarReciente(int num){
		 System.out.println("Llamando al ultimo numero"); 
    }
	
    public void verTarjetas(){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Laura Perez. Tel: 59851686. Puesto: gerente general de ECOM gt.");
        arr.add("Liz Ortiz. Tel: 29987617. Puesto: Manager de produccion en Pollo Campero.");
        arr.add("Dayana González. Tel: 12354789.");
        arr.add("Jackeline Navichoque. Tel: 89651256. Puesto: Social Media Manager at Stabilo.");
        
        System.out.println(arr);
    }
	
	public void TelefonoEspecial(int num){
		llamarReciente(num);
	}
	
	public void Productividad(){
		verTarjetas();
	}

}
