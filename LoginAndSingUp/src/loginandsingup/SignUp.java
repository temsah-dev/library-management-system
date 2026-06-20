package loginandsingup;

import LoginAndSingUp.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        signUp_Email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        signUp_FullName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        signUp_Password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        signup = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\abdog\\Documents\\NetBeansProjects\\LoginAndSingUp\\src\\Login Icon\\bookss4.png")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sing Up");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(147, 113, 95));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\abdog\\Documents\\NetBeansProjects\\LoginAndSingUp\\src\\Login Icon\\liberary20.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 500);

        jPanel3.setBackground(new java.awt.Color(61, 45, 40));

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(202, 182, 160));
        jLabel6.setText("Password");

        signUp_Email.setBackground(new java.awt.Color(130, 94, 78));
        signUp_Email.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        signUp_Email.setForeground(new java.awt.Color(255, 255, 255));
        signUp_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUp_EmailActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(202, 182, 160));
        jLabel5.setText("Email");

        signUp_FullName.setBackground(new java.awt.Color(130, 94, 78));
        signUp_FullName.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        signUp_FullName.setForeground(new java.awt.Color(255, 255, 255));
        signUp_FullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUp_FullNameActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(202, 182, 160));
        jLabel4.setText("Full Name");

        signUp_Password.setBackground(new java.awt.Color(130, 94, 78));
        signUp_Password.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        signUp_Password.setForeground(new java.awt.Color(255, 255, 255));
        signUp_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUp_PasswordActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(213, 188, 162));
        jLabel3.setText("Sign Up");

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("I`ve an account");

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 51, 51));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        signup.setBackground(new java.awt.Color(186, 127, 96));
        signup.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        signup.setText("Sign up");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(174, 24, 54));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\abdog\\Documents\\NetBeansProjects\\LoginAndSingUp\\src\\Login Icon\\nutten2.png")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(236, 236, 236))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(signUp_FullName, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(signUp_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(signUp_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(266, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(25, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signUp_FullName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signUp_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signUp_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(378, Short.MAX_VALUE)
                    .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(84, 84, 84)))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(400, 0, 400, 500);

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

    private void signUp_FullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUp_FullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUp_FullNameActionPerformed

    private void signUp_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUp_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUp_EmailActionPerformed

    private void signUp_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUp_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUp_PasswordActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed

        String fN, email, password, query;
        boolean check = false;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            
            String sql = "SELECT * FROM user WHERE email='" + signUp_Email.getText() + "'";
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                check= true;
            }// لو في وقت + اقم باضافة طريقة معينة للكتابه
            
            if ("".equals( signUp_FullName.getText() )) 
            {
                JOptionPane.showMessageDialog(null, "Full Name is require", "Warning", JOptionPane.ERROR_MESSAGE);
            } 
            else if ("".equals(signUp_Email.getText())) 
            {
                JOptionPane.showMessageDialog(null, "Email Adress is require", "Warning", JOptionPane.ERROR_MESSAGE);
            } 
            else if ("".equals(signUp_Password.getText())) 
            {
                JOptionPane.showMessageDialog(null, "Password is require", "Warning", JOptionPane.ERROR_MESSAGE);
            }
            else if (check)
            {
                JOptionPane.showMessageDialog(null, "This email account has been made by", "Warning", JOptionPane.ERROR_MESSAGE);
            }else {

                fN = signUp_FullName.getText();
                email = signUp_Email.getText();
                password = signUp_Password.getText();
                query = "INSERT INTO User (fullName, email, password) "
                        + "VALUES ('" + fN + "','" + email + "','" + password + "')";

                st.executeUpdate(query);
                signUp_FullName.setText("");
                signUp_Email.setText("");
                signUp_Password.setText("");

                showMessageDialog( null, "Successfully Registered.");
                con.close();
                HomePage x = new HomePage(email, false);
                x.loadData();
                x.setLocationRelativeTo(null);
                x.setVisible(true);
                this.dispose();
            }
        } catch (Exception e) {
            System.out.println("Error 3 :" + e.getMessage());
        }

    }//GEN-LAST:event_signupActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_loginActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton login;
    private javax.swing.JTextField signUp_Email;
    private javax.swing.JTextField signUp_FullName;
    private javax.swing.JPasswordField signUp_Password;
    private javax.swing.JButton signup;
    // End of variables declaration//GEN-END:variables
}