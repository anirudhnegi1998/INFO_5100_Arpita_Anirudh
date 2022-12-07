/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeCampRole;

import Business.AdminPanel;
import Business.Enterprise.CampEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.LabOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author arpitajaiswal
 */
public class HealthcampRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private AdminPanel business;
    private UserAccount userAccount;
    private LabOrganization labOrganization;
    private Enterprise enterprise;
    private Network network;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public HealthcampRequestJPanel(JPanel userProcessContainer, UserAccount account, AdminPanel business, Network network, Enterprise enterprise) {
        initComponents();
        this.network = network;
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.enterprise = enterprise;
        populateTable();
    }

    public void populateTable() {
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            //String dateConvert = format.format(request.getEventDate());
            if (request.toString().equals("HealthCamp")) {
                Object[] row = new Object[8];
                row[0] = request;
                row[1] = request.getCampId() + " - " + request.getCity();
                row[2] = request.getCampId();
                row[3] = request.getHospital(); //Hospital 
                row[4] = request.getCity();
                row[5] = request.getEventDate();
                row[6] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
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
        workRequestJTable = new javax.swing.JTable();
        pieBtn = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        assignJButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Type", "Name", "Camp ID", "Hospital Name", "City", "Date", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 980, 210));

        pieBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        pieBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Yellow/user_download.png"))); // NOI18N
        pieBtn.setText("GENERATE BAR CHART");
        pieBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieBtnActionPerformed(evt);
            }
        });
        add(pieBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 330, -1, -1));

        refreshJButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        refreshJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Green/Button-Refresh-icon.png"))); // NOI18N
        refreshJButton.setText("REFRESH");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, -1, -1));

        backJButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Yellow/prev-36.png"))); // NOI18N
        backJButton.setText(" BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        assignJButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        assignJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Yellow/rss.png"))); // NOI18N
        assignJButton1.setText("VIEW DETAILS");
        assignJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButton1ActionPerformed(evt);
            }
        });
        add(assignJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, 230, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Blue/rss.png"))); // NOI18N
        jLabel7.setText("HEALTH CAMP REQUEST PANEL");
        jLabel7.setBorder(new javax.swing.border.MatteBorder(null));
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 410, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void pieBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieBtnActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        // dataset.setValue(80, "M", "M");
        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {

            //System.out.println(e.getName()+ "---" +e.getEnterpriseType().equals(Enterprise.EnterpriseType.Camp));
            if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.Camp)) {
                CampEnterprise c = (CampEnterprise) e;
                System.out.println(c.getName());
                System.out.println(c.getPeopleAffected());
                if (c.getPeopleAffected() != null) {
                    dataset.setValue(Double.parseDouble(c.getPeopleAffected()), "No. of People Affected", c.getName());
                }
            }

        }

        JFreeChart chart = ChartFactory.createBarChart("People affected respective to Areas", "Camp Name", "No. of People Affected", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLACK);
        ChartFrame frame = new ChartFrame("Plot for Most Affected People in Different Areas", chart);
        frame.setVisible(true);
        frame.setSize(450, 350);
    }//GEN-LAST:event_pieBtnActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void assignJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButton1ActionPerformed
        // TODO add your handling code here:

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please make a selection");
            return;
        }

        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        //request.setStatus("Pending");
        populateTable();
        ViewCampRequestJPanel viewCamp = new ViewCampRequestJPanel(userProcessContainer, userAccount, business, request, network, enterprise);
        userProcessContainer.add("ViewCampRequestJPanel", viewCamp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_assignJButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton1;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pieBtn;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
