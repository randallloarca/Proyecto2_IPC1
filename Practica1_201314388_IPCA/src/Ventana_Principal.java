
import Cola_Pasajeros.Cola;
import Cola_Pasajeros.Nodo_Pasajeros;
import ListaDoblementeEnlazadaAviones.ListaDoblementeEnlazada;
import ListaDoblementeEnlazadaAviones.Nodo_LDE_Aviones;
import ListaDoblementeEnlazdaCircular_Maletas.ListaDoblementeEnlazadaCircular;
import ListaDoblementeEnlazdaCircular_Maletas.Nodo_LDEC_Maletas;
import ListaSimple_Mantenimiento.Cola_Mantenimiento;
import ListaSimple_Mantenimiento.ListaSimple;
import ListaSimple_Mantenimiento.Nodo_LS;
import java.util.Random;

public class Ventana_Principal extends javax.swing.JFrame {

    public static ListaDoblementeEnlazadaAviones.ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();
    Cola_Pasajeros.Cola cola_pasajeros = new Cola();
    public static ListaDoblementeEnlazdaCircular_Maletas.ListaDoblementeEnlazadaCircular listaCircular = new ListaDoblementeEnlazadaCircular();
    ListaSimple_Mantenimiento.ListaSimple listaSimple = new ListaSimple();
    ListaSimple_Mantenimiento.Cola_Mantenimiento cola_m = new Cola_Mantenimiento();

    public Ventana_Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        consola = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        text_CantidadAviones = new javax.swing.JTextField();
        text_CantidadEstaciones = new javax.swing.JTextField();
        Empezar = new javax.swing.JButton();
        Cambiar_Turno = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulacion de Aeropuerto");

        consola.setBackground(new java.awt.Color(0, 0, 0));
        consola.setColumns(20);
        consola.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        consola.setForeground(new java.awt.Color(255, 255, 255));
        consola.setRows(5);
        jScrollPane1.setViewportView(consola);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cantidad de Aviones:");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cantidad de Estaciones:");

        Empezar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Empezar.setText("Empezar");
        Empezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpezarActionPerformed(evt);
            }
        });

        Cambiar_Turno.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Cambiar_Turno.setText("Cambiar Turno");
        Cambiar_Turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cambiar_TurnoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Consola");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Empezar)
                        .addGap(18, 18, 18)
                        .addComponent(Cambiar_Turno))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text_CantidadEstaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(text_CantidadAviones))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(text_CantidadAviones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(text_CantidadEstaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Empezar)
                            .addComponent(Cambiar_Turno)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void EmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpezarActionPerformed
        
        
        generar_aviones(Integer.parseInt(this.text_CantidadAviones.getText()));
        Nodo_LDE_Aviones nuevo = lista.primero ;
        generar_estaciones(Integer.parseInt(this.text_CantidadEstaciones.getText()),nuevo.getNo_Aviones(),nuevo.getNo_Mantenimiento());

        consola.setText(lista.fimprimirLista()
                + "\n" + cola_pasajeros.imprimir()
                + "\n" + listaCircular.imprimir()
                + "\n" + listaSimple.imprimir()
                + "\n" + cola_m.imprimir()
                + "\n");

    }//GEN-LAST:event_EmpezarActionPerformed

    private void Cambiar_TurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cambiar_TurnoActionPerformed
        consola.setText("");
        int turnos = 0;
        String turno = "++++++++++++ Turno" + turnos + "++++++++++++";
        String finTurno = "++++++++++++ Fin Turno" + turnos + "++++++++++++";
        sacar_pasajero(5);

        consola.setText(
                turno
                + lista.fimprimirLista()
                + "\n" + cola_pasajeros.imprimir()
                + "\n" + listaCircular.imprimir()
                + "\n" + listaSimple.imprimir()
                + "\n" + cola_m.imprimir()
                + "\n" + finTurno
        );
        turnos++;
    }//GEN-LAST:event_Cambiar_TurnoActionPerformed

    public void sacar_AvionesDeCola(int cantidad_estaciones) {
        Nodo_LS aux1= listaSimple.primero;
        
        
//        if (listaSimple.EstaVacio()) {
//            if (Integer.parseInt(text_CantidadEstaciones.getText()) != 0) {
//                listaSimple.insertarAlFinal(new Nodo_LS(aux1.getID_estaciones(), aux1.getEstado(), aux1.getID_Aviones(), aux1.getID_Mantenimiento()));
//            }
//        } else {
//            Nodo_LDE_Aviones aux;
//            if (cola_m != null) {
//                aux = cola_m.primero;
//                cola_m.primero = aux.siguiente;
//                aux = null;
//            }
//        }
    }

    public void sacar_pasajero(int cantidad) {
        String temp = "";

        if (cola_pasajeros.EstaVacio()) {
            System.out.println("LISTA VACIA");
        } else {
            Nodo_Pasajeros aux;
            for (int c = 0; c < cantidad; c++) {
                if (cola_pasajeros.primero != null) {
                    aux = cola_pasajeros.primero;
                    cola_pasajeros.primero = aux.siguiente;
                    //listaCircular.sacar_maletas(aux.getId_pasajero());
                    listaCircular.sacar_maletas(aux.getMaletas());
                    aux = null;
                }

            }
        }
    }

    public void generar_aviones(int aviones) {
        Random raviones = new Random();
        int temp_tipo = 0;
        int temp_pasajeros = 0;
        int temp_turno_m=0;
        for (int c = 1; c <= aviones; c++) {

            temp_tipo = raviones.nextInt(3);
            temp_pasajeros = cantidad_pasajeros(temp_tipo);
            temp_turno_m=turno_mantenimiento(temp_tipo);
            lista.InsertarAlFinal(new Nodo_LDE_Aviones(c, temp_turno_m, temp_pasajeros, desabordaje(temp_tipo), tipo_avion(temp_tipo)));
            crear_pasajeros(c, temp_pasajeros);
            cola_m.insertarAlFinal(new Nodo_LDE_Aviones(c, temp_turno_m, temp_pasajeros, desabordaje(temp_tipo), tipo_avion(temp_tipo)));
        }
    }

    public void generar_estaciones(int no_estaciones, int id_Aviones, int id_Mantenimiento) {
        for (int i = 1; i <= no_estaciones; i++) {
            listaSimple.insertarAlFinal(new Nodo_LS(i, estado_Estacion(no_estaciones),id_Aviones, id_Mantenimiento));
        }
    }

    public void generarCola() {
        generar_aviones(Integer.parseInt(this.text_CantidadAviones.getText()));
    }

    public String estado_Estacion(int tipo) {
        String temp = "";

        temp = "Disponible";

        return temp;
    }

    public void crear_pasajeros(int id_avion, int cantidad_pasajeros) {
        int temp_maletas = 0;
        for (int c = 1; c <= cantidad_pasajeros; c++) {
            temp_maletas = cantidad_maletas();
            cola_pasajeros.InsertarAlFinal(new Nodo_Pasajeros(id_avion, c, temp_maletas, cantidad_Documentos()));
            crear_maletas(temp_maletas, c, id_avion);
        }

    }

    public void crear_maletas(int cantidad_maletas, int id_pasajeros, int id_avion) {
        for (int c = 1; c <= cantidad_maletas; c++) {
            listaCircular.InsertarAlFinal(new Nodo_LDEC_Maletas(c, id_pasajeros, id_avion));
        }
    }

    public int turno_mantenimiento(int tipo) {
        int temp = 0;
        Random pasajeros = new Random();

        switch (tipo) {
            case 0:
                temp = pasajeros.nextInt(3) + 1;
                break;
            case 1:
                temp = pasajeros.nextInt(3) + 2;
                break;
            case 2:
                temp = pasajeros.nextInt(4) + 3;
                break;
        }

        return temp;
    }

    public int cantidad_pasajeros(int tipo) {
        int temp = 0;
        Random pasajeros = new Random();

        switch (tipo) {
            case 0:
                temp = pasajeros.nextInt(5) + 5;
                break;
            case 1:
                temp = pasajeros.nextInt(10) + 15;
                break;
            case 2:
                temp = pasajeros.nextInt(10) + 30;
                break;
        }

        return temp;
    }

    public String tipo_avion(int tipo) {
        String temp = "";
        switch (tipo) {
            case 0:
                temp = "Pequeño";
                break;
            case 1:
                temp = "Mediano";
                break;
            case 2:
                temp = "Grande";
                break;
        }
        return temp;
    }

    public int desabordaje(int tipo) {
        int temp = 0;
        switch (tipo) {
            case 0:
                temp = 1;
                break;
            case 1:
                temp = 2;
                break;
            case 2:
                temp = 3;
                break;
        }
        return temp;
    }

    public int cantidad_maletas() {
        int temp = 0;
        Random maletas = new Random();
        return temp = maletas.nextInt(4) + 1;

    }

    public int cantidad_Documentos() {
        int temp = 0;
        Random documentos = new Random();
        return temp = documentos.nextInt(10) + 1;
    }

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
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cambiar_Turno;
    private javax.swing.JButton Empezar;
    private javax.swing.JTextArea consola;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField text_CantidadAviones;
    private javax.swing.JTextField text_CantidadEstaciones;
    // End of variables declaration//GEN-END:variables
}
