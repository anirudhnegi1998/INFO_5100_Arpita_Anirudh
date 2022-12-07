/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.AdminPanel;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {

    AdminPanel business;

    public enum RoleType {
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant"),
        Nurse("Nurse"),
        VolunteerCamp("HealthCamp Volunteer"),
        VolunteerEvent("Event Volunteer"),
        Corporate("Corporate Fund"),
        Student("Student Fund"),
        General("General Fund"),
        Pharmacy("Pharmacy"),
        Receptionist("Redirector");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            Network network,
            AdminPanel business);

    public AdminPanel getEcoSystem() {

        return business;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
