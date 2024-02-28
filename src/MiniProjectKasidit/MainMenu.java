package MiniProjectKasidit;

public class MainMenu extends javax.swing.JFrame {
    // Variable \\
    FrmHotelReservation frmHR;
    FrmWeightHeight frmWH;

                                                                                                       /*
     ---> Overload Constructor <---
                                                                                                       */
    public MainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        dpShow = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuUsername = new javax.swing.JMenu();
        menuHoteReservation = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

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
            .addGap(0, 800, Short.MAX_VALUE)
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

        menuUsername.setBackground(new java.awt.Color(0, 0, 51));
        menuUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/scales-3-fill.png"))); // NOI18N
        menuUsername.setText("HeightWeight");
        menuUsername.setFocusPainted(true);
        menuUsername.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        menuUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuUsername.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        menuUsername.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        menuUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuUsernameMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuUsername);

        menuHoteReservation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hotel-line.png"))); // NOI18N
        menuHoteReservation.setText("HotelReservation");
        menuHoteReservation.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        menuHoteReservation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuHoteReservation.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        menuHoteReservation.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        menuHoteReservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuHoteReservationMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuHoteReservation);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/file-chart-line.png"))); // NOI18N
        jMenu2.setText("Report");
        jMenu2.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        jMenu2.setMargin(new java.awt.Insets(5, 12, 3, 12));
        jMenu2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpShow)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpShow)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuUsernameMouseClicked
        frmWH = new FrmWeightHeight();
        dpShow.add(frmWH);
        frmWH.setVisible(true);
        frmWH.setSize(getSize());
    }//GEN-LAST:event_menuUsernameMouseClicked

    private void menuHoteReservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuHoteReservationMouseClicked
        frmHR = new FrmHotelReservation();
        dpShow.add(frmHR);
        frmHR.setVisible(true);
        frmHR.setSize(getSize());
    }//GEN-LAST:event_menuHoteReservationMouseClicked

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
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpShow;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuHoteReservation;
    private javax.swing.JMenu menuUsername;
    // End of variables declaration//GEN-END:variables
}
