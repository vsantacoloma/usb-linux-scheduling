/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Scheduler;

/**
 *
 * @author lavz24
 */
public class BitacoraPanel extends javax.swing.JFrame {

  /**
   * Creates new form BitacoraPanel
   */
  public BitacoraPanel() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    title = new javax.swing.JLabel();
    quantum = new javax.swing.JLabel();
    CPU1 = new javax.swing.JLabel();
    Disk = new javax.swing.JLabel();
    pID = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    timeQ = new javax.swing.JLabel();
    CPU2 = new javax.swing.JLabel();
    pCPU0 = new javax.swing.JLabel();
    pDisk = new javax.swing.JLabel();
    pCPU1 = new javax.swing.JLabel();
    CPU3 = new javax.swing.JLabel();
    CPU4 = new javax.swing.JLabel();
    colaPL = new javax.swing.JLabel();
    colaPD = new javax.swing.JLabel();
    textColaPE = new javax.swing.JLabel();
    colaPE = new javax.swing.JLabel();
    pID1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Linux Scheduling");
    setBackground(new java.awt.Color(102, 102, 0));

    title.setBackground(new java.awt.Color(153, 153, 0));
    title.setFont(new java.awt.Font("Thonburi", 1, 48));
    title.setForeground(new java.awt.Color(0, 102, 102));
    title.setText("Bitacora Panel");

    quantum.setFont(new java.awt.Font("Courier", 0, 36)); // NOI18N
    quantum.setForeground(new java.awt.Color(0, 0, 204));
    quantum.setText("Ticks");

    CPU1.setFont(new java.awt.Font("Courier", 0, 36));
    CPU1.setForeground(new java.awt.Color(0, 0, 204));
    CPU1.setText("CPU1 : ");

    Disk.setFont(new java.awt.Font("Courier", 0, 36)); // NOI18N
    Disk.setForeground(new java.awt.Color(0, 0, 204));
    Disk.setText("Disk : ");

    pID.setFont(new java.awt.Font("Courier", 0, 24)); // NOI18N
    pID.setForeground(new java.awt.Color(0, 0, 204));
    pID.setText("(PID, Quantum, CPU Cycles left)");

    jPanel1.setBackground(new java.awt.Color(0, 51, 51));
    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    timeQ.setFont(new java.awt.Font("Lucida Grande", 0, 36));
    timeQ.setForeground(new java.awt.Color(255, 255, 0));
    timeQ.setText("0");

    org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(jPanel1Layout.createSequentialGroup()
        .add(41, 41, 41)
        .add(timeQ)
        .addContainerGap(41, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(jPanel1Layout.createSequentialGroup()
        .add(34, 34, 34)
        .add(timeQ)
        .addContainerGap(34, Short.MAX_VALUE))
    );

    CPU2.setFont(new java.awt.Font("Courier", 0, 36));
    CPU2.setForeground(new java.awt.Color(0, 0, 204));
    CPU2.setText("CPU0 : ");

    pCPU0.setFont(new java.awt.Font("Lucida Grande", 0, 18));
    pCPU0.setText("0");

    pDisk.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
    pDisk.setText("0");

    pCPU1.setFont(new java.awt.Font("Lucida Grande", 0, 18));
    pCPU1.setText("0");

    CPU3.setFont(new java.awt.Font("Courier", 0, 14)); // NOI18N
    CPU3.setForeground(new java.awt.Color(0, 0, 204));
    CPU3.setText("Cola Procesos Listos: ");

    CPU4.setFont(new java.awt.Font("Courier", 0, 14));
    CPU4.setForeground(new java.awt.Color(0, 0, 204));
    CPU4.setText("Cola Procesos en Disco: ");

    colaPL.setText("[]");

    colaPD.setText("[]");

    textColaPE.setFont(new java.awt.Font("Courier", 0, 14)); // NOI18N
    textColaPE.setForeground(new java.awt.Color(0, 0, 204));
    textColaPE.setText("Cola Procesos en espera: ");

    colaPE.setText("[]");

    pID1.setFont(new java.awt.Font("Courier", 0, 24)); // NOI18N
    pID1.setForeground(new java.awt.Color(0, 0, 204));
    pID1.setText("(PID, Access time left)");

    org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
          .add(pID1)
          .add(layout.createSequentialGroup()
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
              .add(quantum)
              .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
              .add(layout.createSequentialGroup()
                .add(47, 47, 47)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                  .add(layout.createSequentialGroup()
                    .add(textColaPE)
                    .add(21, 21, 21)
                    .add(colaPE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
                  .add(layout.createSequentialGroup()
                    .add(129, 129, 129)
                    .add(title)
                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 176, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                  .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                    .add(203, 203, 203)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                      .add(layout.createSequentialGroup()
                        .add(CPU2)
                        .add(237, 237, 237))
                      .add(layout.createSequentialGroup()
                        .add(CPU1)
                        .add(237, 237, 237))
                      .add(layout.createSequentialGroup()
                        .add(Disk)
                        .add(237, 237, 237)))
                    .add(103, 103, 103))
                  .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                    .add(CPU4)
                    .add(29, 29, 29)
                    .add(colaPD, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
                  .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                    .add(CPU3)
                    .add(45, 45, 45)
                    .add(colaPL, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)))
                .add(109, 109, 109)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                  .add(pCPU0)
                  .add(pCPU1)
                  .add(pDisk)))
              .add(layout.createSequentialGroup()
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pID)))))
        .add(115, 115, 115))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(layout.createSequentialGroup()
            .add(163, 163, 163)
            .add(pCPU0)
            .add(44, 44, 44)
            .add(pCPU1))
          .add(layout.createSequentialGroup()
            .add(title)
            .add(106, 106, 106)
            .add(CPU2)
            .add(44, 44, 44)
            .add(CPU1)))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 51, Short.MAX_VALUE)
        .add(pID1)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(Disk)
          .add(pDisk))
        .add(57, 57, 57)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(CPU3)
          .add(colaPL))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(CPU4)
          .add(colaPD))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(textColaPE)
          .add(colaPE))
        .add(127, 127, 127))
      .add(layout.createSequentialGroup()
        .add(77, 77, 77)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
          .add(pID)
          .add(quantum))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(424, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /*
     * Set the Nimbus look and feel
     */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
     * If Nimbus (introduced in Java SE 6) is not available, stay with the
     * default look and feel. For details see
     * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(BitacoraPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(BitacoraPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(BitacoraPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(BitacoraPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /*
     * Create and display the form
     */
    java.awt.EventQueue.invokeLater(new Runnable() {

      public void run() {
        new BitacoraPanel().setVisible(true);
      }
    });
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel CPU1;
  private javax.swing.JLabel CPU2;
  private javax.swing.JLabel CPU3;
  private javax.swing.JLabel CPU4;
  private javax.swing.JLabel Disk;
  public javax.swing.JLabel colaPD;
  public javax.swing.JLabel colaPE;
  public javax.swing.JLabel colaPL;
  private javax.swing.JPanel jPanel1;
  public javax.swing.JLabel pCPU0;
  public javax.swing.JLabel pCPU1;
  public javax.swing.JLabel pDisk;
  private javax.swing.JLabel pID;
  private javax.swing.JLabel pID1;
  private javax.swing.JLabel quantum;
  private javax.swing.JLabel textColaPE;
  public javax.swing.JLabel timeQ;
  private javax.swing.JLabel title;
  // End of variables declaration//GEN-END:variables
}
