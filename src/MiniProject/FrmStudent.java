package MiniProject;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class FrmStudent extends javax.swing.JInternalFrame {

    /* default Constructor */
    public FrmStudent() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCalc = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        spnWeight = new javax.swing.JSpinner();
        spnHeight = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnExit = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("TH Baijam", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("ดัชนีมวลกาย");

        jLabel2.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        jLabel2.setText("น้ำหนักตัว (km) :");

        jLabel3.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        jLabel3.setText("ส่วนสูง (cm) :");

        btnCalc.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        btnCalc.setText("คำนวณ");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        btnExit.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spnHeight, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(spnWeight)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCalc)
                                .addGap(30, 30, 30)
                                .addComponent(btnClear)
                                .addGap(28, 28, 28)
                                .addComponent(btnExit))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spnWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spnHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalc)
                    .addComponent(btnClear)
                    .addComponent(btnExit))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* btnExitActionPerformed */
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "Do you need to exit the program?");
        if(option == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    /* Method btnCalcActionPerformed */
    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        // แปลงค่าจาก Spinner "spnWeight" เป็น double เก็บในตัวแปร weight
        double weight = Double.parseDouble(spnWeight.getValue().toString());

        // แปลงค่าจาก Spinner "spnHeight" เป็น double เก็บในตัวแปร height 
        // และหารด้วย 100 เพื่อแปลงหน่วยจากเซนติเมตรเป็นเมตร
        double height = Double.parseDouble(spnHeight.getValue().toString()) / 100.0;

        // คำนวณค่าดัชนีมวลกาย (BMI) โดยใช้สูตร weight / (height * height)
        double bmi = weight / (height * height);

        // ตั้งค่ารูปแบบทศนิยม 2 หลัก
        DecimalFormat df = new DecimalFormat("#.##");

        // เก็บผลลัพธ์ BMI ลงใน String "result" โดยใช้รูปแบบทศนิยม 2 หลัก
        String result = "BMI : " + df.format(bmi) + "\n";

        // ตรวจสอบค่า BMI อยู่ในช่วงใด และแสดงผลลัพธ์
        if (bmi < 18.5) {
            result += "น้ำหนักน้อย / ผอม : มากกว่าคนปกติ";
        } else if (bmi >= 18.5 && bmi <= 22.9) {
            result += "ปกติ (สุขภาพดี) : เท่าคนปกติ";
        } else if (bmi >= 23 && bmi <= 24.9) {
            result += "ท้วม / โรคอ้วนระดับ 1 : อันตรายระดับ 1";
        } else if (bmi >= 25 && bmi <= 29.9) {
            result += "อ้วน / โรคอ้วนระดับ 2 : อันตรายระดับ 2";
        } else {
            result += "อ้วนมาก / โรคอ้วนระดับ 3 : อันตรายระดับ 3";
        }

        // ตั้งค่าข้อความใน TextArea "txtArea" ให้เป็นผลลัพธ์ "result"
        txtArea.setText(result);
    }//GEN-LAST:event_btnCalcActionPerformed

/*  Method tnClearActionPerformed */
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        spnWeight.setValue(0);
        spnHeight.setValue(0);
        txtArea.setText("");
    }//GEN-LAST:event_btnClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnHeight;
    private javax.swing.JSpinner spnWeight;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
