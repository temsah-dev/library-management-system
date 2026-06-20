package loginandsingup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import loginandsingup.*;

public class UserSettings extends javax.swing.JFrame {

    private String id;

    public UserSettings() {
        initComponents();
    }
    //now
    public UserSettings(String id) {
        initComponents();
        this.id = id;
        String book1,book2,book3;
        try {
            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            String sql = "SELECT * FROM user WHERE id=" + id;

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                fullNameL.setText(rs.getString("fullName"));
                idL.setText(rs.getString("id"));
                emailL.setText(rs.getString("email"));
                book1=rs.getString("Book_Loan_ID_1");
                book2=rs.getString("Book_Loan_ID_2");
                book3=rs.getString("Book_Loan_ID_3");
                
            }
            con.close();

        } catch (Exception e) {
            System.out.println("Error 801 :" + e.getMessage());
        }
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fullNameL = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        emailL = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        idL = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("fullName  :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        fullNameL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameLActionPerformed(evt);
            }
        });
        jPanel1.add(fullNameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 230, 40));

        jButton10.setText("Return Book 2");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 140, -1));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 110, 50));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email        :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        emailL.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        emailL.setForeground(new java.awt.Color(255, 255, 255));
        emailL.setText("email");
        jPanel1.add(emailL, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 300, 40));

        jButton6.setText("Return Book 1");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 140, -1));

        jButton2.setText("Refrech");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 80, 40));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Your ID is :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 39));

        jButton9.setText("Return Book 3");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 140, -1));

        idL.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        idL.setForeground(new java.awt.Color(255, 255, 255));
        idL.setText("id");
        jPanel1.add(idL, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 250, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/bg4.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fullNameLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameLActionPerformed

    }//GEN-LAST:event_fullNameLActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String updataName;
        try {
            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            String sql;

            sql = "SELECT * FROM user WHERE id=" + id;

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                updataName = fullNameL.getText();
                String sql2 = "UPDATE user SET fullName='" + updataName + "'  WHERE id=" + id;
                st.executeUpdate(sql2);
            }
            con.close();

        } catch (Exception e) {
            System.out.println("Error 802 :" + e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HomePage x = new HomePage(id, true);//تشغيل الشاشه الجديده 
        x.loadData();// وضع البيانات في الجدول
        x.setVisible(true);
        x.pack();
        x.setLocationRelativeTo(null);
        this.dispose();// اقفل الشاشه القديمه
    }//GEN-LAST:event_jButton1ActionPerformed

    public void returnBook(String nameInDB) {

        String bookID = null ;
        
        // for user Database
        System.out.println("name is : " + nameInDB );
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            String sql = "SELECT * FROM user WHERE ID=" + id;
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                bookID = rs.getString(nameInDB);
                
                String sql2 = "UPDATE user SET " + nameInDB + " = NULL  WHERE id=" + id;
                st.executeUpdate(sql2);
                con.close();
            }

        } catch (Exception e) {
            System.out.println("Error here 2:" + e.getMessage());
        }
        
        // for book Database
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            String sql = "SELECT * FROM booksdata WHERE id=" + bookID;
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {

                String sql2 = "UPDATE booksdata SET loanID = " + 0 + "  WHERE id=" + bookID;
                st.executeUpdate(sql2);
                con.close();
                
            }

        } catch (Exception e) {
            System.out.println("Error 3: " + e.getMessage());
        }
        
        // for loan Database
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            String sql = "SELECT * FROM loan WHERE id_book=" + bookID;
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                
                String sql2 = "UPDATE loan SET isReturned = " + 1 + "  WHERE id_book=" + bookID;
                st.executeUpdate(sql2);
                con.close();
                
            }

        } catch (Exception e) {
            System.out.println("Error 4:" + e.getMessage());
        }
        
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            String sql = "SELECT * FROM user WHERE ID=" + id;
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                if (rs.getString("Book_Loan_ID_1").isEmpty() || rs.getString("Book_Loan_ID_1").equals("0")) {
                    JOptionPane.showMessageDialog(null, "You haven't borrowed a book here yet.", "Warning", JOptionPane.ERROR_MESSAGE);
                } else {
                    // اححذف من الكتب التي تم اخذها
                    returnBook("Book_Loan_ID_1");
                }
                con.close();
            }

        } catch (Exception e) {
            System.out.println("Error here 1:" + e.getMessage());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            String sql = "SELECT * FROM user WHERE ID=" + id;
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                if (rs.getString("Book_Loan_ID_1").isEmpty() || rs.getString("Book_Loan_ID_1").equals("0")) {
                    JOptionPane.showMessageDialog(null, "You haven't borrowed a book here yet.", "Warning", JOptionPane.ERROR_MESSAGE);
                } else {
                    // اححذف من الكتب التي تم اخذها
                    returnBook("Book_Loan_ID_2");
                }
                con.close();
            }

        } catch (Exception e) {
            System.out.println("Error here 2:" + e.getMessage());
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            String sql = "SELECT * FROM user WHERE ID=" + id;
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                if (rs.getString("Book_Loan_ID_1").isEmpty() || rs.getString("Book_Loan_ID_1").equals("0")) {
                    JOptionPane.showMessageDialog(null, "You haven't borrowed a book here yet.", "Warning", JOptionPane.ERROR_MESSAGE);
                } else {
                    // اححذف من الكتب التي تم اخذها
                    returnBook("Book_Loan_ID_3");
                }
                con.close();
            }

        } catch (Exception e) {
            System.out.println("Error here 1:" + e.getMessage());
        }
    }//GEN-LAST:event_jButton10ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emailL;
    private javax.swing.JTextField fullNameL;
    private javax.swing.JLabel idL;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
