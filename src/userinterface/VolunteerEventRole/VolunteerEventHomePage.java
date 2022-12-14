package userinterface.VolunteerEventRole;

import userinterface.CorporateRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.VolunteerEventOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author arpitajaiswal
 */
public class VolunteerEventHomePage extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    private EcoSystem eco;
    private VolunteerEventOrganization organization;
    
    
    public VolunteerEventHomePage(JPanel userProcessContainer, UserAccount account, VolunteerEventOrganization organization, Network network, Enterprise enterprise, EcoSystem eco) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.eco = eco;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        enrolStatusBtn = new javax.swing.JButton();
        fundeEventEnrollBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(181, 223, 237));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("   EVENT VOLUNTEER HOME PAGE");

        enrolStatusBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        enrolStatusBtn.setText("ENROLLMENT STATUS");
        enrolStatusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrolStatusBtnActionPerformed(evt);
            }
        });

        fundeEventEnrollBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        fundeEventEnrollBtn.setText("FUUNDRAISER EVENT ENROLLMENT");
        fundeEventEnrollBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundeEventEnrollBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fundeEventEnrollBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enrolStatusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(162, 162, 162))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(73, 73, 73)
                .addComponent(fundeEventEnrollBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(enrolStatusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void enrolStatusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrolStatusBtnActionPerformed
        System.out.println(network.getEnterpriseDirectory().getEnterpriseList());
        EnrollmentStatus empStatusPanel = new EnrollmentStatus(userProcessContainer, userAccount, network, eco);
        userProcessContainer.add("EnrollmentStatus", empStatusPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_enrolStatusBtnActionPerformed

    private void fundeEventEnrollBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundeEventEnrollBtnActionPerformed
        
        FundraiserEventVolunteer fundPanelVolunteer = new FundraiserEventVolunteer(userProcessContainer, userAccount, network, eco);
        userProcessContainer.add("FundraiserEventVolunteer", fundPanelVolunteer);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_fundeEventEnrollBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enrolStatusBtn;
    private javax.swing.JButton fundeEventEnrollBtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
