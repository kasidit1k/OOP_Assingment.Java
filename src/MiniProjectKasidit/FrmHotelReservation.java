package MiniProjectKasidit;

import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmHotelReservation extends javax.swing.JInternalFrame {

    private final javax.swing.ButtonGroup buttonGroup1;

    DefaultTableModel model;
    MySQLDB myDB;
    String id, name, surname;

    public FrmHotelReservation() {
        initComponents();
        model = (DefaultTableModel) tblData.getModel();
        myDB = new MySQLDB();
        loadData();

        buttonGroup1 = new javax.swing.ButtonGroup();
        cbxWeekend.addItem("Weekday (อา-พฤ)");
        cbxWeekend.addItem("Weekend (ศ-ส)");
        cbxWeekend.addItem("Long Weekend (หยุดยาว)");
        buttonGroup1.add(rdbSuperior);
        buttonGroup1.add(rdbDeluxe);
        buttonGroup1.add(rdbGrandDeluxe);
        buttonGroup1.add(rdbJuniorSuit);
        buttonGroup1.add(rdbGrandFamilySuite);
    }

    private void getSelectedRow() {
        int selectedRow = tblData.getSelectedRow();
        if (selectedRow >= 0) {
            String studentId = tblData.getValueAt(selectedRow, 0).toString();
            String name = tblData.getValueAt(selectedRow, 1).toString();
            String surname = tblData.getValueAt(selectedRow, 2).toString();

            txtId.setText(studentId);
            txtName.setText(name);
            txtSurname.setText(surname);
        }
    }

    private void loadData() {
        model.setRowCount(0); // เคลียร์ข้อมูลในตารางก่อน
        String sql = "SELECT * FROM room ORDER BY id";
        ArrayList<StudentInfo> list = myDB.selectQuery(sql);
        for (StudentInfo info : list) {
            String[] row = {
                info.getId(),
                info.getName(),
                info.getSurname(),
//                info.getRoomtype(), // เปลี่ยนจาก info.getRoomtype() เป็น info.getRoomType()
//                String.valueOf(info.getPeriodofStay()), // เปลี่ยนจาก info.getPeriodofStay() เป็น info.getPeriodOfStay()
//                String.valueOf(info.getNumberofDay()), // เปลี่ยนจาก info.getNumberofDay() เป็น info.getNumberOfDays()
//                String.valueOf(info.getTotalprice())
            };
            model.addRow(row);
        }
        tblData.setModel(model);
}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaShow = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        rdbSuperior = new javax.swing.JRadioButton();
        rdbDeluxe = new javax.swing.JRadioButton();
        rdbGrandDeluxe = new javax.swing.JRadioButton();
        rdbJuniorSuit = new javax.swing.JRadioButton();
        rdbGrandFamilySuite = new javax.swing.JRadioButton();
        btnCalc = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxWeekend = new javax.swing.JComboBox<>();
        spnDay = new javax.swing.JSpinner();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        btnAddData = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1200, 520));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(738, 300));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "รายการรวม", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("TH Baijam", 1, 18), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel1.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N

        jScrollPane1.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setWheelScrollingEnabled(false);

        txtAreaShow.setBackground(new java.awt.Color(102, 255, 153));
        txtAreaShow.setColumns(20);
        txtAreaShow.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        txtAreaShow.setLineWrap(false
        );
        txtAreaShow.setFocusCycleRoot(true);
        txtAreaShow.setOpaque(false);
        jScrollPane1.setViewportView(txtAreaShow);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "จำนวนห้องพัก", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("TH Baijam", 1, 18), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel3.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N

        rdbSuperior.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        rdbSuperior.setText("Superior");

        rdbDeluxe.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        rdbDeluxe.setText("Deluxe");

        rdbGrandDeluxe.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        rdbGrandDeluxe.setText("Grand Deluxe");

        rdbJuniorSuit.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        rdbJuniorSuit.setText("Junior Suit");

        rdbGrandFamilySuite.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        rdbGrandFamilySuite.setText("Grand Family Suite");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdbGrandFamilySuite)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rdbDeluxe)
                                .addGap(42, 42, 42)
                                .addComponent(rdbJuniorSuit)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdbSuperior)
                            .addComponent(rdbGrandDeluxe))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(rdbSuperior)
                .addGap(18, 18, 18)
                .addComponent(rdbGrandDeluxe)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbDeluxe)
                    .addComponent(rdbJuniorSuit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(rdbGrandFamilySuite)
                .addGap(17, 17, 17))
        );

        btnCalc.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        btnCalc.setText("คำนวณราคา");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        Exit.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        Exit.setText("ออก");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        btnClear.setText("ล้าง");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "กรอกข้อมูล", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("TH Baijam", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        jLabel1.setText("รหัส");

        jLabel2.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        jLabel2.setText("ชื่อ");

        jLabel3.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        jLabel3.setText("นามสกุล");

        txtId.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N

        txtName.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N

        txtSurname.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ตัวเลือก", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("TH Baijam", 1, 18))); // NOI18N

        jLabel4.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        jLabel4.setText("ช่วงที่เข้าพัก");

        jLabel5.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        jLabel5.setText("จำนวนวันที่เข้าพัก");

        cbxWeekend.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N

        spnDay.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxWeekend, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxWeekend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Exit))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ตาราง", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("TH Baijam", 1, 18))); // NOI18N

        tblData.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Surname", "RoomType", "PeriodOfStay", "NumberOfDay", "TotalPrice"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblData.setShowGrid(true);
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblData);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        btnAddData.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        btnAddData.setText("เพิ่ม");
        btnAddData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDataActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        btnUpdate.setText("อัพเดต");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        btnDelete.setText("ลบ");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnAddData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddData, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(443, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        String roomType = "";
        double rate = 0;

        if (rdbSuperior.isSelected()) {
            roomType = "Superior";
            rate = cbxWeekend.getSelectedIndex() == 0 ? 2090
                    : cbxWeekend.getSelectedIndex() == 1 ? 2490 : 3390;
        } else if (rdbDeluxe.isSelected()) {
            roomType = "Deluxe";
            rate = cbxWeekend.getSelectedIndex() == 0 ? 2290
                    : cbxWeekend.getSelectedIndex() == 1 ? 2790 : 2690;
        } else if (rdbGrandDeluxe.isSelected()) {
            roomType = "Grand Deluxe";
            rate = cbxWeekend.getSelectedIndex() == 0 ? 3890
                    : cbxWeekend.getSelectedIndex() == 1 ? 4490 : 5390;
        } else if (rdbJuniorSuit.isSelected()) {
            roomType = "Junior Suit";
            rate = cbxWeekend.getSelectedIndex() == 0 ? 3190
                    : cbxWeekend.getSelectedIndex() == 1 ? 3890 : 4790;
        } else if (rdbGrandFamilySuite.isSelected()) {
            roomType = "Grand Family Suite";
            rate = cbxWeekend.getSelectedIndex() == 0 ? 3990
                    : cbxWeekend.getSelectedIndex() == 1 ? 4690 : 5690;
        }

        int numOfDays = (int) spnDay.getValue();
        double totalPrice = rate * numOfDays;

        txtAreaShow.setText("ประเภทห้อง : " + roomType + "\n"
                + "ช่วงที่เข้าพัก : " + cbxWeekend.getSelectedItem().toString() + "\n"
                + "จำนวนวันเข้าพัก : " + numOfDays + "\n"
                + "รวมราคา : " + totalPrice);
    }//GEN-LAST:event_btnCalcActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        String message = "Do you want to exit the program";
        String text1 = "Confirm exti from the program ";
        int option = JOptionPane.showConfirmDialog(rootPane, message, text1,
                JOptionPane.YES_NO_CANCEL_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        buttonGroup1.clearSelection();
        cbxWeekend.setSelectedIndex(0);
        spnDay.setValue(0);
        txtAreaShow.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDataActionPerformed
        String idAdd = txtId.getText();
        String nameAdd = txtName.getText();
        String surnameAdd = txtSurname.getText();
        String roomType = "";
        String weekendType = "";
        String totalPrice = "0";
        int numOfDays = (int) spnDay.getValue();
        if (idAdd.length() > 0 && nameAdd.length() > 1 && surnameAdd.length() > 2) {
            String rowData[] = {idAdd, nameAdd, surnameAdd, roomType, weekendType, Integer.toString(numOfDays), totalPrice};
            String insert = "INSERT INTO room VALUES('" + idAdd + "','" + nameAdd + "','" + surnameAdd + "','" + roomType + "','" + weekendType + "','" + numOfDays + "','" + totalPrice + "')";
            System.out.println("insert = " + insert);
            int row = myDB.stmtCreInsUpdDel(insert);
            if (row > 0) {
                model.addRow(rowData);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Add Error");
            }
        } else {
            JLabel message = new JLabel("กรอกข้อมูลให้ครบถ้วน!");
            message.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
            JOptionPane.showMessageDialog(this, message);
        }
    }//GEN-LAST:event_btnAddDataActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int row = tblData.getSelectedRow();
        if (row >= 0) {
            String id = (String) tblData.getValueAt(row, 0);
            String delete = "DELETE FROM room where id = " + id;
            System.out.println("Delete" + delete);
            int delrow = myDB.stmtCreInsUpdDel(delete);
            if (delrow > 0) {
                model.removeRow(row);
                JLabel message = new JLabel("ลบข้อมูลสำเร็จ");
                message.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
                JOptionPane.showMessageDialog(this, message);
            } else {
                JLabel message = new JLabel("ไม่สามารถลบได้!!!");
                message.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
                JOptionPane.showMessageDialog(this, message);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "เลือกแถวข้อมูลก่อนลบค่ะ");
        }  
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int row = tblData.getSelectedRow();
        String idUpd = (String) tblData.getValueAt(row, 0);
        String nameUpd = txtName.getText();
        String surnameUpd = txtSurname.getText();
        String update = "UPDATE room SET name = '" + nameUpd + "', surname = '" + surnameUpd + "' where id = " + idUpd;
        System.out.println("update = " + update);

        int updRow = myDB.stmtCreInsUpdDel(update); 
        if (updRow > 0) {
            tblData.setValueAt(nameUpd, row, 1);
            tblData.setValueAt(surnameUpd, row, 2);
        } else {
            JOptionPane.showConfirmDialog(rootPane, "update error");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        getSelectedRow();
    }//GEN-LAST:event_tblDataMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton btnAddData;
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbxWeekend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdbDeluxe;
    private javax.swing.JRadioButton rdbGrandDeluxe;
    private javax.swing.JRadioButton rdbGrandFamilySuite;
    private javax.swing.JRadioButton rdbJuniorSuit;
    private javax.swing.JRadioButton rdbSuperior;
    private javax.swing.JSpinner spnDay;
    private javax.swing.JTable tblData;
    private javax.swing.JTextArea txtAreaShow;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
