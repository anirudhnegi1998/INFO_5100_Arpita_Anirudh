package userinterface.VolunteerEventRole;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EventEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

/**
 *
 * @author arpitajaiswal
 */
public class EnrollmentStatus extends javax.swing.JPanel {

    
    private JPanel userProcessContainer;
    private EcoSystem eco;
    private Network network;
    private UserAccount user;
    

    public EnrollmentStatus(JPanel userProcessContainer, UserAccount user, Network network, EcoSystem eco) {
        
        this.userProcessContainer = userProcessContainer;
        this.eco = eco;
        this.user = user;
        this.network = network;
        valueLabel.setText(network.getName());
        
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

        jScrollPane2 = new javax.swing.JScrollPane();
        eventEnrollStatusTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        entLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        headLabel = new javax.swing.JLabel();
        refreshBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(181, 223, 237));

        eventEnrollStatusTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Volunteer Name", "Street Address", "City", "State", "Zipcode", "Enrollment Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(eventEnrollStatusTable);

        backBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Prev Menu.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        entLabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        entLabel.setText("NETWORK NAME :");

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        valueLabel.setText("<value>");

        headLabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        headLabel.setText("       EVENT ENROLLMENT STATUS ");
        headLabel.setBorder(new javax.swing.border.MatteBorder(null));

        refreshBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Green/Button-Refresh-icon.png"))); // NOI18N
        refreshBtn.setText("REFRESH");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(entLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(headLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(refreshBtn))))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel)
                    .addComponent(refreshBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backBtn)
                .addContainerGap(254, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    
    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) eventEnrollStatusTable.getModel();
        model.setRowCount(0);

        for (Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enter.getEnterpriseType().equals(Enterprise.EnterpriseType.Event)) {
                for (Organization org : enter.getOrganizationDirectory().getOrganizationList()) {
                    if (org.toString().equals("Event Organization")) {
                        System.out.println(org.getName());
                        for (Employee emp : org.getEmployeeDirectory().getEmployeeList()) {
                            if (emp.getName().equals(user.getEmployee().getName())&& (!enter.getName().toString().equals("Boston Event"))) {
                                EventEnterprise camp = (EventEnterprise) enter;
                                Object[] row = new Object[6];
                                row[0] = camp;
                                row[1] = camp.getStreet();;
                                row[2] = camp.getCity();
                                row[3] = camp.getState();
                                row[4] = camp.getZipcode();
                                row[5] = "Enrolled";
                                model.addRow(row);
                            }
                        }
                    }
                }
            }
        }
    }
    
    
    
    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
    populateTable();
    }//GEN-LAST:event_refreshBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel entLabel;
    private javax.swing.JTable eventEnrollStatusTable;
    private javax.swing.JLabel headLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

}
