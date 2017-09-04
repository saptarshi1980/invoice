/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SellerMAster.java
 *
 * Created on 6 Aug, 2017, 8:01:37 AM
 */
package com.software.ui;
import com.software.utility.ConnDB;
import com.software.utility.SoftUtil;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SAPTARSHI
 */
public class ReceiptEdit extends javax.swing.JFrame {

    /** Creates new form SellerMAster */
    public ReceiptEdit() {
        initComponents();
        loadCompanyCode();
        populateClientCode();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        jComboBox1.removeAllItems();
        jComboBox2.removeAllItems();
        populateClientCode();
        
        
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(invoice.InvoiceApp.class).getContext().getResourceMap(ReceiptEdit.class);
        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jTextField3.setText(resourceMap.getString("jTextField3.text")); // NOI18N
        jTextField3.setFocusCycleRoot(true);
        jTextField3.setName("jTextField3"); // NOI18N
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        jComboBox1.setFocusCycleRoot(true);
        jComboBox1.setName("jComboBox1"); // NOI18N
        jComboBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox1FocusLost(evt);
            }
        });
        jComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jComboBox1KeyTyped(evt);
            }
        });

        jComboBox2.setFocusCycleRoot(true);
        jComboBox2.setName("jComboBox2"); // NOI18N
        jComboBox2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox2FocusLost(evt);
            }
        });
        jComboBox2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jComboBox2KeyTyped(evt);
            }
        });

        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N

        jComboBox3.setFocusCycleRoot(true);
        jComboBox3.setName("jComboBox3"); // NOI18N
        jComboBox3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox3FocusLost(evt);
            }
        });
        jComboBox3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jComboBox3KeyTyped(evt);
            }
        });

        jComboBox5.setName("jComboBox5"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                        .addContainerGap(416, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(438, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jComboBox2, 0, 389, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jComboBox1, 0, 389, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addComponent(jComboBox3, 0, 389, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jButton1.setIcon(resourceMap.getIcon("jButton1.icon")); // NOI18N
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

        jPanel2.setBackground(resourceMap.getColor("jPanel2.background")); // NOI18N
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setName("jPanel2"); // NOI18N

        jLabel8.setFont(resourceMap.getFont("jLabel8.font")); // NOI18N
        jLabel8.setForeground(resourceMap.getColor("jLabel8.foreground")); // NOI18N
        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
       delete();
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        delete();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jComboBox1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1KeyTyped
        
        char c = evt.getKeyChar();

       if ((c == evt.VK_ENTER)) {
               //findInvoice();
               jComboBox2.requestFocus();
             }
    }//GEN-LAST:event_jComboBox1KeyTyped

    private void jComboBox2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox2KeyTyped
            char c = evt.getKeyChar();

       if ((c == evt.VK_ENTER)) {
               
           
                        //jTextField4.requestFocus();
             }    }//GEN-LAST:event_jComboBox2KeyTyped

    private void jComboBox2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox2FocusLost
        findInvAmt();
    }//GEN-LAST:event_jComboBox2FocusLost

    private void jComboBox1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusLost
           findInvoice();        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1FocusLost

    private void jComboBox3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox3FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3FocusLost

    private void jComboBox3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox3KeyTyped
        char c = evt.getKeyChar();

       if ((c == evt.VK_ENTER)) {
               jComboBox1.requestFocus();
             }
    }//GEN-LAST:event_jComboBox3KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        char c = evt.getKeyChar();

        if ((c == evt.VK_ENTER)) {
            //jTextField4.requestFocus();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ReceiptEdit().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    
    public void populateClientCode(){
    
    
    
    int counter=0;
    String query="SELECT TRIM(CONCAT(client_code,'(',client_name,')')) FROM client_master ";
    try{
        Connection conn=new ConnDB().make_connection();
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery(query);
        while(rs.next()){
            jComboBox1.addItem(rs.getString(1));
            
        }
        
        counter++;
        
  }catch(SQLException ex){
        
        JOptionPane.showMessageDialog(this, "Error loading Code! ");
        ex.printStackTrace();
    }
    
      
    
}
    
    
    public void findInvoice(){
        
        System.out.println();
        String clientCode=jComboBox1.getSelectedItem().toString().trim().substring(0,jComboBox1.getSelectedItem().toString().trim().indexOf('('));
        
        String query="SELECT invoice_no FROM bill_master WHERE buyer_code='"+clientCode+"' ";

        System.out.println(query);
        try{
        Connection conn=new ConnDB().make_connection();
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery(query);
        
        while(rs.next()){
            jComboBox2.addItem(rs.getString(1));
        }
        
        

  }catch(SQLException ex){
        
        JOptionPane.showMessageDialog(this, "Error loading Code! ");
        ex.printStackTrace();
    }
        
      
        
    }
    
    public void savePayment()
    {
        
        //SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        //String paymentDate = sdf.format(jDateChooser1.getDate());
        //String parentCode=jComboBox3.getSelectedItem().toString().substring(0,jComboBox3.getSelectedItem().toString().indexOf("("));
        String clientCode=jComboBox1.getSelectedItem().toString().trim().substring(0,jComboBox1.getSelectedItem().toString().trim().indexOf('('));
        String invoiceNumber=jComboBox2.getSelectedItem().toString();
        double invoiceAmt= Double.parseDouble(jTextField3.getText().trim());
        double paymentAmt=Double.parseDouble(jComboBox5.getSelectedItem().toString().trim());

        //double paymentAmt=Double.parseDouble(jTextField4.getText().trim());
//        if(paymentAmt==0){
//            JOptionPane.showMessageDialog(this, "Payment amount can not be zero!");
//            this.dispose();
//        }else{
//        //String paymentDate=jFormattedTextField1.getText().trim();
//        String reference=jTextField5.getText().toUpperCase().trim();
//        String paymentMode=jComboBox4.getSelectedItem().toString();
        //String query="insert into receipt(transaction_date,client_no,invoice_no,invoice_amt,payment_amt,reference,parent_code,insert_time,payment_mode) values(str_to_date('"+paymentDate+"','%d-%m-%Y'),'"+clientCode+"','"+invoiceNumber+"','"+invoiceAmt+"','"+paymentAmt+"','"+reference+"','"+parentCode+"',now(),'"+paymentMode+"')";
        String query="update receipt set delete_flag='Y' where invoice_no='"+invoiceNumber+"' and seller_no='"+clientCode+"' and payment_amt='"+paymentAmt+"'";
    try{
        Connection conn=new ConnDB().make_connection();
        Statement stmt=conn.createStatement();
        stmt.executeUpdate(query);
        
        this.dispose();
        new ReceiptEdit().setVisible(true);
        
  }catch(SQLException ex){
        
        JOptionPane.showMessageDialog(this, "Error loading Code! ");
        ex.printStackTrace();
    }
        
        
        
        }  
                
                
    

    private void findInvAmt() {
        
        String invoiceNo=jComboBox2.getSelectedItem().toString().trim();
        double totPayment=0,invAmt=0;
        String query="SELECT tot_amt FROM bill_master WHERE invoice_no='"+invoiceNo+"'";
         String query1="SELECT IFNULL(SUM(payment_amt),0) FROM receipt WHERE invoice_no='"+invoiceNo+"' and delete_flag!='Y'";
        try{
        Connection conn=new ConnDB().make_connection();
        Statement stmt=conn.createStatement();
        Statement stmt2=conn.createStatement();
        ResultSet rs=stmt.executeQuery(query);
        ResultSet rs1=stmt2.executeQuery(query1);
        
        while(rs.next()){
            invAmt=rs.getDouble(1);
            jTextField3.setText(String.valueOf(invAmt));
        }
        
        while(rs1.next()){
           jComboBox5.addItem(rs1.getDouble(1));
        }
        
       // jTextField6.setText(String.valueOf(invAmt-totPayment));

        }catch(SQLException ex){
            ex.printStackTrace();
        }
  
}
    
    public void loadCompanyCode(){

    
    String query="select concat(com_id,'(',com_name,')') from company_master";
    ArrayList<String> tax=new ArrayList<String>();
    try{
        Connection conn=new ConnDB().make_connection();
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery(query);
        while(rs.next()){
            tax.add(rs.getString(1));
        }
        jComboBox3.removeAllItems();
        for(String taxCode:tax){
        jComboBox3.addItem(taxCode);
        }
        
  }catch(SQLException ex){
        
        JOptionPane.showMessageDialog(this, "Error loading Company Code! ");
        ex.printStackTrace();
    }

    
    
}
    
    public void delete(){
    
    String invoiceNo=jComboBox2.getSelectedItem().toString().trim();
    String sellerCode=jComboBox1.getSelectedItem().toString().trim().substring(0,jComboBox1.getSelectedItem().toString().trim().indexOf('('));
    double paymentAmt=Double.parseDouble(jComboBox5.getSelectedItem().toString().trim());
    
    String query="update receipt set delete_flag='Y' where invoice_no='"+invoiceNo+"' and client_no='"+sellerCode+"' and payment_amt='"+paymentAmt+"'";
   
    try{
        Connection conn=new ConnDB().make_connection();
        Statement stmt=conn.createStatement();
        stmt.executeUpdate(query);
        JOptionPane.showMessageDialog(this, "Receipt Info deleted");
        this.dispose();
        new ReceiptEdit().setVisible(true);
        
  }catch(SQLException ex){
        
        JOptionPane.showMessageDialog(this, "Error!! ");
        ex.printStackTrace();
    }
    
    
    
}

    
    
    
}