package userinterface.CorporateRole;

import Business.Employee.Employee;
import Business.EcoSystem;
import Business.Network.Network;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EventEnterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.logging.*;

/**
 *
 * @author arpitajaiswal
 */
public class FundraiserEvents extends javax.swing.JPanel {

    //This frame lets the corporate event volunteers to join respective events
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Network network;
    private EcoSystem business;
    private final static Logger logr = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public FundraiserEvents(JPanel userProcessContainer, UserAccount user, Network network, EcoSystem eco) {
        this.userProcessContainer = userProcessContainer;
        this.userAccount = user;
        this.network = network;
        this.business = eco;
        initComponents();
        populateTable();
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
        corpTable = new javax.swing.JTable();
        refreshTestJButton = new javax.swing.JButton();
        joinBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(181, 223, 237));

        corpTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Street", "City", "State", "Zipcode"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(corpTable);

        refreshTestJButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        refreshTestJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Assign symbol.png"))); // NOI18N
        refreshTestJButton.setText("REFRESH");
        refreshTestJButton.setToolTipText("REFRESH");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        joinBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        joinBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Assign symbol.png"))); // NOI18N
        joinBtn.setText("JOIN EVENT");
        joinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Prev Menu.png"))); // NOI18N
        backBtn.setToolTipText("");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel7.setText("         FUNDRAISING EVENT - JOIN PORTAL");
        jLabel7.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(724, 724, 724)
                            .addComponent(refreshTestJButton))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(365, 365, 365)
                            .addComponent(joinBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(backBtn)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(refreshTestJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(joinBtn)
                .addContainerGap(178, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateTable();

    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void joinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinBtnActionPerformed
        int selectedRow = corpTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please make a selection");
        }
        Enterprise e = (Enterprise) corpTable.getValueAt(selectedRow, 0);
        Employee employee = null;

        UserAccount user = business.getUserAccountDirectory().authenticateUser(userAccount.getUsername(), userAccount.getPassword());

        Enterprise inEnterprise = null;
        Organization inOrganization = null;

        if (user == null) {
            //Step 2: Go inside each network and check each enterprise
            for (Network network : business.getNetworkList()) {
                //Step 2.a: check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise.equals(e)) {
                        user = enterprise.getUserAccountDirectory().authenticateUser(userAccount.getUsername(), userAccount.getPassword());
                        if (user == null) {
                            //Step 3:check against each organization for each enterprise
                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                user = organization.getUserAccountDirectory().authenticateUser(userAccount.getUsername(), userAccount.getPassword());
                                if (user != null) {
                                    inEnterprise = enterprise;
                                    //System.out.println(inEnterprise);
                                    inOrganization = organization;
                                    //System.out.println(inOrganization);
                                    //break;
                                }
                            }

                        } else {
                            inEnterprise = enterprise;
                            //System.out.println(inEnterprise);
                            //break;
                        }
                        if (inOrganization != null) {
                            //System.out.println(inOrganization);
                            //break;
                        }
                    }
                    if (inEnterprise != null) {
                        //System.out.println(inEnterprise);
                        //break;
                    }
                }
            }
        }

        if (user == null) {
            //JOptionPane.showMessageDialog(null, "User Account does not exist");
            for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                org.getEmployeeDirectory().createEmployee(userAccount.getEmployee().getName());
                for (Employee emp : org.getEmployeeDirectory().getEmployeeList()) {
                    if (userAccount.getEmployee().getName() == emp.getName()) {
                        employee = emp;
                        org.getUserAccountDirectory().createUserAccount(userAccount.getUsername(), userAccount.getPassword(), employee, userAccount.getRole());
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Enrolled for the event. Donation pools are now open!");
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Enrollment Already Done. Donation pools are now open!");
        }
        
    logr.info("Volunteer joined fund Raiser event");
    }//GEN-LAST:event_joinBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTable corpTable;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton joinBtn;
    private javax.swing.JButton refreshTestJButton;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) corpTable.getModel();
        model.setRowCount(0);
        int count =0;
        for(Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()){
            if(enter.getEnterpriseType().equals(Enterprise.EnterpriseType.Event)){
                if(count != 0){
                    EventEnterprise camp = (EventEnterprise) enter;
                    Object[] row = new Object[5];
                    row[0] = camp;
                    row[1] = camp.getStreet();;
                    row[2] = camp.getCity();
                    row[3] = camp.getState();
                    row[4] = camp.getZipcode();
                    model.addRow(row);
                }else{
                    count++;
                }
            }
        }
        
    }
}
