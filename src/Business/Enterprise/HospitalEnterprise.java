package Business.Enterprise;

import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.Organization.VolunteerCampOrganization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anirudhnegi
 */

public class HospitalEnterprise extends Enterprise {

    public HospitalEnterprise(String name) {
        super(name, EnterpriseType.Hospital);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public ArrayList<Organization> getSupportedType() {
        ArrayList<Organization> organ = new ArrayList();
        organ.add(new DoctorOrganization());
        organ.add(new LabOrganization());
        organ.add(new NurseOrganization());
        return organ;
    }

}
