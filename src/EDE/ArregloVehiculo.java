package EDE;

import Clases.Vehiculo;

/**
 *
 * @author JOSEPH ROJAS
 */
public class ArregloVehiculo {
    private Vehiculo [] elemento;
    private int indice;
    
    public int getIndice(){
        return indice;
    }
    public ArregloVehiculo(int tam) {
        indice = 0;
        elemento = new Vehiculo[tam];
        
    }
    public void add(Vehiculo obj) {
        elemento [indice] = obj;
        indice++;
    }
    public Vehiculo[] getElementos(){
        return elemento;
    }
    public Vehiculo getElemento(int pos){
        return elemento[pos];
    }
}
