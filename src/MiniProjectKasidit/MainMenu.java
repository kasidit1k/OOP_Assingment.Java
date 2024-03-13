package MiniProjectKasidit;

import MiniProjectKasidit.JInternalFrame.FrmReport;
import MiniProjectKasidit.JInternalFrame.FrmWeightHeight;
import MiniProjectKasidit.JInternalFrame.FrmHotelReservation;

public class MainMenu extends javax.swing.JFrame {

    FrmHotelReservation frmHR;
    FrmWeightHeight frmWH;
    FrmReport frmRep;
                                                                                                                                                                                        
    public MainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        dpShow = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuHeightWeight = new javax.swing.JMenu();
        menuHotelReservation = new javax.swing.JMenu();
        menuReport = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("MainMemu"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1200, 520));
        setResizable(false);

        dpShow.setBackground(new java.awt.Color(61, 66, 46));

        javax.swing.GroupLayout dpShowLayout = new javax.swing.GroupLayout(dpShow);
        dpShow.setLayout(dpShowLayout);
        dpShowLayout.setHorizontalGroup(
            dpShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 838, Short.MAX_VALUE)
        );
        dpShowLayout.setVerticalGroup(
            dpShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        jMenuBar1.setAlignmentX(2.0F);
        jMenuBar1.setAlignmentY(2.0F);
        jMenuBar1.setMargin(new java.awt.Insets(3, 0, 3, 0));
        jMenuBar1.setMaximumSize(new java.awt.Dimension(200, 32768));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(888, 800));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(308, 40));
        jMenuBar1.setRequestFocusEnabled(false);

        menuHeightWeight.setBackground(new java.awt.Color(0, 0, 51));
        menuHeightWeight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/scales-2-fill.png"))); // NOI18N
        menuHeightWeight.setText("HeightWeight");
        menuHeightWeight.setFocusPainted(true);
        menuHeightWeight.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        menuHeightWeight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuHeightWeight.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        menuHeightWeight.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        menuHeightWeight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuHeightWeightMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuHeightWeight);

        menuHotelReservation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hotel-line.png"))); // NOI18N
        menuHotelReservation.setText("HotelReservation");
        menuHotelReservation.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        menuHotelReservation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuHotelReservation.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        menuHotelReservation.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        menuHotelReservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuHotelReservationMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuHotelReservation);

        menuReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/file-chart-line.png"))); // NOI18N
        menuReport.setText("Report");
        menuReport.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        menuReport.setMargin(new java.awt.Insets(5, 12, 3, 12));
        menuReport.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        menuReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuReportMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuReport);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpShow, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpShow, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuHeightWeightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuHeightWeightMouseClicked
        frmWH = new FrmWeightHeight(); 
        dpShow.add(frmWH);
        frmWH.setVisible(true);
        frmWH.setSize(getSize());
    }//GEN-LAST:event_menuHeightWeightMouseClicked

    private void menuHotelReservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuHotelReservationMouseClicked
        frmHR = new FrmHotelReservation();
        dpShow.add(frmHR);
        frmHR.setVisible(true);
        frmHR.setSize(getSize());
    }//GEN-LAST:event_menuHotelReservationMouseClicked

    private void menuReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuReportMouseClicked
        frmRep = new FrmReport();
        dpShow.add(frmRep);
        frmRep.setVisible(true);
        frmRep.setSize(getSize());
    }//GEN-LAST:event_menuReportMouseClicked

    /**
     * Method Main
     * @param args
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpShow;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuHeightWeight;
    private javax.swing.JMenu menuHotelReservation;
    private javax.swing.JMenu menuReport;
    // End of variables declaration//GEN-END:variables
}
