/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author ranranhe
 */
public class VitalSignHistory {

    private ArrayList<VitalSigns> vitalSignHistory;
    private ArrayList<VitalSigns> AbnormalList;             //new addition
            
           

    public VitalSignHistory() {
        this.vitalSignHistory = new ArrayList<VitalSigns>();
        this.AbnormalList = new ArrayList<VitalSigns>();     //new addition
    }
    
    public VitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    public ArrayList<VitalSigns> getVitalSignHistory() {
        return this.vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSigns> history) {
        this.vitalSignHistory = history;
    }
    
       public ArrayList<VitalSigns> getAbnormalList() {
        return this.AbnormalList;
    }

    public void setAbnormalList(ArrayList<VitalSigns> AbnormalList) {
        this.AbnormalList = AbnormalList;
    }

    public void addVital(VitalSigns v) {
        vitalSignHistory.add(v);
    }

    public void deleteVital(VitalSigns v) {
        vitalSignHistory.remove(v);
    }
    
  

    public ArrayList<VitalSigns> getAbnormalList(double maxbp, double minbp) {
    ArrayList<VitalSigns> AbnormalList = new ArrayList<>();
        for (VitalSigns vs : vitalSignHistory) {
            if (vs.getBloodPressure() > minbp && vs.getBloodPressure() < maxbp) {
                AbnormalList.add(vs);
            }
        }
        return AbnormalList;
    }

 

   

   
    
     
}
