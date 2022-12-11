package userinterface.AdministrativeEventRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.WorkQueue.WorkRequest;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author arpitajaiswal
 */
public class FundRequests extends javax.swing.JPanel {

    
    private Enterprise enter;
    private JPanel userProcessContainer;
    private UserAccount user;
    private Network network;
    private EcoSystem eco;
    
    public FundRequests(JPanel userProcessContainer, Enterprise enter, UserAccount user, Network network, EcoSystem eco) {
        this.userProcessContainer = userProcessContainer;
        this.enter = enter;
        this.user = user;
        this.network = network;
        this.eco =  eco;
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

        createEventBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        eventDetailTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        headLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(181, 223, 237));

        createEventBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        createEventBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Assign symbol.png"))); // NOI18N
        createEventBtn.setText("CREATE EVENT");
        createEventBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEventBtnActionPerformed(evt);
            }
        });

        eventDetailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Patient ID", "Priority", "Age", "Approval", "Status"
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
        jScrollPane1.setViewportView(eventDetailTable);

        backBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Prev Menu.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Assign symbol.png"))); // NOI18N
        refreshBtn.setText("REFRESH");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        headLabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        headLabel.setText("CREATE FUNDRAISER EVENT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(backBtn)
                        .addGap(169, 169, 169)
                        .addComponent(headLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(756, 756, 756)
                        .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(createEventBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(headLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn)))
                .addGap(9, 9, 9)
                .addComponent(refreshBtn)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(createEventBtn)
                .addContainerGap(162, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
      public void populateTable() {
         DefaultTableModel model = (DefaultTableModel) eventDetailTable.getModel();

        model.setRowCount(0);
//        
        for(WorkRequest req : user.getWorkQueue().getWorkRequestList()){
                if((req.getStatus().equals("Fund Admin Requested")) || (req.getStatus().equals("Funding Going"))){
                    System.out.println(req);
                    Object[] row = new Object[6];
                    row[0] = req.getPatientFirstname();
                    row[1] = req.getPatientLastname();
                    row[2] = req.getPpriority();
                    row[3] = req.getPage();
                    row[4] = req;
                    row[5] = req.getStatus();
 
                    model.addRow(row);
                }
            }
    }

    private void createEventBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEventBtnActionPerformed
       int selectedRow = eventDetailTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a record and proceed to create event!");
            return;
        }
        WorkRequest request = (WorkRequest) eventDetailTable.getValueAt(selectedRow, 4);
        populateTable();
        if(request.getStatus().equals("Fund Admin Requested")){
            CreateFundEvent jpanel = new CreateFundEvent(userProcessContainer, request, user, enter,network);
            userProcessContainer.add("PatientNurseRequestJpanel", jpanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null, "Already In Process");
        }
        
    }//GEN-LAST:event_createEventBtnActionPerformed
    
  
    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createEventBtn;
    private javax.swing.JTable eventDetailTable;
    private javax.swing.JLabel headLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshBtn;
    // End of variables declaration//GEN-END:variables
}
