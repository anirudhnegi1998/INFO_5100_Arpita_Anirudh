package userinterface.AdministrativeEventRole;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Enterprise.EventEnterprise;
import java.awt.CardLayout;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.ChartUtilities;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author arpitajaiswal
 */
public class FundraiserEvents extends javax.swing.JPanel {

    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Network network;

    public FundraiserEvents(JPanel userProcessContainer, Enterprise enterprise, Network network) {
        this.userProcessContainer = userProcessContainer;
        
        this.network = network;
        this.enterprise = enterprise;
         populateTable();
         initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        eventTable = new javax.swing.JTable();
        graphBtn = new javax.swing.JButton();
        headLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        backBtn.setBackground(new java.awt.Color(181, 223, 237));
        backBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Prev Menu.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        eventTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Street", "City", "State", "Zipcode", "Budget", "Funds Collected"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(eventTable);

        graphBtn.setBackground(new java.awt.Color(181, 223, 237));
        graphBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        graphBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Assign symbol.png"))); // NOI18N
        graphBtn.setText("GENERATE BAR ANALYSIS");
        graphBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphBtnActionPerformed(evt);
            }
        });

        headLabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        headLabel.setText("VIEW FUNDRAISER EVENTS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(headLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(graphBtn)
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(graphBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(headLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(backBtn)))
                .addContainerGap(283, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }                                       

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) eventTable.getModel();
        model.setRowCount(0);
        int count = 0;
        for (Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enter.getEnterpriseType().equals(Enterprise.EnterpriseType.Event)) {
                if (count != 0) {
                    EventEnterprise event = (EventEnterprise) enter;
                    Object[] row = new Object[7];
                    row[0] = event;
                    row[1] = event.getStreet();;
                    row[2] = event.getCity();
                    row[3] = event.getState();
                    row[4] = event.getZipcode();
                    row[5] = event.getBudgetCount();
                    row[6] = event.getFundsCollected();
                    model.addRow(row);
                } else {
                    count++;
                }
            }
        }

    }

    private void graphBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        // dataset.setValue(80, "M", "M");
        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {

            //System.out.println(e.getName() + "---" + e.getEnterpriseType().equals(Enterprise.EnterpriseType.Camp));
            if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.Event)) {
                EventEnterprise ep = (EventEnterprise) e;
                // System.out.println(ep.getFundsCollected());
                //System.out.println();
                if (ep.getFundsCollected() != 0) {
                    dataset.setValue(ep.getFundsCollected(), "Funds Collected", ep.getName());
                }
            }
        }

        JFreeChart chart = ChartFactory.createBarChart("Funds Collected Per Camp", "Event Camp Name", "Total Funds", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLACK);
        ChartFrame frame = new ChartFrame("Plot for Most Affected People in Different Areas", chart);
        frame.setVisible(true);
        frame.setSize(450, 350);
    }                                        


    // Variables declaration - do not modify                     
    private javax.swing.JButton backBtn;
    private javax.swing.JTable eventTable;
    private javax.swing.JButton graphBtn;
    private javax.swing.JLabel headLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   

}
