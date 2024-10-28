package Clases;

import javax.swing.JTextField;

/**
 *
 * @author JOSEPH ROJAS
 */
public class Vehiculo {
    private static int contadorIDs = 0;
    private String ID;
    private String marca;
    private String placa;
    private String modelo;
    private String año;
    private String propietario;

        public Vehiculo(int ID, String marca, String placa ,String modelo, String año,String propietario) {
        this.ID = generarID();
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
        this.año = año;
        this.propietario = propietario;
    }
    
    public Vehiculo() {
       this.ID = generarID();
    }

    private String generarID() {
        contadorIDs++;
        return "" + contadorIDs;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

}