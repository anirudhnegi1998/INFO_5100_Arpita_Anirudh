/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeCampRole;

import Business.EcoSystem;
import Business.Enterprise.CampEnterprise;
import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import Business.Network.Network;
import Business.Organization.LabOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author anirudhnegi
 */
public class HealthcampRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private LabOrganization labOrganization;
    private Enterprise enterprise;
    private Network network;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public HealthcampRequestJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business, Network network, Enterprise enterprise) {
        initComponents();
        this.network = network;
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.enterprise = enterprise;
        populateTable();
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
        campRequestTable = new javax.swing.JTable();
        chartBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(181, 223, 237));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campRequestTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(campRequestTable);
        if (campRequestTable.getColumnModel().getColumnCount() > 0) {
            campRequestTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 980, 210));

        chartBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        chartBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Assign symbol.png"))); // NOI18N
        chartBtn.setText("GENERATE BAR CHART");
        chartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chartBtnActionPerformed(evt);
            }
        });
        add(chartBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        refreshBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Green/Button-Refresh-icon.png"))); // NOI18N
        refreshBtn.setText("REFRESH");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, -1, -1));

        backBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Prev Menu.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 301, -1, 40));

        viewBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        viewBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Assign symbol.png"))); // NOI18N
        viewBtn.setText("VIEW IN DETAIL");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });
        add(viewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 230, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel7.setText("              CAMP REQUEST DATA");
        jLabel7.setBorder(new javax.swing.border.MatteBorder(null));
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 410, -1));
    }// </editor-fold>                        

    public void populateTable() {
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
        DefaultTableModel model = (DefaultTableModel) campRequestTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
           if (request.toString().equals("HealthCamp")) {
                Object[] row = new Object[8];
                row[0] = request;
                row[1] = request.getCampId() + " - " + request.getCity();
                row[2] = request.getCampId();
                row[3] = request.getHospital(); 
                row[4] = request.getCity();
                row[5] = request.getEventDate();
                row[6] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                row[7] = request.getStatus();
                model.addRow(row);
            }
        }
    }
    
    private void chartBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
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
    }                                        

     private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:

        int selectedRow = campRequestTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please make a selection");
            return;
        }

        WorkRequest request = (WorkRequest) campRequestTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        //request.setStatus("Pending");
        populateTable();
        ViewCampRequestJPanel viewCamp = new ViewCampRequestJPanel(userProcessContainer, userAccount, business, request, network, enterprise);
        userProcessContainer.add("ViewCampRequestJPanel", viewCamp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }       
                                              

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }                                       

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {                                           
        populateTable();
    }
                                   

    // Variables declaration - do not modify                     
    private javax.swing.JButton backBtn;
    private javax.swing.JTable campRequestTable;
    private javax.swing.JButton chartBtn;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration                   
}
