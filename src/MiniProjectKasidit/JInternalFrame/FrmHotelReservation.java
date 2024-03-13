package MiniProjectKasidit.JInternalFrame;

import MiniProjectKasidit.info.HotelReserverInfo;
import MiniProjectKasidit.MySQlDatabase.ConnecMySQL;
import java.awt.Font;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmHotelReservation extends javax.swing.JInternalFrame {

    private final javax.swing.ButtonGroup buttonGroup1;

    DefaultTableModel model;
    ConnecMySQL conMyDB;

    public FrmHotelReservation() {
        initComponents();
        model = (DefaultTableModel) tblData.getModel();
        conMyDB = new ConnecMySQL();
        loadDataCustomer();

        tblData.getTableHeader().setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
        tblData.setAutoCreateRowSorter(true);

        buttonGroup1 = new javax.swing.ButtonGroup();
        cbxWeek.addItem("Weekday (อา-พฤ)");
        cbxWeek.addItem("Weekend (ศ-ส)");
        cbxWeek.addItem("Long Weekend (หยุดยาว)");
        buttonGroup1.add(rdbSuperior);
        buttonGroup1.add(rdbDeluxe);
        buttonGroup1.add(rdbGrandDeluxe);
        buttonGroup1.add(rdbJuniorSuite);
        buttonGroup1.add(rdbGrandFamilySuite);
    }

    private void loadDataCustomer() {
        model.setRowCount(0);
        String sql = "SELECT * FROM hotel ORDER BY id";
        ArrayList<HotelReserverInfo> list = conMyDB.selectQuery(sql);  
        for (HotelReserverInfo info : list) { 
            Object[] row = {info.getId(), info.getName(), info.getSurname(), info.getRoomtype(), info.getPeriod(), info.getDayscount(), info.getTotalprice()}; // สร้างอ็อปเจกต์เพื่อกำหนดแถวในตาราง
            model.addRow(row);
        }
        tblData.setModel(model);
    }

    private void clearData() {
        txtId.setText("");
        txtName.setText("");
        txtSurname.setText("");
        buttonGroup1.clearSelection();
        cbxWeek.setSelectedIndex(0);
        spnDay.setValue(1);
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
        rdbJuniorSuite = new javax.swing.JRadioButton();
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
        cbxWeek = new javax.swing.JComboBox<>();
        spnDay = new javax.swing.JSpinner();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
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

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "จำนวนห้องพัก", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("TH Baijam", 1, 18), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel3.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N

        rdbSuperior.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        rdbSuperior.setText("Superior");

        rdbDeluxe.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        rdbDeluxe.setText("Deluxe");

        rdbGrandDeluxe.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        rdbGrandDeluxe.setText("Grand Deluxe");

        rdbJuniorSuite.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        rdbJuniorSuite.setText("Junior Suite");

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
                                .addComponent(rdbGrandDeluxe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdbJuniorSuite)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdbSuperior)
                            .addComponent(rdbDeluxe))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(rdbSuperior)
                .addGap(18, 18, 18)
                .addComponent(rdbDeluxe)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbJuniorSuite)
                    .addComponent(rdbGrandDeluxe))
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

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "กรอกข้อมูล", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("TH Baijam", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        jLabel1.setText("รหัสลูกค้า");

        jLabel2.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        jLabel2.setText("ชื่อ");

        jLabel3.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        jLabel3.setText("นามสกุล");

        txtId.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        txtName.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N

        txtSurname.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
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

        cbxWeek.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        cbxWeek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "เลือกช่วงเวลา" }));

        spnDay.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        spnDay.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnDay, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxWeek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Exit)
                        .addGap(23, 23, 23))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 55, Short.MAX_VALUE))
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
                "รหัสลูกค้า", "ชื่อ", "นามกสุล", "ประเภทห้อง", "ช่วงที่เข้าพัก", "จำนวนวัน", "ราคารวม"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblData.setInheritsPopupMenu(true);
        tblData.setShowGrid(true);
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblData);

        jScrollPane3.setViewportView(jScrollPane2);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addContainerGap())
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
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnAddData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        String roomType = "";
        int rate = 0;
        if (rdbSuperior.isSelected()) {  
            roomType = "Superior";
            rate = cbxWeek.getSelectedIndex() == 1 ? 2090 
                    : cbxWeek.getSelectedIndex() == 2 ? 2490
                    : 3390;
        } else if (rdbDeluxe.isSelected()) {
            roomType = "Deluxe";
            rate = cbxWeek.getSelectedIndex() == 1 ? 2290
                    : cbxWeek.getSelectedIndex() == 2 ? 2790
                    : 3690;
        } else if (rdbGrandDeluxe.isSelected()) {
            roomType = "Grand Deluxe"; //แกรนด์ เดลักซ์
            rate = cbxWeek.getSelectedIndex() == 1 ? 3890
                    : cbxWeek.getSelectedIndex() == 2 ? 4490
                    : 5390;
        } else if (rdbJuniorSuite.isSelected()) {
            roomType = "Junior Suite"; 
            rate = cbxWeek.getSelectedIndex() == 1 ? 3190
                    : cbxWeek.getSelectedIndex() == 2 ? 3890
                    : 4790;
        } else if (rdbGrandFamilySuite.isSelected()) {
            roomType = "Grand Family Suite";
            rate = cbxWeek.getSelectedIndex() == 1 ? 4690
                    : cbxWeek.getSelectedIndex() == 2 ? 5590
                    : 6490;
        }

        int numOfDays = (int) spnDay.getValue(); 
        double totalPrice = rate * numOfDays;

        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        String formattedTotalPrice = decimalFormat.format(totalPrice); 

        txtAreaShow.setText("ประเภทห้อง : " + roomType + "\n"
                + "ช่วงที่เข้าพัก : " + cbxWeek.getSelectedItem().toString() + "\n"
                + "จำนวนวันเข้าพัก : " + numOfDays + "\n"
                + "รวมราคา : " + formattedTotalPrice + " บาท");
    }//GEN-LAST:event_btnCalcActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        JLabel message = new JLabel("คุณต้องการออกจากโปรแกรม");
        message.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
        String text1 = "ยืนยันการออกจากโปรแกรม ";
        int option = JOptionPane.showConfirmDialog(rootPane, message, text1,
                JOptionPane.YES_NO_CANCEL_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        buttonGroup1.clearSelection();
        cbxWeek.setSelectedIndex(0);
        spnDay.setValue(0);
        txtAreaShow.setText("");
        txtId.setText("");
        txtName.setText("");
        txtSurname.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDataActionPerformed
        int idAdd = Integer.parseInt(txtId.getText()); //เก็บข้อมูลที่ถูกแปลงมาจาก txtId
        String nameAdd = txtName.getText();
        String surnameAdd = txtSurname.getText();
        String roomtype = "";
        if (rdbSuperior.isSelected()) {
            roomtype = "Superior";
        } else if (rdbGrandDeluxe.isSelected()) {
            roomtype = "Grand Deluxe";
        } else if (rdbDeluxe.isSelected()) {
            roomtype = "Deluxe";
        } else if (rdbJuniorSuite.isSelected()) {
            roomtype = "Junior Suite";
        } else if (rdbGrandFamilySuite.isSelected()) {
            roomtype = "Grand Family Suite";
        }

        String period = cbxWeek.getSelectedItem().toString();  
        int dayscount = (int) spnDay.getValue();

       
        int rate = 0;
        if (roomtype.equals("Superior")) {
            rate = (period.equals("Weekend")) ? 2090
                    : (period.equals("Long Weekend")) ? 3390
                    : 2490;
        } else if (roomtype.equals("Deluxe")) {
            rate = (period.equals("Weekend")) ? 2290
                    : (period.equals("Long Weekend")) ? 3690
                    : 2790;
        } else if (roomtype.equals("Grand Deluxe")) {
            rate = (period.equals("Weekend")) ? 3890
                    : (period.equals("Long Weekend")) ? 5390
                    : 4490;
        } else if (roomtype.equals("Junior Suite")) {
            rate = (period.equals("Weekend")) ? 3190
                    : (period.equals("Long Weekend")) ? 4790
                    : 3890;
        } else if (roomtype.equals("Grand Family Suite")) {
            rate = (period.equals("Weekend")) ? 4690
                    : (period.equals("Long Weekend")) ? 6490
                    : 5590;
        }
        double totalprice = rate * dayscount; 

        if (nameAdd.length() > 1 && surnameAdd.length() > 2) { 
            JLabel messageAdd = new JLabel("คุณต้องการเพิ่มข้อมูลหรือไม่ ? "); 
            messageAdd.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
            String text1 = "ยืนยันการเพิ่มข้อมูล ";
            int option = JOptionPane.showConfirmDialog(rootPane, messageAdd, text1,
                    JOptionPane.YES_NO_CANCEL_OPTION);
            if (option == JOptionPane.YES_OPTION) {  
                String insert = "INSERT INTO hotel VALUES(" + idAdd + ",'" + nameAdd + "','" + surnameAdd + "','" + roomtype + "','" + period + "'," + dayscount + "," + totalprice + ")";
                System.out.println("insert = " + insert);
                int row = conMyDB.stmtCreInsUpdDel(insert);
                if (row > 0) {
                    Object[] rowData = {idAdd, nameAdd, surnameAdd, roomtype, period, dayscount, totalprice};
                    model.addRow(rowData);
                    JLabel message = new JLabel("เพิ่มข้อมูลสำเร็จ");
                    getToolkit().beep();
                    message.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
                    JOptionPane.showMessageDialog(this, message);
                    clearData();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "เพิ่มข้อมูลไม่สำเร็จ");
                }
            }
        } else {
            JLabel message = new JLabel("กรอกข้อมูลให้ครบถ้วน!");
            message.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
            JOptionPane.showMessageDialog(this, message);
        }
    }//GEN-LAST:event_btnAddDataActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int[] selectedRows = tblData.getSelectedRows(); 
        if (selectedRows.length > 0) { 
            JLabel messageout = new JLabel("คุณต้องการลบข้อมูลหรือไม่ ? ");
            messageout.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
            String text = "ยืนการลบข้อมูล";
            int option = JOptionPane.showConfirmDialog(rootPane, messageout, text,
                    JOptionPane.YES_NO_CANCEL_OPTION);
            if (option == JOptionPane.YES_OPTION) { 
                for (int i = selectedRows.length - 1; i >= 0; i--) { 
                    int idDel = (int) tblData.getValueAt(selectedRows[i], 0);
                    String delete = "DELETE FROM hotel WHERE id=" + idDel;
                    System.out.println("delete = " + delete);
                    int row = conMyDB.stmtCreInsUpdDel(delete);

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

    private int calculateRate(String roomType, int weekIndex) {
        int rate = 0;
        //ตรวจสอบประเภทห้อง
        switch (roomType) {
            case "Superior":
                rate = weekIndex == 1 ? 2090 : weekIndex == 2 ? 2490 : 3390;
                break;
            case "Deluxe":
                rate = weekIndex == 1 ? 2290 : weekIndex == 2 ? 2790 : 3690;
                break;
            case "Grand Deluxe":
                rate = weekIndex == 1 ? 3890 : weekIndex == 2 ? 4490 : 5390;
                break;
            case "Junior Suit":
                rate = weekIndex == 1 ? 3190 : weekIndex == 2 ? 3890 : 4790;
                break;
            case "Grand Family Suite":
                rate = weekIndex == 1 ? 4690 : weekIndex == 2 ? 5590 : 6490;
                break;
        }
        return rate;
    }

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int selectedRow = tblData.getSelectedRow(); 
        if (selectedRow != -1) {
            int idUpd = (int) tblData.getValueAt(selectedRow, 0); 
            String nameUpd = txtName.getText();
            String surnameUpd = txtSurname.getText();
            
            //กำหนดประเภทห้องตามประเภทที่เลือกโดยใช้ JRadioButton
            String roomtype = "";   
            if (rdbSuperior.isSelected()) {
                roomtype = "Superior";
            } else if (rdbDeluxe.isSelected()) {
                roomtype = "Deluxe";
            } else if (rdbGrandDeluxe.isSelected()) {
                roomtype = "Grand Deluxe";
            } else if (rdbJuniorSuite.isSelected()) {
                roomtype = "Junior Suit";
            } else if (rdbGrandFamilySuite.isSelected()) {
                roomtype = "Grand Family Suite";
            }

            String period = cbxWeek.getSelectedItem().toString();
            int dayscount = (int) spnDay.getValue();  //ดึงจำนวนวันที่ถูกเลือกจาก JSpinner

            int rate = calculateRate(roomtype, cbxWeek.getSelectedIndex());
            double totalprice = dayscount * rate;
            JLabel messageout = new JLabel("คุณต้องการอัพเดตข้อมูลหรือไม่ ? ");
            messageout.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
            String text = "ยืนการอัพเดตข้อมูล";
            int option = JOptionPane.showConfirmDialog(rootPane, messageout, text,
                    JOptionPane.YES_NO_CANCEL_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                if (nameUpd.length() > 1 && surnameUpd.length() > 2) {  
                    String update = "UPDATE hotel SET name='" + nameUpd + "', surname='" + surnameUpd + "', roomtype='" + roomtype + "', period='" + period + "', dayscount=" + dayscount + ", totalprice=" + totalprice + " WHERE id=" + idUpd;
                    System.out.println("update = " + update); 
                    int row = conMyDB.stmtCreInsUpdDel(update);

                    if (row > 0) {
                        tblData.setValueAt(nameUpd, selectedRow, 1);
                        tblData.setValueAt(surnameUpd, selectedRow, 2);
                        tblData.setValueAt(roomtype, selectedRow, 3);
                        tblData.setValueAt(period, selectedRow, 4);
                        tblData.setValueAt(dayscount, selectedRow, 5);
                        tblData.setValueAt(totalprice, selectedRow, 6);

                        JLabel message = new JLabel("อัพเดตสำเร็จ");
                        message.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
                        JOptionPane.showMessageDialog(this, message);
                        
                        clearData();
                    } else {
                        JLabel message = new JLabel("กรอกข้อมูลให้ครบถ้วน!");
                        message.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
                        JOptionPane.showMessageDialog(this, message);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed
    
    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        int row = tblData.getSelectedRow(); //ดึงข้อมูลแถวที่ถูกเลือก
        JLabel messageout = new JLabel("คุณต้องการเลือกข้อมูอหรือไม่ ? ");
        messageout.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
        String text = "ยืนยันการเลือกแถว";
        int option = JOptionPane.showConfirmDialog(rootPane, messageout, text,
                JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            if (row >= 0) {
                String idData = String.valueOf(tblData.getValueAt(row, 0)); //ดึงข้อมูลจากแถวที่เลือก
                String nameData = (String) tblData.getValueAt(row, 1);
                String surnameData = (String) tblData.getValueAt(row, 2);
                String roomtypeData = (String) tblData.getValueAt(row, 3);
                String periodData = (String) tblData.getValueAt(row, 4);
                int dayscountData = (int) tblData.getValueAt(row, 5);

                Object totalpriceObject = tblData.getValueAt(row, 6);
                int totalpriceData;
                if (totalpriceObject instanceof Integer) {
                    totalpriceData = (int) totalpriceObject;
                } else if (totalpriceObject instanceof Double aDouble) {
                    totalpriceData = aDouble.intValue();
                } else {
                    totalpriceData = 0;
                }

                txtId.setText(idData); // ตั้งค่าข้อความในองค์ประกอบ GUI:
                txtName.setText(nameData);
                txtSurname.setText(surnameData);
                switch (roomtypeData) {
                    case "Superior":
                        rdbSuperior.setSelected(true);
                        break;
                    case "Deluxe":
                        rdbDeluxe.setSelected(true);
                        break;
                    case "Grand Deluxe":
                        rdbGrandDeluxe.setSelected(true);
                        break;
                    case "Junior Suite":
                        rdbJuniorSuite.setSelected(true);
                        break;
                    case "Grand Family Suite":
                        rdbGrandFamilySuite.setSelected(true);
                        break;
                    default:
                        break;
                }
                cbxWeek.setSelectedItem(periodData); //set ค่าให้ combo Box. มีช่วงที่ถูกเลือกเป็น periodData ที่ได้จากข้อมูลของแถวที่ถุกเลือกในตาราง
                spnDay.setValue(dayscountData);  //จะตั้งค่าให้ Spinner มีค่าที่ถูกเลือกเป็น dayscountData ที่ได้จากข้อมูลของแถวที่ถูกเลือกในตาราง

                // อัปเดต txtResult ด้วยข้อมูลที่เลือก
                String resultText = "ประเภทห้องพัก : " + roomtypeData + "\n"
                        + "ช่วงที่เข้าพัก : " + periodData + "\n"
                        + "จำนวนวันที่เข้าพัก : " + dayscountData + "\n"
                        + "ราคารวม : " + totalpriceData;

                txtAreaShow.setText(resultText);
            }
        }
    }//GEN-LAST:event_tblDataMouseClicked

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed

    }//GEN-LAST:event_txtIdKeyPressed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') || (c <= '.') || (c == java.awt.event.KeyEvent.VK_BACK_SPACE)
                || (c == java.awt.event.KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtIdKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton btnAddData;
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbxWeek;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rdbDeluxe;
    private javax.swing.JRadioButton rdbGrandDeluxe;
    private javax.swing.JRadioButton rdbGrandFamilySuite;
    private javax.swing.JRadioButton rdbJuniorSuite;
    private javax.swing.JRadioButton rdbSuperior;
    private javax.swing.JSpinner spnDay;
    private javax.swing.JTable tblData;
    private javax.swing.JTextArea txtAreaShow;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
