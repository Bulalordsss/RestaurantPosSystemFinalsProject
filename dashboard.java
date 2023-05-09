/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trialproject;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author User
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard   
     */
    public dashboard() {
        initComponents();
         showDate();
         showTime();
    }
    public void showDate(){
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("MMM dd, yyyy");
        String dat = s.format(d);
        jLabel4.setText(dat); 
    }
    public void showTime(){
        new Timer (0,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                String tim = s.format(d);
                jLabel6.setText(tim);
            }
        }).start(); 
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_JPANEL = new javax.swing.JPanel();
        JP_Sideboard = new javax.swing.JPanel();
        JL_Navigation = new javax.swing.JLabel();
        JB_Dashboard = new javax.swing.JButton();
        JB_StatChart = new javax.swing.JButton();
        JL_Operations = new javax.swing.JLabel();
        JB_Expenses = new javax.swing.JButton();
        JB_SalesReport = new javax.swing.JButton();
        JB_Inventory = new javax.swing.JButton();
        JB_Menu = new javax.swing.JButton();
        JB_Logout = new javax.swing.JButton();
        JB_RestaurantSupplies = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JP_JPANEL.setBackground(new java.awt.Color(255, 164, 92));
        JP_JPANEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JP_JPANELMousePressed(evt);
            }
        });
        JP_JPANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JP_Sideboard.setBackground(new java.awt.Color(93, 93, 90));
        JP_Sideboard.setForeground(new java.awt.Color(255, 255, 255));
        JP_Sideboard.setToolTipText("");
        JP_Sideboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JL_Navigation.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        JL_Navigation.setForeground(new java.awt.Color(255, 255, 255));
        JL_Navigation.setText("Navigation");
        JP_Sideboard.add(JL_Navigation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 110, 30));

        JB_Dashboard.setBackground(new java.awt.Color(93, 93, 90));
        JB_Dashboard.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        JB_Dashboard.setForeground(new java.awt.Color(255, 255, 255));
        JB_Dashboard.setText("Dashboard");
        JB_Dashboard.setToolTipText("");
        JB_Dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_DashboardActionPerformed(evt);
            }
        });
        JP_Sideboard.add(JB_Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 210, 41));

        JB_StatChart.setBackground(new java.awt.Color(93, 93, 90));
        JB_StatChart.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        JB_StatChart.setForeground(new java.awt.Color(255, 255, 255));
        JB_StatChart.setText("Statistics / Charts");
        JB_StatChart.setToolTipText("");
        JB_StatChart.setPreferredSize(new java.awt.Dimension(115, 26));
        JP_Sideboard.add(JB_StatChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 210, 41));

        JL_Operations.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        JL_Operations.setForeground(new java.awt.Color(255, 255, 255));
        JL_Operations.setText("Reports");
        JP_Sideboard.add(JL_Operations, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 80, 30));

        JB_Expenses.setBackground(new java.awt.Color(93, 93, 90));
        JB_Expenses.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        JB_Expenses.setForeground(new java.awt.Color(255, 255, 255));
        JB_Expenses.setText("Expenses Report");
        JB_Expenses.setToolTipText("");
        JB_Expenses.setPreferredSize(new java.awt.Dimension(115, 26));
        JB_Expenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ExpensesActionPerformed(evt);
            }
        });
        JP_Sideboard.add(JB_Expenses, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 210, 41));

        JB_SalesReport.setBackground(new java.awt.Color(93, 93, 90));
        JB_SalesReport.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        JB_SalesReport.setForeground(new java.awt.Color(255, 255, 255));
        JB_SalesReport.setText("Sales Report");
        JB_SalesReport.setToolTipText("");
        JB_SalesReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_SalesReportActionPerformed(evt);
            }
        });
        JP_Sideboard.add(JB_SalesReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 210, 41));

        JB_Inventory.setBackground(new java.awt.Color(93, 93, 90));
        JB_Inventory.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        JB_Inventory.setForeground(new java.awt.Color(255, 255, 255));
        JB_Inventory.setText("Inventory");
        JB_Inventory.setToolTipText("");
        JB_Inventory.setPreferredSize(new java.awt.Dimension(115, 26));
        JP_Sideboard.add(JB_Inventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 210, 41));

        JB_Menu.setBackground(new java.awt.Color(93, 93, 90));
        JB_Menu.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        JB_Menu.setForeground(new java.awt.Color(255, 255, 255));
        JB_Menu.setText("Menu");
        JB_Menu.setToolTipText("");
        JB_Menu.setPreferredSize(new java.awt.Dimension(115, 26));
        JB_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_MenuActionPerformed(evt);
            }
        });
        JP_Sideboard.add(JB_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 210, 41));

        JB_Logout.setBackground(new java.awt.Color(93, 93, 90));
        JB_Logout.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        JB_Logout.setForeground(new java.awt.Color(255, 255, 255));
        JB_Logout.setText("Log out");
        JB_Logout.setToolTipText("");
        JB_Logout.setPreferredSize(new java.awt.Dimension(182, 26));
        JB_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_LogoutActionPerformed(evt);
            }
        });
        JP_Sideboard.add(JB_Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 690, 210, 41));

        JB_RestaurantSupplies.setBackground(new java.awt.Color(93, 93, 90));
        JB_RestaurantSupplies.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        JB_RestaurantSupplies.setForeground(new java.awt.Color(255, 255, 255));
        JB_RestaurantSupplies.setText("Support");
        JB_RestaurantSupplies.setToolTipText("");
        JP_Sideboard.add(JB_RestaurantSupplies, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 210, 41));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Miscellaneous");
        JP_Sideboard.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 120, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trialproject/Pictures/12.png"))); // NOI18N
        JP_Sideboard.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 210, 190));

        JP_JPANEL.add(JP_Sideboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 230, 860));
        JP_JPANEL.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 270, 190));

        jPanel2.setPreferredSize(new java.awt.Dimension(100, 100));
        JP_JPANEL.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 270, 190));

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

        JP_JPANEL.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, 1090, 380));
        JP_JPANEL.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, 270, 190));
        JP_JPANEL.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 280, 270, 190));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel3.setText("Date:");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 40, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 100, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel5.setText("Time:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 50, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 90, 20));

        JP_JPANEL.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 1110, 40));

        getContentPane().add(JP_JPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -70, 1380, 930));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JP_JPANELMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JP_JPANELMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JP_JPANELMousePressed

    private void JB_DashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_DashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JB_DashboardActionPerformed

    private void JB_ExpensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ExpensesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JB_ExpensesActionPerformed

    private void JB_SalesReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_SalesReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JB_SalesReportActionPerformed

    private void JB_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_MenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JB_MenuActionPerformed

    private void JB_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_LogoutActionPerformed
        int a = JOptionPane.showConfirmDialog(null,"Do you want to logout now?","ConfirmDialog",JOptionPane.YES_NO_OPTION);
        if (a==0){
            System.exit(0);
        }        
    }//GEN-LAST:event_JB_LogoutActionPerformed

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Dashboard;
    private javax.swing.JButton JB_Expenses;
    private javax.swing.JButton JB_Inventory;
    private javax.swing.JButton JB_Logout;
    private javax.swing.JButton JB_Menu;
    private javax.swing.JButton JB_RestaurantSupplies;
    private javax.swing.JButton JB_SalesReport;
    private javax.swing.JButton JB_StatChart;
    private javax.swing.JLabel JL_Navigation;
    private javax.swing.JLabel JL_Operations;
    private javax.swing.JPanel JP_JPANEL;
    private javax.swing.JPanel JP_Sideboard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
