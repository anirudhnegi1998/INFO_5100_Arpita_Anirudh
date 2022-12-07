package Business.HealthCamp;
import java.util.ArrayList;

/**
 *
 * @author anirudhnegi
 */
public class HealthCampDirectory {

    private ArrayList<HealthCamp> healthCampList;

    public HealthCampDirectory() {
        healthCampList = new ArrayList<HealthCamp>();
    }

    public ArrayList<HealthCamp> gethealthCampList() {
        return healthCampList;
    }

    public HealthCamp addHealthCamp() {
        HealthCamp health = new HealthCamp();
        healthCampList.add(health);
        return health;
    }
}