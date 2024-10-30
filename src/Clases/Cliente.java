package Clases;

import java.util.Date;

/**
 *
 * @author JOSEPH ROJAS
 */
public class Cliente extends Persona {
    private static int contadorIDs = 0;
    private String ID;
    private String Ndocumento;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, Date fechaNacimiento, String tipodocumento, String telefono, String email) {
        super(nombre, apellido, fechaNacimiento, tipodocumento, telefono, email);
        this.ID = ID;
        this.Ndocumento = Ndocumento;
    }

    public String getNdocumento() {
        return Ndocumento;
    }

    public void setNdocumento(String Ndocumento) {
        this.Ndocumento = Ndocumento;
    }

    public static int getContadorIDs() {
        return contadorIDs;
    }

    public static void setContadorIDs(int contadorIDs) {
        Cliente.contadorIDs = contadorIDs;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    private String generar() {
        contadorIDs++;
        return "" + contadorIDs; 
    }
    @Override
    public void mostrarInformacion() {
       
    }
    
}
