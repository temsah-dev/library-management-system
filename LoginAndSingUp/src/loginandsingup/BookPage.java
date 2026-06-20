package loginandsingup;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class BookPage extends javax.swing.JFrame {

    private String userID, BookID, path, photobook;

    public BookPage() {
        initComponents();
    }

    public BookPage(String userID, String BookID) {
        initComponents();

        this.userID = userID;
        this.BookID = BookID;

        try {
            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            String sql = "SELECT * FROM booksdata WHERE id=" + BookID;

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                id.setText(rs.getString("id"));
                NameBook.setText(rs.getString("Namebook"));
                author.setText(rs.getString("author"));
                ISBN.setText(rs.getString("ISBN"));
                genre.setText(rs.getString("genre"));
                year.setText(rs.getString("year"));
                language.setText(rs.getString("language"));
                path = rs.getString("bookfile");
                photobook = rs.getString("photobook");
            
            }
            con.close();

        } catch (Exception e) {
            System.out.println("Error 901" + e.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        loan = new javax.swing.JButton();
        read = new javax.swing.JButton();
        back = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        NameBook = new javax.swing.JLabel();
        author = new javax.swing.JLabel();
        ISBN = new javax.swing.JLabel();
        genre = new javax.swing.JLabel();
        year = new javax.swing.JLabel();
        language = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setBorder(null);
        jDesktopPane1.setForeground(new java.awt.Color(0, 0, 0));
        jDesktopPane1.setMaximumSize(new java.awt.Dimension(208, 212));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(208, 212));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 237, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(220, 166, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Book ID          :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" name book    :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Genre            :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Year               :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" ISBN               :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" Author           :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" Language      :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        loan.setText("loan book");
        loan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanActionPerformed(evt);
            }
        });
        jPanel1.add(loan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 120, 50));

        read.setText("read");
        read.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readActionPerformed(evt);
            }
        });
        jPanel1.add(read, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 120, 50));

        back.setText("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 110, 40));

        id.setBackground(new java.awt.Color(255, 255, 255));
        id.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setText("id");
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 200, 20));

        NameBook.setBackground(new java.awt.Color(255, 255, 255));
        NameBook.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        NameBook.setForeground(new java.awt.Color(255, 255, 255));
        NameBook.setText("NameBook");
        jPanel1.add(NameBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 250, 20));

        author.setBackground(new java.awt.Color(255, 255, 255));
        author.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        author.setForeground(new java.awt.Color(255, 255, 255));
        author.setText("author");
        jPanel1.add(author, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 310, 20));

        ISBN.setBackground(new java.awt.Color(255, 255, 255));
        ISBN.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        ISBN.setForeground(new java.awt.Color(255, 255, 255));
        ISBN.setText("ISBN");
        jPanel1.add(ISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 320, 20));

        genre.setBackground(new java.awt.Color(255, 255, 255));
        genre.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        genre.setForeground(new java.awt.Color(255, 255, 255));
        genre.setText("genre");
        jPanel1.add(genre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 320, 24));

        year.setBackground(new java.awt.Color(255, 255, 255));
        year.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        year.setForeground(new java.awt.Color(255, 255, 255));
        year.setText("year");
        jPanel1.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 310, 20));

        language.setBackground(new java.awt.Color(255, 255, 255));
        language.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        language.setForeground(new java.awt.Color(255, 255, 255));
        language.setText("language");
        jPanel1.add(language, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 310, 22));

        jLabel9.setFont(new java.awt.Font("Constantia", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/Ragab36a085785eabcc6add04d35e8c97be37.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void loanBook() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            String sql_B1 = "SELECT * FROM booksdata WHERE id=" + BookID;
            ResultSet rs = st.executeQuery(sql_B1);

            if (rs.next()) {

                String sql_B2 = "UPDATE booksdata SET loanID=" + userID + "  WHERE id=" + BookID;
                st.executeUpdate(sql_B2);
                con.close();

            }

        } catch (Exception e) {
            System.out.println("Error 4444" + e.getMessage());
        }
    }

    public void addToLoanTable(int days) {

        String query;
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);

            Statement st = con.createStatement();

            LocalDate dataOfReceipt = LocalDate.now();
            LocalDate returnDate = LocalDate.now().plusDays( days );

            query = "INSERT INTO loan ( id_user, id_book, Date_of_receipt, Return_Date) "
                    + "VALUES ('" + userID + "','" + BookID + "','" + dataOfReceipt + "','" + returnDate + "')";

            st.executeUpdate(query);
            
            con.close();

        } catch (Exception e) {
            System.out.println("Error 98 : " + e.getMessage());
        }
    }
    
    public int loanDays(){
        while(true){
            String c = JOptionPane.showInputDialog("Enter the number of days you want to take the book\n  ( Remember the maximum is 7 days )");
            int y = Integer.parseInt(c);
            if ( y > 0 && y < 8) {
                JOptionPane.showMessageDialog(null,"You got the book for "+y+" days.");
                return y;
            }{
                JOptionPane.showMessageDialog(null," you need to by a range [1,7] of days");
            }
        }
    }
    
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        HomePage x = new HomePage(userID, true);//تشغيل الشاشه الجديده 
        x.loadData();// وضع البيانات في الجدول
        x.setVisible(true);
        x.pack();
        x.setLocationRelativeTo(null);
        this.dispose();// اقفل الشاشه القديمه
    }//GEN-LAST:event_backActionPerformed

    private void readActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readActionPerformed

        try {
            if ((new File(path)).exists()) {

                String command = "rundll32 url.dll,FileProtocolHandler " + path;
                Process p = Runtime.getRuntime().exec(command);
                p.waitFor();

            } else {

                System.out.println("File is not exists");

            }

            System.out.println("user read book now");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_readActionPerformed

    private void loanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanActionPerformed
        System.out.println("Loan now");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            String sql = "SELECT * FROM user WHERE id=" + userID;
            ResultSet rs = st.executeQuery(sql);
            int num;
            if (rs.next()) {

                if ( rs.getInt("Book_Loan_ID_1") == 0 || rs.getString("Book_Loan_ID_1").isEmpty() ) {
                    //لمعرفه عدد ايام الذي يريد اقتراض الكتاب بها
                    num = loanDays();
                    loanBook();
                    String sql_B2 = "UPDATE user SET Book_Loan_ID_1=" + BookID + "  WHERE id=" + userID;
                    st.executeUpdate(sql_B2);
                    addToLoanTable(num);
                    
                } else if (rs.getInt("Book_Loan_ID_2") == 0 || rs.getString("Book_Loan_ID_2").isEmpty()) {
                    num = loanDays();
                    loanBook();
                    String sql_B2 = "UPDATE user SET Book_Loan_ID_2=" + BookID + "  WHERE id=" + userID;
                    st.executeUpdate(sql_B2);
                    addToLoanTable(num);
                    
                } else if (rs.getInt("Book_Loan_ID_3") == 0 || rs.getString("Book_Loan_ID_3").isEmpty()) {
                    num = loanDays();
                    loanBook();
                    String sql_B2 = "UPDATE user SET Book_Loan_ID_3=" + BookID + "  WHERE id=" + userID;
                    st.executeUpdate(sql_B2);
                    addToLoanTable(num);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "You've reached the limit.", "Warning", JOptionPane.ERROR_MESSAGE);
                }
                con.close();

            }

        } catch (Exception e) {
            System.out.println("Error 489" + e.getMessage());
        }
    }//GEN-LAST:event_loanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ISBN;
    private javax.swing.JLabel NameBook;
    private javax.swing.JLabel author;
    private javax.swing.JButton back;
    private javax.swing.JLabel genre;
    private javax.swing.JLabel id;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel language;
    private javax.swing.JButton loan;
    private javax.swing.JButton read;
    private javax.swing.JLabel year;
    // End of variables declaration//GEN-END:variables

    String filename = null;

    
}
