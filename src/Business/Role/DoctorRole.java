/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.AdminPanel;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DoctorRole.DoctorHomePage;

/**
 *
 * @author arpitajaiswal
 */
public class DoctorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, AdminPanel business) {
        return new DoctorHomePage(userProcessContainer, account, (DoctorOrganization) organization, enterprise,business);
    }

}
