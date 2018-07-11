
package Graficas;


public class Visor_Graficas extends javax.swing.JFrame {

   
    public Visor_Graficas() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lbl_simulacion = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lbl_aviones = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lbl_escritorios = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        lbl_maletas = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        lbl_mantenimiento = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        lbl_colaMantenimiento = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        lbl_pasajeros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Visor Imagenes");
        setLocation(new java.awt.Point(600, 10));

        lbl_simulacion.setText("jLabel1");
        jScrollPane1.setViewportView(lbl_simulacion);

        lbl_aviones.setText("jLabel1");
        jScrollPane3.setViewportView(lbl_aviones);

        lbl_escritorios.setText("jLabel1");
        jScrollPane4.setViewportView(lbl_escritorios);

        lbl_maletas.setText("jLabel1");
        jScrollPane5.setViewportView(lbl_maletas);

        lbl_mantenimiento.setText("jLabel1");
        jScrollPane6.setViewportView(lbl_mantenimiento);

        lbl_colaMantenimiento.setText("jLabel1");
        jScrollPane7.setViewportView(lbl_colaMantenimiento);

        lbl_pasajeros.setText("jLabel1");
        jScrollPane8.setViewportView(lbl_pasajeros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    public javax.swing.JLabel lbl_aviones;
    public javax.swing.JLabel lbl_colaMantenimiento;
    public javax.swing.JLabel lbl_escritorios;
    public javax.swing.JLabel lbl_maletas;
    public javax.swing.JLabel lbl_mantenimiento;
    public javax.swing.JLabel lbl_pasajeros;
    public javax.swing.JLabel lbl_simulacion;
    // End of variables declaration//GEN-END:variables
}
