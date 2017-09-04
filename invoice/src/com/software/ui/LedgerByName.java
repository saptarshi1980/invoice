/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LedgerByName.java
 *
 * Created on Aug 29, 2017, 7:34:47 PM
 */
package com.software.ui;

import java.sql.*;
import com.software.utility.ConnDB;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.software.utility.ConnDB;
import com.software.utility.SoftUtil;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRTextExporter;
import net.sf.jasperreports.engine.export.JRTextExporterParameter;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author saptarshi
 */
public class LedgerByName extends javax.swing.JFrame {

    /** Creates new form LedgerByName */
    public LedgerByName() {
        initComponents();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    
    public String reportFile=null;

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(invoice.InvoiceApp.class).getContext().getResourceMap(LedgerByName.class);
        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setForeground(resourceMap.getColor("jPanel1.foreground")); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELLER", "BUYER" }));
        jComboBox1.setFocusCycleRoot(true);
        jComboBox1.setName("jComboBox1"); // NOI18N
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBox1FocusGained(evt);
            }
        });
        jComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jComboBox1KeyTyped(evt);
            }
        });

        jLabel3.setFont(resourceMap.getFont("jLabel3.font")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jComboBox2.setName("jComboBox2"); // NOI18N
        jComboBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox2MouseClicked(evt);
            }
        });
        jComboBox2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jComboBox2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusGained
        jComboBox2.removeAllItems();
    }//GEN-LAST:event_jComboBox1FocusGained

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1KeyTyped
         char c = evt.getKeyChar();

       if ((c == evt.VK_ENTER)) {
                jComboBox2.removeAllItems();
                findName();
             }
        
        
    }//GEN-LAST:event_jComboBox1KeyTyped

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        generateReport();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jComboBox2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox2KeyTyped
        char c = evt.getKeyChar();

       if ((c == evt.VK_ENTER)) {
                jButton1.requestFocus();
                
             }
    }//GEN-LAST:event_jComboBox2KeyTyped

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        generateReport();
    }//GEN-LAST:event_jButton1KeyPressed

    private void jComboBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox2MouseClicked
        findName();
    }//GEN-LAST:event_jComboBox2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new LedgerByName().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    
    
    public void findName(){
        
        String bs=jComboBox1.getSelectedItem().toString();
        
        if(bs.equals("SELLER")){
         String query1="select distinct(seller_name) from v_all_creditor";
         this.reportFile="c:/invoice/reports/sellerLedger.jasper";
         try{
        Connection conn=new ConnDB().make_connection();
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery(query1);
        int counter=0;
        while(rs.next()){
            jComboBox2.addItem(rs.getString(1));
            counter++;
        }
        
        if(counter>0){
         jComboBox2.requestFocus();   
        }
        
        
  }catch(SQLException ex){
        
        JOptionPane.showMessageDialog(this, "Error loading Company Code! ");
        ex.printStackTrace();
    }
            
        
    }else{
            String query2="select distinct(client_name) from v_all_debtor";
            this.reportFile="c:/invoice/reports/buyerLedger.jasper";
            try{
        Connection conn=new ConnDB().make_connection();
        Statement stmt1=conn.createStatement();
        ResultSet rs1=stmt1.executeQuery(query2);
        
        while(rs1.next()){
            jComboBox2.addItem(rs1.getString(1));
        }
        
        
  }catch(SQLException ex){
        
        JOptionPane.showMessageDialog(this, "Error loading Company Code! ");
        ex.printStackTrace();
    }
         
            
            
        }

}
    
    
    public void generateReport(){
        
        String name=jComboBox2.getSelectedItem().toString().trim().toUpperCase();
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("name",name);
   
        

try
{
           try{
                
                Connection conn = new ConnDB().make_connection(); 
                JasperPrint jasperPrint =
                JasperFillManager.fillReport(
                this.reportFile,params,conn);
                JasperViewer.viewReport(jasperPrint,false);
              }catch(JRException ex){
                     ex.printStackTrace();
                    }
}
catch (Exception ex)
{
   ex.printStackTrace();
   

}
        
    }
}
