/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeEventRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author arpitajaiswal
 */
public class CreateFundEvent extends javax.swing.JPanel {

    /**
     * Creates new form CreateFundEvent
     */
    private JPanel userProcessContainer;
    private WorkRequest request;
    private UserAccount user;
    private Enterprise enter;
    private Network network;
 //   private static final Pattern ZIP_PATTERN = Pattern.compile("/^(\\d{5}(-\\d{4})?|([a-z][a-z]?\\d\\d?|[a-z{2}\\d[a-z]) ?\\d[a-z][a-z])$/i;");

    public CreateFundEvent(JPanel userProcessContainer, WorkRequest request, UserAccount user, Enterprise enter, Network network) {
        this.userProcessContainer = userProcessContainer;
        this.enter = enter;
        this.request = request;
        this.user = user;
        this.network = network;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headLabel = new javax.swing.JLabel();
        eventLabel = new javax.swing.JLabel();
        eventNameField = new javax.swing.JTextField();
        streetField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        stateLabel = new javax.swing.JLabel();
        zipLabel = new javax.swing.JLabel();
        stateField = new javax.swing.JTextField();
        zipCodeField = new javax.swing.JTextField();
        approveBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        dateLabel = new javax.swing.JLabel();
        fundCollectedLabel = new javax.swing.JLabel();
        eventApproxFundField = new javax.swing.JTextField();
        eventDateField = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(181, 223, 237));

        headLabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        headLabel.setText("       Enter Event Details");

        eventLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eventLabel.setText("Event Name");

        addressLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addressLabel.setText("Address");

        cityLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cityLabel.setText("City");

        stateLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        stateLabel.setText("State");

        zipLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        zipLabel.setText("ZipCode");

        approveBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        approveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Assign symbol.png"))); // NOI18N
        approveBtn.setText("APPROVE");
        approveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Prev Menu.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        dateLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dateLabel.setText("Date");

        fundCollectedLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fundCollectedLabel.setText("Fund To Be Collected(Approx)");

        eventApproxFundField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventApproxFundFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eventLabel)
                            .addComponent(cityLabel)
                            .addComponent(stateLabel)
                            .addComponent(zipLabel)
                            .addComponent(addressLabel)
                            .addComponent(dateLabel)
                            .addComponent(fundCollectedLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(eventApproxFundField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stateField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zipCodeField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(eventNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(streetField)
                            .addComponent(cityField)
                            .addComponent(eventDateField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(headLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(approveBtn)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(2, 2, 2)
                .addComponent(headLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eventLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateLabel)
                    .addComponent(eventDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fundCollectedLabel)
                    .addComponent(eventApproxFundField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(approveBtn)
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void approveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveBtnActionPerformed

        int check = 0;
        int checkdate = 0;
        if (eventDateField.getDate() == null || zipCodeField.getText().isEmpty() || stateField.getText().isEmpty() || cityField.getText().isEmpty() || streetField.getText().isEmpty() || eventNameField.getText().isEmpty() || eventApproxFundField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter all the fields");
        } else {
            check = 1;
            Enterprise enterprise = null;
            
            Date eventDay = null;
            Date sysDate = null;
            SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
            format.setLenient(false);
            try {

                eventDay = eventDateField.getDate();
                sysDate = new Date();
                long diff = sysDate.getTime() - eventDay.getTime();
                long diff1 = eventDay.getTime() - sysDate.getTime();
                long diff1Days = diff1 / (24 * 60 * 60 * 1000);
                long years = diff1Days / 365;

                if (diff > 0) {
                    JOptionPane.showMessageDialog(null, "Cannot enter a previous date");
                    checkdate = 1;
                }

                if (diff1Days >= 4 && check == 1 && checkdate == 0) {
                    request.setStatus("Funding Process is going on");
                    int zipcodeVal= validateZipCode(zipCodeField.getText());
                     if (zipcodeVal == 0) {
                            JOptionPane.showMessageDialog(null, "Please enter a valid 5 digit zip code");
                            return;
                     }
                    enterprise = network.getEnterpriseDirectory().createAndAddEventEnterprise(eventNameField.getText(), streetField.getText(), cityField.getText(), stateField.getText(), zipCodeField.getText(), eventDay, Enterprise.EnterpriseType.Event, Integer.parseInt(eventApproxFundField.getText()));
                    Employee empl = enterprise.getEmployeeDirectory().createEmployee("admin");
                    String username = "admin_" + eventNameField.getText();
                    enterprise.getUserAccountDirectory().createUserAccount(username, "admin", empl, new AdminRole());
                    enterprise.getOrganizationDirectory().createOrganization(Organization.OrganizationType.VolunteerEvent);
                    enterprise.getOrganizationDirectory().createOrganization(Organization.OrganizationType.Fundrasier);
                    JOptionPane.showMessageDialog(null, "FundRaiser Event Approved. Sponsors can donate for this event!");
                    eventApproxFundField.setText("");
                    eventDateField.setDate(null);
                    eventNameField.setText("");
                    streetField.setText("");
                    cityField.setText("");
                    stateField.setText("");
                    zipCodeField.setText("");

                } else {
                    JOptionPane.showMessageDialog(null, "Please enter a Date after 4 days");
                }
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Please Enter Appropriate Date MM-dd-yyyy");
            }

        }
    }//GEN-LAST:event_approveBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FundRequests fund = (FundRequests) component;
        fund.populateTable();;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void eventApproxFundFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventApproxFundFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventApproxFundFieldActionPerformed
    private int validateZipCode(String validate) {
    try{
    int zipcodeVal = Integer.parseInt(validate);
        if (validate.length() >= 6) {
            return 0;
        }
        return 1;
    }catch(NumberFormatException e){
        return 0;
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JButton approveBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField eventApproxFundField;
    private com.toedter.calendar.JDateChooser eventDateField;
    private javax.swing.JLabel eventLabel;
    private javax.swing.JTextField eventNameField;
    private javax.swing.JLabel fundCollectedLabel;
    private javax.swing.JLabel headLabel;
    private javax.swing.JTextField stateField;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JTextField streetField;
    private javax.swing.JTextField zipCodeField;
    private javax.swing.JLabel zipLabel;
    // End of variables declaration//GEN-END:variables
}
