/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.LabAssistantRole.LabAssistantWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author arpitajaiswal
 */
public class LabAssistantRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem business) {
        return new LabAssistantWorkAreaJPanel(userProcessContainer, account, (LabOrganization)organization, business, enterprise);
    }
    
}
