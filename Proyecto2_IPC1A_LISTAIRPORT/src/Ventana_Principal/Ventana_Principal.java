package Ventana_Principal;

import Cola_Pasajeros.Cola_pasajeros;
import Cola_Pasajeros.Nodo_Pasajeros;
import ListaDoblementeEnlazadaAviones.ListaDoblementeEnlazada_Aviones;
import ListaDoblementeEnlazadaAviones.Nodo_LDE_Aviones;
import ListaDoblementeEnlazadaEscritorios.ListaDoblementeEnlazada_Escritorios;
import ListaDoblementeEnlazadaEscritorios.Nodo_Escritorios;
import ListaDoblementeEnlazdaCircular_Maletas.ListaDoblementeEnlazadaCircular;
import ListaDoblementeEnlazdaCircular_Maletas.Nodo_LDEC_Maletas;
import ListaSimple_Mantenimiento.Cola_Mantenimiento;
import ListaSimple_Mantenimiento.ListaSimple_mantenimiento;
import ListaSimple_Mantenimiento.Nodo_LS;
import java.util.Random;

public class Ventana_Principal extends javax.swing.JFrame {

    public static ListaDoblementeEnlazadaAviones.ListaDoblementeEnlazada_Aviones lista_dobleEnlazada_aviones = new ListaDoblementeEnlazada_Aviones();
    public static Cola_Pasajeros.Cola_pasajeros cola_pasajeros = new Cola_pasajeros();
    public static ListaDoblementeEnlazdaCircular_Maletas.ListaDoblementeEnlazadaCircular listaCircular_maletas = new ListaDoblementeEnlazadaCircular();
    public static ListaSimple_Mantenimiento.ListaSimple_mantenimiento listaSimple_mantenimiento = new ListaSimple_mantenimiento();
    public static ListaSimple_Mantenimiento.Cola_Mantenimiento cola_m = new Cola_Mantenimiento();
    public static ListaDoblementeEnlazadaEscritorios.ListaDoblementeEnlazada_Escritorios listaDE_Escritorios = new ListaDoblementeEnlazada_Escritorios();

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
        jLabel4 = new javax.swing.JLabel();
        txt_No_Escritorios = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulacion de Aeropuerto");

        consola.setBackground(new java.awt.Color(0, 0, 0));
        consola.setColumns(20);
        consola.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        consola.setForeground(new java.awt.Color(255, 255, 255));
        consola.setRows(5);
        jScrollPane1.setViewportView(consola);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setText("Cantidad de Aviones:");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
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

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setText("Cantidad de Escritorios:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Empezar)
                        .addGap(27, 27, 27)
                        .addComponent(Cambiar_Turno))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text_CantidadEstaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(text_CantidadAviones)
                            .addComponent(txt_No_Escritorios))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(text_CantidadEstaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_No_Escritorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Empezar)
                            .addComponent(Cambiar_Turno))
                        .addContainerGap(312, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//boton para empezar la simulacion
    private void EmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpezarActionPerformed

        generar_aviones(Integer.parseInt(this.text_CantidadAviones.getText()));
        //Nodo_LDE_Aviones nuevo = lista_dobleEnlazada_aviones.primero ;
        generar_estaciones(Integer.parseInt(this.text_CantidadEstaciones.getText()), 0, 0);

        generar_escritorios(Integer.parseInt(this.txt_No_Escritorios.getText()));

        consola.setText(lista_dobleEnlazada_aviones.ImprimirLista_DE()
                + "\n" + cola_pasajeros.imprimir()
                + "\n" + listaCircular_maletas.imprimir()
                + "\n" + listaSimple_mantenimiento.imprimir()
                + "\n" + cola_m.imprimir()
                + "\n" + listaDE_Escritorios.ImprimirLista_DE()
                + "\n");
        inicializa();
    }//GEN-LAST:event_EmpezarActionPerformed

    // boton para cambiar el turno en la simulacion
    int turnos = 0;
    private void Cambiar_TurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cambiar_TurnoActionPerformed

        consola.setText("");
        turnos++;
        String turno = "++++++++++++ Turno" + turnos + "++++++++++++" + "\n" + "\n";
        String finTurno = "++++++++++++ Fin Turno" + turnos + "++++++++++++";
//        sacar_pasajero(5);
//        sacar_AvionesDeCola(Integer.parseInt(this.text_CantidadEstaciones.getText()));
        sacar_pasajero_registro(7);
        //limpiar escritorios

        listaDE_Escritorios.vaciar();
        id_desktop = 65;
        generar_escritorios(Integer.parseInt(this.txt_No_Escritorios.getText()));
        
        inicializa();

        //FALTA ESCRITORIOS
        llena_escritorios(id_avion);
        consola.setText(turno
                + lista_dobleEnlazada_aviones.ImprimirLista_DE_soloprimero()
                + "\n" + cola_pasajeros.imprimir_primero(id_avion)
                + "\n" + listaCircular_maletas.imprimir_primero(id_avion)
                + "\n" + listaDE_Escritorios.ImprimirLista_DE()
                + "\n" + listaSimple_mantenimiento.imprimir()
                + "\n" + cola_m.imprimir()
                + "\n" + finTurno
        );


    }//GEN-LAST:event_Cambiar_TurnoActionPerformed

    ListaDoblementeEnlazadaEscritorios.Nodo_Escritorios nodo_es;

    Cola_Pasajeros.Nodo_Pasajeros aux, modificar;
    Cola_Pasajeros.Nodo_Pasajeros aux2;

    public void inicializa() {

        nodo_es = listaDE_Escritorios.primero;
        aux = cola_pasajeros.primero;
    }

    public void llena_escritorios(int id_avion) {
        //listaDE_Escritorios.vaciar();
        for (int j = 1; j <= Integer.parseInt(txt_No_Escritorios.getText()); j++) {

            for (int i = 1; i <= 7; i++) {
                if (aux != null) {
                    if (aux.id_avion == this.id_avion) {
                        nodo_es.estado = "Ocupado";
                        aux2 = new Cola_Pasajeros.Nodo_Pasajeros(aux.id_avion, aux.id_pasajero, aux.maletas, aux.documentos, aux.turnos_registro);
                        nodo_es.cola_pasajeros_escritorios.InsertarAlFinal(aux2);
                    }
                if (aux.siguiente != null) {
                    aux = aux.siguiente;
                } else {
                    i = 8;
                    j = Integer.parseInt(txt_No_Escritorios.getText()) + 1;
                }
                }

            }

            if (nodo_es.siguiente != null) {
                nodo_es = nodo_es.siguiente;
            } else {
                j = Integer.parseInt(txt_No_Escritorios.getText()) + 1;
            }

        }

    }

//metodo para sacar los aviones de la cola
    int id_avion = 1;
    int id_estacion = 1;

    public void sacar_AvionesDeCola(int cantidad_estaciones) {
        if (id_avion > Integer.parseInt(this.text_CantidadAviones.getText())) {
            id_avion = 1;
        }
        for (int c = 1; c <= Integer.parseInt(text_CantidadEstaciones.getText()); c++) {
            id_avion += lista_dobleEnlazada_aviones.primero.getNo_Aviones();
            Nodo_LDE_Aviones aux = cola_m.buscar(id_avion);

            if (aux == null) {
                listaSimple_mantenimiento.Modificar(c, 0, 0, "Disponible");
            } else {
                aux.setNo_Mantenimiento(aux.getNo_Mantenimiento() - 1);
                listaSimple_mantenimiento.Modificar(c, id_avion, aux.getNo_Mantenimiento(), "Ocupado");
            }

        }

//        listaSimple_mantenimiento.insertarAlFinal(new Nodo_LS(0, "Ocupado",id_avion, aux.getNo_Mantenimiento()));    
    }

    //metodo parea sacar los cola_pasajeros_escritorios correspondientes a cada avion que este ingresando
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
                    listaCircular_maletas.sacar_maletas_pasajero(aux.getId_pasajero());
                    aux = null;
                }

            }
        }
    }

    //metodo parea sacar los cola_pasajeros_escritorios correspondientes a cada avion que este ingresando
    public void sacar_pasajero_registro(int cantidad) {
        String temp = "";

        if (cola_pasajeros.EstaVacio()) {
            System.out.println("LISTA VACIA");
        } else {
            Nodo_Pasajeros aux = cola_pasajeros.primero;
            for (int c = 0; c < cantidad; c++) {
                if (cola_pasajeros.primero != null) {
                    if (aux != null) {
                        aux.turnos_registro--;
                        if (aux.turnos_registro <= 0) {
                            cola_pasajeros.eliminar(aux.id_pasajero);
                            listaCircular_maletas.sacar_maletas_pasajero(aux.id_pasajero);
                        }

                        aux = aux.siguiente;
                    }

                }

            }
        }
    }

    // se generan los avione asi mismo la cantidad de cola_pasajeros_escritorios, tipo, desabordaje y mantenimiento
    public void generar_aviones(int aviones) {
        Random raviones = new Random();
        int temp_tipo = 0;
        int temp_pasajeros = 0;
        int temp_turno_m = 0;
        for (int c = 1; c <= aviones; c++) {
            temp_tipo = raviones.nextInt(3);
            temp_pasajeros = cantidad_pasajeros(temp_tipo);
            temp_turno_m = turno_mantenimiento(temp_tipo);
            lista_dobleEnlazada_aviones.InsertarAlFinal(new Nodo_LDE_Aviones(c, temp_turno_m, temp_pasajeros, desabordaje(temp_tipo), tipo_avion(temp_tipo)));
            crear_pasajeros(c, temp_pasajeros);
            cola_m.insertarAlFinal(new Nodo_LDE_Aviones(c, temp_turno_m, temp_pasajeros, desabordaje(temp_tipo), tipo_avion(temp_tipo)));
        }
    }

    //genera las estacion que se utilizaran para el mantenimiento de los aviones
    public void generar_estaciones(int no_estaciones, int id_Aviones, int id_Mantenimiento) {
        for (int i = 1; i <= no_estaciones; i++) {
            listaSimple_mantenimiento.insertarAlFinal(new Nodo_LS(i, estado_Estacion(no_estaciones), id_Aviones, id_Mantenimiento));
        }
    }

    //genera la cola de los aviones que ingresaran a la lista de mantenimiento
    public void generarCola() {
        generar_aviones(Integer.parseInt(this.text_CantidadAviones.getText()));
    }

    //verifica que estado se encuentra la estacion de mantenimientio
    public String estado_Estacion(int tipo) {
        String temp = "";
        temp = "Disponible";
        return temp;
    }

    //se genera la cantidad de cola_pasajeros_escritorios con su respectiva cantidad de maletas y documentos
    public void crear_pasajeros(int id_avion, int cantidad_pasajeros) {
        int temp_maletas = 0;
        for (int c = 1; c <= cantidad_pasajeros; c++) {
            temp_maletas = cantidad_maletas();
            cola_pasajeros.InsertarAlFinal(new Nodo_Pasajeros(id_avion, c, temp_maletas, cantidad_Documentos(), cantidad_deRegistro()));
            crear_maletas(temp_maletas, c, id_avion);
        }

    }

    public void crear_maletas(int cantidad_maletas, int id_pasajeros, int id_avion) {
        for (int c = 1; c <= cantidad_maletas; c++) {
            listaCircular_maletas.InsertarAlFinal(new Nodo_LDEC_Maletas(c, id_pasajeros, id_avion));
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

    public int cantidad_deRegistro() {
        int temp = 0;
        Random registro = new Random();
        return temp = registro.nextInt(3) + 1;
    }

    public int cantidad_Documentos() {
        int temp = 0;
        Random documentos = new Random();
        return temp = documentos.nextInt(10) + 1;
    }

    //generamos los escritorios donde pasaran los cola_pasajeros_escritorios a presentar su documentos
    char id_desktop = 65;

    public void generar_escritorios(int id_escritorio) {
        String estado = "";
        Nodo_Escritorios aux = listaDE_Escritorios.primero;
        for (int i = 1; i <= Integer.parseInt(txt_No_Escritorios.getText()); i++) {
            if (aux == null) {
                estado = "Disponible";
                listaDE_Escritorios.InsertarAlFinal(new Nodo_Escritorios(("" + id_desktop), 0, estado, cantidad_Documentos(), cantidad_deRegistro()));
                //letra del Escritorio
                id_desktop++;
                if (id_desktop == 91) {
                    id_desktop = 65;
                }
            }
//            else {
//                estado = "Ocupado";
//                listaDE_Escritorios.InsertarAlFinal(new Nodo_Escritorios(("" + id_desktop), 0, estado, cantidad_Documentos(), cantidad_deRegistro()));
//                //letra del escritorio
//                id_desktop++;
//                if (id_desktop == 91) {
//                    id_desktop = 65;
//                }
//            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cambiar_Turno;
    private javax.swing.JButton Empezar;
    private javax.swing.JTextArea consola;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField text_CantidadAviones;
    private javax.swing.JTextField text_CantidadEstaciones;
    private javax.swing.JTextField txt_No_Escritorios;
    // End of variables declaration//GEN-END:variables

}
