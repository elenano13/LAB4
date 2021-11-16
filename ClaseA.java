import java.util.ArrayList;
class claseA extends Radio implements ExclusivoA {

    public void llamarReciente(){

    }
    public void verTarjetas(){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Laura Perez. Tel: 59851686. Puesto: gerente general de ECOM gt.");
        arr.add("Liz Ortiz. Tel: 29987617. Puesto: Manager de produccion en Pollo Campero.");
        arr.add("Dayana González. Tel: 12354789.");
        arr.add("Jackeline Navichoque. Tel: 89651256. Puesto: Social Media Manager at Stabilo.");
        
        System.out.println(arr);
    }

}