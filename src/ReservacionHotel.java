import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class ReservacionHotel extends javax.swing.JFrame {
    //variable para modelo de tabla
    DefaultTableModel modelo = new DefaultTableModel();
    //ARREGLO DINAMICO
    ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

    public ReservacionHotel() {
        initComponents();
        //TItulo
        this.setTitle("Reservación de hotel");
        //Tamaño Jframe
        this.setSize(820, 600);
        //Centrar ventana al momento de ejecutar
        this.setLocationRelativeTo(null);
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Tipo de habitacion");
        modelo.addColumn("Numero de personas");
        modelo.addColumn("Dìa de reservacion");
        modelo.addColumn("Tipo de pago");
        refrescarTabla();
        RellenarItemFor();
//        RellenarItemCase();
    }

    public void RellenarItemFor() {
        for (int i = 1; i <= 5; i++) {
            cboPersona.addItem(String.valueOf(i));
        }

    }
//    public void RellenarItemCase(){
//        String opcion = cboHabitacion.getSelectedItem().toString();
// switch (opcion) {
// case "Individual":
// cboHabitacion.addItem(String.valueOf(opcion));
// break;
//// case "Doble":
//// System.out.println("El país seleccionado fué Argentina");
//// break;
//// case "Suite":
//// System.out.println("El país seleccionado fué Brasil");
//// break;
//    }
//    }

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReservacionPersona = new javax.swing.JTable();
        txtNombrePersona = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        cboPago = new javax.swing.JComboBox<>();
        cboDia = new javax.swing.JComboBox<>();
        btnReservar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cboPersona = new javax.swing.JComboBox<>();
        cbHabitacion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.GreyInline"));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel2.setText("Apellidos");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel3.setText("Tipo de habitación");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel4.setText("Tipo de pago");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel5.setText("Número de personas en habitación");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel6.setText("Dia de Reservacion");

        tblReservacionPersona.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane1.setViewportView(tblReservacionPersona);

        txtNombrePersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePersonaActionPerformed(evt);
            }
        });
        txtNombrePersona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombrePersonaKeyTyped(evt);
            }
        });

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        cboPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta" }));

        cboDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado " }));

        btnReservar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnReservar.setText("Reservar");
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cbHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inidvidual", "Doble", "Suite", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jScrollPane1)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtNombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel6))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cboDia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(cbHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 62, Short.MAX_VALUE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(46, 46, 46)
                                                                .addComponent(btnReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(cboPago, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(cboPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(txtNombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5)
                                        .addComponent(cboPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel4)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cboPago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cboDia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {


        try {
            //CREACION DE OBJETO per
            Persona per = new Persona();
            per.setNombre(txtNombrePersona.getText());
            per.setApellido(txtApellido.getText());
            //VALIDACION
            if (per.nombre.equals("") && (per.apellido.equals(""))) {
                JOptionPane.showMessageDialog(null, "CAMPOS VACIOS");
            } else if (per.nombre.equals("")) {
                JOptionPane.showMessageDialog(null, "SE REQUIERE NOMBRE");
            } else if (per.apellido.equals("")) {
                JOptionPane.showMessageDialog(null, "SE REQUIERE APELLIDO");
            } else {

                System.out.println(cbHabitacion.getSelectedItem().toString());
                per.setTipoHabitacion(cbHabitacion.getSelectedItem().toString());
                String validacion = cbHabitacion.getSelectedItem().toString();
//                 //VALIDACION
                if (validacion.toString().equals(" ")) {
                    JOptionPane.showMessageDialog(null, "Seleccione tipo de habitacion");
                    cbHabitacion.setFocusable(true);
                    return;
                }
                per.setNumeroPersonas(Integer.parseInt(cboPersona.getSelectedItem().toString()));
                per.setdiaReservacion(cboDia.getSelectedItem().toString());
                per.setTipoPago(cboPago.getSelectedItem().toString());
                listaPersonas.add(per);
                refrescarTabla();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al hacer la reservación");
        }

    }

    public static boolean TipoDato(String c) {
        try {
            System.out.println(c);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //BOTON BOrrar
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        txtNombrePersona.setText("");
        txtApellido.setText("");
        cbHabitacion.setSelectedIndex(0);
        cboPersona.setSelectedIndex(1);
        cboDia.setSelectedIndex(0);
        cboPago.setSelectedIndex(0);

    }

    private void txtNombrePersonaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtNombrePersonaKeyTyped(java.awt.event.KeyEvent evt) {
        //Validar que el dato solo sea letra

        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo se permiten letras ");
            txtNombrePersona.setCursor(null);
        }

        else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
                || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo se permiten letras ");
        }
    }

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {
        //Validar que el dato solo sea letra
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo se permiten letras ");
            txtApellido.setCursor(null);
        } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
                || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo se permiten letras ");
        }
    }

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public void refrescarTabla() {
        //Borra campos del modelo
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        for (Persona per : listaPersonas) {
            Object p[] = new Object[6];
            p[0] = per.getNombre();
            p[1] = per.getApellido();
            p[2] = per.getTipoHabitacion();
            p[3] = per.getNumeroPersonas();
            p[4] = per.getdiaReservacion();
            p[5] = per.getTipoPago();
            modelo.addRow(p);
        }
        tblReservacionPersona.setModel(modelo);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReservacionHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservacionHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservacionHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservacionHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservacionHotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnReservar;
    private javax.swing.JComboBox<String> cbHabitacion;
    private javax.swing.JComboBox<String> cboDia;
    private javax.swing.JComboBox<String> cboPago;
    private javax.swing.JComboBox<String> cboPersona;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReservacionPersona;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombrePersona;
    // End of variables declaration                   
}