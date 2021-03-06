/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import archivos.*;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Apuesta;
import ordenamiento.Ordenamiento;
import manejador.*;

/**
 *
 * @author ACER
 */
public class FramePrincipal extends javax.swing.JFrame {
    /**
     * Variables privadas que nos sirven para desarrollar la logica del programa
     */
    private IngresoApuestas ingreso;
    private Apuesta[] apuestas;
    private LectorDeArchivos lectorDeArchivos;
    private Ordenamiento ordenamiento;
    private Resultados creadorResultado;
    private Verificador verificador;
    private int contadorEntradas;
    private int[] resultados;
    private long tiempoPromedioVerificacion, tiempoPromedioResultado, tiempoPromedioOrdenamientoA,tiempoPromedioOrdenamientoP;
    private int promedioPasos=0, mayorCantidadPasos=0, menorCantidadPasos=0;
    private DefaultTableModel modelo;
    private EscritorDeArchivos escritorArchivos;
    /**
     * Creates new form FramePrincipal
     */
    public FramePrincipal() {
        /**
         * Damos inicio a algunos componentes y generamos algunos valores que nos serviran mas adelante
         */
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.ingreso =  new IngresoApuestas();
        this.lectorDeArchivos = new LectorDeArchivos();
        this.ordenamiento = new Ordenamiento();
        this.creadorResultado = new Resultados();
        this.verificador = new Verificador();
        this.escritorArchivos = new EscritorDeArchivos();
        
        this.contadorEntradas=0;
        this.tiempoPromedioVerificacion =0;
        this.tiempoPromedioOrdenamientoA=0;
        this.tiempoPromedioOrdenamientoP=0;
        this.promedioPasos=0;
        this.menorCantidadPasos=0;
        this.mayorCantidadPasos=0;
        
        this.modelo = new DefaultTableModel();
        
        this.tablaServicios.setModel(this.modelo);
        
        modelo.addColumn("Tiempo Promedio de Proceso de Apuestas en milisegundos");
        modelo.addColumn("Promedio de pasos");
        modelo.addColumn("Mayor cantidad de pasos");
        modelo.addColumn("Menor cantidad de pasos");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGeneral = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTextoApuestas = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        botonCargaArchivoApuestas = new javax.swing.JButton();
        botonIngresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonLimpiarAreaApuestas = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaServicios = new javax.swing.JTable();
        botonReportes = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaTextoResultados = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        botonExportarResultados = new javax.swing.JButton();
        botonOrdenarAlfabeticamente = new javax.swing.JButton();
        botonOrdenarPorPuntaje = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaTextoIngresoResultados = new javax.swing.JTextArea();
        botonAgregarCaballo = new javax.swing.JButton();
        botonLimpiarAreaResultado = new javax.swing.JButton();
        botonIngresarResultado = new javax.swing.JButton();
        botonCargaArchivoResultados = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        listaCaballos = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areaTextoApuestas.setColumns(20);
        areaTextoApuestas.setRows(5);
        jScrollPane1.setViewportView(areaTextoApuestas);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("MODULO DE INGRESO DE APUESTAS");

        botonCargaArchivoApuestas.setText("CARGAR ARCHIVO");
        botonCargaArchivoApuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargaArchivoApuestasActionPerformed(evt);
            }
        });

        botonIngresar.setText("INGRESAR APUESTAS");
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });

        jLabel2.setText("El ingreso de apuestas manual debe tener la siguiente sintaxis: ");

        jLabel3.setText("Nombre Apostador, Monto Apuesta, No.Caballo ganador, No.Segunda posicion, No.Tercera Posicion, etc.");

        botonLimpiarAreaApuestas.setText("LIMPIAR CONTENEDOR");
        botonLimpiarAreaApuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarAreaApuestasActionPerformed(evt);
            }
        });

        jLabel6.setText("Nota: el ingreso debe ser una sola linea, siguiendo la regla de sintaxis");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonCargaArchivoApuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonLimpiarAreaApuestas)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(botonIngresar)))
                .addContainerGap(1078, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 237, Short.MAX_VALUE)
                        .addComponent(botonCargaArchivoApuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonLimpiarAreaApuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        panelGeneral.addTab("INGRESAR DE PUESTAS", jPanel1);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("REPORTES");

        tablaServicios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tablaServicios);

        botonReportes.setText("GENERAR REPORTE");
        botonReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(774, 774, 774)
                        .addComponent(jLabel8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(753, 753, 753)
                        .addComponent(botonReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 985, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(573, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel8)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        panelGeneral.addTab("REPORTES", jPanel4);

        areaTextoResultados.setColumns(20);
        areaTextoResultados.setRows(5);
        jScrollPane3.setViewportView(areaTextoResultados);

        jLabel12.setText("RESULTADOS DE APUESTAS");

        botonExportarResultados.setText("EXPORTAR RESULTADOS");
        botonExportarResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExportarResultadosActionPerformed(evt);
            }
        });

        botonOrdenarAlfabeticamente.setText("ORDENAR APUESTAS ALFABETICAMENTE");
        botonOrdenarAlfabeticamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOrdenarAlfabeticamenteActionPerformed(evt);
            }
        });

        botonOrdenarPorPuntaje.setText("ORDENAR APUESTAS POR PUNTAJE");
        botonOrdenarPorPuntaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOrdenarPorPuntajeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(463, 463, 463)
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(botonExportarResultados)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonOrdenarAlfabeticamente)
                                .addGap(27, 27, 27)
                                .addComponent(botonOrdenarPorPuntaje))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(991, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonExportarResultados)
                    .addComponent(botonOrdenarAlfabeticamente)
                    .addComponent(botonOrdenarPorPuntaje))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        panelGeneral.addTab("ENTREGA DE RESULTADOS", jPanel3);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("MODULO DE INGRESO DE RESULTADOS");

        jLabel5.setText("En este espacio puedes ingresar manualmente tus resultados.");

        areaTextoIngresoResultados.setColumns(20);
        areaTextoIngresoResultados.setRows(5);
        jScrollPane2.setViewportView(areaTextoIngresoResultados);

        botonAgregarCaballo.setText("AGREGAR CABALLO");
        botonAgregarCaballo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarCaballoActionPerformed(evt);
            }
        });

        botonLimpiarAreaResultado.setText("BORRAR TEXTO");
        botonLimpiarAreaResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarAreaResultadoActionPerformed(evt);
            }
        });

        botonIngresarResultado.setText("INGRESAR RESULTADO");
        botonIngresarResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarResultadoActionPerformed(evt);
            }
        });

        botonCargaArchivoResultados.setText("CARGAR ARCHIVO");
        botonCargaArchivoResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargaArchivoResultadosActionPerformed(evt);
            }
        });

        jScrollPane5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        listaCaballos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaCaballos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(listaCaballos);

        jLabel7.setText("No. Caballo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(botonAgregarCaballo)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(botonLimpiarAreaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCargaArchivoResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(920, 920, 920))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(483, 483, 483)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(527, 527, 527)
                        .addComponent(botonIngresarResultado))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(437, 437, 437)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonCargaArchivoResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonAgregarCaballo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonLimpiarAreaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(26, 26, 26)
                .addComponent(botonIngresarResultado)
                .addGap(63, 63, 63))
        );

        panelGeneral.addTab("INGRESO DE RESULTADOS", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGeneral, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGeneral)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        /**
         * Metodo para ingresar apuestas en el cual analizamos cuanto tiempo nos tardamos
         */
        try{
            long tiempoInicial = System.currentTimeMillis();
            
            this.apuestas = ingreso.ingresarApuestas(this.areaTextoApuestas);
            
            this.tiempoPromedioVerificacion += System.currentTimeMillis() - tiempoInicial;
            
            JOptionPane.showMessageDialog(this, "Apuestas Ingresadas con exito");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Se encontro una linea en blanco dentro del texto, revise por favor");
        }
        
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void botonCargaArchivoApuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargaArchivoApuestasActionPerformed
        /**
         * Logica para leer un archivo de texto
         */
        JFileChooser fileChosser = new JFileChooser();
        int seleccion = fileChosser.showOpenDialog(this);
        
        if(seleccion == JFileChooser.APPROVE_OPTION){
            File fichero = fileChosser.getSelectedFile();
            try {
                this.lectorDeArchivos.leerFichero(fichero, this.areaTextoApuestas);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al leer el archivo");
            }
        }
    }//GEN-LAST:event_botonCargaArchivoApuestasActionPerformed

    private void botonLimpiarAreaApuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarAreaApuestasActionPerformed
        /**
         * Limpiamos el texto del contenedor
         */
        this.areaTextoApuestas.setText(null);
    }//GEN-LAST:event_botonLimpiarAreaApuestasActionPerformed

    private void botonOrdenarAlfabeticamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOrdenarAlfabeticamenteActionPerformed
        /**
         * Logica para ordenar el arreglo de apuestas
         */
        long tiempoInicial = System.currentTimeMillis();
        this.apuestas = ordenamiento.ordenarApuesta(this.apuestas, true); 
        this.tiempoPromedioOrdenamientoA += (System.currentTimeMillis() - tiempoInicial);
        
        this.areaTextoResultados.setText(null);
        
        for(int i=0; i<this.apuestas.length; i++){
            this.areaTextoResultados.append("\n"+"El Apostador: "+this.apuestas[i].getNombreApostador()+
                    " obtuvo el siguiente puntaje: "+this.apuestas[i].getPuntaje());
        }
    }//GEN-LAST:event_botonOrdenarAlfabeticamenteActionPerformed

    private void botonOrdenarPorPuntajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOrdenarPorPuntajeActionPerformed
        /**
         * Logica para ordenar el arreglo de apuestas
         */
        long tiempoInicial = System.currentTimeMillis();
        this.apuestas = ordenamiento.ordenarApuesta(this.apuestas, false);
        this.tiempoPromedioOrdenamientoP += (System.currentTimeMillis() - tiempoInicial);
        
        this.areaTextoResultados.setText(null);
        for(int i=0; i<this.apuestas.length; i++){
            this.areaTextoResultados.append("\n"+"El Apostador: "+this.apuestas[i].getNombreApostador()+
                    " obtuvo el siguiente puntaje: "+this.apuestas[i].getPuntaje());
        }
    }//GEN-LAST:event_botonOrdenarPorPuntajeActionPerformed

    private void botonCargaArchivoResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargaArchivoResultadosActionPerformed
        /**
         * Logica para leer un archivo
         */
        JFileChooser fileChosser = new JFileChooser();
        int seleccion = fileChosser.showOpenDialog(this);

        if(seleccion == JFileChooser.APPROVE_OPTION){
            File fichero = fileChosser.getSelectedFile();
            try {
                this.lectorDeArchivos.leerFichero(fichero, this.areaTextoIngresoResultados);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al leer el archivo");
            }
        }
    }//GEN-LAST:event_botonCargaArchivoResultadosActionPerformed

    private void botonAgregarCaballoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarCaballoActionPerformed
        /**
         * Logica para a??adir las posiciones de los caballos al acabar la carrera
         */
        if(this.listaCaballos.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(this, "No has seleccionado ningun elemento de la lista, tienes que seleccionar uno");
        }
        else{
            if(this.contadorEntradas<9){
                this.areaTextoIngresoResultados.append(this.listaCaballos.getSelectedValue()+",");
                this.contadorEntradas++;
            }
            else if(this.contadorEntradas==9){
                this.areaTextoIngresoResultados.append(this.listaCaballos.getSelectedValue());
                this.contadorEntradas++;
            }
            else{
                JOptionPane.showMessageDialog(this, "Orden completado con exito");
            }
        }
    }//GEN-LAST:event_botonAgregarCaballoActionPerformed

    private void botonLimpiarAreaResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarAreaResultadoActionPerformed
        /**
         * Limpiamos el contenedor e igualamos a cero el contador de instancias
         */
        this.areaTextoIngresoResultados.setText(null);
        this.contadorEntradas=0;
    }//GEN-LAST:event_botonLimpiarAreaResultadoActionPerformed

    private void botonIngresarResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarResultadoActionPerformed
        /**
         * Logica para crear un resultado
         */
        this.resultados = this.creadorResultado.crearResultado(this.areaTextoIngresoResultados.getText());
        
        if(this.verificador.verificarArreglo(this.resultados)){
            JOptionPane.showMessageDialog(this, "Has ingresado correctamente el resultado");
            this.creadorResultado.calculoResultados(this.apuestas, this.resultados);
        }
        if(this.verificador.verificarArreglo(this.resultados)!=true){
            JOptionPane.showMessageDialog(this, "Has ingresado incorrectamente el resultado");
        }
        
    }//GEN-LAST:event_botonIngresarResultadoActionPerformed

    private void botonReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReportesActionPerformed
        /**
         * A??adimos los reportes con los tiempos calculados
         */
        this.modelo.addRow(new Object[]{this.tiempoPromedioVerificacion, promedioPasos, mayorCantidadPasos, menorCantidadPasos});
        this.modelo.addRow(new Object[]{this.tiempoPromedioOrdenamientoA, promedioPasos, mayorCantidadPasos, menorCantidadPasos});
        this.modelo.addRow(new Object[]{this.tiempoPromedioOrdenamientoP, promedioPasos, mayorCantidadPasos, menorCantidadPasos});
    }//GEN-LAST:event_botonReportesActionPerformed

    private void botonExportarResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExportarResultadosActionPerformed
       /**
        * Aqui se busca generar el archivo de texto exportando las apuestas
        */
        this.escritorArchivos.escribirArchivo(this, this.apuestas);
    }//GEN-LAST:event_botonExportarResultadosActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTextoApuestas;
    private javax.swing.JTextArea areaTextoIngresoResultados;
    private javax.swing.JTextArea areaTextoResultados;
    private javax.swing.JButton botonAgregarCaballo;
    private javax.swing.JButton botonCargaArchivoApuestas;
    private javax.swing.JButton botonCargaArchivoResultados;
    private javax.swing.JButton botonExportarResultados;
    private javax.swing.JButton botonIngresar;
    private javax.swing.JButton botonIngresarResultado;
    private javax.swing.JButton botonLimpiarAreaApuestas;
    private javax.swing.JButton botonLimpiarAreaResultado;
    private javax.swing.JButton botonOrdenarAlfabeticamente;
    private javax.swing.JButton botonOrdenarPorPuntaje;
    private javax.swing.JButton botonReportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList<String> listaCaballos;
    private javax.swing.JTabbedPane panelGeneral;
    private javax.swing.JTable tablaServicios;
    // End of variables declaration//GEN-END:variables
}
