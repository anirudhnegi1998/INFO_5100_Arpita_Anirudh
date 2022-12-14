package userinterface.AdministrativeEventRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import javax.swing.JOptionPane;/**
 *
 * @author arpitajaiswal
 */
public class SponsorApprovalJPanel extends javax.swing.JPanel {

    private Enterprise enterprise;
    private JPanel userProcessContainer;
    private UserAccount userAccount;
   
    
    public SponsorApprovalJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        valueLabel.setText(enterprise.getName());
        populateRequestTable();
    }
    
       public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) sponserRegTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request.toString().equals("Sponsor")) {
                Object[] row = new Object[8];
                row[0] = request;
                row[1] = request.getVolunteerName();
                row[2] = request.getUsername();
                row[3] = request.getDob();
                row[4] = request.getSsn();
                row[5] = request.getMailid();
                row[6] = request.getRole();
                row[7] = request.getStatus();
             
                model.addRow(row);
            }
        }
    }
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        sponserRegTable = new javax.swing.JTable();
        refreshJButton = new javax.swing.JButton();
        approveBtn = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        headLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(181, 223, 237));

        sponserRegTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Type", "Name", "Username", "Date of Birth", "SSN", "Email ID", "Role", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(sponserRegTable);

        refreshJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Assign symbol.png"))); // NOI18N
        refreshJButton.setText("REFRESH");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        approveBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        approveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Assign symbol.png"))); // NOI18N
        approveBtn.setText("APPROVE");
        approveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveBtnActionPerformed(evt);
            }
        });

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        valueLabel.setText("<value>");

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        enterpriseLabel.setText("ENTERPRISE NAME :");

        backBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Prev Menu.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        headLabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        headLabel.setText("         SPONSER REQUEST DATA - APPROVAL");
        headLabel.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(backBtn)
                        .addGap(113, 113, 113)
                        .addComponent(headLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterpriseLabel)
                                .addGap(18, 18, 18)
                                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(169, 169, 169)
                                .addComponent(refreshJButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addComponent(approveBtn)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(67, 67, 67)
                        .addComponent(refreshJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(headLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(approveBtn)
                .addContainerGap(122, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateRequestTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void approveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveBtnActionPerformed
          int selectedRow = sponserRegTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please make a selection");
            return;
        }
        WorkRequest request = (WorkRequest) sponserRegTable.getValueAt(selectedRow, 0);
        Employee employee = null;
        Role role = null;
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            
            if (request.getRole().equals("GeneralRole")) {
                org.getEmployeeDirectory().createEmployee(request.getVolunteerName());
                for (Employee e : org.getEmployeeDirectory().getEmployeeList()) {
                    if (request.getVolunteerName() == e.getName()) {
                        employee = e;
                    }
                }
                for (Role r : org.getSupportedRole()) {
                    
                    if (request.getRole().equals(r.toString())) {
                        role = r;
                        //System.out.println(r);
                        System.out.println(role);
                    }
                }
                org.getUserAccountDirectory().createUserAccount(request.getUsername(), request.getPassword(), employee, role);
                break;
            } else if (request.getRole().equals("StudentRole")) {
                org.getEmployeeDirectory().createEmployee(request.getVolunteerName());
                for (Employee e : org.getEmployeeDirectory().getEmployeeList()) {
                    if (request.getVolunteerName() == e.getName()) {
                        employee = e;
                    }
                    for (Role r : org.getSupportedRole()) {
                        if (request.getRole().equals(r.toString())) {
                            role = r;
                        }
                    }
                }
                org.getUserAccountDirectory().createUserAccount(request.getUsername(), request.getPassword(), employee, role);
                break;
            } else if (request.getRole().equals("CorporateRole")) {
                org.getEmployeeDirectory().createEmployee(request.getVolunteerName());
                for (Employee e : org.getEmployeeDirectory().getEmployeeList()) {
                    if (request.getVolunteerName() == e.getName()) {
                        employee = e;
                    }
                    for (Role r : org.getSupportedRole()) {
                        //System.out.println(r);
                        if (request.getRole().equals(r.toString())) {
                            role = r;
                        }
                    }
                }
                org.getUserAccountDirectory().createUserAccount(request.getUsername(), request.getPassword(), employee, role);
                break;
            }
        }
        request.setStatus("Completed");
        populateRequestTable();
//        if (request.getStatus().equals("Completed")) {
//            String ab = request.getVolunteerName();
//            emailMsgTxt = "Hi " + ab.toUpperCase() + ", " + "\n" + "\n" + "Your User Account has been Created. You may login into the system now!" + "\n" + "\n" + "Regards," + "\n" + "NGO Admin";
//            emailSubjectTxt = "Sponsor Request Approved";
//            emailFromAddress = SendMailUsingAuthentication.SMTP_AUTH_USER;
//
//            // Add List of Email address to who email needs to be sent to
//            StringBuffer sb = new StringBuffer(request.getMailid());
//            StringTokenizer st = new StringTokenizer(request.getMailid());
//            int i = 0;
//            while (st.hasMoreTokens()) {
//                emailList[i] = st.nextToken(",");
//                // System.err.println(emailList[i]);
//                i++;
//            }
//            String emailReceipeint[] = new String[i];
//            for (int j = 0; j < i; j++) {
//                emailReceipeint[j] = emailList[j];
//                //System.out.println("Actually emails are " + j);
//            }
//
//            SendMailUsingAuthentication smtpMailSender = new SendMailUsingAuthentication();
//            try {
//                smtpMailSender.postMail(emailReceipeint, emailSubjectTxt, emailMsgTxt, emailFromAddress);
//                JOptionPane.showMessageDialog(null, "Request Approved and mail has been sent to the Sponsor. Sponsors can enroll for FundRaiser Events!");
//            } catch (MessagingException ex) {
//                //Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            System.out.println("Sucessfully Sent mail to All Users - Sponsor");
//
//        }
    }//GEN-LAST:event_approveBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel headLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable sponserRegTable;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
