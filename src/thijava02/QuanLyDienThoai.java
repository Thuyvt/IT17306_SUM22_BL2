/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package thijava02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author THUYVU
 */
public class QuanLyDienThoai extends javax.swing.JFrame implements Runnable {
    List<DienThoai> listDienThoai = new ArrayList<>();
    DefaultTableModel defaultTable = new DefaultTableModel();
    
    /**
     * Creates new form QuanLyDienThoai
     */
    public QuanLyDienThoai() {
        initComponents();
        defaultTable = (DefaultTableModel) tblDienThoai.getModel();
        // TAO DU LIEU MAC DINH
        genData();
        System.out.println(listDienThoai);
        // DO DU LIEU VAO BANG
        fillDataToTable();
        
        // 3 - 1 = 2 -> index = 2
        fillObjectToField(listDienThoai.get(2));
        
        // Tao da luong chay chu
        Thread th = new Thread(this);
        th.start();
    }
    
    private void genData() {
        listDienThoai.add(new DienThoai("Sam sung e6", "Sam sung" , 10000));
        listDienThoai.add(new DienThoai("Sam sung e8", "Sam sung" , 20000));
        listDienThoai.add(new DienThoai("Iphone 13", "Apple" , 32000));
        listDienThoai.add(new DienThoai("Iphone se", "Apple" , 54000));
    }
    
    private void fillDataToTable() {
        defaultTable.setRowCount(0);
        for (DienThoai dt : listDienThoai) {
            defaultTable.addRow(new Object[] {
                dt.getTenSP(), dt.getGiaSP(), dt.getHang(),
                dt.getStatus(dt.getGiaSP())
            });
        }
    }
    
    private void fillObjectToField(DienThoai dienThoai) {
        txtTen.setText(dienThoai.getTenSP());
        cboHang.setSelectedItem(dienThoai.getHang());
        txtGia.setText(String.valueOf(dienThoai.getGiaSP()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        cboHang = new javax.swing.JComboBox<>();
        txtGia = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnMo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDienThoai = new javax.swing.JTable();

        jTextField1.setText("jTextField1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 51, 255));
        lblTitle.setText("QUAN LY DIEN THOAI");

        jLabel1.setText("Ten san pham");

        jLabel2.setText("Hang");

        jLabel3.setText("Gia");

        cboHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sam sung", "Apple" }));

        btnThem.setText("Them");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnGhi.setText("Ghi");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        btnMo.setText("Mo");
        btnMo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoActionPerformed(evt);
            }
        });

        tblDienThoai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Ten San Pham", "Gia San Pham", "Hang", "Trang thai"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblDienThoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDienThoaiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDienThoai);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTen)
                                    .addComponent(cboHang, 0, 260, Short.MAX_VALUE)
                                    .addComponent(txtGia)))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGhi, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMo, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTitle)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGhi)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDienThoaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDienThoaiMouseClicked
        // TODO add your handling code here:
        // LAY DUOC INDEX CUA DONG DU LIEU
        int index = tblDienThoai.getSelectedRow();
        // DO DU LIEU LEN TREN TEXT FIELD
        fillObjectToField(listDienThoai.get(index));
    }//GEN-LAST:event_tblDienThoaiMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (!txtGia.getText().isEmpty()) {
            DienThoai dienThoai = new DienThoai(txtTen.getText(), 
                cboHang.getSelectedItem().toString().equals("Sam sung") ? "Sam sung" : "Apple"
                , Double.parseDouble(txtGia.getText()));
        
            listDienThoai.add(dienThoai);
            defaultTable.addRow(new Object[] {
                    dienThoai.getTenSP(), dienThoai.getGiaSP(), dienThoai.getHang(),
                    "Dang hoat dong"});
        } else {
            JOptionPane.showMessageDialog(this, "Gia khong duoc de rong");
        }
       
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        try {
            // TODO add your handling code here:
            FileOutputStream fos = new FileOutputStream("thithu.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(listDienThoai);
            JOptionPane.showMessageDialog(this, "Ghi du lieu thanh cong");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Khong tim thay file");
        } catch (IOException ex) {
            Logger.getLogger(QuanLyDienThoai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGhiActionPerformed

    private void btnMoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoActionPerformed
        try {
            // TODO add your handling code here:
            FileInputStream fis = new FileInputStream("thithu.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            listDienThoai = (List<DienThoai>) ois.readObject();
            fillDataToTable();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(QuanLyDienThoai.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(QuanLyDienThoai.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuanLyDienThoai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMoActionPerformed

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(QuanLyDienThoai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyDienThoai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyDienThoai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyDienThoai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyDienThoai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnMo;
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> cboHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblDienThoai;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (true) {
            String title = lblTitle.getText();
            String firstCh = title.substring(0, 1);
            lblTitle.setText(title.concat(firstCh).substring(1));
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(QuanLyDienThoai.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
