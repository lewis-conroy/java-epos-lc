package epos;

import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public final class View extends javax.swing.JFrame {

    // Global 'session' variables.
    // user holds information about the current user.
    public static User user;
    // epos holds information about session sales etc
    public static Epos epos;
    
    // Listmodel used to track the current order.
    public static DefaultListModel listModel = new DefaultListModel();
    public static double cost = 0.0;
    
    // Controllers for relevant tables in the database.
    public static ProductController productController = new ProductController();
    public static UserController userController = new UserController();
    
    public View() {
        initComponents();
        login();
        updateEPOS();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabMain = new javax.swing.JTabbedPane();
        pnlUser = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUserFirstName = new javax.swing.JTextField();
        txtUserSecondName = new javax.swing.JTextField();
        txtUserID = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtUserUsername = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtUserPermission = new javax.swing.JTextField();
        pnlSales = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCustomersServed = new javax.swing.JTextField();
        txtAverageSale = new javax.swing.JTextField();
        txtMinimumSale = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtMaximum = new javax.swing.JTextField();
        pnlManagerTools = new javax.swing.JPanel();
        tabStats = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listManagerRead = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtReadFirstName = new javax.swing.JTextField();
        txtReadSecondName = new javax.swing.JTextField();
        txtReadID = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtReadUsername = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtReadPermission = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtReadTakings = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtCreateFirstName = new javax.swing.JTextField();
        txtCreateSecondName = new javax.swing.JTextField();
        txtCreateUsername = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        cboCreatePermission = new javax.swing.JComboBox<>();
        txtCreatePassword = new javax.swing.JPasswordField();
        btnCreateClear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listManagerUpdate = new javax.swing.JList<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtUpdateFirstName = new javax.swing.JTextField();
        txtUpdateSecondName = new javax.swing.JTextField();
        txtUpdateUsername = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        cboUpdatePermission = new javax.swing.JComboBox<>();
        txtUpdatePassword = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listManagerDelete = new javax.swing.JList<>();
        btnDeleteUser = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        btnDeleteProduct = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        listProducts = new javax.swing.JList<>();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        txtProductImage = new javax.swing.JTextField();
        txtProductPrice = new javax.swing.JTextField();
        btnAddProduct = new javax.swing.JButton();
        btnRestart = new javax.swing.JButton();
        pnlEPOS = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        txtOrderCost = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        listOrder = new javax.swing.JList<>();
        btnCheckout = new javax.swing.JButton();
        btnRemoveLastItem = new javax.swing.JButton();
        btnCancelOrder = new javax.swing.JButton();
        scrollButtons = new javax.swing.JScrollPane();
        pnlButtons = new javax.swing.JPanel();
        spnQuantity = new javax.swing.JSpinner();
        jLabel36 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EPOS System");

        jLabel1.setText("First Name:");

        jLabel2.setText("Second Name:");

        jLabel3.setText("ID:");

        txtUserFirstName.setEditable(false);

        txtUserSecondName.setEditable(false);

        txtUserID.setEditable(false);

        jLabel29.setText("Username:");

        txtUserUsername.setEditable(false);

        jLabel31.setText("Permission:");

        txtUserPermission.setEditable(false);

        javax.swing.GroupLayout pnlUserLayout = new javax.swing.GroupLayout(pnlUser);
        pnlUser.setLayout(pnlUserLayout);
        pnlUserLayout.setHorizontalGroup(
            pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel29)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUserPermission, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(txtUserSecondName)
                    .addComponent(txtUserID)
                    .addComponent(txtUserUsername))
                .addContainerGap(671, Short.MAX_VALUE))
        );

        pnlUserLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtUserFirstName, txtUserID, txtUserPermission, txtUserSecondName, txtUserUsername});

        pnlUserLayout.setVerticalGroup(
            pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUserFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUserSecondName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtUserUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtUserPermission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(350, Short.MAX_VALUE))
        );

        tabMain.addTab("User Details", pnlUser);

        jLabel4.setText("Customers Served:");

        jLabel5.setText("Average Sale Price:");

        jLabel6.setText("Minimum Sale Price:");

        jLabel7.setText("Total Session Takings:");

        jLabel8.setText("Maximum Sale Price:");

        txtCustomersServed.setEditable(false);

        txtAverageSale.setEditable(false);

        txtMinimumSale.setEditable(false);

        txtTotal.setEditable(false);

        txtMaximum.setEditable(false);

        javax.swing.GroupLayout pnlSalesLayout = new javax.swing.GroupLayout(pnlSales);
        pnlSales.setLayout(pnlSalesLayout);
        pnlSalesLayout.setHorizontalGroup(
            pnlSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCustomersServed, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAverageSale, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMinimumSale, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaximum, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(656, Short.MAX_VALUE))
        );
        pnlSalesLayout.setVerticalGroup(
            pnlSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCustomersServed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAverageSale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMinimumSale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtMaximum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(350, Short.MAX_VALUE))
        );

        tabMain.addTab("Sales Records", pnlSales);

        jLabel9.setText("All Users");

        listManagerRead.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listManagerReadValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listManagerRead);

        jLabel10.setText("First Name:");

        jLabel11.setText("Second Name:");

        jLabel12.setText("ID:");

        txtReadFirstName.setEditable(false);

        txtReadSecondName.setEditable(false);

        txtReadID.setEditable(false);

        jLabel30.setText("Username:");

        txtReadUsername.setEditable(false);

        jLabel32.setText("Permission:");

        txtReadPermission.setEditable(false);

        jLabel35.setText("Total Takings:");

        txtReadTakings.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel30)
                            .addComponent(jLabel32))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtReadFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtReadTakings, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtReadSecondName, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtReadID, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtReadUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtReadPermission, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel9))
                .addContainerGap(291, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtReadFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35)
                            .addComponent(txtReadTakings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtReadSecondName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtReadID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(txtReadUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(txtReadPermission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tabStats.addTab("Read Users", jPanel1);

        jLabel13.setText("First Name:");

        jLabel14.setText("Second Name:");

        jLabel15.setText("Username:");

        jLabel16.setText("Password:");

        btnCreate.setText("Create New User");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel33.setText("Permission:");

        cboCreatePermission.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));

        btnCreateClear.setText("Clear");
        btnCreateClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel33))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCreatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCreateUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCreateSecondName, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboCreatePermission, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCreateFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnCreateClear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(237, 237, 237))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cboCreatePermission, txtCreateFirstName, txtCreatePassword, txtCreateSecondName, txtCreateUsername});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtCreateFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtCreateSecondName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtCreateUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtCreatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(cboCreatePermission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnCreate)
                .addGap(18, 18, 18)
                .addComponent(btnCreateClear)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        tabStats.addTab("Create Users", jPanel2);

        listManagerUpdate.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listManagerUpdateValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listManagerUpdate);

        jLabel17.setText("All Users");

        jLabel18.setText("First Name:");

        jLabel19.setText("Second Name:");

        jLabel20.setText("Username:");

        jLabel21.setText("Password:");

        btnUpdate.setText("Update User");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel34.setText("Permission:");

        cboUpdatePermission.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(btnUpdate)))
                        .addGap(305, 305, 305))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel34))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUpdateUsername)
                            .addComponent(txtUpdateSecondName)
                            .addComponent(txtUpdateFirstName)
                            .addComponent(cboUpdatePermission, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUpdatePassword))
                        .addGap(186, 186, 186))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtUpdateFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtUpdateSecondName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUpdateUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtUpdatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(cboUpdatePermission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate)))
                .addContainerGap())
        );

        tabStats.addTab("Update Users", jPanel3);

        jLabel22.setText("All Users");

        jScrollPane3.setViewportView(listManagerDelete);

        btnDeleteUser.setText("Delete User");
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteUser))
                    .addComponent(jLabel22))
                .addContainerGap(641, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDeleteUser))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tabStats.addTab("Delete Users", jPanel4);

        jLabel23.setText("Remove Product");

        btnDeleteProduct.setText("Delete Selected Item");
        btnDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProductActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(listProducts);

        jLabel24.setText("Add Product");

        jLabel25.setText("Product Name:");

        jLabel26.setText("Product Image:");

        jLabel27.setText("Product Price:");

        btnAddProduct.setText("Add New Item");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnDeleteProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                    .addComponent(jLabel23))
                .addGap(324, 324, 324)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(txtProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtProductImage, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtProductImage, txtProductName, txtProductPrice});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeleteProduct))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(txtProductImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(txtProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddProduct)))
                .addContainerGap())
        );

        tabStats.addTab("Manage EPOS", jPanel5);

        btnRestart.setText("Restart System");
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlManagerToolsLayout = new javax.swing.GroupLayout(pnlManagerTools);
        pnlManagerTools.setLayout(pnlManagerToolsLayout);
        pnlManagerToolsLayout.setHorizontalGroup(
            pnlManagerToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManagerToolsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlManagerToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabStats)
                    .addGroup(pnlManagerToolsLayout.createSequentialGroup()
                        .addComponent(btnRestart)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlManagerToolsLayout.setVerticalGroup(
            pnlManagerToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlManagerToolsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRestart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabStats)
                .addContainerGap())
        );

        tabMain.addTab("Manager Tools", pnlManagerTools);

        jLabel28.setText("Total Order Cost:");

        txtOrderCost.setEditable(false);
        txtOrderCost.setText("£0.00");

        jScrollPane6.setViewportView(listOrder);

        btnCheckout.setText("Checkout Order");
        btnCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckoutActionPerformed(evt);
            }
        });

        btnRemoveLastItem.setText("Remove Last Item");
        btnRemoveLastItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveLastItemActionPerformed(evt);
            }
        });

        btnCancelOrder.setText("Cancel Order");
        btnCancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelOrderActionPerformed(evt);
            }
        });

        scrollButtons.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollButtons.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        pnlButtons.setPreferredSize(new java.awt.Dimension(428, 1000));

        javax.swing.GroupLayout pnlButtonsLayout = new javax.swing.GroupLayout(pnlButtons);
        pnlButtons.setLayout(pnlButtonsLayout);
        pnlButtonsLayout.setHorizontalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 667, Short.MAX_VALUE)
        );
        pnlButtonsLayout.setVerticalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );

        scrollButtons.setViewportView(pnlButtons);

        spnQuantity.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel36.setText("Quantity:");

        javax.swing.GroupLayout pnlEPOSLayout = new javax.swing.GroupLayout(pnlEPOS);
        pnlEPOS.setLayout(pnlEPOSLayout);
        pnlEPOSLayout.setHorizontalGroup(
            pnlEPOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEPOSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEPOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnCheckout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemoveLastItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlEPOSLayout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOrderCost, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEPOSLayout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlEPOSLayout.setVerticalGroup(
            pnlEPOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEPOSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEPOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEPOSLayout.createSequentialGroup()
                        .addGroup(pnlEPOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(txtOrderCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlEPOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btnRemoveLastItem, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabMain.addTab("EPOS", pnlEPOS);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabMain)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabMain)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listManagerReadValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listManagerReadValueChanged
        //Updates the read user fields based on the current selected user in the list.
        
        String username = listManagerRead.getSelectedValue();
        User selectedUser = UserController.retrieveDetails(username);
        
        txtReadFirstName.setText(selectedUser.getFirstName());
        txtReadSecondName.setText(selectedUser.getSecondName());
        txtReadID.setText(selectedUser.getID());
        txtReadUsername.setText(selectedUser.getUsername());
        txtReadPermission.setText(selectedUser.getPermission());
        
        // Gets the selected user's total takings from the sales table.
        double total = SalesController.retrieveTotal(user.getUsername());
        
        String stringTotal = (String) String.format("%.2f", total);
        
        txtReadTakings.setText("£" + stringTotal);
    }//GEN-LAST:event_listManagerReadValueChanged

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // Creates a new User object to insert into the users table.
        User newUser = new User();
        User.setFirstName(txtCreateFirstName.getText());
        User.setSecondName(txtCreateSecondName.getText());
        User.setPassword(txtCreatePassword.getText());
        User.setUsername(txtCreateUsername.getText());
        User.setPermission((String)cboCreatePermission.getSelectedItem());
        
        // inserts user, and then updates the CRUD features of the app.
        UserController.insertUser(newUser);
        updateManagerTools();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        // Creates a new Product object to insert into the products table.
        Product product = new Product();
        
        String name = txtProductName.getText();
        String image = txtProductImage.getText();
        String price = txtProductPrice.getText();
        
        product.setName(name);
        product.setImage(image);
        product.setPrice(price);
        
        // inserts product and updates the CRUD features of the app.
        ProductController.insertProduct(product);   
        updateManagerTools();
        
        txtProductName.setText("");
        txtProductImage.setText("");
        txtProductPrice.setText("");
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // Creates a new User object and then replaces the old user in the users table
        // with the updated fields.
        
        String username = listManagerUpdate.getSelectedValue();
        User updateUser = new User();
        
        String firstName = txtUpdateFirstName.getText();
        String secondName = txtUpdateSecondName.getText();
        String newUsername = txtUpdateUsername.getText();
        String password = txtUpdatePassword.getText();
        String permission = (String)cboUpdatePermission.getSelectedItem();
       
        updateUser.setFirstName(firstName);
        updateUser.setSecondName(secondName);
        updateUser.setPassword(password);
        updateUser.setUsername(newUsername);
        updateUser.setPermission(permission);

        // updates the users table and updates the CRUD features of the app.
        UserController.updateUser(username, updateUser);
        updateManagerTools();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void listManagerUpdateValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listManagerUpdateValueChanged
        // Changes the update user screen when the selected list item is changed.
        
        String username = listManagerUpdate.getSelectedValue();
        User selectedUser = UserController.retrieveDetails(username);
        
        txtUpdateFirstName.setText(selectedUser.getFirstName());
        txtUpdateSecondName.setText(selectedUser.getSecondName());
        txtUpdateUsername.setText(selectedUser.getUsername());
        txtUpdatePassword.setText(selectedUser.getPassword());
        cboUpdatePermission.setSelectedItem((String)selectedUser.getPermission());
    }//GEN-LAST:event_listManagerUpdateValueChanged

    private void btnDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProductActionPerformed
        // Deletes the selected item from the products table and resets CRUD features.
        
        String selectedItem = listProducts.getSelectedValue();
        
        ProductController.deleteProduct(selectedItem);
        updateManagerTools();
    }//GEN-LAST:event_btnDeleteProductActionPerformed

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        // Deletes the selected user from the products table and resets CRUD features.
        
        String username = listManagerDelete.getSelectedValue();
        
        UserController.deleteUser(username);
        updateManagerTools();
    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void btnCreateClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateClearActionPerformed
        // Clears the fields in the create username screen.
        
        txtCreateFirstName.setText("");
        txtCreateSecondName.setText("");
        txtCreateUsername.setText("");
        txtCreatePassword.setText("");
        cboCreatePermission.setSelectedItem("User");
    }//GEN-LAST:event_btnCreateClearActionPerformed

    private void btnCancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOrderActionPerformed
        // Initialises the cost and order variables.
        
        cost = 0.00;
        txtOrderCost.setText("£0.00");
        listModel = new DefaultListModel();
        listOrder.setModel(listModel);
        
    }//GEN-LAST:event_btnCancelOrderActionPerformed

    private void btnRemoveLastItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveLastItemActionPerformed
        // Removes the last item from every relevant array, and subtracts the cost.
        
        try
        {
            cost -= epos.priceList.get( epos.priceList.size() -1);
            
            listModel.remove( listModel.size() - 1);
            epos.priceList.remove( epos.priceList.size() -1);
            
            // Updates the order to display the changes.
            updateOrder();
            
        }
        catch (IndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(null, "Error: No items in cart.");
        }
        
    }//GEN-LAST:event_btnRemoveLastItemActionPerformed

    private void btnCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckoutActionPerformed
        // Checks out order and displays invoice.
        
        // Checks that there is at least one item in the cart.
        if (epos.priceList.size() > 0)
        {
            // checkout() updates the epos variables, and sales table.
            checkout();
            // Dispalys invoice.
            JOptionPane.showMessageDialog(null, "Order complete.\n Total price: £" + String.format("%.2f", cost));
            // initialises the order.
            listModel.removeAllElements();
            txtOrderCost.setText("£0.00");
            cost = 0.00;
            epos.priceList.clear();
            epos.checkoutList.clear();
            // updates CRUD.
            updateManagerTools();
            updateRecords();
        }
        
    }//GEN-LAST:event_btnCheckoutActionPerformed

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        // Restarts the system by clearing the sales table.
        
        // Displays confirmation box to prevent accidental resets.
        JLabel confirm = new JLabel("Resetting the system will delete all sales records. Are you sure?");
        Object[] guiElements = {confirm};
        int choice = JOptionPane.showConfirmDialog(null, guiElements, "Reset System",
                javax.swing.JOptionPane.OK_CANCEL_OPTION,
                javax.swing.JOptionPane.PLAIN_MESSAGE);
        
        if (choice == javax.swing.JOptionPane.OK_OPTION)
        {
            // clears the sales table.
            SalesController.resetSystem();
            JOptionPane.showMessageDialog(null, "System Reset.");
            // clears the list of transactions.
            epos.transactionList.clear();
            // updates CRUD.
            updateManagerTools();
            updateRecords();
        }
    }//GEN-LAST:event_btnRestartActionPerformed

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }
    
    public static User loginDialog()
    {
        // initialises global user and epos variables.
        user = new User();
        epos = new Epos();
        
        // Displays login dialog. accepts username and password.
        JLabel loginLabel = new JLabel("Username:");
        JTextField loginField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();
        
        Object[] guiElements = {loginLabel, loginField, passwordLabel, passwordField};
        
        int dialog = JOptionPane.showConfirmDialog(null, guiElements, "Login",
                javax.swing.JOptionPane.OK_CANCEL_OPTION,
                javax.swing.JOptionPane.PLAIN_MESSAGE);
        
        if (dialog == javax.swing.JOptionPane.OK_OPTION)
        {
            String username = loginField.getText().trim();
            System.out.println("Entered: " + username);
            String password = passwordField.getText().trim();
            
            user = UserController.retrieveDetails(username);
            
            if (password.equals(user.getPassword()) )
            {
                return user;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Incorrect Login.");
                user = loginDialog();
                return user;
            }
        }
        else if (dialog == javax.swing.JOptionPane.CANCEL_OPTION || dialog == javax.swing.JOptionPane.CLOSED_OPTION)
        {
            System.exit(0);
        }
        return null;
    }
    
    public void login()
    {
        this.setVisible(false);
        
        user = loginDialog();
        if (!user.getPermission().equals("Admin"))
        {
            tabMain.remove(pnlManagerTools);
        }
        
        String username = user.getUsername();
        
        txtUserFirstName.setText(user.getFirstName());
        txtUserSecondName.setText(user.getSecondName());
        txtUserID.setText(user.getID());
        txtUserUsername.setText(user.getUsername());
        txtUserPermission.setText(user.getPermission());
        
        updateRecords();
        updateManagerTools();

        // Prevents username overwrite in updateManagerTools();
        user.setUsername(username);
        System.out.println("Username: " + user.getUsername());
        
        this.setVisible(true);
    }
    
    public void updateRecords()
    {
        // Updates the fields to the correct value.
        
        txtCustomersServed.setText(String.valueOf(epos.getCustomersServed()));
        txtTotal.setText("£" + String.format("%.2f", epos.getTotalTakings()));
        txtMaximum.setText("£" + String.format("%.2f", epos.getMaximumSale()));
        txtMinimumSale.setText("£" + String.format("%.2f", epos.getMinimumSale()));
        txtAverageSale.setText("£" + String.format("%.2f", epos.getAverageSale()));
    }
    
    public void updateManagerTools()
    {
        // Updates the CRUD features in the app by querying the database.
        
        // Creates a list to store usernames in.
        ArrayList<String> userList = UserController.retrieveUsernames();
        
        DefaultListModel listModel = new DefaultListModel();
        for (String member : userList)
        {
            // Adds each username to a listmodel
            listModel.addElement(member);
        }
        
        // Sets the listboxes in the CRUD screens to the listmodel of usernames.
        listManagerRead.setModel(listModel);
        listManagerDelete.setModel(listModel);
        listManagerUpdate.setModel(listModel);
        
        // Creates a list to store product names in.
        ArrayList<String> productList = ProductController.retrieveProductNames();
        
        listModel = new DefaultListModel();
        for (String member: productList)
        {
            // Adds each product name to a listmodel
            listModel.addElement(member);
        }
        
        // Sets the product lists to the correct listmodel.
        listProducts.setModel(listModel);
        
        // Sets the selected user to the first user.
        listManagerRead.setSelectedIndex(0);
        listManagerDelete.setSelectedIndex(0);
        listManagerUpdate.setSelectedIndex(0);
        
        // Sets the fields for the selected user.
        String selectedUser = (String)listManagerRead.getSelectedValue();
        double total = SalesController.retrieveTotal(selectedUser);
        String stringTotal = String.format("%.2f", total);
        txtReadTakings.setText("£" + stringTotal);
        
        updateEPOS();
    }
    
    public void updateEPOS()
    {
        // Creates a button for each product programmatically.
        
        // Removes all existing buttons.
        pnlButtons.removeAll();
        
        // Initial button location.
        int x = 15;
        int y = 15;
        
        // Determines image folder location.
        String workingDir = System.getProperty("user.dir");
        String filepath = workingDir + "\\Data\\imgs\\";
        BufferedImage image;
        ImageIcon icon = null;
        
        for (Product item : ProductController.retrieveProducts())
        {
            // Creates an icon for the button.
            try
            { 
                image = ImageIO.read(new File(filepath + item.getImage()));
                icon = new ImageIcon(image);
            }
            catch (IOException e) { System.out.println(e); }
            
            // Button creation
            JButton button = new JButton();
            
            // ActionListener is assigned to each button so as to identify which button is pressed.
            button.addActionListener(e -> EPOSButtonPressed(item));
            
            // Sets the appearance of the button.
            button.setSize(200, 100);
            button.setIcon(icon);
            double price = Double.parseDouble(item.getPrice());
            button.setText("<html><center>" + item.getName() + ",<br>£" + String.format("%.2f", price) + "</center></html>");
            
            // Positions the button correctly.
            button.setLocation(x, y);
            x += 215;
            if (x == 660)
            {
                x = 15;
                y += 125;
            }
            // Adds the button to the button panel.
            pnlButtons.add(button);
        }
    }
    
    public void EPOSButtonPressed(Product item)
    {
        // Adds the item pressed to the order.
        
        // Gets the quantity
        int quantity = (int)spnQuantity.getValue();
        double price;
        if(quantity > 0)
        {
            // Adds the item to the listmodel.
            listModel.addElement(item.getName() + " £" + item.getPrice() + " x" + String.valueOf(quantity));
            price = Double.parseDouble(item.getPrice()) * quantity;
            // adds the cost to the pricelist.
            epos.priceList.add(price);
            cost += price;
            
            // updates the order.
            updateOrder();
        }
    }
    
    public void updateOrder()
    {
        // updates the order screen.
        
        // sets the cost label appropriately.
        txtOrderCost.setText("£" + String.format("%.2f", cost));
        // sets the order listbox to the correct listmodel.
        listOrder.setModel(listModel);
    }
    
    public void checkout()
    {
        // Checks out order and adds transaction to transactionlist.
        
        // gets price.
        String numericalPrice = txtOrderCost.getText().substring(1);
        // adds price to transactionlist.
        epos.transactionList.add( Double.parseDouble(numericalPrice) );
        
        // Calculates report values.
        double highest = epos.transactionList.get(0);
        double lowest = epos.transactionList.get(0);
        double total = 0.0;
        double average = 0.0;
        for (double member : epos.transactionList)
        {
            if (member > highest) { highest = member; }
            else if (member < lowest) { lowest = member; }
            
            total += member;
            average = total / epos.transactionList.size();
        }
        
        // sets epos variables to keep track of statistics.
        epos.setCustomersServed(epos.transactionList.size());
        epos.setAverageSale(average);
        epos.setMaximumSale(highest);
        epos.setMinimumSale(lowest);
        epos.setTotalTakings(total);
        
        /*  //Implementation of provided algorithms for assessment.
            //Above implementation is preferable.
        double lowest = epos.transactionList[0];
        for (int i = 0; i <= epos.transactionList.size() - 1; i++)
        {
            if (epos.transactionList[i] < lowest)
            {
                lowest = epos.transactionList[i];
            }
        }
        
        double highest = 0;
        for (int i = 0; i <= epos.transactionList.size() - 1; i++)
        {
            if (epos.transactionList[i] > highest)
            {
                highest = epos.transactionList[i];
            }
        }
        */
        // Submits the most recent sale.
        
        // submits sale to sales table.
        SalesController.submitSale(user, epos.transactionList.get(epos.transactionList.size() -1));
        
        // updates CRUD.
        updateManagerTools();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnCancelOrder;
    private javax.swing.JButton btnCheckout;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnCreateClear;
    private javax.swing.JButton btnDeleteProduct;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnRemoveLastItem;
    private javax.swing.JButton btnRestart;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboCreatePermission;
    private javax.swing.JComboBox<String> cboUpdatePermission;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JList<String> listManagerDelete;
    private javax.swing.JList<String> listManagerRead;
    private javax.swing.JList<String> listManagerUpdate;
    private javax.swing.JList<String> listOrder;
    private javax.swing.JList<String> listProducts;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlEPOS;
    private javax.swing.JPanel pnlManagerTools;
    private javax.swing.JPanel pnlSales;
    private javax.swing.JPanel pnlUser;
    private javax.swing.JScrollPane scrollButtons;
    private javax.swing.JSpinner spnQuantity;
    private javax.swing.JTabbedPane tabMain;
    private javax.swing.JTabbedPane tabStats;
    private javax.swing.JTextField txtAverageSale;
    private javax.swing.JTextField txtCreateFirstName;
    private javax.swing.JPasswordField txtCreatePassword;
    private javax.swing.JTextField txtCreateSecondName;
    private javax.swing.JTextField txtCreateUsername;
    private javax.swing.JTextField txtCustomersServed;
    private javax.swing.JTextField txtMaximum;
    private javax.swing.JTextField txtMinimumSale;
    private javax.swing.JTextField txtOrderCost;
    private javax.swing.JTextField txtProductImage;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtProductPrice;
    private javax.swing.JTextField txtReadFirstName;
    private javax.swing.JTextField txtReadID;
    private javax.swing.JTextField txtReadPermission;
    private javax.swing.JTextField txtReadSecondName;
    private javax.swing.JTextField txtReadTakings;
    private javax.swing.JTextField txtReadUsername;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtUpdateFirstName;
    private javax.swing.JPasswordField txtUpdatePassword;
    private javax.swing.JTextField txtUpdateSecondName;
    private javax.swing.JTextField txtUpdateUsername;
    private javax.swing.JTextField txtUserFirstName;
    private javax.swing.JTextField txtUserID;
    private javax.swing.JTextField txtUserPermission;
    private javax.swing.JTextField txtUserSecondName;
    private javax.swing.JTextField txtUserUsername;
    // End of variables declaration//GEN-END:variables
}

