/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package airline.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import org.apache.commons.dbutils.DbUtils;
//import net.proteanit.sql.DbUtils;
/**
 *
 * @author BHAVESH
 */
public class RemoveFlight extends javax.swing.JFrame {

    private DefaultTableModel model;
    /**
     * Creates new form RemoveFlight
     */
    public RemoveFlight() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonSearch = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1500, 800));
        getContentPane().setLayout(null);

        jTextFieldSearch.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jTextFieldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchActionPerformed(evt);
            }
        });
        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldSearch);
        jTextFieldSearch.setBounds(40, 254, 199, 30);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setText("Enter Flight ID to Search :");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 160, 370, 50);

        jButtonSearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\BHAVESH\\Documents\\NetBeansProjects\\Airline System\\Icon\\Search-removebg-preview (3).png")); // NOI18N
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });
        jButtonSearch.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jButtonSearchPropertyChange(evt);
            }
        });
        getContentPane().add(jButtonSearch);
        jButtonSearch.setBounds(290, 230, 60, 60);

        jButtonRemove.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jButtonRemove.setText("REMOVE");
        jButtonRemove.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });
        jButtonRemove.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jButtonRemovePropertyChange(evt);
            }
        });
        getContentPane().add(jButtonRemove);
        jButtonRemove.setBounds(20, 340, 148, 35);

        jButtonCancel.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jButtonCancel.setText("CANCEL");
        jButtonCancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jButtonCancel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jButtonCancelPropertyChange(evt);
            }
        });
        getContentPane().add(jButtonCancel);
        jButtonCancel.setBounds(210, 340, 148, 35);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel3.setText("REMOVE FLIGHT");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 50, 470, 60);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight_No", "Flight_Name", "Source", "Destination", "Fare"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(540, 160, 610, 200);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\BHAVESH\\Documents\\NetBeansProjects\\Airline System\\Icon\\ViewFlight.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -170, 1460, 1050);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchActionPerformed

    private void jTextFieldSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyPressed
      String search=jTextFieldSearch.getText();
       
        //int length=search.length();
        
        char c=evt.getKeyChar();

       if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
       
           
            {
                jTextFieldSearch.setEditable(true);
            }
            else
            {
                jTextFieldSearch.setEditable(false);
            }
       
       /*else
       {    //allow backspace 
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                   jTextFieldSearch.setEditable(true);
            }
            else
            {
                   jTextFieldSearch.setEditable(false);
            }
       }*/
                                            

      
       
    }//GEN-LAST:event_jTextFieldSearchKeyPressed

    private void jTextFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyReleased

    }//GEN-LAST:event_jTextFieldSearchKeyReleased

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed

        if(jTextFieldSearch.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter Flight Name","swing Tester",JOptionPane.WARNING_MESSAGE);
        }
        
        Function f=new Function();
        ResultSet rs=null;

        rs=f.find(jTextFieldSearch.getText());
        try
        {
                    while(rs.next())
                    {
                        String No=String.valueOf(rs.getInt("Flight_No"));
                        String Name=rs.getString("Flight_Name");
                        String Source=rs.getString("Source");
                        String Destination =rs.getString("Destination");
                        String Fare=rs.getString("Fare");
               

                        String tbData[]={No,Name,Source,Destination,Fare};
                        DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
                        tblModel.addRow(tbData);
                    }
                
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonSearchPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jButtonSearchPropertyChange
        jButtonSearch.setOpaque(false);
        jButtonSearch.setContentAreaFilled(false);
        jButtonSearch.setBorderPainted(false);
    }//GEN-LAST:event_jButtonSearchPropertyChange
    public void UpdateTable()
    {
        Connection con=null;
        ResultSet rs;
        PreparedStatement pst=null;
        
       /* try
        {
            con = DriverManager.getConnection("jdbc:mysql:///ams","root","");
            
            String No=String.valueOf(rs.getInt("Flight_No"));
            String Name=rs.getString("Flight_Name");
            String Source=rs.getString("Source");
            String Destination =rs.getString("Destination");
            String Fare=rs.getString("Fare");
                        
            String str="SELECT Flight_No as No,Flight_Name as Name,Source as Source,Destination as Destination, Fare as Fare";
            pst=con.prepareStatement(str);
            rs=pst.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTable1.removeColumn(jTable1.getColumnModel().getColumn(0));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }*/
    }
    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        Connection con=null;
      //  ResultSet rs=null;
        PreparedStatement pst=null;
        

        /*int p=JOptionPane.showConfirmDialog(null, "Do you really want to delete","Delete",JOptionPane.YES_NO_OPTION);
        if(p==0){

            String sql="delete from flight where Flight_No=?";
            try{
                con = DriverManager.getConnection("jdbc:mysql:///ams","root","");
                ps=con.prepareStatement(sql);
                ps.setString(1,jTextFieldSearch.getText());
                ps.execute();
                JOptionPane.showMessageDialog(null, "Record Deleted Successfully");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
            //Update_table();*/
            /* DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
                 int SelectedRowIndex=jTable1.getSelectedRow();
                 model.removeRow(SelectedRowIndex);*/
                 
             int row=jTable1.getSelectedRow();
             String id=jTable1.getModel().getValueAt(row,0).toString();
             try
             {
                 con = DriverManager.getConnection("jdbc:mysql:///ams","root","");
                 String qry="DELETE FROM flight WHERE Flight_No='"+id+"'";
                 pst=con.prepareStatement(qry);
                 pst.execute();
                 
                 //for delete row from jable
                 int[] rows=jTable1.getSelectedRows();
                 model =(DefaultTableModel)jTable1.getModel();
                 for(int rowa : rows)
                 {
                     model.removeRow(jTable1.convertRowIndexToModel(row));
                 }
                 jTable1.clearSelection();
                 
                 
                 JOptionPane.showMessageDialog(null,"Flight Deleted Successfully...");
                 
                 
                 UpdateTable();
             }
             catch(Exception e)
             {
                 JOptionPane.showMessageDialog(null,e);
             }
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jButtonRemovePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jButtonRemovePropertyChange
        jButtonRemove.setOpaque(false);
        jButtonRemove.setContentAreaFilled(false);
       
    }//GEN-LAST:event_jButtonRemovePropertyChange

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        
        AdminMenu1 a= new AdminMenu1();
        a.setVisible(true);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonCancelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jButtonCancelPropertyChange
        jButtonCancel.setOpaque(false);
        jButtonCancel.setContentAreaFilled(false);
        
    }//GEN-LAST:event_jButtonCancelPropertyChange
public class Function
{
       Connection con=null;
       ResultSet rs=null;
       PreparedStatement ps=null;

        public ResultSet find(String s)
        {
                try
                {
                        con = DriverManager.getConnection("jdbc:mysql:///ams","root","");  
                         ps=con.prepareStatement("select * from flight where Flight_Name = ?");
                         ps.setString(1,s);
                        rs=ps.executeQuery();
                }
                catch(Exception ex)
                {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                return rs;
        }
        
}
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
            java.util.logging.Logger.getLogger(RemoveFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveFlight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
