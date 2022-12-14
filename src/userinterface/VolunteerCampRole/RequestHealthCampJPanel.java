package userinterface.VolunteerCampRole;

import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthCampApprovalStatus;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author arpitajaiswal 
 */
public class RequestHealthCampJPanel extends javax.swing.JPanel {

    private Enterprise enterprise;
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;

    
    public RequestHealthCampJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        //valueLabel.setText(enterprise.getName());

    }
    
    private int verifyZipCode(String verify) {
  
    try{
    int zipcodeVal = Integer.parseInt(verify);
        if (verify.length() >= 6) {
            return 0;
        }
        return 1;
    }catch(NumberFormatException e){
        return 0;
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

        streetLabel = new javax.swing.JLabel();
        streetField = new javax.swing.JTextField();
        cityField = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        stateLabel = new javax.swing.JLabel();
        stateField = new javax.swing.JTextField();
        zipCodeField = new javax.swing.JTextField();
        zipcodeLabel = new javax.swing.JLabel();
        headLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        requestHCBtn = new javax.swing.JButton();
        noofAffectedPeopleLabel = new javax.swing.JLabel();
        noOfPeopleField = new javax.swing.JTextField();
        childPercentLabel = new javax.swing.JLabel();
        childPercentField = new javax.swing.JTextField();
        elderPercentField = new javax.swing.JTextField();
        elderPercentLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(181, 223, 237));

        streetLabel.setText("Street Address");

        cityLabel.setText("City");

        stateLabel.setText("State");

        zipcodeLabel.setText("ZipCode");

        headLabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        headLabel.setText("HEALTH CAMP REQUEST");

        backBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Prev Menu.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        requestHCBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        requestHCBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Assign symbol.png"))); // NOI18N
        requestHCBtn.setText("REQUEST FOR HEALTH CAMP");
        requestHCBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestHCBtnActionPerformed(evt);
            }
        });

        noofAffectedPeopleLabel.setText("No of People Affected");

        childPercentLabel.setText("Percentage of Affected Children");

        elderPercentLabel.setText("Percentage of Affected Elders");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(90, 90, 90)
                        .addComponent(requestHCBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(streetLabel)
                            .addComponent(cityLabel)
                            .addComponent(stateLabel)
                            .addComponent(zipcodeLabel)
                            .addComponent(noofAffectedPeopleLabel)
                            .addComponent(childPercentLabel)
                            .addComponent(elderPercentLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(streetField)
                            .addComponent(cityField)
                            .addComponent(stateField)
                            .addComponent(zipCodeField)
                            .addComponent(noOfPeopleField)
                            .addComponent(childPercentField)
                            .addComponent(elderPercentField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(headLabel)
                        .addGap(100, 100, 100)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(headLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetLabel)
                    .addComponent(streetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateLabel)
                    .addComponent(stateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipcodeLabel)
                    .addComponent(zipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noofAffectedPeopleLabel)
                    .addComponent(noOfPeopleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(childPercentLabel)
                    .addComponent(childPercentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elderPercentLabel)
                    .addComponent(elderPercentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(requestHCBtn))
                .addContainerGap(97, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        VolunteerCampRequestJPanel vol = (VolunteerCampRequestJPanel) component;
        vol.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backBtnActionPerformed

    private void requestHCBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestHCBtnActionPerformed

        if(streetField.getText().isEmpty() || cityField.getText().isEmpty() || stateField.getText().isEmpty() || zipCodeField.getText().isEmpty() || noOfPeopleField.getText().isEmpty() || childPercentField.getText().isEmpty() || elderPercentField.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Enrollment cannot be completed as one or more fields are empty!");
       }
       else{
       String address = streetField.getText();
       String city1 = cityField.getText();
       String state1 = stateField.getText();
       String zipcode1 = zipCodeField.getText();
       int zipcodeVal= verifyZipCode(zipCodeField.getText());
        if (zipcodeVal == 0) {
            JOptionPane.showMessageDialog(null, "Please enter a valid 5 digit zip code");
            return;
        }
       try{
           
       
       int people = Integer.parseInt(noOfPeopleField.getText());
       int elder = Integer.parseInt(elderPercentField.getText());
       int child = Integer.parseInt(childPercentField.getText());
       
      
       HealthCampApprovalStatus req = new HealthCampApprovalStatus();
       req.setTypeOfRequest("HealthCamp");
       req.setStreet(address);
       req.setCity(city1);
       req.setState(state1);
       req.setZipcode(zipcode1);
       req.setPercentChild(noOfPeopleField.getText());
       req.setPercentElder(childPercentField.getText());
       req.setPeopleAffected(elderPercentField.getText());
       req.setStatus("Pending");
       req.setReceiver(userAccount);
       req.setName(userAccount.toString());
       
       userAccount.getWorkQueue().getWorkRequestList().add(req);

       for (UserAccount user : enterprise.getUserAccountDirectory().getUserAccountList()) {
           
           if ((enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Camp)) {
               
               user.getWorkQueue().getWorkRequestList().add(req);
               JOptionPane.showMessageDialog(this, "Health Camp Request Submitted to Camp Admin!");
               streetField.setText("");
               cityField.setText("");
               stateField.setText("");
               zipCodeField.setText("");
               noOfPeopleField.setText("");
               childPercentField.setText("");
               elderPercentField.setText("");
           }
       }
       } catch(NumberFormatException e){
          JOptionPane.showMessageDialog(null, "Please enter number for people affected, percentage of affected children and elders!");
       }
    }//GEN-LAST:event_requestHCBtnActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField childPercentField;
    private javax.swing.JLabel childPercentLabel;
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField elderPercentField;
    private javax.swing.JLabel elderPercentLabel;
    private javax.swing.JLabel headLabel;
    private javax.swing.JTextField noOfPeopleField;
    private javax.swing.JLabel noofAffectedPeopleLabel;
    private javax.swing.JButton requestHCBtn;
    private javax.swing.JTextField stateField;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JTextField streetField;
    private javax.swing.JLabel streetLabel;
    private javax.swing.JTextField zipCodeField;
    private javax.swing.JLabel zipcodeLabel;
    // End of variables declaration//GEN-END:variables
}
