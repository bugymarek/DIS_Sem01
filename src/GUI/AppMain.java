/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Core.Command;
import Core.Simulation;
import Core.TaskA;
import Core.TaskB;
import java.awt.Color;

/**
 *
 * @author Bugy
 */
public class AppMain extends javax.swing.JDialog {

    /**
     * Creates new form AppMain
     * @param parent
     * @param modal
     */
    public AppMain(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setUp();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSliderDoors = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldReplicationCount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSliderPercents = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelDoorsCount = new javax.swing.JLabel();
        jLabelPercents = new javax.swing.JLabel();
        JPanelChart = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldProbabilityB = new javax.swing.JTextField();
        jTextFieldProbabilityA = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jSliderDoors.setMaximum(10);
        jSliderDoors.setMinimum(3);
        jSliderDoors.setValue(3);
        jSliderDoors.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderDoorsStateChanged(evt);
            }
        });

        jLabel1.setText("Počet dverí: ");

        jLabel2.setText("Počet replikácií");

        jTextFieldReplicationCount.setText("1000000");
        jTextFieldReplicationCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldReplicationCountActionPerformed(evt);
            }
        });

        jLabel3.setText("Počet precent:");

        jSliderPercents.setValue(0);
        jSliderPercents.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderPercentsStateChanged(evt);
            }
        });

        jButton1.setText("Stop");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Štart");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelChartLayout = new javax.swing.GroupLayout(JPanelChart);
        JPanelChart.setLayout(JPanelChartLayout);
        JPanelChartLayout.setHorizontalGroup(
            JPanelChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        JPanelChartLayout.setVerticalGroup(
            JPanelChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );

        jLabel4.setText("Pavdepodobnosť prípadA:");

        jLabel5.setText("Pavdepodobnosť prípadB:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prípad A aj B", "Prípad A", "Prípad B" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanelChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelDoorsCount))
                                    .addComponent(jSliderDoors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldReplicationCount, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldProbabilityA, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldProbabilityB))))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelPercents)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSliderPercents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabelDoorsCount)
                    .addComponent(jLabelPercents))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSliderPercents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSliderDoors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldReplicationCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldProbabilityA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldProbabilityB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addComponent(JPanelChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldReplicationCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldReplicationCountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldReplicationCountActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setEnabled(false);
        int count = Integer.parseInt(jTextFieldReplicationCount.getText());
        int doors = jSliderDoors.getValue();
        int cutPercents = jSliderPercents.getValue();
        int comboboxIndex = jComboBox1.getSelectedIndex();
        min = 1;
        max = 0;

        if (chart != null) {
            chart = new Chart(JPanelChart);
        }

        if (comboboxIndex == 0 || comboboxIndex == 1) {

            Thread t1 = new Thread(() -> {
                taskA = new TaskA(count, doors);
                Command c = createCommand(taskA, indexA, cutPercents);
                taskA.setCommand(c);
                taskA.replicate();
                jButton2.setEnabled(true);
            });
            t1.start();
        }

        if (comboboxIndex == 0 || comboboxIndex == 2) {
            Thread t2 = new Thread(() -> {
                taskB = new TaskB(count, doors);
                Command c = createCommand(taskB, indexB, cutPercents);
                taskB.setCommand(c);
                taskB.replicate();
                jButton2.setEnabled(true);
            });
            t2.start();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private Command createCommand(Simulation task, int index, int cutPercents) {
        Command c = new Command() {
            @Override
            public void run() {
                double firstReplication = task.getReplicationsCount() / 100 * cutPercents;
                if (task.getCurrentExperiment() > firstReplication) {
                    if (task.getCurrentExperiment() % task.getModulo() == 0) {
                        chart.addValueToSeries(index, task.getCurrentExperiment(), task.getCurrentProbability());
                        task.setMinMax();
                        setMinMax(task.getMinValue(), task.getMaxValue());
                        if (index == indexA) {                        
                            jTextFieldProbabilityA.setText(Double.toString(task.getCurrentProbability()));
                        } else {
                            jTextFieldProbabilityB.setText(Double.toString(task.getCurrentProbability()));
                        }
                        chart.changeRange(min, max);
                    }

                }
            }
        };
        return c;
    }

    private void jSliderDoorsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderDoorsStateChanged
        jLabelDoorsCount.setText(Integer.toString(jSliderDoors.getValue()));
    }//GEN-LAST:event_jSliderDoorsStateChanged

    private void jSliderPercentsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderPercentsStateChanged
        jLabelPercents.setText(Integer.toString(jSliderPercents.getValue()));
    }//GEN-LAST:event_jSliderPercentsStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (taskA != null) {
            taskA.setRunnable(false);
        }
        if (taskB != null) {
            taskB.setRunnable(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(AppMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            AppMain dialog = new AppMain(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelChart;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDoorsCount;
    private javax.swing.JLabel jLabelPercents;
    private javax.swing.JSlider jSliderDoors;
    private javax.swing.JSlider jSliderPercents;
    private javax.swing.JTextField jTextFieldProbabilityA;
    private javax.swing.JTextField jTextFieldProbabilityB;
    private javax.swing.JTextField jTextFieldReplicationCount;
    // End of variables declaration//GEN-END:variables
    private Chart chart;
    private Simulation taskA;
    private Simulation taskB;
    private final int indexA = 0;
    private final int indexB = 1;
    private double min = 1;
    private double max = 0;

    private void setUp() {
        jLabelDoorsCount.setText(Integer.toString(jSliderDoors.getValue()));
        jLabelPercents.setText(Integer.toString(jSliderPercents.getValue()));
        jTextFieldProbabilityA.setEditable(false);
        jTextFieldProbabilityA.setForeground(Color.red);
        jTextFieldProbabilityB.setEditable(false);
        jTextFieldProbabilityB.setForeground(Color.red);
        chart = new Chart(JPanelChart);
    }
    private void setMinMax(double taskMin, double taskMax){
        if(taskMin < min){
            min = taskMin;
        }
        if(taskMax > max){
            max = taskMax;
        }
        if(min == max){
            max += 0.01;
        }    
    }
}
