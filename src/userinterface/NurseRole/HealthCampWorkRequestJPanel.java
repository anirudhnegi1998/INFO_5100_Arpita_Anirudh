package userinterface.NurseRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.Organization.VolunteerCampOrganization;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arpitajaiswal
 */
public class HealthCampWorkRequestJPanel extends javax.swing.JPanel {
    
    private EcoSystem business;
    private UserAccount userAccount;
    private JPanel userProcessContainer;
    private NurseOrganization nurseOrganization;
    private Enterprise enter;

    
    public HealthCampWorkRequestJPanel(JPanel userProcessContainer, UserAccount account, NurseOrganization organization, EcoSystem business, Enterprise enter) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.nurseOrganization = organization;
        this.userAccount = account;
        this.business = business;
        this.enter = enter;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        for (Network net : business.getNetworkList()) {
            for (Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                    if (org instanceof VolunteerCampOrganization) {
                        for (UserAccount user : org.getUserAccountDirectory().getUserAccountList()) {
                            System.out.println(user.getRole().toString());
                            for (WorkRequest req : user.getWorkQueue().getWorkRequestList()) {
                                if ((req.getTypeOfRequest().equals("PatientTest")) && (req.getCampName().equals(enter.toString())) && (req.getStatus().equals("Nurse Waiting"))) {
                                    System.out.println(req);
                                    Object[] row = new Object[6];
                                    System.out.println(req);
                                    row[0] = req.getPatientFirstname();
                                    row[1] = req.getPatientLastname();
                                    row[2] = req.getPgender();
                                    row[3] = req.getPage();
                                    row[4] = req;
                                    row[5] = req.getStatus();
                                    model.addRow(row);
                                }
                            }
                        }
                    }

                }
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
        workRequestJTable = new javax.swing.JTable();
        assignBtn = new javax.swing.JButton();
        processBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(181, 223, 237));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Patient ID", "Gender", "Age", "Request", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
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
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 750, 130));

        assignBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        assignBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Prev Menu.png"))); // NOI18N
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });
        add(assignBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 40));

        processBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        processBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Assign symbol.png"))); // NOI18N
        processBtn.setText("PATIENT REGISTRATION");
        processBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processBtnActionPerformed(evt);
            }
        });
        add(processBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, -1, -1));

        refreshBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Assign symbol.png"))); // NOI18N
        refreshBtn.setText("REFRESH");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 130, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PATIENT REGISTRATION");
        jLabel1.setToolTipText("");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_assignBtnActionPerformed

    private void processBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processBtnActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }
        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 4);
        System.out.println(request.getStatus());

        if (request.getStatus().equals("Nurse Waiting")){
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            PatientNurseRequestJPanel patientNurseRequestJpanel = new PatientNurseRequestJPanel(userProcessContainer, userAccount, (NurseOrganization) nurseOrganization, business, enter, request);
            userProcessContainer.add("PatientNurseRequestJpanel", patientNurseRequestJpanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "The Patient is already taken");
        }
        

    }//GEN-LAST:event_processBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processBtn;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
