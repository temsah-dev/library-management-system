package loginandsingup;

import LoginAndSingUp.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HomePage extends javax.swing.JFrame implements Search {

    private static String name, iduser;

    //Overloading
    public HomePage() {
        initComponents();
    }

    public HomePage(String email, boolean isID) {
        initComponents();
        try {
            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            String sql;
            if (isID) {
                sql = "SELECT * FROM user WHERE id=" + email;
            } else {
                sql = "SELECT * FROM user WHERE email='" + email + "'";
            }
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                name = rs.getString("fullName");
                iduser = rs.getString("id");
                UserName.setText(name);
            }
            con.close();

        } catch (Exception e) {
            System.out.println("Error 4 :" + e.getMessage());
        }
        setLoanBook();
    }

    @Override
    public void search(String name_DataSearch, boolean isString) {
        int notFound = 0;
        String search;
        try {
            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            search = searchData.getText();
            if ("".equals(search)) {
                JOptionPane.showMessageDialog(null, name_DataSearch + " is require", "Warning", JOptionPane.ERROR_MESSAGE);
            } else {

                DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Name Book", "Author", "ISBN", "genre", "year", "Language", "currently"}, 0);

                Table1.setModel(model);
                String sql;
                if (isString) {
                    sql = "SELECT * FROM booksdata WHERE " + name_DataSearch + "='" + search + "'";
                } else {
                    sql = "SELECT * FROM booksdata WHERE " + name_DataSearch + "=" + search;
                }
                ResultSet rs = st.executeQuery(sql);

                String i, nb, a, is, g, y, la;
                boolean lo;

                while (rs.next()) {
                    i = rs.getString("id");
                    nb = rs.getString("Namebook");
                    a = rs.getString("author");
                    is = rs.getString("ISBN");
                    g = rs.getString("genre");
                    y = rs.getString("year");
                    la = rs.getString("language");
                    if (rs.getString("loanID").equals("0")) {
                        lo = true;
                    } else {
                        lo = false;
                    }
                    model.addRow(new Object[]{i, nb, a, is, g, y, la, lo});
                    notFound = 1;
                }
                con.close();
                if (notFound == 0) {
                    JOptionPane.showMessageDialog(null, "invalid " + name_DataSearch, "Warning", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public void loadData() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Name Book", "Author", "ISBN", "genre", "year", "Language", "currently"}, 0);

            Table.setModel(model);
            String sql = "SELECT * FROM booksdata";

            ResultSet rs = st.executeQuery(sql);
            String i, nb, a, is, g, y, la;
            boolean lo;
            while (rs.next()) {
                i = rs.getString("id");
                nb = rs.getString("Namebook");
                a = rs.getString("author");
                is = rs.getString("ISBN");
                g = rs.getString("genre");
                y = rs.getString("year");
                la = rs.getString("language");
                if (rs.getString("loanID").equals("0")) {
                    lo = true;
                } else {
                    lo = false;
                }
                model.addRow(new Object[]{i, nb, a, is, g, y, la, lo});
            }
        } catch (Exception e) {
        }
    }

    public void setLoanBook() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            String sql = "SELECT * FROM user WHERE id=" + iduser;
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                get_name_from_id(rs.getString("Book_Loan_ID_1"), Book_Loan_ID_1);
                get_name_from_id(rs.getString("Book_Loan_ID_2"), Book_Loan_ID_2);
                get_name_from_id(rs.getString("Book_Loan_ID_3"), Book_Loan_ID_3);

                con.close();
            }

        } catch (Exception e) {
            System.out.println("Error 96 : " + e.getMessage());
        }

    }

    public void get_name_from_id(String str, JButton button) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            String sql = "SELECT * FROM booksdata WHERE id=" + str;
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                button.setText(rs.getString("NameBook"));
                con.close();
            }

        } catch (Exception e) {
            System.out.println("Error 9898 : " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchData = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        UserName = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        IdBookPage = new javax.swing.JTextField();
        openBook = new javax.swing.JButton();
        Book_Loan_ID_1 = new javax.swing.JButton();
        Book_Loan_ID_2 = new javax.swing.JButton();
        Book_Loan_ID_3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1223, 1200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/home2.png"))); // NOI18N
        jButton3.setText("     Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 800, 190, 50));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Search");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 25, -1, -1));
        jPanel5.add(searchData, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 16, 275, 40));

        jButton2.setFont(new java.awt.Font("sansserif", 2, 18)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 64, 120, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Found What!!!", "ID", "Name Book", "Author", "ISBN", "genre", "Year", "Language", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel5.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1039, 15, 122, 43));

        UserName.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        UserName.setForeground(new java.awt.Color(0, 0, 0));
        UserName.setText("user name");
        jPanel5.add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 310, 29));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/User Icon/user icon D.jpg"))); // NOI18N
        jButton1.setMaximumSize(new java.awt.Dimension(50, 28));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 15, 75, 68));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/bac1.jpg"))); // NOI18N
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 560, 1090));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/bac1.jpg"))); // NOI18N
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, -80, 560, 1090));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/bac1.jpg"))); // NOI18N
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, -60, 560, 1090));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 110));

        Table.setBackground(new java.awt.Color(255, 255, 255));
        Table.setForeground(new java.awt.Color(0, 0, 0));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name Book", "Author", "ISBN", "genre", "year", "Language", "currently"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("All Book", jPanel2);

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name Book", "Author", "ISBN", "genre", "year", "Language", "currently"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Table1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Search Book", jPanel3);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 990, 790));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(230, 800));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("All Books");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 145, 50));

        jLabel2.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID book page");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 648, -1, -1));
        jPanel4.add(IdBookPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 686, 206, -1));

        openBook.setBackground(new java.awt.Color(102, 102, 102));
        openBook.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        openBook.setForeground(new java.awt.Color(255, 255, 255));
        openBook.setText("Open Book");
        openBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openBookActionPerformed(evt);
            }
        });
        jPanel4.add(openBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 732, 105, 39));

        Book_Loan_ID_1.setBackground(new java.awt.Color(102, 102, 102));
        Book_Loan_ID_1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Book_Loan_ID_1.setForeground(new java.awt.Color(255, 255, 255));
        Book_Loan_ID_1.setText("Book Loan 1");
        Book_Loan_ID_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Book_Loan_ID_1ActionPerformed(evt);
            }
        });
        jPanel4.add(Book_Loan_ID_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 145, 50));

        Book_Loan_ID_2.setBackground(new java.awt.Color(102, 102, 102));
        Book_Loan_ID_2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Book_Loan_ID_2.setForeground(new java.awt.Color(255, 255, 255));
        Book_Loan_ID_2.setText("Book Loan 2");
        Book_Loan_ID_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Book_Loan_ID_2ActionPerformed(evt);
            }
        });
        jPanel4.add(Book_Loan_ID_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 145, 50));

        Book_Loan_ID_3.setBackground(new java.awt.Color(102, 102, 102));
        Book_Loan_ID_3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Book_Loan_ID_3.setForeground(new java.awt.Color(255, 255, 255));
        Book_Loan_ID_3.setText("Book Loan 3");
        Book_Loan_ID_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Book_Loan_ID_3ActionPerformed(evt);
            }
        });
        jPanel4.add(Book_Loan_ID_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 145, 50));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Books You Have");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/bac1.jpg"))); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 560, 1090));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 870));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 870));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        UserSettings x = new UserSettings(iduser);
        x.setVisible(true);
        x.pack();
        x.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        switch (jComboBox1.getSelectedIndex()) {
            case 0:
                JOptionPane.showMessageDialog(null, "Found ...???", "found what ????", JOptionPane.ERROR_MESSAGE);
                break;
            case 1:
                search("id", false);
                jTabbedPane1.setSelectedIndex(1);
                break;
            case 2:
                search("NameBook", true);
                jTabbedPane1.setSelectedIndex(1);
                break;
            case 3:
                search("author", true);
                jTabbedPane1.setSelectedIndex(1);
                break;
            case 4:
                search("ISBN", true);
                jTabbedPane1.setSelectedIndex(1);
                break;
            case 5:
                search("genre", true);
                jTabbedPane1.setSelectedIndex(1);
                break;
            case 6:
                search("year", true);
                jTabbedPane1.setSelectedIndex(1);
                break;
            case 7:
                search("language", true);
                jTabbedPane1.setSelectedIndex(1);
                break;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void openBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openBookActionPerformed

        if (IdBookPage.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "is ID empty");
        } else {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
                String user = "root";
                String pass = "";

                Connection con = DriverManager.getConnection(url, user, pass);
                Statement st = con.createStatement();

                String sql = "SELECT * FROM booksdata WHERE id=" + IdBookPage.getText();
                ResultSet rs = st.executeQuery(sql);
                if (rs.next()) {
                    if (rs.getString("loanID").isEmpty() || rs.getString("loanID").equals("0") || rs.getString("loanID").equals("")) {
                        BookPage x = new BookPage(iduser, IdBookPage.getText());
                        x.setVisible(true);
                        x.pack();
                        x.setLocationRelativeTo(null);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Book in loan sorry", "Warning", JOptionPane.ERROR_MESSAGE);
                    }
                    con.close();
                } else {
                    JOptionPane.showMessageDialog(null, "The book doesn't exist at all.", "Warning", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                System.out.println("Error 605 :" + e.getMessage());
            }

        }

    }//GEN-LAST:event_openBookActionPerformed

    private void Book_Loan_ID_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Book_Loan_ID_1ActionPerformed
        if(true){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
                String user = "root";
                String pass = "";

                Connection con = DriverManager.getConnection(url, user, pass);
                Statement st = con.createStatement();

                String sql = "SELECT * FROM user WHERE id=" + iduser;
                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {

                    BookPage x = new BookPage(iduser, rs.getString("Book_Loan_ID_1"));
                    x.setVisible(true);
                    x.pack();
                    x.setLocationRelativeTo(null);
                    this.dispose();

                    con.close();
                }

            } catch (Exception e) {
                System.out.println("Error IDK" + e.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Full Name is require", "Warning", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Book_Loan_ID_1ActionPerformed

    private void Book_Loan_ID_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Book_Loan_ID_2ActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            String sql = "SELECT * FROM user WHERE id=" + iduser;
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                BookPage x = new BookPage(iduser, rs.getString("Book_Loan_ID_2"));
                x.setVisible(true);
                x.pack();
                x.setLocationRelativeTo(null);
                this.dispose();

                con.close();
            }

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }//GEN-LAST:event_Book_Loan_ID_2ActionPerformed

    private void Book_Loan_ID_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Book_Loan_ID_3ActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            String sql = "SELECT * FROM user WHERE id=" + iduser;
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                BookPage x = new BookPage(iduser, rs.getString("Book_Loan_ID_3"));
                x.setVisible(true);
                x.pack();
                x.setLocationRelativeTo(null);
                this.dispose();

                con.close();
            }

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }//GEN-LAST:event_Book_Loan_ID_3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Book_Loan_ID_1;
    private javax.swing.JButton Book_Loan_ID_2;
    private javax.swing.JButton Book_Loan_ID_3;
    private javax.swing.JTextField IdBookPage;
    private javax.swing.JTable Table;
    private javax.swing.JTable Table1;
    private javax.swing.JLabel UserName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton openBook;
    private javax.swing.JTextField searchData;
    // End of variables declaration//GEN-END:variables
}
