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
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import com.software.utility.ConnDB;
import com.software.utility.DateUtil;
import com.software.utility.SoftUtil;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author SAPTARSHI
 */
public class SellerMasterEdit extends javax.swing.JFrame {
    
    public String gst="   ";
    public String gstState="  ";
    ArrayList<String>seller=new ArrayList<String>();
    

    /** Creates new form SellerMAster */
    public SellerMasterEdit() {
        initComponents();
        //populateSellerCode();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.seller=loadSeller();
        jTextField5.addKeyListener(new KeyAdapter() {
        public void keyTyped(KeyEvent e) {
          char c = e.getKeyChar();
          
          if (!((c >= '0') && (c <= '9') ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            e.consume();
          }
        }
      });
        jTextField4.addKeyListener(new KeyAdapter() {
        public void keyTyped(KeyEvent e) {
          char c = e.getKeyChar();
          
          if (!((c >= '0') && (c <= '9') ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            e.consume();
          }
        }
      });
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
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(invoice.InvoiceApp.class).getContext().getResourceMap(SellerMasterEdit.class);
        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jTextField1.setText(resourceMap.getString("jTextField1.text")); // NOI18N
        jTextField1.setFocusCycleRoot(true);
        jTextField1.setName("jTextField1"); // NOI18N
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel2.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jTextField2.setText(resourceMap.getString("jTextField2.text")); // NOI18N
        jTextField2.setFocusCycleRoot(true);
        jTextField2.setName("jTextField2"); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jLabel3.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
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

        jLabel4.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        jTextField4.setText(resourceMap.getString("jTextField4.text")); // NOI18N
        jTextField4.setFocusCycleRoot(true);
        jTextField4.setName("jTextField4"); // NOI18N
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jLabel5.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        jTextField5.setText(resourceMap.getString("jTextField5.text")); // NOI18N
        jTextField5.setFocusCycleRoot(true);
        jTextField5.setName("jTextField5"); // NOI18N
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jLabel6.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        jTextField6.setText(resourceMap.getString("jTextField6.text")); // NOI18N
        jTextField6.setFocusCycleRoot(true);
        jTextField6.setName("jTextField6"); // NOI18N
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });

        jLabel8.setFont(resourceMap.getFont("jLabel8.font")); // NOI18N
        jLabel8.setForeground(resourceMap.getColor("jLabel8.foreground")); // NOI18N
        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N

        jComboBox1.setName("jComboBox1"); // NOI18N
        jComboBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox1FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField2)
                        .addGap(133, 133, 133))
                    .addComponent(jTextField4)
                    .addComponent(jTextField5)
                    .addComponent(jTextField6)
                    .addComponent(jTextField3)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jButton1.setFont(resourceMap.getFont("jButton1.font")); // NOI18N
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

        jLabel7.setFont(resourceMap.getFont("jLabel7.font")); // NOI18N
        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(162, 162, 162))
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
         char c = evt.getKeyChar();

       if ((c == evt.VK_ENTER)) {
               jTextField3.requestFocus();
             }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
         char c = evt.getKeyChar();

       if ((c == evt.VK_ENTER)) {
               jTextField4.requestFocus();
             }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
         char c = evt.getKeyChar();

       if ((c == evt.VK_ENTER)) {
               jTextField5.requestFocus();
             }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
         char c = evt.getKeyChar();

       if ((c == evt.VK_ENTER)) {
               jTextField6.requestFocus();
             }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
         char c = evt.getKeyChar();

       if ((c == evt.VK_ENTER)) {
               if(jTextField6.getText().length()>16){
                        JOptionPane.showMessageDialog(this, "GST Number can not be more than 16 letters! ");
                    }else{
           
                    jButton1.requestFocus();
                    }
             }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        sellerDetails();
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        sellerDetails();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_F1){
          viewReport();
           
       }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c = evt.getKeyChar();

       if ((c == evt.VK_ENTER)) {
               fetchSellerInfo();
             }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        jComboBox1.removeAllItems();
        String name=jTextField1.getText().toUpperCase();
        System.out.println(name);
        List <String> listClone = new ArrayList<String>(); 
           for (String string : this.seller) {
               System.out.println("String-"+string);
               System.out.println("index of (-"+string.indexOf("("));
               int index=string.indexOf("(")+1;
               String search=string.substring(index,index+2);
               System.out.println("Search-"+search);
               System.out.println("AL Value-"+search);
               if(search.startsWith(name)){
                   listClone.add(string);
                   System.out.println("yahoo");
               }
               System.out.println(string);
           }
           
          
        for (String string : listClone) {
               jComboBox1.addItem(string);
               
           }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jComboBox1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusLost
        fetchSellerInfo();
    }//GEN-LAST:event_jComboBox1FocusLost

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        fetchSellerInfo();
    }//GEN-LAST:event_jTextField1FocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SellerMasterEdit().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

    
    public void populateSellerCode(){
    
    
    
    int counter=0;
    String query="select count(*) from seller_master ";
    try{
        Connection conn=new ConnDB().make_connection();
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery(query);
        while(rs.next()){
            counter=rs.getInt(1);
        }
        
        counter++;
        
  }catch(SQLException ex){
        
        JOptionPane.showMessageDialog(this, "Error loading Code! ");
        ex.printStackTrace();
    }
    
      
    jTextField1.setText(String.format("%03d", counter));
    jTextField2.requestFocus();
}
    
    
    public void sellerDetails(){
        if(!verifyFields()){
            JOptionPane.showMessageDialog(this, "Please fill up the information proeperly. ");
        }
        else{
        String sellerCode=jComboBox1.getSelectedItem().toString().substring(0,jComboBox1.getSelectedItem().toString().indexOf("("));
        String sellerName=jTextField2.getText().trim().toUpperCase();
        String address=jTextField3.getText().trim().toUpperCase();
        String phone=jTextField4.getText().trim().toUpperCase();
        String mobile=jTextField5.getText().trim().toUpperCase();
        
        try{
        this.gst=jTextField6.getText().trim().toUpperCase();
        this.gstState=jTextField6.getText().trim().toUpperCase().substring(0,1);
        }catch(NullPointerException ex){
             ex.printStackTrace();
                
         }
    
        String query="update seller_master set seller_name='"+sellerName+"',seller_address='"+address+"',seller_phone='"+phone+"',seller_mobile='"+mobile+"',seller_gst='"+this.gst+"',state_code='"+this.gstState+"' where seller_code='"+sellerCode+"' ";
               
        
        try{
        Connection conn=new ConnDB().make_connection();
        Statement stmt=conn.createStatement();
        stmt.executeUpdate(query);
        JOptionPane.showMessageDialog(this, "Seller Updated ");
        this.dispose();
        new SellerMasterEdit().setVisible(true);
  }catch(SQLException ex){
        
        JOptionPane.showMessageDialog(this, "Error loading Code! ");
        ex.printStackTrace();
    }
        
        
        }
    }
    
    
    
    public boolean verifyFields(){
        
        String sellerCode=jComboBox1.getSelectedItem().toString().substring(0,jComboBox1.getSelectedItem().toString().indexOf("("));
        String sellerName=jTextField2.getText().trim().toUpperCase();
        String address=jTextField3.getText().trim().toUpperCase();
        String phone=jTextField4.getText().trim().toUpperCase();
        String mobile=jTextField5.getText().trim().toUpperCase();
        String gst=jTextField6.getText().trim().toUpperCase();
        String gstState=jTextField6.getText().trim().toUpperCase().substring(0,1);
        
        if(sellerCode.trim().length()>0 && sellerName.trim().length()>1 && address.trim().length()>1 && mobile.trim().length()==10)
            return true;
        else return false;
        
        
    }
    
    private void viewReport() {
        
           String sellerCode=jTextField1.getText().trim().toString();
           //String reportSource = "rptInvoice1.jasper";
            String reportSource = "c://invoice//reports//seller.jasper";
            Map<String, Object> params = new HashMap<String, Object>();
            
   try
        {
           try{
                
                Connection conn = new ConnDB().make_connection(); 
                JasperPrint jasperPrint =
                JasperFillManager.fillReport(
                reportSource,params,conn);
                JasperViewer.viewReport(jasperPrint,false);
              }catch(JRException ex){
                     ex.printStackTrace();
                    }
        }catch (Exception ex)
        {
           ex.printStackTrace();


        }
    }

public void fetchSellerInfo(){
    String sellerCode=jComboBox1.getSelectedItem().toString().substring(0,jComboBox1.getSelectedItem().toString().indexOf("("));
    String query="SELECT * FROM seller_master WHERE seller_code='"+sellerCode+"'";
    Connection conn = new ConnDB().make_connection(); 
    int counter=0;
    try{
    Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery(query);
        while(rs.next()){
            jTextField2.setText(rs.getString("seller_name"));
            jTextField3.setText(rs.getString("seller_address"));
            jTextField4.setText(rs.getString("seller_phone"));
            jTextField5.setText(rs.getString("seller_mobile"));
            jTextField6.setText(rs.getString("seller_gst"));
            jTextField2.requestFocus();
        }
        
        
        
  }catch(SQLException ex){
        
        JOptionPane.showMessageDialog(this, "Error loading Code! ");
        ex.printStackTrace();
    }
}

public ArrayList<String> loadSeller(){
    
    String query="SELECT CONCAT(seller_code,'(',seller_name,')') FROM seller_master ORDER BY reg_date desc";
    ArrayList<String>alParty=new ArrayList<String>();
    try{
        Connection conn=new ConnDB().make_connection();
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery(query);
        while(rs.next()){
            alParty.add(rs.getString(1));
            System.out.println("insdie al");
        }
        
        
        
  }catch(SQLException ex){
        
        JOptionPane.showMessageDialog(this, "Error loading Company Code! ");
        ex.printStackTrace();
    }
    
    return alParty;
}
}
