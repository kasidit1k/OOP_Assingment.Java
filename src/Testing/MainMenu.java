package Testing;

import javax.swing.JFrame;

public class MainMenu extends javax.swing.JFrame {

    FrmAddUser frmUser;
    FrmAddEmployee frmEmp;
    FrmReport frmReport;

    public MainMenu() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        try {
            dpShow =(javax.swing.JDesktopPane)java.beans.Beans.instantiate(getClass().getClassLoader(), "Testing.MainMenu_dpShow");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jMenuBar1 = new javax.swing.JMenuBar();
        menuUser = new javax.swing.JMenu();
        menuEmployee = new javax.swing.JMenu();
        menuReport = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dpShowLayout = new javax.swing.GroupLayout(dpShow);
        dpShow.setLayout(dpShowLayout);
        dpShowLayout.setHorizontalGroup(
            dpShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
        );
        dpShowLayout.setVerticalGroup(
            dpShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
        );

        jMenuBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuBar1MouseClicked(evt);
            }
        });

        menuUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Testing/Add user.png"))); // NOI18N
        menuUser.setText("Add user");
        menuUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuUser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuUserMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuUser);

        menuEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Testing/Employee.png"))); // NOI18N
        menuEmployee.setText("Employee");
        menuEmployee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuEmployee.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        menuEmployee.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEmployeeMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuEmployee);

        menuReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Testing/Report.png"))); // NOI18N
        menuReport.setText("Report");
        menuReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuReport.setVerifyInputWhenFocusTarget(false);
        menuReport.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        menuReport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuBar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MouseClicked

    }//GEN-LAST:event_jMenuBar1MouseClicked

    private void menuUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuUserMouseClicked
        frmUser = new FrmAddUser();
        this.dpShow.add(frmUser);
        frmUser.setVisible(true);
        frmUser.setSize(this.getSize());
    }//GEN-LAST:event_menuUserMouseClicked

    private void menuEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEmployeeMouseClicked
        // TODO add your handling code here:
        frmEmp = new FrmAddEmployee();
        this.dpShow.add(frmEmp);
        frmEmp.setVisible(true);
        frmEmp.setSize(this.getSize());
    }//GEN-LAST:event_menuEmployeeMouseClicked

    private void menuReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuReportMouseClicked
        // TODO add your handling code here:
        frmReport = new FrmReport();
        this.dpShow.add(frmReport);
        frmReport.setVisible(true);
        frmReport.setSize(this.getSize());
    }//GEN-LAST:event_menuReportMouseClicked

    public static void main(String args[]) {
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
    private javax.swing.JMenu menuEmployee;
    private javax.swing.JMenu menuReport;
    private javax.swing.JMenu menuUser;
    // End of variables declaration//GEN-END:variables
}
