package MiniProjectKasidit.JInternalFrame;

import MiniProjectKasidit.MySQlDatabase.MySQLDB;
import MiniProjectKasidit.info.HeightWeightInfo;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.JLabel;

public class FrmWeightHeight extends javax.swing.JInternalFrame {

    DefaultTableModel model;
    MySQLDB myDB;

    public FrmWeightHeight() {
        initComponents();
        model = (DefaultTableModel) tblData.getModel();
        myDB = new MySQLDB();
        loadStudentData();

        tblData.getTableHeader().setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
        tblData.setAutoCreateRowSorter(true);
    }

    private void loadStudentData() {
        model.setRowCount(0);
        String selectSql = "SELECT * FROM weight ORDER BY id";
        ArrayList<HeightWeightInfo> list = myDB.selectQuery(selectSql);
        for (HeightWeightInfo info : list) {
            Object[] row = {
                info.getId(),
                info.getName(),
                info.getSurname(),
                info.getWeight(),
                info.getHeight(),
                info.getWeightResult()
            };
            model.addRow(row);
        }
        tblData.setModel(model);
    }

    private void clearData() {
        txtWeight.setText("");
        txtHeight.setText("");
        txtResult.setText("");
        txtResult.setBackground(Color.white);
        txtId.setText("");
        txtName.setText("");
        txtSurname.setText("");
        txtResult.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();
        btnCalc1 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnAddData = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();

        jLabel8.setText("jLabel8");

        setTitle("HeightWeight");
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(1000, 300));
        setVisible(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1221, 350));

        btnUpdate.setFont(new java.awt.Font("TH Baijam", 1, 20)); // NOI18N
        btnUpdate.setText("อัพเดต");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("TH Baijam", 1, 20)); // NOI18N
        btnDelete.setText("ลบ");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ชั่งน้ำหนัก", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("TH Baijam", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("Result");
        jPanel1.setPreferredSize(new java.awt.Dimension(90, 85));

        jLabel2.setFont(new java.awt.Font("TH Baijam", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("น้ำหนัก :");

        txtWeight.setBackground(new Color(0,0,0,0));
        txtWeight.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtWeight.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWeight.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtWeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWeightKeyTyped(evt);
            }
        });

        txtHeight.setBackground(new Color(0,0,0,0));
        txtHeight.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtHeight.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHeight.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtHeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHeightKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("TH Baijam", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("ส่วนสูง :");

        jLabel5.setFont(new java.awt.Font("TH Baijam", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("กิโลกรัม");

        jLabel6.setFont(new java.awt.Font("TH Baijam", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("เซนติเมตร");

        jLabel7.setBackground(new java.awt.Color(0, 0, 51));
        jLabel7.setFont(new java.awt.Font("TH Baijam", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("ผล");

        txtResult.setEditable(false);
        txtResult.setFont(new java.awt.Font("TH Baijam", 1, 24)); // NOI18N
        txtResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(112, 112, 112))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel4)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtResult)))
                .addGap(29, 29, 29))
        );

        btnCalc1.setFont(new java.awt.Font("TH Baijam", 1, 24)); // NOI18N
        btnCalc1.setText("คำนวณ");
        btnCalc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalc1ActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("TH Baijam", 1, 24)); // NOI18N
        btnClear.setText("ล้าง");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("TH Baijam", 1, 24)); // NOI18N
        btnExit.setText("ออก");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "กรอกข้อมูล", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("TH Baijam", 1, 18))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        jLabel9.setFont(new java.awt.Font("TH Baijam", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("รหัส");

        txtId.setBackground(new Color(0,0,0,0));
        txtId.setFont(new java.awt.Font("TH Baijam", 1, 20)); // NOI18N
        txtId.setForeground(new java.awt.Color(0, 0, 0));
        txtId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 51, 51)));
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("TH Baijam", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("ชื่อ");

        txtName.setBackground(new Color(0,0,0,0));
        txtName.setFont(new java.awt.Font("TH Baijam", 1, 20)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 51, 51)));

        txtSurname.setBackground(new Color(0,0,0,0));
        txtSurname.setFont(new java.awt.Font("TH Baijam", 1, 20)); // NOI18N
        txtSurname.setForeground(new java.awt.Color(0, 0, 0));
        txtSurname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 51, 51)));

        jLabel11.setFont(new java.awt.Font("TH Baijam", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("นามสกุล");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)
                        .addGap(8, 8, 8)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnAddData.setFont(new java.awt.Font("TH Baijam", 1, 20)); // NOI18N
        btnAddData.setText("เพิ่ม");
        btnAddData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDataActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ตาราง", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("TH Baijam", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        tblData.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "รหัส", "ชื่อ", "นามสกุล", "น้ำหนัก", "ส่วนสูง", "ผลการวัดน้ำหนัก"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblData.setRequestFocusEnabled(false);
        tblData.setShowGrid(true);
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        jScrollPane3.setViewportView(jScrollPane1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddData, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCalc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnCalc1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnAddData, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1144, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        JLabel message = new JLabel("คุณต้องการออกจากโปรแกรม");
        message.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
        String text1 = "ยืนยันการออกจากโปรแกรม ";
        int option = JOptionPane.showConfirmDialog(rootPane, message, text1,
                JOptionPane.YES_NO_CANCEL_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtWeight.setText("");
        txtHeight.setText("");
        txtResult.setText("");
        txtResult.setBackground(Color.white);
        txtId.setText("");
        txtName.setText("");
        txtSurname.setText("");
        txtResult.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCalc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalc1ActionPerformed
        double weight = Double.parseDouble(txtWeight.getText()); 
        double height = Double.parseDouble(txtHeight.getText()) / 100;  
        double bmi = weight / (height * height);

        String result = "";
        if (bmi >= 0 && bmi <= 22.9) {
            result = "ปกติ";
            txtResult.setBackground(Color.GREEN);
        } else if (bmi > 22 && bmi <= 24.9) {
            result = "ท้วม";
            txtResult.setBackground(Color.YELLOW);
        } else if (bmi > 24 && bmi <= 29.9) {
            result = "อ้วนระดับ1";
            txtResult.setBackground(Color.PINK);
        } else {
            result = "อ้วนระดับ2";
            txtResult.setBackground(Color.RED);
        }
        txtResult.setText(result);
    }//GEN-LAST:event_btnCalc1ActionPerformed

    private void txtHeightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHeightKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') || (c == java.awt.event.KeyEvent.VK_BACK_SPACE)
                || (c == java.awt.event.KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtHeightKeyTyped

    private void txtWeightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWeightKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') || (c <= '.') || (c == java.awt.event.KeyEvent.VK_BACK_SPACE)
                || (c == java.awt.event.KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtWeightKeyTyped

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int[] selectedRows = tblData.getSelectedRows(); 
        if (selectedRows.length > 0) { 
            JLabel messageout = new JLabel("คุณต้องการลบข้อมูลหรือไม่ ? ");
            messageout.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
            String text = "ยืนการลบข้อมูล";
            int option = JOptionPane.showConfirmDialog(rootPane, messageout, text,
                    JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) { 
                for (int i = selectedRows.length - 1; i >= 0; i--) { 
                    int idDel = Integer.parseInt((String) tblData.getValueAt(selectedRows[i], 0));
                    String delete = "DELETE FROM weight WHERE id=" + idDel;
                    System.out.println("delete = " + delete);
                    int row = myDB.stmtCreInsUpdDel(delete);
                    
                    if (row > 0) {
                        model.removeRow(selectedRows[i]);
                    }
                }
                JLabel message = new JLabel("ลบข้อมูลสำเร็จ");
                message.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
                JOptionPane.showMessageDialog(this, message);
            }
        } else {
            JLabel message = new JLabel("กรุณาเลือกข้อมูลที่ต้องการลบ");
            message.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
            JOptionPane.showMessageDialog(this, message);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int row = tblData.getSelectedRow();
        String idUpd = (String) tblData.getValueAt(row, 0);
        String nameUpd = txtName.getText();
        String surnameUpd = txtSurname.getText();
        double weightUpd = Double.parseDouble(txtWeight.getText());
        double heightUpd = Double.parseDouble(txtHeight.getText());
        String weightResultUpd = txtResult.getText();

        JLabel messageout = new JLabel("คุณต้องการอัพเดตข้อมูลหรือไม่ ? ");
        messageout.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
        String text = "ยืนการอัพเดตข้อมูล";
        int option = JOptionPane.showConfirmDialog(rootPane, messageout, text,
                JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) { 
            String update = "UPDATE weight SET name = '" + nameUpd + "', surname = '" + surnameUpd + "', weight = " + weightUpd + ", height = " + heightUpd + ", weightResult = '" + weightResultUpd + "' WHERE id = '" + idUpd + "'";
            System.out.println("update = " + update);

            int updRow = myDB.stmtCreInsUpdDel(update); 
            if (updRow > 0) {
                tblData.setValueAt(nameUpd, row, 1); // อัปเดตคอลัมน์ 
                tblData.setValueAt(surnameUpd, row, 2);
                tblData.setValueAt(weightUpd, row, 3);
                tblData.setValueAt(heightUpd, row, 4);
                tblData.setValueAt(weightResultUpd, row, 5);

                JLabel message = new JLabel("อัปเดตข้อมูลสำเร็จ");
                message.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
                JOptionPane.showMessageDialog(this, message);
                
               clearData();

            } else {
                JLabel message = new JLabel("เกิดข้อผิดพลาดในการอัปเดต!!!");
                message.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
                JOptionPane.showMessageDialog(this, message);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDataActionPerformed
        String idAdd = txtId.getText();
        String nameAdd = txtName.getText();
        String surnameAdd = txtSurname.getText();
        double weight = Double.parseDouble(txtWeight.getText());
        double height = Double.parseDouble(txtHeight.getText());
        String weightResult = txtResult.getText();

        if (idAdd.length() > 0 && nameAdd.length() > 1 && surnameAdd.length() > 2) {
            JLabel messageout = new JLabel("คุณต้องการเพิ่มข้อมูลหรือไม่ ? ");
            messageout.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
            String text = "ยืนการเพิ่มข้อมูล";
            int optional = JOptionPane.showConfirmDialog(rootPane, messageout, text,
                    JOptionPane.YES_NO_OPTION);
            if (optional == JOptionPane.YES_OPTION) {
                String insert = "INSERT INTO weight VALUES('" + idAdd + "','" + nameAdd + "','" + surnameAdd + "'," + weight + "," + height + ",'" + weightResult + "')";
                System.out.println("insert = " + insert);
                int row = myDB.stmtCreInsUpdDel(insert);
                if (row > 0) {
                    Object[] rowData = {idAdd, nameAdd, surnameAdd, weight, height, weightResult};
                    model.addRow(rowData);

                    JLabel message = new JLabel("เพิ่มข้อมูลสำเร็จ");
                    message.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
                    JOptionPane.showMessageDialog(this, message);
                    
                    clearData();
                } else {
                    JLabel message = new JLabel("ไม่สามารถเพิ่มข้อมูลได้!!!");
                    message.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
                    JOptionPane.showMessageDialog(this, message);
                }
            }
        } else {
            JLabel message = new JLabel("กรอกข้อมูลให้ครบถ้วน !!!");
            message.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
            JOptionPane.showMessageDialog(this, message);
        }
    }//GEN-LAST:event_btnAddDataActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        int row = tblData.getSelectedRow(); 
        JLabel messageout = new JLabel("คุณต้องการเลือกข้อมูลหรือไม่ ? ");
        messageout.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
        String text = "ยืนยันการเลือกแถว";
        int option = JOptionPane.showConfirmDialog(rootPane, messageout, text,
                JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) { 
            if (row >= 0) {
                String idData = String.valueOf(tblData.getValueAt(row, 0));
                String nameData = (String) tblData.getValueAt(row, 1);
                String surnameData = (String) tblData.getValueAt(row, 2);
                double weightData = (double) tblData.getValueAt(row, 3);
                double heightData = (double) tblData.getValueAt(row, 4);
                String weightResultData = (String) tblData.getValueAt(row, 5);

                txtId.setText(idData);
                txtName.setText(nameData);
                txtSurname.setText(surnameData);
                txtWeight.setText(String.valueOf(weightData));
                txtHeight.setText(String.valueOf(heightData));

                double bmi = weightData / (heightData * heightData) / 100;
                if (bmi >= 0 && bmi <= 22.9) {
                    txtResult.setBackground(Color.GREEN);
                } else if (bmi > 22 && bmi <= 24) {
                    txtResult.setBackground(Color.YELLOW);
                } else if (bmi > 24 && bmi <= 29) {
                    txtResult.setBackground(Color.PINK);
                } else {
                    txtResult.setBackground(Color.RED);
                }

                txtResult.setText(weightResultData);
            }
        }
    }//GEN-LAST:event_tblDataMouseClicked

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') || (c <= '.') || (c == java.awt.event.KeyEvent.VK_BACK_SPACE)
                || (c == java.awt.event.KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtIdKeyTyped

    // การประกาศตัวแปร - ห้ามแก้ไข
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddData;
    private javax.swing.JButton btnCalc1;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtResult;
    private javax.swing.JTextField txtSurname;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
