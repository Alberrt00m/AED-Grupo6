package EDD;

import Clases.Vehiculo;
import javax.swing.table.DefaultTableModel;

public class ListaVehiculo {
    private NodoVehiculo cabeza;

    public ListaVehiculo() {
        cabeza = null;
    }

    public void agregar(Vehiculo vehiculo) {
        NodoVehiculo nuevoNodo = new NodoVehiculo(vehiculo);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoVehiculo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    public Vehiculo buscar(String valorBusqueda) {
    NodoVehiculo actual = cabeza;
    valorBusqueda = valorBusqueda.toLowerCase(); 

    while (actual != null) {
        Vehiculo vehiculo = actual.getVehiculo();

        if (vehiculo.getPropietario().toLowerCase().contains(valorBusqueda) ||
            vehiculo.getMarca().toLowerCase().contains(valorBusqueda) ||
            vehiculo.getPlaca().toLowerCase().contains(valorBusqueda) ||
            vehiculo.getModelo().toLowerCase().contains(valorBusqueda) ||
            vehiculo.getAño().toLowerCase().contains(valorBusqueda)) {
            return vehiculo; 
        }
        actual = actual.getSiguiente();
    }
    return null; 
}
    
    public void listar(DefaultTableModel modelo) {
        modelo.setRowCount(0); 
        NodoVehiculo actual = cabeza;
        while (actual != null) {
            modelo.addRow(actual.getVehiculo().toTableRow());
            actual = actual.getSiguiente();
        }
    }
    public void ordenar() {
        if (cabeza == null || cabeza.getSiguiente() == null) {
            return; 
        }

        boolean intercambiado;
        do {
            intercambiado = false;
            NodoVehiculo actual = cabeza;

            while (actual.getSiguiente() != null) {
                NodoVehiculo siguiente = actual.getSiguiente();
                if (actual.getVehiculo().getPropietario().compareTo(siguiente.getVehiculo().getPropietario()) > 0) {
                    // Intercambiar nodos
                    Vehiculo temp = actual.getVehiculo();
                    actual.setVehiculo(siguiente.getVehiculo());
                    siguiente.setVehiculo(temp);
                    intercambiado = true;
                }
                actual = actual.getSiguiente();
            }
        } while (intercambiado);
    }

    
    public void eliminar(String placa) {
        if (cabeza != null) {
            if (cabeza.getVehiculo().getPlaca().equals(placa)) {
                cabeza = cabeza.getSiguiente();
            } else {
                NodoVehiculo actual = cabeza;
                while (actual.getSiguiente() != null && !actual.getSiguiente().getVehiculo().getPlaca().equals(placa)) {
                    actual = actual.getSiguiente();
                }
                if (actual.getSiguiente() != null) {
                    actual.setSiguiente(actual.getSiguiente().getSiguiente());
                }
            }
        }
    }
    
    public void limpiar() {
        cabeza = null;
    }
}
