/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.table.DefaultTableModel;
import entities.ThiSinh;
import controller.*;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import compare.CompareByGPA;
/**
 *
 * @author Viet
 */
public class ManagementStudentPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageMentStudent
     */
    private DefaultTableModel tbModel; // Tạo ra modelTabel để làm việc với table
    private final ManagementStudent mmStudent = new ManagementStudent(); // Tạo ra thằng quản lý sinh viên
    
    public ManagementStudentPanel() {
        initComponents();
        loadTable();
    }
    
    // Nè là tạo ra để gọi đến phương thức thôi, không hiển thị giao diện
    public ManagementStudentPanel(boolean choose){
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgGioiTinh = new javax.swing.ButtonGroup();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMaThiSinh = new javax.swing.JTextField();
        txtTenThiSinh = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtQueQuan = new javax.swing.JTextField();
        txtDiemThi = new javax.swing.JTextField();
        rdbNam = new javax.swing.JRadioButton();
        rdbNu = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        btnFind = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        checkDo = new javax.swing.JCheckBox();
        checkTruot = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudents = new javax.swing.JTable();

        jFormattedTextField1.setText("jFormattedTextField1");

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel2.setText("Mã thí sinh:");

        jLabel3.setText("Tên thí sinh:");

        jLabel4.setText("Ngày sinh:");

        jLabel5.setText("Giới tính:");

        jLabel6.setText("Quê quán:");

        jLabel7.setText("Điểm thi:");

        btgGioiTinh.add(rdbNam);
        rdbNam.setSelected(true);
        rdbNam.setText("Nam");
        rdbNam.setFocusCycleRoot(true);

        btgGioiTinh.add(rdbNu);
        rdbNu.setText("Nữ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenThiSinh)
                            .addComponent(txtNgaySinh)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdbNam)
                                .addGap(18, 18, 18)
                                .addComponent(rdbNu)
                                .addGap(0, 77, Short.MAX_VALUE))
                            .addComponent(txtQueQuan)
                            .addComponent(txtDiemThi)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(txtMaThiSinh)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaThiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenThiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rdbNam)
                    .addComponent(rdbNu))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiemThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/search-icon-16.png"))); // NOI18N
        btnFind.setText("Tìm kiếm");
        btnFind.setMaximumSize(new java.awt.Dimension(150, 50));
        btnFind.setMinimumSize(new java.awt.Dimension(150, 50));
        btnFind.setPreferredSize(new java.awt.Dimension(150, 50));
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/Add_16x16.png"))); // NOI18N
        btnAdd.setText("Thêm mới");
        btnAdd.setMaximumSize(new java.awt.Dimension(150, 50));
        btnAdd.setMinimumSize(new java.awt.Dimension(150, 50));
        btnAdd.setPreferredSize(new java.awt.Dimension(150, 50));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/Edit_16x16.png"))); // NOI18N
        btnEdit.setText("Sửa");
        btnEdit.setMaximumSize(new java.awt.Dimension(150, 50));
        btnEdit.setMinimumSize(new java.awt.Dimension(150, 50));
        btnEdit.setPreferredSize(new java.awt.Dimension(150, 50));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/Remove_16x16.png"))); // NOI18N
        btnDelete.setText("Xoá");
        btnDelete.setMaximumSize(new java.awt.Dimension(150, 50));
        btnDelete.setMinimumSize(new java.awt.Dimension(150, 50));
        btnDelete.setPreferredSize(new java.awt.Dimension(150, 50));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        checkDo.setSelected(true);
        checkDo.setText("Đỗ");
        checkDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDoActionPerformed(evt);
            }
        });

        checkTruot.setSelected(true);
        checkTruot.setText("Trượt");
        checkTruot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTruotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(checkDo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkTruot)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkDo)
                    .addComponent(checkTruot))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tblStudents.setAutoCreateRowSorter(true);
        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStudents);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // ====================================================================== //
    // ====================== Sự kiện nút tìm kiếm ========================== //
    // ====================================================================== //
    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        if(txtMaThiSinh.getText().equals("")){ // Kiểm tra xem mã thí sinh có để trống không
            // Hiển thị thông báo
            JOptionPane.showMessageDialog(this, "Mã thí sinh không được để trống!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            loadTable(); // Load lại cái bảng dữ liệu
        } else {
            tbModel = new DefaultTableModel(); // Tạo ra cái model của bảng
            
            // Thiết lập tên các cột
            tbModel.setColumnIdentifiers(new String[]{"Mã thí sinh", "Họ tên", "Ngày sinh",
            "Giới tính", "Quê quán", "Điểm thi", "Tình trạng"});
            tblStudents.setModel(tbModel);
            
            // Duyệt danh sách các thí sinh
            for(ThiSinh i : mmStudent.getList()){
                if(i.getMaTS().equals(txtMaThiSinh.getText())){ // Kiểm tra xem mã thí sinh có đúng là mã thí sinh cần tìm không
                    Object[] obj = new Object[7]; // Tạo ra một đối tượng
                    // Gán vị trí đối tượng tương ứng với vị trí cột
                    obj[0] = i.getMaTS();
                    obj[1] = i.getTenST();
                    obj[2] = i.getNgaySinh();
                    obj[3] = i.getGioiTinh();
                    obj[4] = i.getQueQuan();
                    obj[5] = i.getDiemThi();
                    obj[6] = i.getDiemThi() >= getDiemChuan()? "Đỗ" : "Trượt";
                    
                    tbModel.addRow(obj); // Thêm đối tượng vào hàng
                }
            }
            
            // Tìm xong thì ẩn hết thông tin dư thừa đi
            txtNgaySinh.setText("");
            txtDiemThi.setText("");
            txtQueQuan.setText("");
            txtTenThiSinh.setText("");
        }
    }//GEN-LAST:event_btnFindActionPerformed

    // ====================================================================== //
    // ====================== Sự kiện nút thêm mới ========================== //
    // ====================================================================== //
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(!checkEmpty()) { // Kiểm tra xem các trường dữ liệu có để trống không
            txtMaThiSinh.setText(""); // Vì mã thí sinh tự tạo nên không cần thiết lập mã thí sinh
            ThiSinh tsNew = new ThiSinh();
            tsNew.setMaTS(String.format("TS%04d", ManagementStudent.ID ++)); // Thiết lập mã thí sinh tăng tự động
            tsNew.setTenST(txtTenThiSinh.getText());
            tsNew.setNgaySinh(txtNgaySinh.getText());
            tsNew.setGioiTinh(rdbNam.isSelected()? "Nam" : "Nữ");
            tsNew.setQueQuan(txtQueQuan.getText());
            tsNew.setDiemThi((Float.parseFloat(txtDiemThi.getText())));
            
            // Tạo hộp thoại xác nhận muốn thêm mới hay không?
            if(JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn thêm mới?", "Thông báo",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
                mmStudent.themThiSinh(tsNew); // Thêm thí sinh vào danh sách
            }
            loadTable(); // Load lại table
        }
    }//GEN-LAST:event_btnAddActionPerformed

    // ====================================================================== //
    // ====================== Sự kiện nút chỉnh sửa ========================= //
    // ====================================================================== //
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if(!checkEmpty()){ // Kiểm tra các trường dữ liệu để trống hay không ??
            ThiSinh tsNew = new ThiSinh(); // Tạo một thí sinh mới để lưu thông tin chỉnh sửa
            
            // Thiết lập các thông tin lấy từ input
            tsNew.setMaTS(txtMaThiSinh.getText());
            tsNew.setTenST(txtTenThiSinh.getText());
            tsNew.setNgaySinh(txtNgaySinh.getText());
            tsNew.setGioiTinh(rdbNam.isSelected()? "Nam" : "Nữ");
            tsNew.setQueQuan(txtQueQuan.getText());
            tsNew.setDiemThi((Float.parseFloat(txtDiemThi.getText())));

            // Kiểm tra xem mã thí sinh có để trống không???
            if(txtMaThiSinh.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Mã thí sinh không được để trống!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Hiện thông báo và sửa thí sinh
                JOptionPane.showMessageDialog(this, mmStudent.suaThiSinh(tsNew));
            }
            loadTable(); // Load lại dữ liệu
        }
    }//GEN-LAST:event_btnEditActionPerformed

    // ====================================================================== //
    // ================== Sự kiện nút xoá thí sinh ========================== //
    // ====================================================================== //
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        ThiSinh tsNew = new ThiSinh();
        tsNew.setMaTS(txtMaThiSinh.getText()); // Lấy mã thí sinh
        tsNew.setTenST("");
        tsNew.setNgaySinh("");
        tsNew.setGioiTinh("");
        tsNew.setQueQuan("");
        tsNew.setDiemThi(0);
        
        if(txtMaThiSinh.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Mã thí sinh không được để trống!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            
            // Hỏi xem nó có chắc chắn muốn xoá không?
            if(JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xoá?", "Thông báo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                // Nó ok thì cho xoá và thông báo
                JOptionPane.showMessageDialog(this, mmStudent.xoaThiSinh(tsNew));
        }
        
        // Thiết lập lại hết các trường dữ liệu là trống
        txtMaThiSinh.setText("");
        txtNgaySinh.setText("");
        txtDiemThi.setText("");
        txtQueQuan.setText("");
        txtTenThiSinh.setText("");
        
        loadTable(); // Load lại bảng dữ liệu
    }//GEN-LAST:event_btnDeleteActionPerformed

    // ====================================================================== //
    // ====== Sự kiện hiển thị dữ liệu khi kich vào một dòng trong table ==== //
    // ====================================================================== //
    private void tblStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentsMouseClicked
        // TODO add your handling code here:
        try{
            int row = tblStudents.getSelectedRow(); // Lấy ra chỉ số dòng đang click
            
            if(row > -1){ // Nếu chỉ số dòng lớn hơn -1, tức là nó đang chọn
                // Lấy ra các dữ liệu tương ứng với các cột tại dòng đó
                txtMaThiSinh.setText((String) tblStudents.getValueAt(row, 0));
                txtTenThiSinh.setText((String) tblStudents.getValueAt(row, 1));
                if(tblStudents.getValueAt(row, 3).toString().equals("Nam")){
                    rdbNam.setSelected(true);
                } else {
                    rdbNu.setSelected(true);
                }
                txtNgaySinh.setText((String) tblStudents.getValueAt(row, 2));
                txtQueQuan.setText((String) tblStudents.getValueAt(row, 4));
                txtDiemThi.setText(tblStudents.getValueAt(row, 5).toString());
            }
        } catch(IndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_tblStudentsMouseClicked

    // ====================================================================== //
    // ======================== Sự kiện nút check đỗ ======================== //
    // ====================================================================== //
    private void checkDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDoActionPerformed
        // TODO add your handling code here:
        loadTable(); // Load lại dữ liệu
    }//GEN-LAST:event_checkDoActionPerformed

    // ====================================================================== //
    // ======================== Sự kiện nút check tạch ====================== //
    // ====================================================================== //
    private void checkTruotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTruotActionPerformed
        // TODO add your handling code here:
        loadTable(); // Load lại dữ liệu
    }//GEN-LAST:event_checkTruotActionPerformed

    // ====================================================================== //
    // =================== Nè là click vào một chỗ bất kỳ =================== //
    // ====================================================================== //
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        // Nè là để phục vụ lúc mà mình đổi các chỉ tiêu thì nó có thể load lại được dữ liệu
        loadTable(); // load lại dữ liệu
    }//GEN-LAST:event_formMouseClicked

    // ====================================================================== //
    // ========================= Hàm load dữ liệu =========================== //
    // ====================================================================== //
    public void loadTable(){
        // Tạo model mới
        tbModel = new DefaultTableModel();
        // Thiết lập tên các cột
        tbModel.setColumnIdentifiers(new String[]{"Mã thí sinh", "Họ tên", "Ngày sinh",
        "Giới tính", "Quê quán", "Điểm thi", "Tình trạng"});
        
        tblStudents.setModel(tbModel); // Sét model cho table thí sinh
        
        // Kiểm tra nếu như đang chọn check đỗ và check tạch thì hiển thị hết
        if(checkDo.isSelected() && checkTruot.isSelected()){
            for(ThiSinh i : mmStudent.getList()){
                Object[] obj = new Object[7];
                obj[0] = i.getMaTS();
                obj[1] = i.getTenST();
                obj[2] = i.getNgaySinh();
                obj[3] = i.getGioiTinh();
                obj[4] = i.getQueQuan();
                obj[5] = i.getDiemThi();
                obj[6] = i.getDiemThi() >= getDiemChuan()? "Đỗ" : "Trượt";
                tbModel.addRow(obj);
            }
        } else if(checkDo.isSelected() && !checkTruot.isSelected()){ // Nè là chỉ đỗ
            for(ThiSinh i : getListDo()){
                Object[] obj = new Object[7];
                obj[0] = i.getMaTS();
                obj[1] = i.getTenST();
                obj[2] = i.getNgaySinh();
                obj[3] = i.getGioiTinh();
                obj[4] = i.getQueQuan();
                obj[5] = i.getDiemThi();
                obj[6] = "Đỗ";
                tbModel.addRow(obj);
            }
        } else if(!checkDo.isSelected() && checkTruot.isSelected()) { // Nè là chỉ tạch
            for(ThiSinh i : getListTruot()){
                Object[] obj = new Object[7];
                obj[0] = i.getMaTS();
                obj[1] = i.getTenST();
                obj[2] = i.getNgaySinh();
                obj[3] = i.getGioiTinh();
                obj[4] = i.getQueQuan();
                obj[5] = i.getDiemThi();
                obj[6] = "Trượt";
                tbModel.addRow(obj);
            }
        } else {
            // Không có gì cả
        }
    }
    
    // ====================================================================== //
    // =================== Hàm lấy danh sách thí sinh đỗ ==================== //
    // ====================================================================== //
    private ArrayList<ThiSinh> getListDo(){
        ArrayList<ThiSinh> listDo = new ArrayList<>();
        float diemChuan = getDiemChuan();
        
        for(ThiSinh i : cloneList()) {
            if(i.getDiemThi() >= diemChuan)
                listDo.add(new ThiSinh(i));
        }
        
        return listDo;
    }
    
    // ====================================================================== //
    // =================== Hàm lấy danh sách thí sinh tạch=================== //
    // ====================================================================== //
    private ArrayList<ThiSinh> getListTruot() {
        ArrayList<ThiSinh> listTruot = new ArrayList<>();
        float diemChuan = getDiemChuan();
        
        for(ThiSinh i : cloneList()) {
            if(i.getDiemThi() < diemChuan)
                listTruot.add(new ThiSinh(i));
        }
        
        return listTruot;
    }
    
    // ====================================================================== //
    // ================== Hàm lấy điểm chuẩn dựa vào chỉ tiêu =============== //
    public float getDiemChuan() {
        ArrayList<ThiSinh> spam = cloneList();
        int chiTieu = new QuanLyTuyenSinhDao().read(); // Đọc chỉ tiêu từ file
        float diemChuan;
        
        Collections.sort(spam, new CompareByGPA()); // Sắp xếp danh sách theo chiều giảm dần của điểm thi
        
        if(chiTieu <= spam.size()) { // Nếu chỉ tiêu mà nhỏ hơn hoặc bằng số thí sinh dự thi
            diemChuan = spam.get(chiTieu - 1).getDiemThi(); // Điểm chuẩn bằng điểm của thí sinh dốt nhất
        } else {
            diemChuan = spam.get(spam.size() - 1).getDiemThi(); // Điểm chuẩn bằng điểm của thí sinh tại vị trí lấy chỉ tiêu
        }
        
        return diemChuan;
    }
    
    // ====================================================================== //
    // ====================== Hàm clone list ================================ //
    // ====================================================================== //
    private ArrayList<ThiSinh> cloneList(){
        ArrayList<ThiSinh> spam = new ArrayList<>();
        for(ThiSinh i : mmStudent.getList()) {
            spam.add(new ThiSinh(i));
        }
        
        return spam;
    }
    
    // ====================================================================== //
    // ================== Hàm này để cho bên User UI lấy ==================== //
    // ====================================================================== //
    public float diemChuan(){
        return getDiemChuan();
    }
    
    // ====================================================================== //
    // =========== Hàm kiểm tra các trường dữ liệu có trống không =========== //
    // ====================================================================== //
    private boolean checkEmpty(){
        boolean flag = false; // Tạo cờ đánh dấu dữ liệu là hợp lệ
        if(txtTenThiSinh.getText().equals("")){ 
            JOptionPane.showMessageDialog(this, "Tên thí sinh không được để trống!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            flag = true; // Đánh dấu là không hợp lệ
        } else if(txtNgaySinh.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ngày sinh không được để trống!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            flag = true;
        } else if(txtQueQuan.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Quê quán không được để trống!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            flag = true;
        } else if(txtDiemThi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Điểm thi không được để trống!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            flag = true;
        } else if(!checkNumber(txtDiemThi.getText())) {
            JOptionPane.showMessageDialog(this, "Điểm thi phải là số!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            flag = true;
        }
        return flag;
    }
    
    // ====================================================================== //
    // ================ Kiểm tra xem dữ liệu phải số không ================== //
    // ====================================================================== //
    private boolean checkNumber(String number){
        boolean flag = true;
        try {
            Float.valueOf(number);
        } catch (NumberFormatException ex) {
            flag = false;
        }
        
        return flag;
    }
    
    // ====================================================================== //
    // ================== Hàm lấy số lượng thí sinh đỗ ====================== //
    // ====================================================================== //
    public int getNumberOfDo() {
        return getListDo().size();
    }
    
    // ====================================================================== //
    // ====================== Hàm lấy số lượng thí sinh tạch ================ //
    public int getNumberOfTach() {
        return getListTruot().size();
    }
    
    // ====================================================================== //
    // ==================== Hàm lấy số lượng tất cả thí sinh ================ //
    // ====================================================================== //
    public int getNumberOfAll() {
        return mmStudent.getList().size();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgGioiTinh;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFind;
    private javax.swing.JCheckBox checkDo;
    private javax.swing.JCheckBox checkTruot;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rdbNam;
    private javax.swing.JRadioButton rdbNu;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTextField txtDiemThi;
    private javax.swing.JTextField txtMaThiSinh;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtQueQuan;
    private javax.swing.JTextField txtTenThiSinh;
    // End of variables declaration//GEN-END:variables
}
