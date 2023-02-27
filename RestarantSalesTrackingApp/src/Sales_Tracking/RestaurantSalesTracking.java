package Sales_Tracking;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;

//Developer: Ahmed Hassan Mohammed Salem (1191102340)
// For Dr. Nathar (OOAD)
public class RestaurantSalesTracking extends javax.swing.JFrame {

   
    List<Order> orderList = new ArrayList<Order>();
    public int totalPrice;
    public int discountAmount;
    public int finalPrice;
    public int bigMacItemCount;
    public int megaMacItemCount;
    public int doubleBeefItemCount;
    public int tripleBeefItemCount;
    public int macDeluxeItemCount;
    public int cokeItemCount;
    public int fantaItemCount;
    public int spriteItemCount;
    public int mirandaItemCount;
    public int waterItemCount;
    public CalculateDiscountedPrice coupon = new NoCoupon();
    Order food;
    Order drink;
    
    
    private javax.swing.JButton BigMacAddButton;
    private javax.swing.JCheckBox BigMacBox;
    private javax.swing.JTextField BigMacText;
    private javax.swing.JButton DoubleBeefAddButton;
    private javax.swing.JCheckBox DoubleBeefBox;
    private javax.swing.JTextField DoubleBeefText;
    private javax.swing.JButton MacDeluxeAddButton;
    private javax.swing.JCheckBox MacDeluxeBox;
    private javax.swing.JTextField MacDeluxeText;
    private javax.swing.JButton MegaMacAddButton;
    private javax.swing.JCheckBox MegaMacBox;
    private javax.swing.JTextField MegaMacText;
    private javax.swing.JButton TripleBeefAddButton;
    private javax.swing.JCheckBox TripleBeefBox;
    private javax.swing.JTextField TripleBeefText;
    private javax.swing.JPanel appHeading;
    private javax.swing.JButton cokeAddButton;
    private javax.swing.JCheckBox cokeBox;
    private javax.swing.JTextField cokeText;
    private javax.swing.JComboBox<String> couponComboBox;
    private javax.swing.JLabel couponLabel;
    private javax.swing.JTable customerBill;
    private javax.swing.JLabel discountAmountLabel;
    private javax.swing.JTextField discountAmountText;
    private javax.swing.JButton fantaAddButton;
    private javax.swing.JCheckBox fantaBox;
    private javax.swing.JTextField fantaText;
    private javax.swing.JTextField finalPriceText;
    private javax.swing.JButton generateBillButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mirandaAddButton;
    private javax.swing.JCheckBox mirandaBox;
    private javax.swing.JTextField mirandaText;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton spriteAddButton;
    private javax.swing.JCheckBox spriteBox;
    private javax.swing.JTextField spriteText;
    private javax.swing.JLabel totalLable;
    private javax.swing.JTextField totalText;
    private javax.swing.JButton waterAddButton;
    private javax.swing.JCheckBox waterBox;
    private javax.swing.JTextField waterText;
    
    public RestaurantSalesTracking() {
        initComponents();
    }

    
    
                             
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        appHeading = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BigMacBox = new javax.swing.JCheckBox();
        MegaMacBox = new javax.swing.JCheckBox();
        DoubleBeefBox = new javax.swing.JCheckBox();
        TripleBeefBox = new javax.swing.JCheckBox();
        MacDeluxeBox = new javax.swing.JCheckBox();
        BigMacText = new javax.swing.JTextField();
        MegaMacText = new javax.swing.JTextField();
        DoubleBeefText = new javax.swing.JTextField();
        TripleBeefText = new javax.swing.JTextField();
        MacDeluxeText = new javax.swing.JTextField();
        MegaMacAddButton = new javax.swing.JButton();
        DoubleBeefAddButton = new javax.swing.JButton();
        BigMacAddButton = new javax.swing.JButton();
        MacDeluxeAddButton = new javax.swing.JButton();
        TripleBeefAddButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cokeBox = new javax.swing.JCheckBox();
        fantaBox = new javax.swing.JCheckBox();
        spriteBox = new javax.swing.JCheckBox();
        mirandaBox = new javax.swing.JCheckBox();
        waterBox = new javax.swing.JCheckBox();
        cokeText = new javax.swing.JTextField();
        fantaText = new javax.swing.JTextField();
        spriteText = new javax.swing.JTextField();
        mirandaText = new javax.swing.JTextField();
        waterText = new javax.swing.JTextField();
        fantaAddButton = new javax.swing.JButton();
        cokeAddButton = new javax.swing.JButton();
        spriteAddButton = new javax.swing.JButton();
        mirandaAddButton = new javax.swing.JButton();
        waterAddButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        generateBillButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        totalLable = new javax.swing.JLabel();
        totalText = new javax.swing.JTextField();
        couponComboBox = new javax.swing.JComboBox<>();
        couponLabel = new javax.swing.JLabel();
        discountAmountLabel = new javax.swing.JLabel();
        discountAmountText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        finalPriceText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerBill = new javax.swing.JTable();

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 4, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 4, true));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 4, true));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 4, true));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 4, true));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        appHeading.setBackground(new java.awt.Color(255, 0, 0));
        appHeading.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 4, true));

        jLabel5.setFont(new java.awt.Font("Sitka Heading", 1, 36)); 
        jLabel5.setText("MacDonalds@Cyberjaya");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sales_Tracking/icons8-mcdonald`s-48.png"))); 

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sales_Tracking/icons8-mcdonald`s-48.png")));

        javax.swing.GroupLayout appHeadingLayout = new javax.swing.GroupLayout(appHeading);
        appHeading.setLayout(appHeadingLayout);
        appHeadingLayout.setHorizontalGroup(
            appHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, appHeadingLayout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(209, 209, 209))
        );
        appHeadingLayout.setVerticalGroup(
            appHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appHeadingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, appHeadingLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        getContentPane().add(appHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 950, 70));

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel1.setText("Burgers:");

        BigMacBox.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        BigMacBox.setText("BigMac (10 RM)");
        BigMacBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BigMacBoxActionPerformed(evt);
            }
        });

        MegaMacBox.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        MegaMacBox.setText("MegaMac (20 RM)");
        MegaMacBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MegaMacBoxActionPerformed(evt);
            }
        });

        DoubleBeefBox.setFont(new java.awt.Font("Tahoma", 1, 11));
        DoubleBeefBox.setText("Double Beef (15 RM)");
        DoubleBeefBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoubleBeefBoxActionPerformed(evt);
            }
        });

        TripleBeefBox.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        TripleBeefBox.setText("Triple beef (20 RM)");
        TripleBeefBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TripleBeefBoxActionPerformed(evt);
            }
        });

        MacDeluxeBox.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        MacDeluxeBox.setText("MacDeluxe (15 RM)");
        MacDeluxeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MacDeluxeBoxActionPerformed(evt);
            }
        });

        BigMacText.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        BigMacText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BigMacText.setText("0");
        BigMacText.setEnabled(false);
        BigMacText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BigMacTextActionPerformed(evt);
            }
        });
        BigMacText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BigMacTextKeyTyped(evt);
            }
        });

        MegaMacText.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        MegaMacText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MegaMacText.setText("0");
        MegaMacText.setEnabled(false);
        MegaMacText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MegaMacTextActionPerformed(evt);
            }
        });

        DoubleBeefText.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        DoubleBeefText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DoubleBeefText.setText("0");
        DoubleBeefText.setEnabled(false);
        DoubleBeefText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoubleBeefTextActionPerformed(evt);
            }
        });

        TripleBeefText.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        TripleBeefText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TripleBeefText.setText("0");
        TripleBeefText.setEnabled(false);
        TripleBeefText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TripleBeefTextActionPerformed(evt);
            }
        });

        MacDeluxeText.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        MacDeluxeText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MacDeluxeText.setText("0");
        MacDeluxeText.setEnabled(false);
        MacDeluxeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MacDeluxeTextActionPerformed(evt);
            }
        });

        MegaMacAddButton.setText("+");
        MegaMacAddButton.setEnabled(false);
        MegaMacAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MegaMacAddButtonActionPerformed(evt);
            }
        });

        DoubleBeefAddButton.setText("+");
        DoubleBeefAddButton.setEnabled(false);
        DoubleBeefAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoubleBeefAddButtonActionPerformed(evt);
            }
        });

        BigMacAddButton.setText("+");
        BigMacAddButton.setEnabled(false);
        BigMacAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BigMacAddButtonActionPerformed(evt);
            }
        });

        MacDeluxeAddButton.setText("+");
        MacDeluxeAddButton.setEnabled(false);
        MacDeluxeAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MacDeluxeAddButtonActionPerformed(evt);
            }
        });

        TripleBeefAddButton.setText("+");
        TripleBeefAddButton.setEnabled(false);
        TripleBeefAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TripleBeefAddButtonActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sales_Tracking/icons8-hamburger-96.png")));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TripleBeefBox)
                                    .addComponent(MacDeluxeBox))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TripleBeefAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(MacDeluxeAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BigMacBox)
                                    .addComponent(MegaMacBox)
                                    .addComponent(DoubleBeefBox))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(DoubleBeefAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(MegaMacAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BigMacAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MacDeluxeText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MegaMacText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BigMacText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DoubleBeefText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TripleBeefText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)))
                .addGap(33, 33, 33)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BigMacBox)
                    .addComponent(BigMacAddButton)
                    .addComponent(BigMacText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MegaMacBox)
                    .addComponent(MegaMacAddButton)
                    .addComponent(MegaMacText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DoubleBeefBox)
                    .addComponent(DoubleBeefAddButton)
                    .addComponent(DoubleBeefText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TripleBeefBox)
                    .addComponent(TripleBeefAddButton)
                    .addComponent(TripleBeefText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MacDeluxeBox)
                    .addComponent(MacDeluxeAddButton)
                    .addComponent(MacDeluxeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 260, 350));

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel2.setText("Drinks:");

        cokeBox.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        cokeBox.setText("Coke (5 RM)");
        cokeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokeBoxActionPerformed(evt);
            }
        });

        fantaBox.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        fantaBox.setText("Fanta (6 RM)");
        fantaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fantaBoxActionPerformed(evt);
            }
        });

        spriteBox.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        spriteBox.setText("Sprite (8 RM)");
        spriteBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spriteBoxActionPerformed(evt);
            }
        });

        mirandaBox.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        mirandaBox.setText("Miranda (8 RM)");
        mirandaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mirandaBoxActionPerformed(evt);
            }
        });

        waterBox.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        waterBox.setText("Water (2 RM)");
        waterBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waterBoxActionPerformed(evt);
            }
        });

        cokeText.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        cokeText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cokeText.setText("0");
        cokeText.setEnabled(false);
        cokeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokeTextActionPerformed(evt);
            }
        });

        fantaText.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        fantaText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fantaText.setText("0");
        fantaText.setEnabled(false);

        spriteText.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        spriteText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        spriteText.setText("0");
        spriteText.setEnabled(false);

        mirandaText.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        mirandaText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mirandaText.setText("0");
        mirandaText.setEnabled(false);

        waterText.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        waterText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        waterText.setText("0");
        waterText.setEnabled(false);

        fantaAddButton.setText("+");
        fantaAddButton.setEnabled(false);
        fantaAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fantaAddButtonActionPerformed(evt);
            }
        });

        cokeAddButton.setText("+");
        cokeAddButton.setEnabled(false);
        cokeAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokeAddButtonActionPerformed(evt);
            }
        });

        spriteAddButton.setText("+");
        spriteAddButton.setEnabled(false);
        spriteAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spriteAddButtonActionPerformed(evt);
            }
        });

        mirandaAddButton.setText("+");
        mirandaAddButton.setEnabled(false);
        mirandaAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mirandaAddButtonActionPerformed(evt);
            }
        });

        waterAddButton.setText("+");
        waterAddButton.setEnabled(false);
        waterAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waterAddButtonActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sales_Tracking/icons8-cup-with-straw-96.png"))); 

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(fantaBox)
                                .addGap(18, 18, 18)
                                .addComponent(fantaAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(spriteBox)
                                .addGap(18, 18, 18)
                                .addComponent(spriteAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 28, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fantaText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spriteText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(cokeBox)
                        .addGap(18, 18, 18)
                        .addComponent(cokeAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cokeText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                        .addComponent(waterBox)
                        .addGap(18, 18, 18)
                        .addComponent(waterAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(waterText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                        .addComponent(mirandaBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mirandaAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mirandaText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cokeBox)
                    .addComponent(cokeAddButton)
                    .addComponent(cokeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fantaBox)
                    .addComponent(fantaAddButton)
                    .addComponent(fantaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spriteBox)
                    .addComponent(spriteAddButton)
                    .addComponent(spriteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mirandaBox)
                    .addComponent(mirandaAddButton)
                    .addComponent(mirandaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(waterBox)
                    .addComponent(waterAddButton)
                    .addComponent(waterText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 260, 350));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));

        generateBillButton.setText("Generate Bill");
        generateBillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateBillButtonActionPerformed(evt);
            }
        });

        resetButton.setText("RESET");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        totalLable.setText("Total:");

        totalText.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        totalText.setEnabled(false);
        totalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTextActionPerformed(evt);
            }
        });

        couponComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Coupon", "Premium Coupon", "Bronze Coupon" }));
        couponComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                couponComboBoxActionPerformed(evt);
            }
        });

        couponLabel.setText("Coupon:");

        discountAmountLabel.setText("Discount Amount:");

        discountAmountText.setEditable(false);
        discountAmountText.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        discountAmountText.setEnabled(false);

        jLabel3.setText("Final Price to pay:");

        finalPriceText.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        finalPriceText.setEnabled(false);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sales_Tracking/icons8-money-48.png")));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sales_Tracking/icons8-available-updates-48.png"))); 

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalLable)
                            .addComponent(couponLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalText, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(couponComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generateBillButton)
                        .addGap(28, 28, 28)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(discountAmountLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(discountAmountText, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(finalPriceText))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetButton)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalLable)
                    .addComponent(totalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discountAmountLabel)
                    .addComponent(discountAmountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(couponComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(couponLabel)
                    .addComponent(jLabel3)
                    .addComponent(finalPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(generateBillButton, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                            .addComponent(resetButton)
                            .addGap(5, 5, 5)))
                    .addComponent(jLabel10))
                .addContainerGap())
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 410, 170));

        customerBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customerBill);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 412, 170));

        pack();
    }                     

    private void BigMacTextActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
    }                                          

    private void MegaMacTextActionPerformed(java.awt.event.ActionEvent evt) {                                            
       
    }                                           

    private void DoubleBeefTextActionPerformed(java.awt.event.ActionEvent evt) {                                               
       
    }                                              

    private void TripleBeefTextActionPerformed(java.awt.event.ActionEvent evt) {                                               
        
    }                                              

    private void MacDeluxeTextActionPerformed(java.awt.event.ActionEvent evt) {                                              
        
    }                                             

    private void BigMacBoxActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        if(BigMacBox.isSelected()){
            
            BigMacText.requestFocus();
            BigMacAddButton.setEnabled(true);
        }
     
         
    }                                         

    private void TripleBeefBoxActionPerformed(java.awt.event.ActionEvent evt) {                                              
        
      if(TripleBeefBox.isSelected()){
            
            TripleBeefText.requestFocus();
            TripleBeefAddButton.setEnabled(true);
        }  
    }                                             

    private void MacDeluxeBoxActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        if(MacDeluxeBox.isSelected()){
            
            MacDeluxeText.requestFocus();
            MacDeluxeAddButton.setEnabled(true);
        }  
    }                                            

    private void cokeBoxActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
        if(cokeBox.isSelected()){
            
            cokeText.requestFocus();
            cokeAddButton.setEnabled(true);
        }  
    }                                       

    private void waterBoxActionPerformed(java.awt.event.ActionEvent evt) {                                         
      
         if(waterBox.isSelected()){
            //BigMacText.setEnabled(true);
            waterText.requestFocus();
            waterAddButton.setEnabled(true);
        }  
    }                                        

    private void totalTextActionPerformed(java.awt.event.ActionEvent evt) {                                          
       
    }                                         

    private void generateBillButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        
        
        DefaultTableModel model = (DefaultTableModel) customerBill.getModel();
        model.setRowCount(0);
        
        Order customerOrder = new TotalOrders(orderList,"Customer Collection", coupon);
        totalPrice = customerOrder.getPrice();
        finalPrice = customerOrder.calculatePrice();
        discountAmount = customerOrder.getDiscountAmount();
        totalText.setText("RM " + totalPrice);
        discountAmountText.setText("RM " + discountAmount);
        finalPriceText.setText("RM " + finalPrice);
        
        model = (DefaultTableModel) customerBill.getModel();
        for(int i = 0; i < orderList.size(); i++){
            model.addRow(new Object[] {orderList.get(i).getItemName(), 
                orderList.get(i).getPrice()});
        }
        
        
        
        
    }                                                  

    private void BigMacTextKeyTyped(java.awt.event.KeyEvent evt) {                                    
        
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
                || (iNumber == evt.VK_BACK_SPACE)
                ||  (iNumber == evt.VK_DELETE)){
            evt.consume();
        }
    }                                   

    private void MegaMacAddButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        
        int orderPrice = 20;
        megaMacItemCount++;
        MegaMacText.setText("" + megaMacItemCount);
        food = new Food("Mega Mac", orderPrice, new NoCoupon());
        
        orderList.add(food);
        
    }                                                

    private void DoubleBeefAddButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        
        int orderPrice = 15;
        doubleBeefItemCount++;
        DoubleBeefText.setText("" + doubleBeefItemCount);
        food = new Food("Double Beef",orderPrice, new NoCoupon());
        orderList.add(food);
    }                                                   

    private void BigMacAddButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        
        int orderPrice = 10;
        bigMacItemCount++;
        BigMacText.setText("" + bigMacItemCount);
        food = new Food("Big Mac", orderPrice, new NoCoupon());
        orderList.add(food);
    }                                               

    private void MacDeluxeAddButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        
        int orderPrice = 15;
        macDeluxeItemCount++;
        MacDeluxeText.setText("" + macDeluxeItemCount);
        food = new Food("Mac Deluxe", orderPrice, new NoCoupon());
        orderList.add(food);
    }                                                  

    private void TripleBeefAddButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        
        int orderPrice = 20;
        tripleBeefItemCount++;
        TripleBeefText.setText("" + tripleBeefItemCount);
        food = new Food("Triple Beef", orderPrice, new NoCoupon());
        orderList.add(food);
    }                                                   

    private void MegaMacBoxActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        if(MegaMacBox.isSelected()){
            
            MegaMacText.requestFocus();
            MegaMacAddButton.setEnabled(true);
        }
    }                                          

    private void DoubleBeefBoxActionPerformed(java.awt.event.ActionEvent evt) {                                              
        
        if(DoubleBeefBox.isSelected()){
            
            DoubleBeefText.requestFocus();
            DoubleBeefAddButton.setEnabled(true);
        }
    }                                             

    private void fantaAddButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        
        int orderPrice = 10;
        fantaItemCount++;
        fantaText.setText("" + fantaItemCount);
        drink = new Drink(orderPrice,"Fanta", new NoCoupon());
        orderList.add(drink);
    }                                              

    private void cokeAddButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
       
        int orderPrice = 6;
        cokeItemCount++;
        cokeText.setText("" + cokeItemCount);
        drink = new Drink(orderPrice, "Coke", new NoCoupon());
        orderList.add(drink);
    }                                             

    private void fantaBoxActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        if(fantaBox.isSelected()){
            
            fantaText.requestFocus();
            fantaAddButton.setEnabled(true);
        }
        
    }                                        

    private void spriteBoxActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        if(spriteBox.isSelected()){
            
            spriteText.requestFocus();
            spriteAddButton.setEnabled(true);
        }
    }                                         

    private void mirandaBoxActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        if(mirandaBox.isSelected()){
            
            mirandaText.requestFocus();
            mirandaAddButton.setEnabled(true);
        }
    }                                          

    private void cokeTextActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
    }                                        

    private void spriteAddButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        
        int orderPrice = 8;
        spriteItemCount++;
        spriteText.setText("" + spriteItemCount);
        drink = new Drink(orderPrice, "Sprite",  new NoCoupon());
        orderList.add(drink);
    }                                               

    private void mirandaAddButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        
        int orderPrice = 8;
        mirandaItemCount++;
       mirandaText.setText("" + mirandaItemCount);
        drink = new Drink(orderPrice, "Miranda",  new NoCoupon());
        orderList.add(drink);
    }                                                

    private void waterAddButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        
         int orderPrice = 2;
        waterItemCount++;
       waterText.setText("" + waterItemCount);
        drink = new Drink(orderPrice, "Water", new NoCoupon());
        orderList.add(drink);
    }                                              

    private void couponComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                               
        
        if(couponComboBox.getSelectedItem().toString().equals("No Coupon"))
            coupon = new NoCoupon();
        else if(couponComboBox.getSelectedItem().toString().equals("Premium Coupon"))
            coupon = new PremiumCoupon();
        else if(couponComboBox.getSelectedItem().toString().equals("Bronze Coupon"))
            coupon = new BronzeCoupon();
        
        DefaultTableModel model = (DefaultTableModel) customerBill.getModel();
        model.setRowCount(0);
            
        
    }                                              

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
        //reset order list
        orderList = new ArrayList<Order>();
        //reset quantity
        BigMacText.setText("0");
        MegaMacText.setText("0");
        DoubleBeefText.setText("0");
        TripleBeefText.setText("0");
        MacDeluxeText.setText("0");
        cokeText.setText("0");
        fantaText.setText("0");
        spriteText.setText("0");
        mirandaText.setText("0");
        waterText.setText("0");
        
        //reset checkboxes
        BigMacBox.setSelected(false);
        MegaMacBox.setSelected(false);
        DoubleBeefBox.setSelected(false);
        TripleBeefBox.setSelected(false);
        MacDeluxeBox.setSelected(false);
        cokeBox.setSelected(false);
        fantaBox.setSelected(false);
        spriteBox.setSelected(false);
        mirandaBox.setSelected(false);
        waterBox.setSelected(false);
        
        //reset item counts
        bigMacItemCount = 0;
        megaMacItemCount = 0;
        doubleBeefItemCount = 0;
        tripleBeefItemCount = 0;
        macDeluxeItemCount = 0;
        cokeItemCount = 0;
        fantaItemCount = 0;
        spriteItemCount = 0;
        mirandaItemCount = 0;
        waterItemCount = 0;
        
        //reset total price, discount amount, and price to pay
        totalPrice = 0;
        totalText.setText("");
        
        discountAmount = 0;
        discountAmountText.setText("");
        
        finalPrice = 0;
        finalPriceText.setText("");
        
        //reset table
        DefaultTableModel model = (DefaultTableModel) customerBill.getModel();
        model.setRowCount(0);
        
        //disableButtons
        BigMacAddButton.setEnabled(false);
        MegaMacAddButton.setEnabled(false);
        DoubleBeefAddButton.setEnabled(false);
        TripleBeefAddButton.setEnabled(false);
        MacDeluxeAddButton.setEnabled(false);
        cokeAddButton.setEnabled(false);
        fantaAddButton.setEnabled(false);
        mirandaAddButton.setEnabled(false);
        spriteAddButton.setEnabled(false);
        waterAddButton.setEnabled(false);
        
        
        
    }                                           

   
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RestaurantSalesTracking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaurantSalesTracking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaurantSalesTracking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurantSalesTracking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaurantSalesTracking().setVisible(true);
            }
        });
    }                    
}

