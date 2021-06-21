/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ServerForm extends javax.swing.JFrame {
    Servidor serverRef;
    /**
     * Creates new form ServerForm
     */
    public ServerForm() {
        initComponents();
    }
    
    
    public void addMensaje(String msj){
        txaVuelos.append(msj+"\n");
    }
    public void actualizar(int i, String msj){
        serverRef.vuelos.get(i).estado = msj;
    }
    public void puerta(vuelo v){
        try {
            serverRef.vuelos.get(v.id).estado = "Esperando pasajeros...";
            addMensajeColas();
            txaPuerta.append("Tipo: " + v.tipo + "  Retraso: " + v.tarde + "   Esperando pasajeros...");
            addMensajeColas();
            Thread.sleep(4000);
            txaPuerta.append("Tipo: " + v.tipo + "  Retraso: " + v.tarde + "   Despegó");
            serverRef.vuelos.get(v.id).estado = "Despegó";
            addMensajeColas();
            serverRef.puerta = false;
        } catch (InterruptedException ex) {
            Logger.getLogger(ServerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void puerta1(vuelo v){
        try {
            serverRef.vuelos.get(v.id).estado = "Esperando pasajeros...";
            addMensajeColas();
            txaPuerta1.append("Tipo: " + v.tipo + "  Retraso: " + v.tarde + "   Esperando pasajeros...");
            addMensajeColas();
            Thread.sleep(4000);
            txaPuerta1.append("Tipo: " + v.tipo + "  Retraso: " + v.tarde + "   Despegó");
            serverRef.vuelos.get(v.id).estado = "Despegó";
            addMensajeColas();
            serverRef.puerta = false;
        } catch (InterruptedException ex) {
            Logger.getLogger(ServerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void puerta2(vuelo v){
        try {
            serverRef.vuelos.get(v.id).estado = "Esperando pasajeros...";
            addMensajeColas();
            txaPuerta2.append("Tipo: " + v.tipo + "  Retraso: " + v.tarde + "   Esperando pasajeros...");
            addMensajeColas();
            Thread.sleep(4000);
            txaPuerta2.append("Tipo: " + v.tipo + "  Retraso: " + v.tarde + "   Despegó");
            serverRef.vuelos.get(v.id).estado = "Despegó";
            addMensajeColas();
            serverRef.puerta = false;
        } catch (InterruptedException ex) {
            Logger.getLogger(ServerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void puerta3(vuelo v){
        try {
            serverRef.vuelos.get(v.id).estado = "Esperando pasajeros...";
            addMensajeColas();
            txaPuerta3.append("Tipo: " + v.tipo + "  Retraso: " + v.tarde + "   Esperando pasajeros...");
            addMensajeColas();
            Thread.sleep(4000);
            txaPuerta3.append("Tipo: " + v.tipo + "  Retraso: " + v.tarde + "   Despegó");
            serverRef.vuelos.get(v.id).estado = "Despegó";
            addMensajeColas();
            serverRef.puerta = false;
        } catch (InterruptedException ex) {
            Logger.getLogger(ServerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void puerta4(vuelo v){
        try {
            serverRef.vuelos.get(v.id).estado = "Esperando pasajeros...";
            addMensajeColas();
            txaPuerta4.append("Tipo: " + v.tipo + "  Retraso: " + v.tarde + "   Esperando pasajeros...");
            addMensajeColas();
            Thread.sleep(4000);
            txaPuerta4.append("Tipo: " + v.tipo + "  Retraso: " + v.tarde + "   Despegó");
            serverRef.vuelos.get(v.id).estado = "Despegó";
            addMensajeColas();
            serverRef.puerta = false;
        } catch (InterruptedException ex) {
            Logger.getLogger(ServerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void addMensajeColas(){
        txaCola.setText("");
        for (vuelo element : serverRef.cola) {
           txaCola.append("Tipo: "+ element.tipo +"  Retraso: " + element.tarde + "\n");
        }
        txaGran.setText("");
        for (vuelo element : serverRef.colaAG) {
           txaGran.append("Tipo: "+ element.tipo +"  Retraso: " + element.tarde + "\n");
        }
        txaMed.setText("");
        for (vuelo element : serverRef.colaAM) {
           txaMed.append("Tipo: "+ element.tipo +"  Retraso: " + element.tarde + "\n");
        }
        txaPeq.setText("");
        for (vuelo element : serverRef.colaAP) {
           txaPeq.append("Tipo: "+ element.tipo +"  Retraso: " + element.tarde + "\n");
        }
        txaInfo.setText("");
        for (int i = 0; i < serverRef.vuelos.size();i++){
            txaInfo.append("Tipo: "+ serverRef.vuelos.get(i).tipo +"  Retraso: " + serverRef.vuelos.get(i).tarde + "  Estado: " + serverRef.vuelos.get(i).estado + "\n");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txaVuelos = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaInfo = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaMed = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txaGran = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txaPuerta = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txaCola = new javax.swing.JTextArea();
        comPuerPis = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        comPista = new javax.swing.JComboBox<>();
        btnAterrizar = new javax.swing.JButton();
        btnAbordar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txaPeq = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        txaPuerta1 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txaPuerta2 = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        txaPuerta3 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        txaPuerta4 = new javax.swing.JTextArea();
        comPista1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txaVuelos.setColumns(20);
        txaVuelos.setRows(5);
        jScrollPane1.setViewportView(txaVuelos);

        jLabel1.setText("Cola de aterrizaje");

        txaInfo.setColumns(20);
        txaInfo.setRows(5);
        jScrollPane2.setViewportView(txaInfo);

        jLabel2.setText("Historial");

        txaMed.setColumns(20);
        txaMed.setRows(5);
        jScrollPane3.setViewportView(txaMed);

        txaGran.setColumns(20);
        txaGran.setRows(5);
        jScrollPane4.setViewportView(txaGran);

        txaPuerta.setColumns(20);
        txaPuerta.setRows(5);
        jScrollPane5.setViewportView(txaPuerta);

        jLabel3.setText("Pista Grande");

        jLabel4.setText("Pista Mediana");

        jLabel5.setText("Pista Pequeña");

        txaCola.setColumns(20);
        txaCola.setRows(5);
        jScrollPane6.setViewportView(txaCola);

        comPuerPis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Puerta 1", "Puerta 2", "Puerta 3", "Puerta 4", "Puerta 5" }));

        jLabel6.setText("Info Aviones");

        comPista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pista Grande", "pista Mediana", "Pista Pequeña" }));

        btnAterrizar.setText("Aterrizar");
        btnAterrizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAterrizarActionPerformed(evt);
            }
        });

        btnAbordar.setText("Pasar a Abordar");
        btnAbordar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbordarActionPerformed(evt);
            }
        });

        jLabel7.setText("Puerta 1");

        jLabel9.setText("Puerta 2");

        jLabel10.setText("Puerta 3");

        jLabel11.setText("Puerta 5");

        txaPeq.setColumns(20);
        txaPeq.setRows(5);
        jScrollPane8.setViewportView(txaPeq);

        txaPuerta1.setColumns(20);
        txaPuerta1.setRows(5);
        jScrollPane9.setViewportView(txaPuerta1);

        jLabel12.setText("Puerta 4");

        txaPuerta2.setColumns(20);
        txaPuerta2.setRows(5);
        jScrollPane10.setViewportView(txaPuerta2);

        txaPuerta3.setColumns(20);
        txaPuerta3.setRows(5);
        jScrollPane11.setViewportView(txaPuerta3);

        txaPuerta4.setColumns(20);
        txaPuerta4.setRows(5);
        jScrollPane12.setViewportView(txaPuerta4);

        comPista1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pista Grande", "pista Mediana", "Pista Pequeña" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addGap(125, 125, 125)))
                                .addGap(39, 39, 39))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comPuerPis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comPista1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAbordar)
                            .addComponent(jLabel11)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jLabel3)
                                .addGap(172, 172, 172)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(161, 161, 161)
                                        .addComponent(jLabel2)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(136, 136, 136)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(comPista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAterrizar)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(76, 76, 76))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(890, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comPista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAterrizar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(comPista1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comPuerPis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAbordar))))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(550, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(204, 204, 204)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAterrizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAterrizarActionPerformed
        System.out.println();
        if (serverRef.cola.isEmpty()){
            JOptionPane.showMessageDialog(this, "No se espera que aterricen vuelos");
        }
        else if (comPista.getSelectedIndex() == 0){
            serverRef.vuelos.get(serverRef.cola.peek().id).estado = "Aterrizado";
            serverRef.colaAG.add(serverRef.cola.remove());
        }
        else if (comPista.getSelectedIndex() == 1){
            if (serverRef.cola.peek().tipo == type.CARGA){
                JOptionPane.showMessageDialog(this, "El avión No puede aterrizar en esta pista");
            }
            else{
                serverRef.vuelos.get(serverRef.cola.peek().id).estado = "Aterrizado";
                serverRef.colaAM.add(serverRef.cola.remove());
            }
        }
        else if (comPista.getSelectedIndex() == 2){
            if (serverRef.cola.peek().tipo == type.CARGA){
                JOptionPane.showMessageDialog(this, "El avión No puede aterrizar en esta pista");
            }
            else if (serverRef.cola.peek().tipo == type.PASAJEROS){
                JOptionPane.showMessageDialog(this, "El avión No puede aterrizar en esta pista");
            }
            else{
                serverRef.vuelos.get(serverRef.cola.peek().id).estado = "Aterrizado";
                serverRef.colaAP.add(serverRef.cola.remove());
            }
        }
        addMensajeColas();
    }//GEN-LAST:event_btnAterrizarActionPerformed

    private void btnAbordarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbordarActionPerformed
        if (comPista.getSelectedIndex() == 0){
            if (serverRef.colaAG.isEmpty()){
                JOptionPane.showMessageDialog(this, "La pista grande no tiene pendientes");
            }
            else if ((comPuerPis.getSelectedIndex() == 0) && (serverRef.puerta == false)){
                serverRef.puerta = true;
                puerta(serverRef.colaAG.remove());
            }
            else if ((comPuerPis.getSelectedIndex() == 1) && (serverRef.puerta1 == false)){
                serverRef.puerta1 = true;
                puerta1(serverRef.colaAG.remove());
            }
            else if ((comPuerPis.getSelectedIndex() == 2) && (serverRef.puerta2 == false)){
                serverRef.puerta2 = true;
                puerta2(serverRef.colaAG.remove());
            }
            else if ((comPuerPis.getSelectedIndex() == 3) && (serverRef.puerta3 == false)){
                serverRef.puerta3 = true;
                puerta3(serverRef.colaAG.remove());
            }
            else if ((comPuerPis.getSelectedIndex() == 4) && (serverRef.puerta4 == false)){
                serverRef.puerta4 = true;
                puerta4(serverRef.colaAG.remove());
            }
            else{
                JOptionPane.showMessageDialog(this, "La puerta esta ocupada");
            }
        }
        if (comPista.getSelectedIndex() == 1){
            if (serverRef.colaAM.isEmpty()){
                JOptionPane.showMessageDialog(this, "La pista mediana no tiene pendientes");
            }
            else if ((comPuerPis.getSelectedIndex() == 0) && (serverRef.puerta == false)){
                serverRef.puerta = true;
                puerta(serverRef.colaAM.remove());
            }
            else if ((comPuerPis.getSelectedIndex() == 1) && (serverRef.puerta1 == false)){
                serverRef.puerta1 = true;
                puerta1(serverRef.colaAM.remove());
            }
            else if ((comPuerPis.getSelectedIndex() == 2) && (serverRef.puerta2 == false)){
                serverRef.puerta2 = true;
                puerta2(serverRef.colaAM.remove());
            }
            else if ((comPuerPis.getSelectedIndex() == 3) && (serverRef.puerta3 == false)){
                serverRef.puerta3 = true;
                puerta3(serverRef.colaAM.remove());
            }
            else if ((comPuerPis.getSelectedIndex() == 4) && (serverRef.puerta4 == false)){
                serverRef.puerta4 = true;
                puerta4(serverRef.colaAM.remove());
            }
            else{
                JOptionPane.showMessageDialog(this, "La puerta esta ocupada");
            }
        }
        if (comPista.getSelectedIndex() == 2){
            if (serverRef.colaAP.isEmpty()){
                JOptionPane.showMessageDialog(this, "La pista pequeña no tiene pendientes");
            }
            else if ((comPuerPis.getSelectedIndex() == 0) && (serverRef.puerta == false)){
                serverRef.puerta = true;
                puerta(serverRef.colaAP.remove());
            }
            else if ((comPuerPis.getSelectedIndex() == 1) && (serverRef.puerta1 == false)){
                serverRef.puerta1 = true;
                puerta1(serverRef.colaAP.remove());
            }
            else if ((comPuerPis.getSelectedIndex() == 2) && (serverRef.puerta2 == false)){
                serverRef.puerta2 = true;
                puerta2(serverRef.colaAP.remove());
            }
            else if ((comPuerPis.getSelectedIndex() == 3) && (serverRef.puerta3 == false)){
                serverRef.puerta3 = true;
                puerta3(serverRef.colaAP.remove());
            }
            else if ((comPuerPis.getSelectedIndex() == 4) && (serverRef.puerta4 == false)){
                serverRef.puerta4 = true;
                puerta4(serverRef.colaAP.remove());
            }
            else{
                JOptionPane.showMessageDialog(this, "La puerta esta ocupada");
            }
        }
        addMensajeColas();
    }//GEN-LAST:event_btnAbordarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbordar;
    private javax.swing.JButton btnAterrizar;
    private javax.swing.JComboBox<String> comPista;
    private javax.swing.JComboBox<String> comPista1;
    private javax.swing.JComboBox<String> comPuerPis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea txaCola;
    private javax.swing.JTextArea txaGran;
    private javax.swing.JTextArea txaInfo;
    private javax.swing.JTextArea txaMed;
    private javax.swing.JTextArea txaPeq;
    private javax.swing.JTextArea txaPuerta;
    private javax.swing.JTextArea txaPuerta1;
    private javax.swing.JTextArea txaPuerta2;
    private javax.swing.JTextArea txaPuerta3;
    private javax.swing.JTextArea txaPuerta4;
    private javax.swing.JTextArea txaVuelos;
    // End of variables declaration//GEN-END:variables

    void setSrv(Servidor serverRef) {
        this.serverRef = serverRef;
    }
}