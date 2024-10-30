package EDE;

import Clases.Cliente;
import javax.swing.JOptionPane;

public class ArregloCliente {
    private int indice;
    private Cliente [] elemento;
    private static int contadorIDs = 0;
    
    public int getIndice(){
        return indice;
    }
    public ArregloCliente(int tam) {
        indice = 0;
        elemento = new Cliente [tam];
        
    }
    public void agregarPropietario(Cliente obj) {
       if (indice < elemento.length) {
            obj.setID(generarID());
            elemento[indice] = obj;
            indice++;
            JOptionPane.showMessageDialog(null, "Propietario agregado con ID: " + obj.getID());
        } else {
           JOptionPane.showMessageDialog(null, "No se pueden agregar más propietarios. Capacidad máxima alcanzada.");
        }
    }
    public Cliente[] getElementos(){
        return elemento;
    }
    public Cliente getElemento(int pos){
       if (pos >= 0 && pos < indice) {
            return elemento[pos];
        } else {
            JOptionPane.showMessageDialog(null, "Índice fuera de rango.");
            return null;
        }
    } 
    
     private String generarID() {
        contadorIDs++;
        return "" + contadorIDs;
    }

}