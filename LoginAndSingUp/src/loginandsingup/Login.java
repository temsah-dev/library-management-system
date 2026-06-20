package LoginAndSingUp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import loginandsingup.SignUp;
import javax.swing.JOptionPane;
import loginandsingup.AdminSettings;
import loginandsingup.HomePage;

public class Login extends javax.swing.JFrame {
    
    
    //تغليف و حمايه بيانات المستخدم
    private String id, email, password, fullname;

    //Constructor
    public Login() {
        initComponents();
    }
    
    // set and get
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    protected String getPassword() {
        return password;
    }

    protected void setPassword(String password) {
        this.password = password;
    }
    
    //Override
    @Override
    public String toString() {
        return "Login : " + "Fulll name = " + fullname +",email = " + email + ", password = " + password ;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        login_Email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        login_Password = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        sign_up = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        Right = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(843, 500));
        jPanel1.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(242, 240, 241));
        jLabel6.setFont(new java.awt.Font("Malgun Gothic", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 240, 241));
        jLabel6.setText("Library Management System");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(460, 10, 350, 80);

        jLabel7.setBackground(new java.awt.Color(242, 240, 241));
        jLabel7.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(242, 240, 241));
        jLabel7.setText("Eng. Ismail Ahmed");
        jLabel7.setToolTipText("");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel7.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(530, 160, 180, 30);

        jLabel8.setBackground(new java.awt.Color(242, 240, 241));
        jLabel8.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(242, 240, 241));
        jLabel8.setText("This project was conducted under the management of :-");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(450, 80, 370, 30);

        jLabel9.setBackground(new java.awt.Color(242, 240, 241));
        jLabel9.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(242, 240, 241));
        jLabel9.setText(" Dr. Mahmoud Zaki");
        jLabel9.setToolTipText("");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel9.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel9);
        jLabel9.setBounds(530, 130, 180, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\abdog\\Documents\\NetBeansProjects\\LoginAndSingUp\\src\\Login Icon\\Firefly صوره تمساح بيقراء كتب 11118.png")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(290, -60, 620, 710);

        Left.setBackground(new java.awt.Color(147, 113, 95));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(213, 188, 162));
        jLabel1.setText("Login");

        jLabel2.setBackground(new java.awt.Color(61, 45, 40));
        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(61, 45, 40));
        jLabel2.setText("Email ");

        login_Email.setBackground(new java.awt.Color(189, 150, 117));
        login_Email.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        login_Email.setForeground(new java.awt.Color(255, 255, 255));
        login_Email.setToolTipText("");
        login_Email.setCaretColor(new java.awt.Color(32, 21, 14));
        login_Email.setDisabledTextColor(new java.awt.Color(32, 21, 14));
        login_Email.setSelectionColor(new java.awt.Color(214, 196, 181));
        login_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_EmailActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(61, 45, 40));
        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(61, 45, 40));
        jLabel3.setText("Password");

        login_Password.setBackground(new java.awt.Color(189, 150, 117));
        login_Password.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        login_Password.setSelectionColor(new java.awt.Color(214, 196, 181));
        login_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_PasswordActionPerformed(evt);
            }
        });

        login.setBackground(new java.awt.Color(213, 188, 162));
        login.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(0, 0, 0));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("I  don't have an account");

        sign_up.setBackground(new java.awt.Color(153, 153, 153));
        sign_up.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        sign_up.setForeground(new java.awt.Color(255, 51, 51));
        sign_up.setText("Sign Up");
        sign_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_upActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(174, 24, 54));
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setIcon(new javax.swing.ImageIcon("C:\\Users\\abdog\\Documents\\NetBeansProjects\\LoginAndSingUp\\src\\Login Icon\\nutten2.png")); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(login_Email)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(login_Password, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(LeftLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(sign_up))))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sign_up))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel1.add(Left);
        Left.setBounds(0, 0, 420, 500);

        Right.setBackground(new java.awt.Color(61, 45, 40));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel1.add(Right);
        Right.setBounds(420, 0, 450, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sign_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_upActionPerformed
        // لو اراد ان يقوم بانشاء حساب جديد
        SignUp SingUpFrame = new SignUp();
        SingUpFrame.setVisible(true);
        SingUpFrame.pack();
        SingUpFrame.setLocationRelativeTo(null);
        //قفل شاشة التشغيل القديمة
        this.dispose();
    }//GEN-LAST:event_sign_upActionPerformed

    private void login_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_EmailActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

        try {
            //connecthion Database
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            
            //cheack is empty 
            if ( "".equals( login_Email.getText() ) ) 
            {
                JOptionPane.showMessageDialog(null, "Email Adress is require", "Dialog", JOptionPane.ERROR_MESSAGE);
            }
            else if ( "".equals( login_Password.getText() ) ) 
            {
                JOptionPane.showMessageDialog(null, "Password is require", "Warning", JOptionPane.ERROR_MESSAGE);
            }
            else if (login_Email.getText().equals("admin") && login_Password.getText().equals("admin")) 
            {   
                // لو المستخدم طلع ادمن 
                JOptionPane.showMessageDialog(null, "You a Admin now", "Success", JOptionPane.INFORMATION_MESSAGE);
                // شاشه بتقول ان هوا ادمن دلوقتي
                AdminSettings x = new AdminSettings(); 
                
                x.loadData();
                x.loadUserData();
                x.loadLoanData();
                        
                x.setLocationRelativeTo(null);
                x.setVisible(true);
                // الذهاب لشاشة الادمن
                this.dispose();//قفل الشاشه الحالية
            } 
            else
            {
                email= login_Email.getText();// وضع الايميل في وحده التخزين
                password= login_Password.getText();// وضع الباسورد في وحده التخزين
                
                //البحث هل يوجد الايميل و الباسورد في البيانات
                String sql = "SELECT * FROM user WHERE email='" + email + "'and password='" + password + "'";
                ResultSet rs = st.executeQuery(sql);
                
                if (rs.next()) // للو كان موجدين فعلا
                {
                    HomePage x = new HomePage( login_Email.getText(), false);//تشغيل الشاشه الجديده 
                    x.loadData();// وضع البيانات في الجدول
                    x.setVisible(true);
                    x.pack();
                    x.setLocationRelativeTo(null);
                    this.dispose();// اقفل الشاشه القديمه
                    
                } 
                else 
                {
                    // للو مكنش موجود
                    JOptionPane.showMessageDialog(null, "you don`t have account please Sign Up", "Warning", JOptionPane.WARNING_MESSAGE);
                    //طلع شاشه تقول ان في غلط
                }   
                con.close();// اقفل الاتصال بوحده البيانات
            }
        
        } catch (Exception e) {// اذا طلع خطاء بتوصيل البيانات
            System.out.println("Error 2 : " + e.getMessage() );
        }
        
    }//GEN-LAST:event_loginActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);// للخروج من البرنامج
    }//GEN-LAST:event_exitActionPerformed

    private void login_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_PasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JTextField login_Email;
    private javax.swing.JPasswordField login_Password;
    private javax.swing.JButton sign_up;
    // End of variables declaration//GEN-END:variables
}