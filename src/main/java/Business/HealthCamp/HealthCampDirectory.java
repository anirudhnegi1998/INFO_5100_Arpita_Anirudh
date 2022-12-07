/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
