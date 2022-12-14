/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package airline.system;
import javax.swing.JOptionPane;
import java.awt.EventQueue;

import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
/**
 *
 * @author BHAVESH
 */
public class CancellationReport extends javax.swing.JFrame {

    /**
     * Creates new form CancellationReport
     */
    public CancellationReport() {
        initComponents();
        
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now=LocalDateTime.now();
        jlblDate.setText(dtf.format(now));
        
        dtf=DateTimeFormatter.ofPattern("HH:mm:ss");
        now=LocalDateTime.now();
        jlblTime.setText(dtf.format(now));
        
         try
        {
            //Class.forName("com.mysql.jdbc.Driver");  
             Connection con = DriverManager.getConnection("jdbc:mysql:///ams","root","");  
             Statement s =con.createStatement();
             String sql="select * from cancellation";
             ResultSet rs=s.executeQuery(sql);

             while(rs.next())
             {
                String CID=String.valueOf(rs.getInt("Cancellation_ID"));
                String Name=rs.getString("Customer_Name");
                String Mob=rs.getString("Mob_No");
                String Address =rs.getString("Address");
                String Aadhar=rs.getString("Aadhar_Card_No");
                String FName=rs.getString("Flight_Name");
                String Source=rs.getString("Source");
                String Destination=rs.getString("Destination");
                String Fare=rs.getString("Fare");
                String Passport=rs.getString("Passport_No");
                
                  String tbData[]={CID,Name,Mob,Address,Aadhar,FName,Source,Destination,Fare,Passport};
                  DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
                 tblModel.addRow(tbData);
             }
        }
        catch(Exception e)
        {
               JOptionPane.showMessageDialog(null, e.getMessage());
        }
       
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
        jlblDate = new javax.swing.JLabel();
        jlblTime = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1450, 750));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel2.setText("AIRLINE MANAGEMENT SYSTEM");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(430, 40, 670, 86);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\BHAVESH\\Documents\\NetBeansProjects\\Airline System\\Icon\\Logo.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(240, 60, 200, 180);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("CANCELLATION REPORT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(560, 140, 340, 70);

        jlblDate.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jlblDate.setText("jLabel3");
        getContentPane().add(jlblDate);
        jlblDate.setBounds(980, 150, 220, 30);

        jlblTime.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jlblTime.setText("jLabel3");
        getContentPane().add(jlblTime);
        jlblTime.setBounds(980, 210, 220, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cancellation_ID", "Customer_Name", "Mob_No", "Address", "Aadhar_Card_No", "Flight_Name", "Source", "Destination", "Fare", "Passport_No"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(110, 280, 1150, 260);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\BHAVESH\\Documents\\NetBeansProjects\\Airline System\\Icon\\whitebackground.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -120, 1480, 980);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CancellationReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancellationReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancellationReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancellationReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancellationReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlblDate;
    private javax.swing.JLabel jlblTime;
    // End of variables declaration//GEN-END:variables
}
