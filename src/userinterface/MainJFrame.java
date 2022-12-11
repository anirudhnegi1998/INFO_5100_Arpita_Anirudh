
package userinterface;

import Business.EcoSystem;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.Organization.Organization;

import userinterface.GeneralRole.SponsorRegistrationPanel;
import userinterface.VolunteerCampRole.VolunteerRegistrationPanel;
import java.util.logging.*;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;


/**
 *
 * @author arpitajaiswal
 */
public class MainJFrame extends javax.swing.JFrame {

   
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private final static Logger logr = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
 
    

    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        this.setSize(1680, 1050);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        loginBtn = new javax.swing.JButton();
        userNameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        usernameLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        campLabel = new javax.swing.JLabel();
        descriptionBtn = new javax.swing.JButton();
        CampRegisterBtn = new javax.swing.JButton();
        container = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(250);

        jPanel1.setBackground(new java.awt.Color(181, 223, 237));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));

        loginBtn.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button.png"))); // NOI18N
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        usernameLabel.setBackground(new java.awt.Color(255, 255, 255));
        usernameLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        usernameLabel.setText("User Name");

        passLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        passLabel.setText("Password");

        logoutBtn.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button (1).png"))); // NOI18N
        logoutBtn.setEnabled(false);
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        campLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        campLabel.setText("Camp Registration");

        descriptionBtn.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        descriptionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AboutUsButton.png"))); // NOI18N
        descriptionBtn.setToolTipText("");
        descriptionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionBtnActionPerformed(evt);
            }
        });

        CampRegisterBtn.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        CampRegisterBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Assign symbol.png"))); // NOI18N
        CampRegisterBtn.setText("JOIN US");
        CampRegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampRegisterBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(loginJLabel)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(passLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(40, 40, 40)))
                            .addComponent(campLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(userNameField)
                    .addComponent(passwordField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CampRegisterBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutBtn)
                .addGap(48, 48, 48)
                .addComponent(loginJLabel)
                .addGap(44, 44, 44)
                .addComponent(campLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampRegisterBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 590, Short.MAX_VALUE)
                .addComponent(descriptionBtn)
                .addGap(30, 30, 30))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        container.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        container.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(1546, 471));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mainimage (5).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        container.add(jPanel2, "card2");

        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>                        

    private void CampRegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        logr.info("Entering the volunteer RegistrationScreen");
        if((!userNameField.getText().isEmpty()) && (!loginBtn.isEnabled())){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "The current user session" +userNameField.getText() + " will be terminated, Do you want to proceed?",
                "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                VolunteerRegistrationPanel vp = new VolunteerRegistrationPanel(container, system);
                CardLayout layout = (CardLayout) container.getLayout();
                container.add("VolunteerRegistration", vp);
                layout.next(container);

                loginBtn.setEnabled(false);
                logoutBtn.setEnabled(true);
                userNameField.setEnabled(false);
                passwordField.setEnabled(false);
                userNameField.setText("");
                passwordField.setText("");
            }
        }else{
            VolunteerRegistrationPanel vp = new VolunteerRegistrationPanel(container, system);
            CardLayout layout = (CardLayout) container.getLayout();
            container.add("VolunteerRegistration", vp);
            layout.next(container);

            loginBtn.setEnabled(false);
            logoutBtn.setEnabled(true);
            userNameField.setEnabled(false);
            passwordField.setEnabled(false);
        }

    }                                               

    private void descriptionBtnActionPerformed(java.awt.event.ActionEvent evt) {                                               

        logr.info("Entering into About US");
        if((!userNameField.getText().isEmpty()) && (!loginBtn.isEnabled())){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "The current user session" +userNameField.getText() + " will be terminated, Do you want to proceed?",
                "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                AboutUsJPanel sp = new AboutUsJPanel(container, system);
                CardLayout layout = (CardLayout) container.getLayout();
                container.add("AboutUs", sp);
                layout.next(container);
                loginBtn.setEnabled(false);
                logoutBtn.setEnabled(true);
                userNameField.setEnabled(false);
                passwordField.setEnabled(false);
                userNameField.setText("");
                passwordField.setText("");
            }
        }else{
            AboutUsJPanel sp = new AboutUsJPanel(container, system);
            CardLayout layout = (CardLayout) container.getLayout();
            container.add("AboutUs", sp);
            layout.next(container);

            loginBtn.setEnabled(false);
            logoutBtn.setEnabled(true);
            userNameField.setEnabled(false);
            passwordField.setEnabled(false);
        }
    }                                              

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          

        logoutBtn.setEnabled(false);
        userNameField.setEnabled(true);
        passwordField.setEnabled(true);
        loginBtn.setEnabled(true);

        userNameField.setText("");
        passwordField.setText("");

        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", jPanel2);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(system);
        logr.info("Logged out");
    }                                         

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         

        logr.info("LoggingIn");
        String userName = userNameField.getText();
        // Get Password
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);

        if((userName==null || userName.equals("")) && (password==null || password.equals(""))){
            usernameLabel.setForeground(Color.RED);
            passLabel.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, " User-name and password is blank");
            return;
        }
        if(userName==null || userName.equals("")){
            usernameLabel.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "User-name is blank");
            return;
        }else{
            usernameLabel.setForeground(Color.BLACK);
        }

        if(password==null || password.equals("")){
            passLabel.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Password is blank");
            return;
        } else{
            passLabel.setForeground(Color.BLACK);
        }
        //Check system admin user account directory if you have the user
        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);

        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        Network inNetwork = null;

        if (userAccount == null) {
            //Go inside each network and check each enterprise
            for (Network network : system.getNetworkList()) {

                //check in each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if (userAccount == null) {
                        //check in each organization and enterprise
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                            if (userAccount != null) {
                                inNetwork = network;
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                break;
                            }
                        }

                    } else {
                        inEnterprise = enterprise;
                        inNetwork = network;
                        break;
                    }
                    if (inOrganization != null) {
                        break;
                    }
                }
                if (inEnterprise != null) {
                    break;
                }
            }
        }

        if (userAccount == null) {
            usernameLabel.setForeground(Color.RED);
            passLabel.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Invalid Credentials! Please re-enter!");
            return;
        } else {
            CardLayout layout = (CardLayout) container.getLayout();

            container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, inNetwork, system));
            layout.next(container);
        }

        loginBtn.setEnabled(false);
        logoutBtn.setEnabled(true);
        userNameField.setEnabled(false);
        passwordField.setEnabled(false);
    }                                        

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
        try{
            FileHandler fh= new FileHandler("myLogger.log");
            fh.setLevel(Level.INFO);
            fh.setFormatter(new SimpleFormatter());
            logr.addHandler(fh); 
            } catch(IOException e){
                ConsoleHandler ch = new ConsoleHandler();
                ch.setLevel(Level.SEVERE);
                logr.addHandler(ch);
            
            }
        
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton CampRegisterBtn;
    private javax.swing.JLabel campLabel;
    private javax.swing.JPanel container;
    private javax.swing.JButton descriptionBtn;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration                   
}
