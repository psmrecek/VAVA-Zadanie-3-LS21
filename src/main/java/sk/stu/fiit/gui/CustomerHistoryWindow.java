/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.gui;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import sk.stu.fiit.logic.Accommodation;
import sk.stu.fiit.logic.Customer;

/**
 *
 * @author PeterSmrecek
 */
public class CustomerHistoryWindow extends javax.swing.JFrame {

    /**
     * Creates new form CustomerHistoryWindow
     */
    
    private Customer customer;
    private SimpleDateFormat sdfRoom = new SimpleDateFormat("dd.MM.yyyy HH:mm");

    
    public CustomerHistoryWindow(Customer customer) {
        initComponents();
        
        this.customer = customer;
        nameTf.setText(customer.getName());
        addressTf.setText(customer.getAddress());
        phoneTf.setText(customer.getPhoneNumber());
        emailTf.setText(customer.getEmail());
        
        populateAccommTbl();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        nameLbl = new javax.swing.JLabel();
        addressLbl = new javax.swing.JLabel();
        phoneLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        nameTf = new javax.swing.JTextField();
        addressTf = new javax.swing.JTextField();
        phoneTf = new javax.swing.JTextField();
        emailTf = new javax.swing.JTextField();
        titleLbl = new javax.swing.JLabel();
        buttonsPnl = new javax.swing.JPanel();
        okBtn = new javax.swing.JButton();
        accommScroll = new javax.swing.JScrollPane();
        accommTbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hist??ria z??kazn??ka");

        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel1.setLayout(jPanel1Layout);

        nameLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameLbl.setText("Meno");
        nameLbl.setMinimumSize(new java.awt.Dimension(200, 20));
        nameLbl.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel1.add(nameLbl, gridBagConstraints);

        addressLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addressLbl.setText("Adresa");
        addressLbl.setMinimumSize(new java.awt.Dimension(200, 20));
        addressLbl.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel1.add(addressLbl, gridBagConstraints);

        phoneLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        phoneLbl.setText("Telef??nne ????slo");
        phoneLbl.setMinimumSize(new java.awt.Dimension(200, 20));
        phoneLbl.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        jPanel1.add(phoneLbl, gridBagConstraints);

        emailLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailLbl.setText("Email");
        emailLbl.setMinimumSize(new java.awt.Dimension(200, 20));
        emailLbl.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        jPanel1.add(emailLbl, gridBagConstraints);

        nameTf.setEditable(false);
        nameTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameTf.setMinimumSize(new java.awt.Dimension(300, 26));
        nameTf.setPreferredSize(new java.awt.Dimension(300, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel1.add(nameTf, gridBagConstraints);

        addressTf.setEditable(false);
        addressTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addressTf.setMinimumSize(new java.awt.Dimension(300, 26));
        addressTf.setPreferredSize(new java.awt.Dimension(300, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        jPanel1.add(addressTf, gridBagConstraints);

        phoneTf.setEditable(false);
        phoneTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        phoneTf.setMinimumSize(new java.awt.Dimension(300, 26));
        phoneTf.setPreferredSize(new java.awt.Dimension(300, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        jPanel1.add(phoneTf, gridBagConstraints);

        emailTf.setEditable(false);
        emailTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailTf.setMinimumSize(new java.awt.Dimension(300, 26));
        emailTf.setPreferredSize(new java.awt.Dimension(300, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        jPanel1.add(emailTf, gridBagConstraints);

        titleLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Hist??ria z??kazn??ka");
        titleLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titleLbl.setPreferredSize(new java.awt.Dimension(450, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        jPanel1.add(titleLbl, gridBagConstraints);

        buttonsPnl.setLayout(new javax.swing.BoxLayout(buttonsPnl, javax.swing.BoxLayout.LINE_AXIS));

        okBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        okBtn.setText("OK");
        okBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                okBtnMouseReleased(evt);
            }
        });
        buttonsPnl.add(okBtn);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 7;
        jPanel1.add(buttonsPnl, gridBagConstraints);

        accommScroll.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabu??ka ubytovan??", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        accommScroll.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        accommScroll.setMinimumSize(new java.awt.Dimension(375, 260));
        accommScroll.setPreferredSize(new java.awt.Dimension(12, 500));

        accommTbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        accommTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Izba", "Od", "Do", "Slu??by", "Suma", "V hotovosti"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        accommTbl.setMinimumSize(new java.awt.Dimension(375, 260));
        accommTbl.getTableHeader().setReorderingAllowed(false);
        accommScroll.setViewportView(accommTbl);
        if (accommTbl.getColumnModel().getColumnCount() > 0) {
            accommTbl.getColumnModel().getColumn(5).setMaxWidth(100);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(accommScroll, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okBtnMouseReleased
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_okBtnMouseReleased

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CustomerHistoryWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CustomerHistoryWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CustomerHistoryWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CustomerHistoryWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CustomerHistoryWindow().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane accommScroll;
    private javax.swing.JTable accommTbl;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JTextField addressTf;
    private javax.swing.JPanel buttonsPnl;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTf;
    private javax.swing.JButton okBtn;
    private javax.swing.JLabel phoneLbl;
    private javax.swing.JTextField phoneTf;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
    
    
    public void deleteRows(DefaultTableModel model) {
        if (model.getRowCount() > 0) {
            for (int i = model.getRowCount() - 1; i > -1; i--) {
                model.removeRow(i);
            }
        }
    }

    private void populateAccommTbl() {
        DefaultTableModel model = (DefaultTableModel) accommTbl.getModel();
        deleteRows(model);

        int numberOfColumns = accommTbl.getColumnCount();
        Object[] rowData = new Object[numberOfColumns];
        ArrayList<Accommodation> list = customer.getListAccommodations();
        for (int i = 0; i < list.size(); i++) {

            rowData[0] = list.get(i).getRoom().getName();
            rowData[1] = sdfRoom.format(list.get(i).getStartDate());
            rowData[2] = sdfRoom.format(list.get(i).getEndDate());
            rowData[3] = list.get(i).getServicesString();
            if (list.get(i).getPayment() != null) {
                rowData[4] = list.get(i).getPayment().getTotal().toString();
                rowData[5] = list.get(i).getPayment().isCash();
            } else {
                rowData[4] = "Nezaplaten??";
                rowData[5] = false;
            }
            model.addRow(rowData);
        }
    }
}
