/**
 * Interface que contiene los metodos que corresponden al radio en modo telefono
 * coordenadas de su  centro.
 * @version 1.0, 16/11/2021
 * @author Dulce Gonzalez 
 */
public interface ModoTelefono{

    void desconectar(); 
    void conectar();
    void mostrarContactos();
    void llamar(int num); 
    void finalizarLlamada(int num);

}
