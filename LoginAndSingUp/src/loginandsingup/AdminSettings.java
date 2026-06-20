package loginandsingup;

import LoginAndSingUp.Login;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

public class AdminSettings extends javax.swing.JFrame {

    public AdminSettings() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        BookData = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        namebook = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        author = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ISBN = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        genre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        loanID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        searchData = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        Update1 = new javax.swing.JButton();
        Create1 = new javax.swing.JButton();
        Upload = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        photobook_url = new javax.swing.JLabel();
        Upload1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        bookfile_url = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        language = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        UserData = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        FullName = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        searchBtn1 = new javax.swing.JButton();
        userClear = new javax.swing.JButton();
        userBlock = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        UserSearch = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        userUpdate = new javax.swing.JButton();
        addUser = new javax.swing.JButton();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        BookLoanID3 = new javax.swing.JLabel();
        BookLoanID1 = new javax.swing.JLabel();
        BookLoanID2 = new javax.swing.JLabel();
        Loan = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        idUser = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        idBook = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        DateOfReceipt = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        ReturnDate = new javax.swing.JTextField();
        searchBtn2 = new javax.swing.JButton();
        userClear1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        loanTable = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        loanSearch = new javax.swing.JTextField();
        addUser1 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        report = new javax.swing.JButton();
        userButten = new javax.swing.JButton();
        bookButten = new javax.swing.JButton();
        loanButten = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BookData.setBackground(new java.awt.Color(255, 153, 0));
        BookData.setLayout(null);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NameBook");
        BookData.add(jLabel2);
        jLabel2.setBounds(10, 50, 130, 50);

        namebook.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        BookData.add(namebook);
        namebook.setBounds(30, 90, 510, 36);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("author");
        BookData.add(jLabel3);
        jLabel3.setBounds(10, 120, 130, 50);

        author.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        BookData.add(author);
        author.setBounds(30, 160, 510, 36);

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ISBN");
        BookData.add(jLabel4);
        jLabel4.setBounds(10, 190, 130, 50);

        ISBN.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        BookData.add(ISBN);
        ISBN.setBounds(30, 230, 510, 36);

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("genre");
        BookData.add(jLabel5);
        jLabel5.setBounds(10, 260, 130, 50);

        genre.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        genre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genreActionPerformed(evt);
            }
        });
        BookData.add(genre);
        genre.setBounds(30, 300, 510, 36);

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Photo Of Book");
        BookData.add(jLabel6);
        jLabel6.setBounds(10, 530, 180, 30);

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Book File \" PDF \"");
        BookData.add(jLabel7);
        jLabel7.setBounds(10, 650, 160, 30);

        searchBtn.setBackground(new java.awt.Color(255, 255, 255));
        searchBtn.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(0, 0, 0));
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/iconSearch2.png"))); // NOI18N
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        BookData.add(searchBtn);
        searchBtn.setBounds(840, 40, 40, 40);

        clear.setBackground(new java.awt.Color(255, 255, 254));
        clear.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        clear.setForeground(new java.awt.Color(0, 0, 0));
        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/clear.png"))); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        BookData.add(clear);
        clear.setBounds(490, 810, 140, 60);

        Delete.setBackground(new java.awt.Color(255, 255, 254));
        Delete.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        Delete.setForeground(new java.awt.Color(0, 0, 0));
        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/delete.png"))); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        BookData.add(Delete);
        Delete.setBounds(330, 810, 150, 60);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name Book", "Author", "ISBN", "genre", "year", "Language", "Photo Book", "Book File", "LoanID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(4).setHeaderValue("genre");
            Table.getColumnModel().getColumn(5).setHeaderValue("year");
            Table.getColumnModel().getColumn(6).setHeaderValue("Language");
            Table.getColumnModel().getColumn(7).setHeaderValue("Photo Book");
            Table.getColumnModel().getColumn(8).setHeaderValue("Book File");
        }

        BookData.add(jScrollPane1);
        jScrollPane1.setBounds(640, 100, 980, 770);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("loan ID : ");
        jLabel8.setToolTipText("");
        BookData.add(jLabel8);
        jLabel8.setBounds(10, 470, 110, 50);

        loanID.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        BookData.add(loanID);
        loanID.setBounds(120, 480, 420, 36);

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Search");
        BookData.add(jLabel9);
        jLabel9.setBounds(890, 10, 70, 40);

        searchData.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        searchData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDataActionPerformed(evt);
            }
        });
        BookData.add(searchData);
        searchData.setBounds(890, 40, 460, 36);

        jComboBox1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "find to ...", "ID", "NameBook", "ISBN" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        BookData.add(jComboBox1);
        jComboBox1.setBounds(1360, 30, 120, 50);

        Update1.setBackground(new java.awt.Color(255, 255, 254));
        Update1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        Update1.setForeground(new java.awt.Color(0, 0, 0));
        Update1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/updata.png"))); // NOI18N
        Update1.setText("Update");
        Update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update1ActionPerformed(evt);
            }
        });
        BookData.add(Update1);
        Update1.setBounds(170, 810, 150, 60);

        Create1.setBackground(new java.awt.Color(255, 255, 254));
        Create1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        Create1.setForeground(new java.awt.Color(0, 0, 0));
        Create1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/createBook.png"))); // NOI18N
        Create1.setText("Create");
        Create1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create1ActionPerformed(evt);
            }
        });
        BookData.add(Create1);
        Create1.setBounds(10, 810, 150, 60);

        Upload.setBackground(new java.awt.Color(255, 255, 254));
        Upload.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        Upload.setForeground(new java.awt.Color(0, 0, 0));
        Upload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/photoicon.png"))); // NOI18N
        Upload.setText("UPLOAD        ");
        Upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadActionPerformed(evt);
            }
        });
        BookData.add(Upload);
        Upload.setBounds(30, 610, 510, 40);

        jPanel2.setBackground(new java.awt.Color(18, 30, 49));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));

        photobook_url.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        photobook_url.setForeground(new java.awt.Color(255, 255, 255));
        photobook_url.setText("URL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(photobook_url, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(photobook_url, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        BookData.add(jPanel2);
        jPanel2.setBounds(30, 560, 510, 40);

        Upload1.setBackground(new java.awt.Color(255, 255, 254));
        Upload1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        Upload1.setForeground(new java.awt.Color(0, 0, 0));
        Upload1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/upload2.png"))); // NOI18N
        Upload1.setText(" UPLOAD      ");
        Upload1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Upload1ActionPerformed(evt);
            }
        });
        BookData.add(Upload1);
        Upload1.setBounds(30, 740, 510, 40);

        jPanel3.setBackground(new java.awt.Color(18, 30, 49));
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));

        bookfile_url.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        bookfile_url.setForeground(new java.awt.Color(255, 255, 255));
        bookfile_url.setText("PDF Fill plese");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookfile_url, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookfile_url, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        BookData.add(jPanel3);
        jPanel3.setBounds(30, 690, 510, 40);

        jDesktopPane2.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane2.setForeground(new java.awt.Color(0, 0, 0));
        jDesktopPane2.setToolTipText("");
        jDesktopPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jDesktopPane2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, 0));

        BookData.add(jDesktopPane2);
        jDesktopPane2.setBounds(600, 240, 0, 400);

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("year");
        BookData.add(jLabel11);
        jLabel11.setBounds(10, 320, 130, 50);

        year.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });
        BookData.add(year);
        year.setBounds(30, 360, 510, 36);

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("language");
        BookData.add(jLabel12);
        jLabel12.setBounds(10, 390, 130, 50);

        language.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        BookData.add(language);
        language.setBounds(30, 430, 510, 36);
        BookData.add(jLabel14);
        jLabel14.setBounds(570, 0, 0, 0);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/greean.jpg"))); // NOI18N
        BookData.add(jLabel15);
        jLabel15.setBounds(0, 80, 440, 850);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/greean.jpg"))); // NOI18N
        BookData.add(jLabel16);
        jLabel16.setBounds(0, -6, 440, 800);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/greean.jpg"))); // NOI18N
        BookData.add(jLabel17);
        jLabel17.setBounds(440, 80, 440, 850);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/greean.jpg"))); // NOI18N
        BookData.add(jLabel18);
        jLabel18.setBounds(440, -10, 440, 810);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/greean.jpg"))); // NOI18N
        BookData.add(jLabel19);
        jLabel19.setBounds(880, -10, 440, 810);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/greean.jpg"))); // NOI18N
        BookData.add(jLabel20);
        jLabel20.setBounds(880, 80, 440, 850);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/greean.jpg"))); // NOI18N
        BookData.add(jLabel21);
        jLabel21.setBounds(440, -10, 440, 810);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/greean.jpg"))); // NOI18N
        BookData.add(jLabel22);
        jLabel22.setBounds(440, 80, 440, 850);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/greean.jpg"))); // NOI18N
        BookData.add(jLabel23);
        jLabel23.setBounds(1190, 80, 440, 850);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/greean.jpg"))); // NOI18N
        BookData.add(jLabel24);
        jLabel24.setBounds(1190, -40, 440, 850);

        jTabbedPane1.addTab("tab1", BookData);

        UserData.setBackground(new java.awt.Color(147, 113, 95));
        UserData.setLayout(null);

        jLabel13.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Full Name");
        UserData.add(jLabel13);
        jLabel13.setBounds(10, 50, 130, 50);

        FullName.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        UserData.add(FullName);
        FullName.setBounds(30, 90, 510, 36);

        jLabel25.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Email");
        UserData.add(jLabel25);
        jLabel25.setBounds(10, 140, 130, 50);

        Email.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        UserData.add(Email);
        Email.setBounds(30, 180, 510, 36);

        jLabel26.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Password");
        UserData.add(jLabel26);
        jLabel26.setBounds(10, 220, 130, 50);

        Password.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        UserData.add(Password);
        Password.setBounds(30, 260, 510, 36);

        jLabel27.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Book Loan ID 1");
        UserData.add(jLabel27);
        jLabel27.setBounds(10, 320, 150, 50);

        searchBtn1.setBackground(new java.awt.Color(255, 255, 255));
        searchBtn1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        searchBtn1.setForeground(new java.awt.Color(0, 0, 0));
        searchBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/iconSearch2.png"))); // NOI18N
        searchBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtn1ActionPerformed(evt);
            }
        });
        UserData.add(searchBtn1);
        searchBtn1.setBounds(840, 40, 40, 40);

        userClear.setBackground(new java.awt.Color(255, 255, 254));
        userClear.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        userClear.setForeground(new java.awt.Color(0, 0, 0));
        userClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/clear.png"))); // NOI18N
        userClear.setText("Clear");
        userClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userClearActionPerformed(evt);
            }
        });
        UserData.add(userClear);
        userClear.setBounds(320, 700, 180, 60);

        userBlock.setBackground(new java.awt.Color(255, 255, 254));
        userBlock.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        userBlock.setForeground(new java.awt.Color(0, 0, 0));
        userBlock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/block.png"))); // NOI18N
        userBlock.setText("Block");
        userBlock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userBlockActionPerformed(evt);
            }
        });
        UserData.add(userBlock);
        userBlock.setBounds(50, 700, 180, 60);

        UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Full Name", "Email", "Password", "Book Loan ID 1", "Book Loan ID 2", "Book Loan ID 3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(UserTable);

        UserData.add(jScrollPane2);
        jScrollPane2.setBounds(610, 100, 990, 760);

        jLabel31.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Search");
        UserData.add(jLabel31);
        jLabel31.setBounds(890, 10, 70, 40);

        UserSearch.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        UserSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserSearchActionPerformed(evt);
            }
        });
        UserData.add(UserSearch);
        UserSearch.setBounds(890, 40, 460, 36);

        jComboBox2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "find to ...", "ID", "Email" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        UserData.add(jComboBox2);
        jComboBox2.setBounds(1350, 30, 120, 50);

        userUpdate.setBackground(new java.awt.Color(255, 255, 254));
        userUpdate.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        userUpdate.setForeground(new java.awt.Color(0, 0, 0));
        userUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/updata.png"))); // NOI18N
        userUpdate.setText("Update");
        userUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userUpdateActionPerformed(evt);
            }
        });
        UserData.add(userUpdate);
        userUpdate.setBounds(320, 620, 180, 60);

        addUser.setBackground(new java.awt.Color(255, 255, 254));
        addUser.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        addUser.setForeground(new java.awt.Color(0, 0, 0));
        addUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/userAdd.png"))); // NOI18N
        addUser.setText("Add User");
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });
        UserData.add(addUser);
        addUser.setBounds(50, 620, 180, 60);

        jDesktopPane3.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane3.setForeground(new java.awt.Color(0, 0, 0));
        jDesktopPane3.setToolTipText("");
        jDesktopPane3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jDesktopPane3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, 0));

        UserData.add(jDesktopPane3);
        jDesktopPane3.setBounds(600, 240, 0, 400);

        jLabel35.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Book Loan ID 2");
        UserData.add(jLabel35);
        jLabel35.setBounds(10, 390, 150, 50);

        jLabel36.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Book Loan ID 3");
        UserData.add(jLabel36);
        jLabel36.setBounds(10, 460, 140, 50);

        BookLoanID3.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        BookLoanID3.setForeground(new java.awt.Color(0, 0, 0));
        BookLoanID3.setText("He hasn't borrowed a book yet.");
        UserData.add(BookLoanID3);
        BookLoanID3.setBounds(30, 500, 470, 30);

        BookLoanID1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        BookLoanID1.setForeground(new java.awt.Color(0, 0, 0));
        BookLoanID1.setText("He hasn't borrowed a book yet.");
        UserData.add(BookLoanID1);
        BookLoanID1.setBounds(28, 360, 470, 30);

        BookLoanID2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        BookLoanID2.setForeground(new java.awt.Color(0, 0, 0));
        BookLoanID2.setText("He hasn't borrowed a book yet.");
        UserData.add(BookLoanID2);
        BookLoanID2.setBounds(30, 430, 470, 30);

        jTabbedPane1.addTab("tab1", UserData);

        Loan.setBackground(new java.awt.Color(0, 0, 0));

        jLabel28.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("ID User");

        idUser.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        jLabel29.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("ID Book");

        idBook.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        jLabel30.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Date Of Receipt");

        DateOfReceipt.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        jLabel33.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Return Date");

        ReturnDate.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        ReturnDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnDateActionPerformed(evt);
            }
        });

        searchBtn2.setBackground(new java.awt.Color(255, 255, 255));
        searchBtn2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        searchBtn2.setForeground(new java.awt.Color(0, 0, 0));
        searchBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/iconSearch2.png"))); // NOI18N
        searchBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtn2ActionPerformed(evt);
            }
        });

        userClear1.setBackground(new java.awt.Color(255, 255, 254));
        userClear1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        userClear1.setForeground(new java.awt.Color(0, 0, 0));
        userClear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/clear.png"))); // NOI18N
        userClear1.setText("Clear");
        userClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userClear1ActionPerformed(evt);
            }
        });

        loanTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "id user", "id Book", "Date of receipt", "Return Date", "Debit", "isReturned"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(loanTable);

        jLabel34.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Search");

        loanSearch.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        loanSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanSearchActionPerformed(evt);
            }
        });

        addUser1.setBackground(new java.awt.Color(255, 255, 254));
        addUser1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        addUser1.setForeground(new java.awt.Color(0, 0, 0));
        addUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/userAdd.png"))); // NOI18N
        addUser1.setText("Add Book Lending");
        addUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUser1ActionPerformed(evt);
            }
        });

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Search ID");

        javax.swing.GroupLayout LoanLayout = new javax.swing.GroupLayout(Loan);
        Loan.setLayout(LoanLayout);
        LoanLayout.setHorizontalGroup(
            LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
            .addGroup(LoanLayout.createSequentialGroup()
                .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(LoanLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(LoanLayout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(ReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(LoanLayout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(addUser1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LoanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39))))
                .addContainerGap(1080, Short.MAX_VALUE))
            .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LoanLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(LoanLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(idUser, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(idBook, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DateOfReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(70, 70, 70)
                    .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LoanLayout.createSequentialGroup()
                            .addGap(230, 230, 230)
                            .addComponent(searchBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(loanSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        LoanLayout.setVerticalGroup(
            LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoanLayout.createSequentialGroup()
                .addComponent(jLabel38)
                .addGap(44, 44, 44)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238)
                .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoanLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(ReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addUser1)
                    .addComponent(userClear1))
                .addGap(18, 18, 18)
                .addComponent(jLabel39)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LoanLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LoanLayout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(LoanLayout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(idUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(14, 14, 14)
                            .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(LoanLayout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(idBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(4, 4, 4)
                            .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(LoanLayout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(DateOfReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(LoanLayout.createSequentialGroup()
                            .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(LoanLayout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(searchBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(LoanLayout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(loanSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(20, 20, 20)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("tab2", Loan);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, -30, 1630, 930));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/home2.png"))); // NOI18N
        jButton1.setText("     Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 710, 170, 50));

        report.setBackground(new java.awt.Color(255, 255, 255));
        report.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        report.setForeground(new java.awt.Color(0, 0, 0));
        report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/reourt3.png"))); // NOI18N
        report.setText("    Report");
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });
        jPanel4.add(report, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 570, 180, 50));

        userButten.setBackground(new java.awt.Color(147, 113, 95));
        userButten.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        userButten.setForeground(new java.awt.Color(255, 255, 255));
        userButten.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/user.png"))); // NOI18N
        userButten.setText("User Data");
        userButten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userButtenActionPerformed(evt);
            }
        });
        jPanel4.add(userButten, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 280, 170, 60));

        bookButten.setBackground(new java.awt.Color(21, 49, 47));
        bookButten.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        bookButten.setForeground(new java.awt.Color(255, 255, 255));
        bookButten.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/bokkfata2.png"))); // NOI18N
        bookButten.setText("Book Data");
        bookButten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtenActionPerformed(evt);
            }
        });
        jPanel4.add(bookButten, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 170, 180, 60));

        loanButten.setBackground(new java.awt.Color(0, 0, 0));
        loanButten.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        loanButten.setForeground(new java.awt.Color(255, 255, 255));
        loanButten.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/money2.png"))); // NOI18N
        loanButten.setText("  Loan");
        loanButten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanButtenActionPerformed(evt);
            }
        });
        jPanel4.add(loanButten, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 410, 180, 60));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Snap ITC", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Icon/Orange3.jpg"))); // NOI18N
        jLabel1.setText("Admin");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 170, 90));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genreActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        int notFound = 0;
        switch (jComboBox1.getSelectedIndex()) {
            case 0:
                JOptionPane.showMessageDialog(null, "Found ...???", "found what ????", JOptionPane.ERROR_MESSAGE);
                break;
            case 1:
                String ID;
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
                    String user = "root";
                    String pass = "";

                    Connection con = DriverManager.getConnection(url, user, pass);
                    Statement st = con.createStatement();

                    ID = searchData.getText();
                    if ("".equals(ID)) {
                        JOptionPane.showMessageDialog(null, "ID is require", "Warning", JOptionPane.ERROR_MESSAGE);
                    } else {
                        String sql = "SELECT * FROM booksdata WHERE id=" + ID;
                        ResultSet rs = st.executeQuery(sql);
                        while (rs.next()) {
                            namebook.setText(rs.getString("NameBook"));
                            author.setText(rs.getString("author"));
                            ISBN.setText(rs.getString("ISBN"));
                            genre.setText(rs.getString("genre"));
                            year.setText(rs.getString("year"));
                            language.setText(rs.getString("language"));
                            photobook_url.setText(rs.getString("photobook"));
                            bookfile_url.setText(rs.getString("bookfile"));
                            loanID.setText(rs.getString("loanID"));
                            notFound = 1;
                            con.close();
                        }
                        if (notFound == 0) {
                            JOptionPane.showMessageDialog(null, "invalid ID", "Warning", JOptionPane.ERROR_MESSAGE);
                        }
                    }

                } catch (Exception e) {
                    System.out.println("Error " + e.getMessage());
                }
                break;
            case 2:
                String NameBook;
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
                    String user = "root";
                    String pass = "";

                    Connection con = DriverManager.getConnection(url, user, pass);
                    Statement st = con.createStatement();

                    NameBook = searchData.getText();
                    if ("".equals(NameBook)) {
                        JOptionPane.showMessageDialog(null, "Name Book is require", "Warning", JOptionPane.ERROR_MESSAGE);
                    } else {
                        String sql = "SELECT * FROM booksdata WHERE NameBook='" + NameBook + "'";
                        ResultSet rs = st.executeQuery(sql);
                        while (rs.next()) {
                            namebook.setText(rs.getString("NameBook"));
                            author.setText(rs.getString("author"));
                            ISBN.setText(rs.getString("ISBN"));
                            genre.setText(rs.getString("genre"));
                            year.setText(rs.getString("year"));
                            language.setText(rs.getString("language"));
                            photobook_url.setText(rs.getString("photobook"));
                            bookfile_url.setText(rs.getString("bookfile"));
                            loanID.setText(rs.getString("loanID"));
                            notFound = 1;
                            con.close();
                        }
                        if (notFound == 0) {
                            JOptionPane.showMessageDialog(null, "invalid NameBook", "Warning", JOptionPane.ERROR_MESSAGE);
                        }
                    }

                } catch (Exception e) {
                    System.out.println("Error " + e.getMessage());
                }
                break;
            case 3:
                String ISBN2;
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
                    String user = "root";
                    String pass = "";

                    Connection con = DriverManager.getConnection(url, user, pass);
                    Statement st = con.createStatement();

                    ISBN2 = searchData.getText();
                    if ("".equals(ISBN2)) {
                        JOptionPane.showMessageDialog(null, "ISBN is require", "Warning", JOptionPane.ERROR_MESSAGE);
                    } else {
                        String sql = "SELECT * FROM booksdata WHERE ISBN='" + ISBN2 + "'";
                        ResultSet rs = st.executeQuery(sql);
                        while (rs.next()) {
                            namebook.setText(rs.getString("NameBook"));
                            author.setText(rs.getString("author"));
                            ISBN.setText(rs.getString("ISBN"));
                            genre.setText(rs.getString("genre"));
                            year.setText(rs.getString("year"));
                            language.setText(rs.getString("language"));
                            photobook_url.setText(rs.getString("photobook"));
                            bookfile_url.setText(rs.getString("bookfile"));
                            loanID.setText(rs.getString("loanID"));
                            notFound = 1;
                            con.close();
                        }
                        if (notFound == 0) {
                            JOptionPane.showMessageDialog(null, "invalid ISBN", "Warning", JOptionPane.ERROR_MESSAGE);
                        }
                    }

                } catch (Exception e) {
                    System.out.println("Error " + e.getMessage());
                }
                break;
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    public void userSearch(String dataname, boolean isString) {
        String value;
        int notFound = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            String sql;

            value = UserSearch.getText();
            if ("".equals(value)) {
                JOptionPane.showMessageDialog(null, dataname + " is require", "Warning", JOptionPane.ERROR_MESSAGE);
            } else {
                if (isString) {
                    sql = "SELECT * FROM user WHERE " + dataname + "='" + value + "'";
                } else {
                    sql = "SELECT * FROM user WHERE " + dataname + "=" + value;
                }
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    FullName.setText(rs.getString("fullName"));
                    Email.setText(rs.getString("email"));
                    Password.setText(rs.getString("Password"));
                    BookLoanID1.setText(rs.getString("Book_Loan_ID_1"));
                    BookLoanID2.setText(rs.getString("Book_Loan_ID_2"));
                    BookLoanID3.setText(rs.getString("Book_Loan_ID_3"));
                    notFound = 1;
                    con.close();
                }
                if (notFound == 0) {
                    JOptionPane.showMessageDialog(null, "invalid " + dataname, "Warning", JOptionPane.ERROR_MESSAGE);
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

            DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Name Book", "Author", "ISBN", "genre", "year", "Language", "Photo Book", "Book File", "LoanID"}, 0);

            Table.setModel(model);
            String sql = "SELECT * FROM booksdata";

            ResultSet rs = st.executeQuery(sql);
            String i, nb, a, is, g, y, p, bf, lo, la;
            while (rs.next()) {
                i = rs.getString("id");
                nb = rs.getString("Namebook");
                a = rs.getString("author");
                is = rs.getString("ISBN");
                g = rs.getString("genre");
                y = rs.getString("year");
                la = rs.getString("language");
                p = rs.getString("photobook");
                bf = rs.getString("bookfile");
                lo = rs.getString("loanID");

                model.addRow(new Object[]{i, nb, a, is, g, y, la, p, bf, lo});
            }
        } catch (Exception e) {
            System.out.println("(loadData)Error 501 : " + e.getMessage());
        }
    }

    public void loadUserData() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Full Name", "Email", "Password", "Book Loan ID 1", "Book Loan ID 2", "Book Loan ID 3"}, 0);

            UserTable.setModel(model);
            String sql = "SELECT * FROM user";

            ResultSet rs = st.executeQuery(sql);
            String i, fN, e, p, bLI1, bLI2, bLI3;
            while (rs.next()) {
                i = rs.getString("id");
                fN = rs.getString("fullName");
                e = rs.getString("email");
                p = rs.getString("password");
                bLI1 = rs.getString("Book_Loan_ID_1");
                bLI2 = rs.getString("Book_Loan_ID_2");
                bLI3 = rs.getString("Book_Loan_ID_3");

                model.addRow(new Object[]{i, fN, e, p, bLI1, bLI2, bLI3});
            }
        } catch (Exception e) {
            System.out.println("Error 4 :" + e.getMessage());
        }
    }

    public void loadLoanData() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "id user", "id Book", "Date of receipt", "Return Date", "Debit", "isReturned"}, 0);

            loanTable.setModel(model);

            String sql = "SELECT * FROM loan";
            ResultSet rs = st.executeQuery(sql);

            String ID, iU, iB, dor, rd, d;
            boolean ir;

            while (rs.next()) {

                ID = rs.getString("ID");
                iU = rs.getString("id_user");
                iB = rs.getString("id_book");
                dor = rs.getString("Date_Of_Receipt");
                rd = rs.getString("Return_Date");
                d = rs.getString("Debit");
                if (rs.getString("isReturned").equals("0")) {
                    ir = true;
                } else {
                    ir = false;
                }
                model.addRow(new Object[]{ID, iU, iB, dor, rd, d, ir});
            }

        } catch (Exception e) {
            System.out.println("Error 78 : " + e.getMessage());
        }
    }

    private void UploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath().replace("\\", "\\\\");
        photobook_url.setText(filename);
    }//GEN-LAST:event_UploadActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        namebook.setText("");
        author.setText("");
        ISBN.setText("");
        genre.setText("");
        year.setText("");
        language.setText("");
        photobook_url.setText("");
        bookfile_url.setText("");
        loanID.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        String ID;
        int notFound = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            ID = searchData.getText();
            if ("".equals(ID)) {
                JOptionPane.showMessageDialog(null, "ID is require", "Warning", JOptionPane.ERROR_MESSAGE);
            } else {
                String sql = "SELECT * FROM booksdata WHERE id=" + ID;
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    notFound = 1;
                    String sql2 = "DELETE FROM booksdata WHERE id=" + ID;
                    st.executeUpdate(sql2);
                    loadData();
                    con.close();
                }
                if (notFound == 0) {
                    JOptionPane.showMessageDialog(null, "invalid ID", "Warning", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void Update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update1ActionPerformed
        String ID;
        String namebook2, author2, ISBN2, genre2, year2, language2, photobook2, bookfile2, loanID2;
        int notFound = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            ID = searchData.getText();
            if ("".equals(ID)) {
                JOptionPane.showMessageDialog(null, "ID is require", "Warning", JOptionPane.ERROR_MESSAGE);
            } else {
                String sql = "SELECT * FROM booksdata WHERE id=" + ID;
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    notFound = 1;
                    namebook2 = namebook.getText();
                    author2 = author.getText();
                    ISBN2 = ISBN.getText();
                    genre2 = genre.getText();
                    year2 = year.getText();
                    language2 = language.getText();
                    photobook2 = photobook_url.getText();
                    bookfile2 = bookfile_url.getText();
                    loanID2 = loanID.getText();

                    String sql2 = "UPDATE booksdata SET NameBook='" + namebook2 + "',author='" + author2 + "',ISBN='" + ISBN2 + "',genre='" + genre2 + "',year='" + year2 + "',language='" + language2 + "',photobook='" + photobook2 + "',bookfile='" + bookfile2 + "',loanID='" + loanID2 + "'  WHERE id=" + ID;
                    st.executeUpdate(sql2);
                    loadData();
                    con.close();
                }
                if (notFound == 0) {
                    JOptionPane.showMessageDialog(null, "invalid ID", "Warning", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

    }//GEN-LAST:event_Update1ActionPerformed

    private void Create1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create1ActionPerformed

        String NB, au, IS, ge, ye, la, pb, bf, query;
        String li;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);

            Statement st = con.createStatement();

            if ("".equals(namebook.getText())) {
                JOptionPane.showMessageDialog(null, "Name Book is require", "Warning", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(author.getText())) {
                JOptionPane.showMessageDialog(null, "Author is require", "Warning", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(ISBN.getText())) {
                JOptionPane.showMessageDialog(null, "ISBN is require", "Warning", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(genre.getText())) {
                JOptionPane.showMessageDialog(null, "genre is require", "Warning", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(year.getText())) {
                JOptionPane.showMessageDialog(null, "year is require", "Warning", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(language.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Language is require", "Warning", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(bookfile_url.getText())) {
                JOptionPane.showMessageDialog(null, "Book File is require", "Warning", JOptionPane.ERROR_MESSAGE);
            } else {
                if ("".equals(loanID.getText())) {
                    li = "0";
                } else {
                    li = loanID.getText();
                }
                NB = namebook.getText();
                au = author.getText();
                IS = ISBN.getText();
                ge = genre.getText();
                ye = year.getText();
                la = language.getText();
                pb = photobook_url.getText();
                bf = bookfile_url.getText();

                query = "INSERT INTO booksdata (NameBook, author, ISBN, genre, year, language, photobook, bookfile, loanID) "
                        + "VALUES ('" + NB + "','" + au + "','" + IS + "','" + ge + "','" + ye + "','" + la + "','" + pb + "','" + bf + "','" + li + "')";

                st.executeUpdate(query);
                namebook.setText("");
                author.setText("");
                ISBN.setText("");
                genre.setText("");
                year.setText("");
                language.setText("");
                photobook_url.setText("");
                bookfile_url.setText("");
                loanID.setText("");
                showMessageDialog(null, "Successfully Registered.");
                loadData();

                con.close();
            }

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }//GEN-LAST:event_Create1ActionPerformed

    private void Upload1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Upload1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath().replace("\\", "\\\\");
        bookfile_url.setText(filename);
    }//GEN-LAST:event_Upload1ActionPerformed

    private void searchDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchDataActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportActionPerformed
        
        
        int numberOfBooksLoan = 0;
        long debit = 0 ;
        int numberOfBooks=0;
        int numberOfUser =0;
        
        try {
            
            //Connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, user, pass);
            
            //Loan report
            Statement stL = con.createStatement();
            String sqlL = "SELECT * FROM loan";
            ResultSet rsL = stL.executeQuery(sqlL);
            while( rsL.next() ){
                debit += rsL.getDouble("Debit");
                numberOfBooksLoan++;
            }
            
            //Book report
            Statement stB = con.createStatement();
            String sqlB = "SELECT * FROM booksdata";
            ResultSet rsB = stB.executeQuery(sqlB);
            while( rsB.next() ){
                numberOfBooks++;
            }
            //user report
            Statement stU = con.createStatement();
            String sqlU = "SELECT * FROM user";
            ResultSet rsU = stU.executeQuery(sqlU);
            while( rsU.next() ){
                numberOfUser++;
            }
            
            con.close();
            
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        
        String  str = "\n\nThe number of users is : " + numberOfUser
                    + "\nNumber of books borrowed : " + numberOfBooksLoan
                    + "\nThe number of books in the office is : "+ numberOfBooks
                    + "\nThe amount obtained from book borrowing is : "+ debit +"$\t\n\n\n";
        
        JOptionPane.showMessageDialog(null, str, "report", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_reportActionPerformed

    private void bookButtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtenActionPerformed
        jTabbedPane1.setSelectedIndex(0);
        loadData();
    }//GEN-LAST:event_bookButtenActionPerformed

    private void userButtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userButtenActionPerformed
        jTabbedPane1.setSelectedIndex(1);
        loadUserData();
    }//GEN-LAST:event_userButtenActionPerformed

    private void loanButtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanButtenActionPerformed
        jTabbedPane1.setSelectedIndex(2);
        loadLoanData();
    }//GEN-LAST:event_loanButtenActionPerformed

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
        String fN, e, p, query;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);

            Statement st = con.createStatement();

            if ("".equals(FullName.getText())) {
                JOptionPane.showMessageDialog(null, "Full Name is require", "Warning", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(Email.getText())) {
                JOptionPane.showMessageDialog(null, "Email is require", "Warning", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(Password.getText())) {
                JOptionPane.showMessageDialog(null, "Password is require", "Warning", JOptionPane.ERROR_MESSAGE);
            } else {

                fN = FullName.getText();
                e = Email.getText();
                p = Password.getText();

                query = "INSERT INTO user ( fullName, email, password ) "
                        + "VALUES ('" + fN + "','" + e + "','" + p + "')";

                st.executeUpdate(query);
                FullName.setText("");
                Email.setText("");
                Password.setText("");

                showMessageDialog(null, "Successfully Registered.");
                loadUserData();

                con.close();
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Error 3");
        } catch (SQLException ex) {
            Logger.getLogger(AdminSettings.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error 48");
        }
    }//GEN-LAST:event_addUserActionPerformed

    private void userUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userUpdateActionPerformed
        String ID;
        String fullName, email, password;
        int notFound = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            ID = UserSearch.getText();
            if ("".equals(ID)) {
                JOptionPane.showMessageDialog(null, "ID is require", "Warning", JOptionPane.ERROR_MESSAGE);
            } else {
                String sql = "SELECT * FROM user WHERE id=" + ID;
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    notFound = 1;
                    fullName = FullName.getText();
                    email = Email.getText();
                    password = Password.getText();

                    String sql2 = "UPDATE user SET fullName = '" + fullName + "', email = '" + email + "' ,password = '" + password + "'  WHERE id=" + ID;
                    st.executeUpdate(sql2);
                    loadUserData();
                    con.close();
                }
                if (notFound == 0) {
                    JOptionPane.showMessageDialog(null, "invalid ID", "Warning", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }//GEN-LAST:event_userUpdateActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void UserSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserSearchActionPerformed

    private void userBlockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userBlockActionPerformed
        String ID;
        int notFound = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            ID = UserSearch.getText();
            if ("".equals(ID)) {
                JOptionPane.showMessageDialog(null, "ID is require", "Warning", JOptionPane.ERROR_MESSAGE);
            } else {
                String sql = "SELECT * FROM user WHERE id=" + ID;
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    notFound = 1;
                    String sql2 = "DELETE FROM user WHERE id=" + ID;
                    st.executeUpdate(sql2);
                    loadUserData();
                    con.close();
                }
                if (notFound == 0) {
                    JOptionPane.showMessageDialog(null, "invalid ID", "Warning", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }//GEN-LAST:event_userBlockActionPerformed

    private void userClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userClearActionPerformed
        FullName.setText("");
        Email.setText("");
        Password.setText("");
        BookLoanID1.setText("");
        BookLoanID2.setText("");
        BookLoanID3.setText("");
    }//GEN-LAST:event_userClearActionPerformed

    private void searchBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtn1ActionPerformed

        switch (jComboBox2.getSelectedIndex()) {
            case 0:
                JOptionPane.showMessageDialog(null, "Found ...???", "found what ????", JOptionPane.ERROR_MESSAGE);
                break;
            case 1:
                userSearch("id", false);
                break;
            case 2:
                userSearch("email", true);
                break;
        }
    }//GEN-LAST:event_searchBtn1ActionPerformed

    private void ReturnDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReturnDateActionPerformed

    private void searchBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtn2ActionPerformed

        String ID;
        int notFound = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            ID = loanSearch.getText();
            if ("".equals(ID)) {
                JOptionPane.showMessageDialog(null, "ID is require", "Warning", JOptionPane.ERROR_MESSAGE);
            } else {

                String sql = "SELECT * FROM loan WHERE ID=" + ID;
                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    idUser.setText(rs.getString("id_user"));
                    idBook.setText(rs.getString("id_book"));
                    DateOfReceipt.setText(rs.getString("Date_of_receipt"));
                    ReturnDate.setText(rs.getString("Return_Date"));

                    notFound = 1;
                    con.close();
                }
                if (notFound == 0) {
                    JOptionPane.showMessageDialog(null, "invalid ID", "Warning", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

    }//GEN-LAST:event_searchBtn2ActionPerformed

    private void userClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userClear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userClear1ActionPerformed

    private void loanSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loanSearchActionPerformed

    private void addUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUser1ActionPerformed
        String iU, iB, DS, DE, query;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySql://localhost:3306/librarymanagementsystemdata";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);

            Statement st = con.createStatement();

            if ("".equals(idUser.getText())) {
                JOptionPane.showMessageDialog(null, "ID User is require", "Warning", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(idBook.getText())) {
                JOptionPane.showMessageDialog(null, "ID Book is require", "Warning", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(DateOfReceipt.getText())) {
                JOptionPane.showMessageDialog(null, "Date Of Receipt is require", "Warning", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(ReturnDate.getText())) {
                JOptionPane.showMessageDialog(null, "ReturnDate is require", "Warning", JOptionPane.ERROR_MESSAGE);
            } else {

                iU = idUser.getText();
                iB = idBook.getText();
                DS = DateOfReceipt.getText();
                DE = ReturnDate.getText();

                query = "INSERT INTO loan ( id_user, id_book, Date_of_receipt, Return_Date ) "
                        + "VALUES (" + iU + "," + iB + ",'" + DS + "','" + DE + "')";

                st.executeUpdate(query);
                idUser.setText("");
                idBook.setText("");
                DateOfReceipt.setText("");
                ReturnDate.setText("");

                showMessageDialog(null, "Successfully Registered.");
                loadUserData();

                con.close();
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Error 3 : " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(AdminSettings.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error 48 : " + ex.getMessage());
        }
    }//GEN-LAST:event_addUser1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdminSettings x = new AdminSettings();
                x.loadData();
                x.loadUserData();
                x.setLocationRelativeTo(null);
                x.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BookData;
    private javax.swing.JLabel BookLoanID1;
    private javax.swing.JLabel BookLoanID2;
    private javax.swing.JLabel BookLoanID3;
    private javax.swing.JButton Create1;
    private javax.swing.JTextField DateOfReceipt;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField FullName;
    private javax.swing.JTextField ISBN;
    private javax.swing.JPanel Loan;
    private javax.swing.JTextField Password;
    private javax.swing.JTextField ReturnDate;
    private javax.swing.JTable Table;
    private javax.swing.JButton Update1;
    private javax.swing.JButton Upload;
    private javax.swing.JButton Upload1;
    private javax.swing.JPanel UserData;
    private javax.swing.JTextField UserSearch;
    private javax.swing.JTable UserTable;
    private javax.swing.JButton addUser;
    private javax.swing.JButton addUser1;
    private javax.swing.JTextField author;
    private javax.swing.JButton bookButten;
    private javax.swing.JLabel bookfile_url;
    private javax.swing.JButton clear;
    private javax.swing.JTextField genre;
    private javax.swing.JTextField idBook;
    private javax.swing.JTextField idUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField language;
    private javax.swing.JButton loanButten;
    private javax.swing.JTextField loanID;
    private javax.swing.JTextField loanSearch;
    private javax.swing.JTable loanTable;
    private javax.swing.JTextField namebook;
    private javax.swing.JLabel photobook_url;
    private javax.swing.JButton report;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton searchBtn1;
    private javax.swing.JButton searchBtn2;
    private javax.swing.JTextField searchData;
    private javax.swing.JButton userBlock;
    private javax.swing.JButton userButten;
    private javax.swing.JButton userClear;
    private javax.swing.JButton userClear1;
    private javax.swing.JButton userUpdate;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables

//    byte[] photo=null;
    String filename = null;
}
