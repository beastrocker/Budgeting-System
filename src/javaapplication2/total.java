/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Deepa
 */
public class total extends javax.swing.JFrame {

    /**
     * Creates new form total
     */
    public total() {
        initComponents();
        
        try
           {   
               
               Class.forName("com.mysql.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
               
                String sql = "SELECT SUM(amount) FROM funds";
                 
                
                
                Statement pst = con.createStatement();
                     
                                
                ResultSet rs = pst.executeQuery(sql);
                
                if(rs.next())
                {
                    
                fundamount.setText(String.valueOf(rs.getInt(1)));
                
                }  
                }
       catch(HeadlessException | ClassNotFoundException | SQLException e)
        {JOptionPane.showMessageDialog(null,e);
         } 
        
        try
           {   
               
               Class.forName("com.mysql.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
               
                String sql = "SELECT SUM(salary) FROM staffmembers";
                 
                
                
                Statement pst = con.createStatement();
                     
                                
                ResultSet rs = pst.executeQuery(sql);
                
                if(rs.next())
                {
                    
                empsalary.setText(String.valueOf(rs.getInt(1)));
                
                }  
                }
       catch(HeadlessException | ClassNotFoundException | SQLException e)
        {JOptionPane.showMessageDialog(null,e);
         }
        
        try
           {   
               
               Class.forName("com.mysql.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
               
                String sql = "SELECT SUM(amount) FROM events";
                 
                
                
                Statement pst = con.createStatement();
                     
                                
                ResultSet rs = pst.executeQuery(sql);
                
                if(rs.next())
                {
                    
                eventamount.setText(String.valueOf(rs.getInt(1)));
                
                }  
                }
       catch(HeadlessException | ClassNotFoundException | SQLException e)
        {JOptionPane.showMessageDialog(null,e);
         }
        
        try
           {   
               
               Class.forName("com.mysql.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
               
                String sql = "SELECT SUM(amount) FROM otherexpenses";
                 
                
                
                Statement pst = con.createStatement();
                     
                                
                ResultSet rs = pst.executeQuery(sql);
                
                if(rs.next())
                {
                    
                otherexpensesamount.setText(String.valueOf(rs.getInt(1)));
                
                }  
                }
       catch(HeadlessException | ClassNotFoundException | SQLException e)
        {JOptionPane.showMessageDialog(null,e);
         } 
        
        double a1,a2,a3,a4,result;
        a1=Double.parseDouble(fundamount.getText());
        a2=Double.parseDouble(empsalary.getText());
        a3=Double.parseDouble(eventamount.getText());
        a4=Double.parseDouble(otherexpensesamount.getText());

        result=a1-a2-a3-a4;
        totalamount.setText(String.valueOf(result));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fundamount = new javax.swing.JTextField();
        eventamount = new javax.swing.JTextField();
        otherexpensesamount = new javax.swing.JTextField();
        totalamount = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        empsalary = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Overall Budget");

        jLabel3.setText("Total Funds");

        jLabel5.setText("Events Expenses");

        jLabel6.setText("Other Expenses");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Total");

        fundamount.setEditable(false);
        fundamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundamountActionPerformed(evt);
            }
        });

        eventamount.setEditable(false);
        eventamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventamountActionPerformed(evt);
            }
        });

        otherexpensesamount.setEditable(false);
        otherexpensesamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherexpensesamountActionPerformed(evt);
            }
        });

        totalamount.setEditable(false);
        totalamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalamountActionPerformed(evt);
            }
        });

        jLabel8.setText("Employee Salary");

        empsalary.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(totalamount, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(48, 48, 48))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(25, 25, 25)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(25, 25, 25))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(30, 30, 30)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(otherexpensesamount, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fundamount)
                                        .addComponent(empsalary)
                                        .addComponent(eventamount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fundamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(empsalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eventamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(otherexpensesamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(totalamount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fundamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundamountActionPerformed
       boolean flag=true;
        // TODO add your handling code here:
    }//GEN-LAST:event_fundamountActionPerformed

    private void totalamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalamountActionPerformed

    private void otherexpensesamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherexpensesamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otherexpensesamountActionPerformed

    private void eventamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventamountActionPerformed

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
            java.util.logging.Logger.getLogger(total.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(total.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(total.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(total.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new total().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField empsalary;
    private javax.swing.JTextField eventamount;
    private javax.swing.JTextField fundamount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField otherexpensesamount;
    private javax.swing.JTextField totalamount;
    // End of variables declaration//GEN-END:variables
}