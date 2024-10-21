package EDD;

import Clases.Vehiculo;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author JOSEPH ROJAS
 */
public class ColaVehiculo {
    private Queue<Vehiculo> colav;

    public ColaVehiculo() {
        colav = new LinkedList<>();
    }
    
    public void agregarVehiculo(Vehiculo vehiculo) {
        colav.add(vehiculo);
    }

    public Vehiculo atenderVehiculo() {
        return colav.poll();
    }

    public String mostrarColaVehiculos() {
        if (colav.isEmpty()) {
            return "No hay vehículos en la cola.";
        } else {
            StringBuilder resultado = new StringBuilder();
            for (Vehiculo v : colav) {
                resultado.append(v).append("\n");
            }
            return resultado.toString();
        }
    }

    public boolean estaVacia() {
        return colav.isEmpty();
    }
}
