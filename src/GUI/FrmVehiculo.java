package GUI;

import Clases.Vehiculo;
import EDE.ArregloVehiculo;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.IntelliJTheme;
import com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JOSEPH ROJAS
 */
public class FrmVehiculo extends javax.swing.JFrame {
    ArregloVehiculo datos = new ArregloVehiculo(20);
     public FrmVehiculo(){
         initComponents();
         this.setLocationRelativeTo(null);
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Lista = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehiculo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        Registro = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        txtpropietario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lista.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Ordenar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Agregar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        tblVehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Propietario", "Placa", "Marca", "Modelo", "Año"
            }
        ));
        jScrollPane1.setViewportView(tblVehiculo);

        jLabel1.setText("Buscar: ");

        javax.swing.GroupLayout ListaLayout = new javax.swing.GroupLayout(Lista);
        Lista.setLayout(ListaLayout);
        ListaLayout.setHorizontalGroup(
            ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ListaLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ListaLayout.setVerticalGroup(
            ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnBuscar)
                    .addComponent(jButton1)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lista", Lista);

        jLabel6.setText("Propietario:");

        jLabel7.setText("Marca:");

        jLabel8.setText("Placa:");

        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });

        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlacaKeyTyped(evt);
            }
        });

        txtpropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpropietarioActionPerformed(evt);
            }
        });
        txtpropietario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpropietarioKeyTyped(evt);
            }
        });

        jLabel9.setText("Año:");

        txtAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAñoKeyTyped(evt);
            }
        });

        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModeloKeyTyped(evt);
            }
        });

        jLabel10.setText("Modelo:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegistroLayout = new javax.swing.GroupLayout(Registro);
        Registro.setLayout(RegistroLayout);
        RegistroLayout.setHorizontalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar)
                            .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(269, 269, 269))
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtModelo)
                                .addComponent(txtMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                            .addComponent(txtpropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(268, 268, 268))))
        );
        RegistroLayout.setVerticalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtpropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registro", Registro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String propietario = txtpropietario.getText().trim();
        String placa = txtPlaca.getText().trim();
        String marca = txtMarca.getText().trim();
        String modelo = txtModelo.getText().trim();
        String año = txtAño.getText().trim();
        if (propietario.isEmpty()||placa.isEmpty()||marca.isEmpty()||modelo.isEmpty()||año.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (propietario.length() < 3) {
            JOptionPane.showMessageDialog(null, "El nombre del propietario debe de tener al menos 3 caracteres.");
            return; 
        }
        
        if (placa.length() < 6 || placa.length() > 8) {
            JOptionPane.showMessageDialog(this, "La placa esta mal >:v.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (marca.length() < 3) {
            JOptionPane.showMessageDialog(null, "La marca debe de tener al menos 3 caracteres.");
            return; 
        }

        if (modelo.length() < 3) {
            JOptionPane.showMessageDialog(null, "El modelo debe de tener 3 caracteres como minimo .");
            return; 
        }
        
        if (año.length() != 4) {
            JOptionPane.showMessageDialog(this, "En el año son solo 4 digitos!!!!!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        agregar();
        jTabbedPane1.setSelectedComponent(Lista);
        JOptionPane.showMessageDialog(null, "Vehiculo registrado correctamente.");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
       jTabbedPane1.setSelectedComponent(Registro);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ordenar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtpropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpropietarioActionPerformed

    }//GEN-LAST:event_txtpropietarioActionPerformed

    private void txtpropietarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpropietarioKeyTyped
        char c  = evt.getKeyChar();
        if((c<'a'||c>'z') && (c<'A')|c>'Z') evt.consume();
    }//GEN-LAST:event_txtpropietarioKeyTyped

    private void txtPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyTyped
        char c  = evt.getKeyChar();
        if((c<'a'||c>'z') && (c<'A')|c>'Z') evt.consume();
    }//GEN-LAST:event_txtPlacaKeyTyped

    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
        char c  = evt.getKeyChar();
        if((c<'a'||c>'z') && (c<'A')|c>'Z') evt.consume();
    }//GEN-LAST:event_txtMarcaKeyTyped

    private void txtModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyTyped
        char c  = evt.getKeyChar();
        if((c<'a'||c>'z') && (c<'A')|c>'Z') evt.consume();
    }//GEN-LAST:event_txtModeloKeyTyped

    private void txtAñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAñoKeyTyped
        if (txtAño.getText().trim().length() == 4) {
            evt.consume();
        }
        char xc = evt.getKeyChar();
        if(xc<'0'||xc>'9') evt.consume();
    }//GEN-LAST:event_txtAñoKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

            FlatCyanLightIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Lista;
    private javax.swing.JPanel Registro;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblVehiculo;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtpropietario;
    // End of variables declaration//GEN-END:variables

    private void agregar() {
      Vehiculo xd = new Vehiculo();
        xd.setMarca(txtMarca.getText());
        xd.setPlaca(txtPlaca.getText());
        xd.setModelo(txtModelo.getText());
        xd.setPropietario(txtpropietario.getText());
        xd.setAño(txtAño.getText());
        datos.add(xd);
        limpiar();
        listar();
    }

    private void listar() {
       Vehiculo [] aux = datos.getElementos();
        DefaultTableModel dtm = (DefaultTableModel) tblVehiculo.getModel();
        // Limpiar la tabla antes de cargar nuevos datos
        while (dtm.getRowCount() != 0) {
             dtm.removeRow(0);
        }
         for (int i = 0; i < datos.getIndice(); i++) {
            Vehiculo vehiculo = aux[i];
            Vector<Object> w = new Vector<>();
            w.add(vehiculo.getID());
            w.add(vehiculo.getPropietario());
            w.add(vehiculo.getPlaca());
            w.add(vehiculo.getMarca());
            w.add(vehiculo.getModelo());
            w.add(vehiculo.getAño());
            dtm.addRow(w);
        }
    }

    private void limpiar() {
       txtpropietario.setText("");
       txtPlaca.setText("");
       txtMarca.setText("");
       txtModelo.setText("");
       txtAño.setText("");
    }

    private void ordenar() {
         Vehiculo[] aux = datos.getElementos();
        int n = datos.getIndice();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (aux[j].getPropietario().compareToIgnoreCase(aux[j + 1].getPropietario()) > 0) {
                    Vehiculo temp = aux[j];
                    aux[j] = aux[j + 1];
                    aux[j + 1] = temp;
                }
            }
        }
        listar();
        }

    private void buscar() {
         String xd = txtBuscar.getText().trim(); 
         Vehiculo[] aux = datos.getElementos();
         boolean encontrado = false;

        DefaultTableModel dtm = (DefaultTableModel) tblVehiculo.getModel();
        while (dtm.getRowCount() != 0) {
            dtm.removeRow(0);
        }

        for (int i = 0; i < datos.getIndice(); i++) {
        Vehiculo vehiculo = aux[i];
        
        if (vehiculo.getID().equalsIgnoreCase(xd) || 
            vehiculo.getPropietario().equalsIgnoreCase(xd) ||
            vehiculo.getPlaca().equalsIgnoreCase(xd) ||
            vehiculo.getMarca().equalsIgnoreCase(xd) ||
            vehiculo.getModelo().equalsIgnoreCase(xd) ||
            vehiculo.getAño().equalsIgnoreCase(xd)) {
            
            // Agregar fila a la tabla si se encuentra coincidencia en algún atributo
            Vector<Object> w = new Vector<>();
            w.add(vehiculo.getID());
            w.add(vehiculo.getPropietario());
            w.add(vehiculo.getPlaca());
            w.add(vehiculo.getMarca());
            w.add(vehiculo.getModelo());
            w.add(vehiculo.getAño());
            dtm.addRow(w);
            
            encontrado = true;
        }
    }


    if (!encontrado) {
        JOptionPane.showMessageDialog(this, "No se encontró el valor especificado en la tabla.", "Búsqueda", 
                JOptionPane.INFORMATION_MESSAGE);
    }
        }
 
}
