/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package home;

import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author PC
 */
public class admin extends javax.swing.JFrame {
DefaultTableModel model123;
DefaultTableModel model122;
DefaultTableModel model222;
DefaultTableModel model00;
    /**
     * Creates new form admin
     */
    public admin() {
        initComponents();
        fillTable();
         fillTable1();
         updateCombo();
    }

    
    public void fillTable(){
       try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/downpayment_final","root","");
                   String sql12 = "SELECT * FROM downpayment_final_table";
                   PreparedStatement pr112 = conn.prepareStatement(sql12);
                   ResultSet ze11 = pr112.executeQuery();
                   
                   while(ze11.next()){
                       //String aton1 = ze11.getString("id");
                       String aton2 = ze11.getString("name");
                       String aton3 = ze11.getString("item");
                       String aton4 = ze11.getString("started");
                       String aton5 = ze11.getString("orig");
                       String aton6 = ze11.getString("down");
                       
                       String choice11 = ze11.getString("monthsToPay");
                       String aton7 = ze11.getString("total");
                       String aton8 = ze11.getString("permonth");
                       String aton9 = ze11.getString("15days");
                      
                       String aton11 = ze11.getString("date_paid1");
                       String aton12 = ze11.getString("amount_1");
                        String aton10 = ze11.getString("remarks");
                         
                       Object[] obj = {aton2,aton3,aton4,aton5,aton6,choice11, aton7,aton8,aton9,aton11,aton12, aton10};
                       
                       
                       model00 = (DefaultTableModel)jTable1.getModel();
                       model00.addRow(obj);
                   }     
        }catch(Exception e){
                System.out.println(e.getMessage());
            }
    }

      public void fillTable1(){
       try { 
           
           
             try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/downpayment_final","root","");
                   String sql12 = "SELECT * FROM downpayment_final_table";
                   PreparedStatement pr112 = conn.prepareStatement(sql12);
                   ResultSet ze11 = pr112.executeQuery();
                   
                   while(ze11.next()){
                       //String aton1 = ze11.getString("id");
                       String aton2 = ze11.getString("name");
                       String aton3 = ze11.getString("item");
                       String aton4 = ze11.getString("started");
                       String aton5 = ze11.getString("orig");
                       String aton6 = ze11.getString("down");
                       
                       String choice11 = ze11.getString("monthsToPay");
                       String aton7 = ze11.getString("total");
                       String aton8 = ze11.getString("permonth");
                       String aton9 = ze11.getString("15days");
                      
                       String aton11 = ze11.getString("date_paid1");
                       String aton12 = ze11.getString("amount_1");
                        String aton10 = ze11.getString("remarks");
                         
                       Object[] obj = {aton2,aton3,aton4,aton5,aton6,choice11, aton7,aton8,aton9,aton11,aton12, aton10};
                       
                       
                       model00 = (DefaultTableModel)jTable2.getModel();
                       model00.addRow(obj);
                   }     
        }catch(Exception e){
                System.out.println(e.getMessage());
            }
           
           
           
            Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bayad_binulan","root","");
                   String sql12 = "SELECT * FROM bayad_tracker";
                   PreparedStatement pr112 = conn.prepareStatement(sql12);
                   ResultSet ze111 = pr112.executeQuery();
                   
                   while(ze111.next()){
                       //String aton1 = ze11.getString("id");
                       String aton21 = ze111.getString("name1");
                       String aton31 = ze111.getString("item1");
                       String aton41 = ze111.getString("date1");
                       String aton51 = ze111.getString("orig1");
                       String aton61 = ze111.getString("down1");
                       
                       String choice111 = ze111.getString("monthstopay1");
                       String aton71 = ze111.getString("total1");
                       String aton81 = ze111.getString("per1");
                       String aton91 = ze111.getString("15days1");
                      
                       String aton111 = ze111.getString("datepaid1");
                       String aton121 = ze111.getString("amount1");
                        String aton101 = ze111.getString("remarks1");
                         
                       Object[] obj = {aton21,aton31,aton41,aton51,aton61,choice111, aton71,aton81,aton91,aton111,aton121, aton101};
                       
                    
                       model00 = (DefaultTableModel)jTable2.getModel();
                        model00.addRow(obj);
                   }     
        }catch(Exception e){
                System.out.println(e.getMessage());
            }
    }

    private void updateCombo(){
        
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/downpayment_final","root","");
                   String sql12 = "SELECT * FROM downpayment_final_table";
                   PreparedStatement pr112 = conn.prepareStatement(sql12);
                   ResultSet ze11 = pr112.executeQuery();
                   
                   while(ze11.next()){
                      // String aton1 = ze11.getString("id");
                       String aton2 = ze11.getString("name");
                       jComboBox1.addItem(ze11.getString("name"));
                       
                       
                      
                   }     
        }catch(Exception e){
                System.out.println(e.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        montly = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        down = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        j1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        j2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        j4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        j5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        j6 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        j7 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        j8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        j9 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        j10 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        j11 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        j12 = new javax.swing.JTextField();
        date_chooser = new com.toedter.calendar.JDateChooser();
        create_monthly = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        amount_dis = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        remarks_dis = new javax.swing.JTextField();
        create1 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        qwe_date = new com.toedter.calendar.JDateChooser();
        q2 = new javax.swing.JTextField();
        q1 = new javax.swing.JTextField();
        q3 = new javax.swing.JTextField();
        q4 = new javax.swing.JTextField();
        q5 = new javax.swing.JTextField();
        q6 = new javax.swing.JTextField();
        q7 = new javax.swing.JTextField();
        q8 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        SEARCH = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        name_check = new javax.swing.JTextField();
        check_balance = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        container1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 800));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/javapics/logout_rounded_up_35px.png"))); // NOI18N
        jButton1.setText("LOGOUT");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jButton1)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/javapics/add_35px.png"))); // NOI18N

        montly.setBackground(new java.awt.Color(51, 51, 51));
        montly.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        montly.setForeground(new java.awt.Color(153, 153, 153));
        montly.setText("Monthly Pay");
        montly.setBorder(null);
        montly.setBorderPainted(false);
        montly.setFocusPainted(false);
        montly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montlyActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/javapics/add_35px.png"))); // NOI18N

        down.setBackground(new java.awt.Color(51, 51, 51));
        down.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        down.setForeground(new java.awt.Color(153, 153, 153));
        down.setText("Down Payment");
        down.setBorderPainted(false);
        down.setFocusPainted(false);
        down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(down, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(montly, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(down, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(montly, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 0, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(2000, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/javapics/menu_rounded_48px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("l");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Boulevard Credit");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/javapics/11.png"))); // NOI18N
        jLabel4.setText("Hello, Admin");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("WELCOME TO SECRET SHOP");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(598, 598, 598)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(820, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(809, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab1", jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));

        jTable1.setBackground(new java.awt.Color(153, 153, 153));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "ITEM DESCRIPTION", "DATE STARTED", "ORIGINAL PRICE", "DOWNPAYMENT", "MONTHS TO PAY", "TOTAL PRICE", "PER MONTH", "15 DAYS DUE", "DATE PAID", "AMOUNT", "REMARKS"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel9.setFont(new java.awt.Font("Swis721 Blk BT", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DOWNPAYMENTS");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NAME: ");

        j1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        j1.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ITEM DESCRIPTION:");

        j2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        j2.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DATE STARTED:");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ORIGINAL PRICE:");

        j4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        j4.setBorder(null);

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("DOWNPAYMENT:");

        j5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        j5.setBorder(null);

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("MONTHS TO PAY:");

        j6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        j6.setBorder(null);
        j6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j6KeyReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("TOTAL PRICE:");

        j7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        j7.setBorder(null);

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("PER MONTH:");

        j8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        j8.setBorder(null);

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("15 DAYS DUE:");

        j9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        j9.setBorder(null);

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("DATE PAID:");

        j10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        j10.setText("0");
        j10.setBorder(null);

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("AMOUNT:");

        j11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        j11.setText("0");
        j11.setBorder(null);

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("REMARKS:");

        j12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        j12.setText("ON_GOING");
        j12.setBorder(null);

        create_monthly.setBackground(new java.awt.Color(153, 0, 0));
        create_monthly.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        create_monthly.setForeground(new java.awt.Color(255, 255, 255));
        create_monthly.setText("CREATE");
        create_monthly.setBorderPainted(false);
        create_monthly.setFocusPainted(false);
        create_monthly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_monthlyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(date_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(18, 18, 18)
                            .addComponent(j5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(18, 18, 18)
                            .addComponent(j6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(18, 18, 18)
                            .addComponent(j7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(j4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(j10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addGap(18, 18, 18)
                            .addComponent(j11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(create_monthly, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(j12, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 911, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(date_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(j4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(j5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(j6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(j7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(j8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(j9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(j10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(j11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(j12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(create_monthly)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab2", jPanel5);

        jPanel7.setBackground(new java.awt.Color(0, 51, 51));

        jTable2.setBackground(new java.awt.Color(153, 153, 153));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "ITEM DESCRIPTION", "DATE STARTED", "ORIGINAL PRICE", "DOWNPAYMENT", "MONTHS TO PAY", "TOTAL PRICE", "PER MONTH", "15 DAYS DUE", "DATE PAID", "AMOUNT", "REMARKS"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel20.setFont(new java.awt.Font("Swis721 Blk BT", 1, 48)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("MONTHLY PAYMENTS TRACKER");

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("DATE PAID:");

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("AMOUNT:");

        amount_dis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amount_dis.setBorder(null);

        jLabel25.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("REMARKS:");

        jLabel26.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("NAME: ");

        remarks_dis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        remarks_dis.setText("ON_GOING");
        remarks_dis.setBorder(null);

        create1.setBackground(new java.awt.Color(153, 0, 0));
        create1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        create1.setForeground(new java.awt.Color(255, 255, 255));
        create1.setText("DONE");
        create1.setBorderPainted(false);
        create1.setFocusPainted(false);
        create1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create1ActionPerformed(evt);
            }
        });

        jLabel30.setBackground(new java.awt.Color(0, 51, 51));
        jLabel30.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 51, 51));
        jLabel30.setText("DOWNPAYMENT:");

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        q2.setBackground(new java.awt.Color(0, 51, 51));
        q2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        q2.setForeground(new java.awt.Color(0, 51, 51));
        q2.setText("0");
        q2.setBorder(null);

        q1.setBackground(new java.awt.Color(0, 51, 51));
        q1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        q1.setForeground(new java.awt.Color(0, 51, 51));
        q1.setText("null");
        q1.setBorder(null);

        q3.setBackground(new java.awt.Color(0, 51, 51));
        q3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        q3.setForeground(new java.awt.Color(0, 51, 51));
        q3.setText("0");
        q3.setBorder(null);

        q4.setBackground(new java.awt.Color(0, 51, 51));
        q4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        q4.setForeground(new java.awt.Color(0, 51, 51));
        q4.setText("0");
        q4.setBorder(null);

        q5.setBackground(new java.awt.Color(0, 51, 51));
        q5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        q5.setForeground(new java.awt.Color(0, 51, 51));
        q5.setText("0");
        q5.setBorder(null);

        q6.setBackground(new java.awt.Color(0, 51, 51));
        q6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        q6.setForeground(new java.awt.Color(0, 51, 51));
        q6.setText("0");
        q6.setBorder(null);

        q7.setBackground(new java.awt.Color(0, 51, 51));
        q7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        q7.setForeground(new java.awt.Color(0, 51, 51));
        q7.setText("0");
        q7.setBorder(null);

        q8.setBackground(new java.awt.Color(0, 51, 51));
        q8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        q8.setForeground(new java.awt.Color(0, 51, 51));
        q8.setText("0");
        q8.setBorder(null);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("SEARCH:");

        SEARCH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SEARCH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SEARCHKeyReleased(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("NAME: ");

        name_check.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name_check.setBorder(null);

        check_balance.setBackground(new java.awt.Color(153, 0, 0));
        check_balance.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        check_balance.setForeground(new java.awt.Color(255, 255, 255));
        check_balance.setText("CHECK BALANCE");
        check_balance.setBorderPainted(false);
        check_balance.setFocusPainted(false);
        check_balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_balanceActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("REMAINING BALANCE:");

        container1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton2.setBackground(new java.awt.Color(255, 204, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("PRINT RECIEPT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(593, 593, 593)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(18, 18, 18)
                                .addComponent(qwe_date, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(18, 18, 18)
                                .addComponent(amount_dis, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel28))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(container1)
                                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(check_balance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(name_check, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6))
                                    .addComponent(remarks_dis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(create1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(193, 193, 193)
                            .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(q7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(q8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1063, 1063, 1063))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1479, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(79, 79, 79)))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(SEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel26)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel23)
                                .addComponent(qwe_date, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel24)
                                .addComponent(amount_dis, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel25)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(remarks_dis, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(create1)))
                            .addGap(138, 138, 138)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel27)
                                .addComponent(name_check, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(4, 4, 4)
                            .addComponent(check_balance, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel28)
                                .addComponent(container1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jTabbedPane2.addTab("tab3", jPanel7);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 2275, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1162, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      dispose();
        welcome m = new welcome();
        m.show();

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void downActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downActionPerformed
            jTabbedPane2.setSelectedIndex(1);

        // TODO add your handling code here:
    }//GEN-LAST:event_downActionPerformed

    private void montlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montlyActionPerformed
             jTabbedPane2.setSelectedIndex(2);


        // TODO add your handling code here:
    }//GEN-LAST:event_montlyActionPerformed

    private void SEARCHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SEARCHKeyReleased

        model222 = (DefaultTableModel)jTable2.getModel();
        TableRowSorter<DefaultTableModel>trs = new TableRowSorter<>(model222);
        jTable2.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(SEARCH.getText()));
        
        

        String name = SEARCH.getText();

        name_check.setText(name);

        // TODO add your handling code here:
    }//GEN-LAST:event_SEARCHKeyReleased

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void create1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create1ActionPerformed

        try{
            SimpleDateFormat sdf  = new SimpleDateFormat ("yyyy-MM-dd");
            String date1 = sdf.format(qwe_date.getDate());
            Connection conn1234;
            PreparedStatement insert991;

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn1234 = DriverManager.getConnection("jdbc:mysql://localhost:3306/montly_pays","root","");
            insert991 = conn1234.prepareStatement("INSERT INTO monthly_final_table( `name1`, item1, date1, orig1, down1,`monthstopay1`, total1, per1, 15days1,  datepaid1, amount1,remarks1) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            String cmb = jComboBox1.getSelectedItem().toString();

            insert991.setString(1,cmb);
            insert991.setString(2,q1.getText());
            insert991.setString(3,q2.getText());
            insert991.setString(4,q3.getText());
            insert991.setString(5,q4.getText());
            insert991.setString(6,q5.getText());
            insert991.setString(7,q6.getText());
            insert991.setString(8,q7.getText());
            insert991.setString(9,q8.getText());

            insert991.setString(10,date1);
            insert991.setString(11,amount_dis.getText());

            insert991.setString(12,remarks_dis.getText());

            insert991.executeUpdate();
            String data[] = {cmb, q1.getText(), q2.getText(), q3.getText() ,q4.getText(),q5.getText() ,
                q6.getText(), q7.getText(),q8.getText(), date1,amount_dis.getText(),remarks_dis.getText()};
            DefaultTableModel tb1model1 = (DefaultTableModel)jTable2.getModel();
            tb1model1.addRow(data);
        }catch (Exception ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_create1ActionPerformed

    private void create_monthlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_monthlyActionPerformed

        

        if (j1.getText().equals("") || j2.getText().equals("") ||
            j4.getText().equals("") || j5.getText().equals("") ||
            j9.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Please Enter All Data!");
        }else {
            try{
                SimpleDateFormat sdf  = new SimpleDateFormat ("yyyy-MM-dd");
                String date = sdf.format(date_chooser.getDate());
                Connection conn123;
                PreparedStatement insert9;

                Class.forName("com.mysql.cj.jdbc.Driver");
                conn123 = DriverManager.getConnection("jdbc:mysql://localhost:3306/downpayment_final","root","");
                insert9 = conn123.prepareStatement("INSERT INTO downpayment_final_table( `name`, item, started, orig, down,`monthsToPay`, total, permonth, 15days, date_paid1, amount_1,remarks) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");

                insert9.setString(1,j1.getText());
                insert9.setString(2,j2.getText());
                insert9.setString(3,date);
                insert9.setString(4,j4.getText());
                insert9.setString(5,j5.getText());
                insert9.setString(6,j6.getText());
                insert9.setString(7,j7.getText());
                insert9.setString(8,j8.getText());
                insert9.setString(9,j9.getText());
                insert9.setString(10,j10.getText());
                insert9.setString(11,j11.getText());
                insert9.setString(12,j12.getText());

                insert9.executeUpdate();
                String data[] = {j1.getText(), j2.getText(), date, j4.getText() ,j5.getText(),j6.getText() ,j7.getText(), j8.getText(),  j9.getText(),j10.getText(),j11.getText(),j12.getText()};
                DefaultTableModel tb1model = (DefaultTableModel)jTable1.getModel();
                tb1model.addRow(data);
            }catch (Exception ex) {
                Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_create_monthlyActionPerformed

    private void j6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j6KeyReleased
        String a1, a2;
        int c,d,total,permonth,kinsinas, store, divider;
        float decimal = (float) 0.05;
        //a1 = j4.getText();
        //a2 = j5.getText();

        //j6.setText(a1+a2);

        int orig = Integer.parseInt (j4.getText());
        int down = Integer.parseInt (j5.getText());
        int choice1 = Integer.parseInt (j6.getText());

        c = (int) (orig * decimal);
        d = c * choice1 ;
        total = d + orig;
        store = total - down;
        divider = choice1 * 2;

        permonth = store /choice1;
        kinsinas = store /divider;
        j7.setText(" "+total);
        j8.setText(" "+permonth);
        j9.setText(" "+kinsinas);

        j7.setEditable(false);
        j8.setEditable(false);
        j9.setEditable(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_j6KeyReleased

    private void check_balanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_balanceActionPerformed
           int numrow = jTable2.getRowCount();
         double tot1=0;
         double tot2=0;
        double tot=0;
    
        for (int i=0; i < numrow; i++){
            double val = Double.valueOf(jTable2.getValueAt(i,10).toString());
            double val1 = Double.valueOf(jTable2.getValueAt(i,4).toString());
           
            tot+=val + val1;
           
          
        }
        
         for (int i=0; i < numrow; i++){
          
            double val2 = Double.valueOf(jTable2.getValueAt(i,6).toString());
            tot2 +=val2;
           
            
        }
        

             //double result_bal  = Integer.parseInt (container1.getText());
        tot1 = tot2- tot;
        
        //result_balance.setText(" "+ tot1);
        container1.setText("Php "+tot1);


        // TODO add your handling code here:
    }//GEN-LAST:event_check_balanceActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

             JOptionPane.showMessageDialog(null, " Under Maintenance~!");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SEARCH;
    private javax.swing.JTextField amount_dis;
    private javax.swing.JButton check_balance;
    private javax.swing.JTextField container1;
    private javax.swing.JButton create1;
    private javax.swing.JButton create_monthly;
    private com.toedter.calendar.JDateChooser date_chooser;
    private javax.swing.JButton down;
    private javax.swing.JTextField j1;
    private javax.swing.JTextField j10;
    private javax.swing.JTextField j11;
    private javax.swing.JTextField j12;
    private javax.swing.JTextField j2;
    private javax.swing.JTextField j4;
    private javax.swing.JTextField j5;
    private javax.swing.JTextField j6;
    private javax.swing.JTextField j7;
    private javax.swing.JTextField j8;
    private javax.swing.JTextField j9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton montly;
    private javax.swing.JTextField name_check;
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    private javax.swing.JTextField q3;
    private javax.swing.JTextField q4;
    private javax.swing.JTextField q5;
    private javax.swing.JTextField q6;
    private javax.swing.JTextField q7;
    private javax.swing.JTextField q8;
    private com.toedter.calendar.JDateChooser qwe_date;
    private javax.swing.JTextField remarks_dis;
    // End of variables declaration//GEN-END:variables
}
