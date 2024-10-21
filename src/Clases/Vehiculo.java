package Clases;

/**
 *
 * @author JOSEPH ROJAS
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private String año;
    private Cliente clienteA;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String año, Cliente clienteA) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.clienteA = clienteA;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public Cliente getClienteA() {
        return clienteA;
    }

    public void setClienteA(Cliente clienteA) {
        this.clienteA = clienteA;
    }
    
    public void registrarVehiculo() {
       
    }
}
