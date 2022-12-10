package userinterface.AdministrativeEventRole;

import userinterface.AdministrativeCampRole.*;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Organization.Organization;
import Business.Organization.Organization.OrganizationType;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arpitajaiswal
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    private Enterprise enterprise;
    private OrganizationDirectory directory;
    private JPanel userProcessContainer;
    
    public ManageOrganizationJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
       
        populateTable();
        populateCombo();
    }

     private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) orgTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization;

            model.addRow(row);
        }
    }
     
    private void populateCombo() {
        orgComboBox.removeAllItems();
        if (enterprise.getEnterpriseType() == EnterpriseType.Hospital) {
            for (OrganizationType type : Organization.OrganizationType.values()) {
                if ((type.getValue().equals(OrganizationType.Doctor.getValue())) || (type.getValue().equals(OrganizationType.Lab.getValue())) || (type.getValue().equals(OrganizationType.Nurse.getValue()))) {
                    orgComboBox.addItem(type);
                }
            }
        } else if (enterprise.getEnterpriseType() == EnterpriseType.Event) {
            for (OrganizationType type : Organization.OrganizationType.values()) {
                if ((type.getValue().equals(OrganizationType.Fundrasier.getValue())) || (type.getValue().equals(OrganizationType.VolunteerEvent.getValue()))) {
                    orgComboBox.addItem(type);
                }
            }
        } else if (enterprise.getEnterpriseType() == EnterpriseType.Camp) {
            for (OrganizationType type : Organization.OrganizationType.values()) {
                if ((type.getValue().equals(OrganizationType.VolunteerCamp.getValue()))) {
                    orgComboBox.addItem(type);
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        orgTable = new javax.swing.JTable();
        createBtn = new javax.swing.JButton();
        orgComboBox = new javax.swing.JComboBox();
        backBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        headLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        

        setBackground(new java.awt.Color(181, 223, 237));

        orgTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organization ID", "Organization Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orgTable);
        if (orgTable.getColumnModel().getColumnCount() > 0) {
            orgTable.getColumnModel().getColumn(0).setResizable(false);
            orgTable.getColumnModel().getColumn(1).setResizable(false);
        }

        createBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        createBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Assign symbol.png"))); // NOI18N
        createBtn.setText("CREATE");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        orgComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Organization Type ");

        backBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Prev Menu.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        headLabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        headLabel.setText("    ORGANIZATION MANAGEMENT");
        headLabel.setBorder(new javax.swing.border.MatteBorder(null));

        deleteBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Assign symbol.png"))); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(backBtn)
                        .addGap(103, 103, 103)
                        .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(deleteBtn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orgComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(129, 129, 129)
                            .addComponent(jLabel1)
                            .addGap(330, 330, 330)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(headLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(headLabel)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orgComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteBtn)
                        .addComponent(createBtn)))
                .addContainerGap(210, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          

        OrganizationType type = (OrganizationType) orgComboBox.getSelectedItem();
        enterprise.getOrganizationDirectory().createOrganization(type);
        populateTable();
        JOptionPane.showMessageDialog(null, "An Organization has ben added successfully");
    }                                                                                                                   

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) orgTable.getModel();
        int selectedRow = orgTable.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
            Organization organization  = (Organization) orgTable.getValueAt(selectedRow, 1);
            enterprise.getOrganizationDirectory().removeOrganization(organization);
            populateTable();
            }
        }else{
               JOptionPane.showMessageDialog(null, "Please select a row");
        }
    }          
    
    private void orgComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }   
    
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }     

    // Variables declaration - do not modify                     
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel headLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox orgComboBox;
    private javax.swing.JTable orgTable;
    // End of variables declaration                   
}
