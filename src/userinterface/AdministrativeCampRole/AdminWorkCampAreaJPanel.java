package userinterface.AdministrativeCampRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author anirudhnegi
 */
public class AdminWorkCampAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount account;
    EcoSystem ecosystem;
    Network network;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
        public AdminWorkCampAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account,Network network,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.ecosystem = ecosystem;
        this.network = network;
        valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        VolunteerApprovalBtn = new javax.swing.JButton();
        ManageUserBtn = new javax.swing.JButton();
        HealthCampBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(1546, 471));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Blue/Home-36.png"))); // NOI18N
        jLabel1.setText("HEALTHCAMP ADMINISTRATOR HOME");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        manageEmployeeJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Green/user_up.png"))); // NOI18N
        manageEmployeeJButton.setText("MANAGE EMPLOYEE");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 270, 40));

        manageOrganizationJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Green/user_up.png"))); // NOI18N
        manageOrganizationJButton.setText("MANAGE ORGANIZATION");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 270, 40));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        enterpriseLabel.setText("ENTERPRISE:");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 160, 30));

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 300, 30));

        VolunteerApprovalBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Green/user_ok.png"))); // NOI18N
        VolunteerApprovalBtn.setText("VOLUNTEER APPROVAL");
        VolunteerApprovalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolunteerApprovalBtnActionPerformed(evt);
            }
        });
        add(VolunteerApprovalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 270, 40));

        ManageUserBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Green/user_up.png"))); // NOI18N
        ManageUserBtn.setText("MANAGE USER");
        ManageUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageUserBtnActionPerformed(evt);
            }
        });
        add(ManageUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 270, 40));

        HealthCampBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Green/rss.png"))); // NOI18N
        HealthCampBtn.setText("HEALTH CAMP REQUEST");
        HealthCampBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HealthCampBtnActionPerformed(evt);
            }
        });
        add(HealthCampBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 270, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed
        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void VolunteerApprovalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolunteerApprovalBtnActionPerformed
        // TODO add your handling code here:
//        VolunteerCampApprovalJPanel volunteerApprovalJPanel = new VolunteerCampApprovalJPanel(userProcessContainer, enterprise, account);
//        userProcessContainer.add("VolunteerApprovalJPanel", volunteerApprovalJPanel);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_VolunteerApprovalBtnActionPerformed

    private void ManageUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageUserBtnActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel manageUserAccountJPanel = new ManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", manageUserAccountJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ManageUserBtnActionPerformed

    private void HealthCampBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HealthCampBtnActionPerformed
        // TODO add your handling code here:
        HealthcampRequestJPanel HealthcampRequestJPanel = new HealthcampRequestJPanel(userProcessContainer, account, ecosystem,network,enterprise);
        userProcessContainer.add("HealthcampRequestJPanel", HealthcampRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_HealthCampBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HealthCampBtn;
    private javax.swing.JButton ManageUserBtn;
    private javax.swing.JButton VolunteerApprovalBtn;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

}
