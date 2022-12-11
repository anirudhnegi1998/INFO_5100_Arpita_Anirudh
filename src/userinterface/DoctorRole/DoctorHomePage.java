/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;


import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.EcoSystem;
import Business.Organization.DoctorOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author anirudhnegi
 */

public class DoctorHomePage extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DoctorOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private Network network;

    //Home Page for Doctor Role
    public DoctorHomePage(JPanel userProcessContainer, UserAccount account, DoctorOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reuqestWorkBtn = new javax.swing.JButton();
        requestStatusBtn = new javax.swing.JButton();
        headLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(181, 223, 237));

        reuqestWorkBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        reuqestWorkBtn.setText("REQUEST WORK");
        reuqestWorkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reuqestWorkBtnActionPerformed(evt);
            }
        });

        requestStatusBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        requestStatusBtn.setText("REQUEST WORK STATUS");
        requestStatusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestStatusBtnActionPerformed(evt);
            }
        });

        headLabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        headLabel.setText("DOCTOR - HOME PAGE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(requestStatusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reuqestWorkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(headLabel))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(headLabel)
                .addGap(42, 42, 42)
                .addComponent(reuqestWorkBtn)
                .addGap(49, 49, 49)
                .addComponent(requestStatusBtn)
                .addContainerGap(112, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void reuqestWorkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reuqestWorkBtnActionPerformed
        

        DoctorWorkAreaJPanel doctorWorkPanel = new DoctorWorkAreaJPanel(userProcessContainer, userAccount, (DoctorOrganization) organization, enterprise, business);
        userProcessContainer.add("DoctorWorkAreaJPanel", doctorWorkPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_reuqestWorkBtnActionPerformed

    private void requestStatusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestStatusBtnActionPerformed
        
        WorkStatusPanel workStatusPanel = new WorkStatusPanel(userProcessContainer, userAccount, (DoctorOrganization) organization, enterprise, business);
        userProcessContainer.add("WorkStatusPanel", workStatusPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_requestStatusBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel headLabel;
    private javax.swing.JButton requestStatusBtn;
    private javax.swing.JButton reuqestWorkBtn;
    // End of variables declaration//GEN-END:variables
}
