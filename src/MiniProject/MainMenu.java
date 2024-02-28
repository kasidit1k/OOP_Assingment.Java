package MiniProject;

import javax.swing.JFrame;

public class MainMenu extends javax.swing.JFrame {

    FrmAddUser frmUser;
    FrmStudent frmStd;
    static String userType;

    public MainMenu(String inpUserType) {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        userType = inpUserType;
        System.out.println("Main Fram userType = " + userType);
        if (Integer.parseInt(userType) == 1) {
            this.menuEmployee.setVisible(true);
            this.menuReport.setVisible(true);
            this.menuUser.setVisible(true);
        } else {
            this.menuEmployee.setVisible(false);
            this.menuUser.setVisible(false);
            this.menuReport.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpShow = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuUser = new javax.swing.JMenu();
        menuEmployee = new javax.swing.JMenu();
        menuReport = new javax.swing.JMenu();
        menuStudent = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(558, 443));

        dpShow.setBackground(new java.awt.Color(51, 255, 204));
        dpShow.setFocusTraversalPolicyProvider(true);
        dpShow.setPreferredSize(new java.awt.Dimension(558, 600));

        javax.swing.GroupLayout dpShowLayout = new javax.swing.GroupLayout(dpShow);
        dpShow.setLayout(dpShowLayout);
        dpShowLayout.setHorizontalGroup(
            dpShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 708, Short.MAX_VALUE)
        );
        dpShowLayout.setVerticalGroup(
            dpShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        menuUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add User.png"))); // NOI18N
        menuUser.setText("Add User");
        menuUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuUser.setVerifyInputWhenFocusTarget(false);
        menuUser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuUserMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuUser);

        menuEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/AddEmployee.png"))); // NOI18N
        menuEmployee.setText("Add Employee");
        menuEmployee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuEmployee.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar1.add(menuEmployee);

        menuReport.setForeground(new java.awt.Color(51, 0, 0));
        menuReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Report.png"))); // NOI18N
        menuReport.setText("Report");
        menuReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuReport.setMinimumSize(new java.awt.Dimension(99, 89));
        menuReport.setPreferredSize(new java.awt.Dimension(99, 89));
        menuReport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar1.add(menuReport);

        menuStudent.setForeground(new java.awt.Color(51, 0, 0));
        menuStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add User.png"))); // NOI18N
        menuStudent.setText("Student");
        menuStudent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuStudent.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuStudentMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuStudent);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpShow, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpShow, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuUserMouseClicked
        frmUser = new FrmAddUser();
        this.dpShow.add(frmUser);
        frmUser.setVisible(true);
        frmUser.setSize(this.getSize());
    }//GEN-LAST:event_menuUserMouseClicked

    private void menuStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuStudentMouseClicked
        frmStd = new FrmStudent();
        this.dpShow.add(frmStd);
        frmStd.setVisible(true);
        frmStd.setSize(this.getSize());
    }//GEN-LAST:event_menuStudentMouseClicked

    /*  Method Main */
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
                new MainMenu(userType).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpShow;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuEmployee;
    private javax.swing.JMenu menuReport;
    private javax.swing.JMenu menuStudent;
    private javax.swing.JMenu menuUser;
    // End of variables declaration//GEN-END:variables
}
