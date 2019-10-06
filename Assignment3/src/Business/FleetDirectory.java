/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;


/**
 *
 * @author DivyaThanigaiArasu
 */
public class FleetDirectory {
    private ArrayList<Fleet> fleetCatalog;

    public FleetDirectory() {
        this.fleetCatalog = new ArrayList<Fleet>();
        
        Fleet car1 = new Fleet();
        car1.FleetManualAdd(true, "Ferrari", 2019, 1, 2, 1,"Red One", "Boston", true);
        Fleet car2 = new Fleet();
        car2.FleetManualAdd(true, "BMW", 2019, 1, 4, 2, "X1", "New York", true);
        Fleet car3 = new Fleet();
        car3.FleetManualAdd(true, "Toyota", 2018, 1, 4, 3, "T1", "Boston", true);
        Fleet car4 = new Fleet();
        car4.FleetManualAdd(true, "GM", 2018, 1, 4, 4, "G1", "New York", true);
        Fleet car5 = new Fleet();
        car5.FleetManualAdd(true, "Toyota", 2017, 1, 4, 5, "T2", "Chicago", true);
        Fleet car6 = new Fleet();
        car6.FleetManualAdd(true, "GM", 2017, 1, 4, 6, "G2", "Chicago", true);
        Fleet car7 = new Fleet();
        car7.FleetManualAdd(true, "Ferrari", 2016, 1, 4, 7, "", "Seattle", true);
        Fleet car8 = new Fleet();
        car8.FleetManualAdd(true, "BMW", 2016, 1, 4, 8, "X2", "Seattle", true);
        Fleet car9 = new Fleet();
        car9.FleetManualAdd(true, "Toyota", 2019, 1, 4, 9, "T3", "Austin", true);
        Fleet car10 = new Fleet();
        car10.FleetManualAdd(true, "GM", 2019, 1, 4, 10, "G3", "Austin", true);
        
        fleetCatalog.add(car1);
        fleetCatalog.add(car2);
        fleetCatalog.add(car3);
        fleetCatalog.add(car4);
        fleetCatalog.add(car5);
        fleetCatalog.add(car6);
        fleetCatalog.add(car7);
        fleetCatalog.add(car8);
        fleetCatalog.add(car9);
        fleetCatalog.add(car10);
    }
    
    

    public ArrayList<Fleet> getFleetCatalog() {
        return fleetCatalog;
    }

    public void setFleetCatalog(ArrayList<Fleet> fleetCatalog) {
        this.fleetCatalog = fleetCatalog;
    }
    
    public Fleet addCar () {
        Fleet car = new Fleet();
        fleetCatalog.add(car);
        return car;
    }
    
    public void deleteCar(Fleet car) {
        fleetCatalog.remove(car);
    }
    
    public ArrayList<Fleet> searchSnumber(int num){
        ArrayList<Fleet> arr = new ArrayList<Fleet>();
        for(Fleet c : this.fleetCatalog){
            if(c.getSerial_num() == num){
                arr.add(c);
                return (arr);
            }
        }
        return null;
    }
    public ArrayList<Fleet> searchSnumber(int num, ArrayList<Fleet> result){
        ArrayList<Fleet> arr = new ArrayList<Fleet>();
        for(Fleet c : result){
            if(c.getSerial_num() == num){
                arr.add(c);
                return (arr);
            }
        }
        return null;
    }
    public ArrayList<Fleet> searchManYr(int num){
        ArrayList<Fleet> arr = new ArrayList<Fleet>();
        for(Fleet c : this.fleetCatalog){
            if(c.getManufactured_year() == num){
                arr.add(c);
            }
        }
        return (arr);
    }
    public ArrayList<Fleet> searchManYr(int num, ArrayList<Fleet> result){
        ArrayList<Fleet> arr = new ArrayList<Fleet>();
        for(Fleet c : result){
            if(c.getManufactured_year() == num){
                arr.add(c);
            }
        }
        return (arr);
    }
    public ArrayList<Fleet> searchAvailCar(boolean b){
        ArrayList<Fleet> arr = new ArrayList<Fleet>();
        for(Fleet c : this.fleetCatalog){
            if(c.isAvailable() == b){
                arr.add(c);
                return(arr);
            }
        }
        return null;
    }
    public ArrayList<Fleet> searchAllAvailCar(boolean b){
        ArrayList<Fleet> arr = new ArrayList<Fleet>();
        for(Fleet c : this.fleetCatalog){
            if(c.isAvailable() == b){
                arr.add(c);
            }
        }
        return(arr);
    }
    public ArrayList<Fleet> searchBrand(String s){
        ArrayList<Fleet> arr = new ArrayList<Fleet>();
        for(Fleet c : this.fleetCatalog){
            if(c.getBrand().equalsIgnoreCase(s)){
                arr.add(c);
            }
        }
        return(arr);
    }
    public ArrayList<Fleet> searchBrand(String s, ArrayList<Fleet> result){
        ArrayList<Fleet> arr = new ArrayList<Fleet>();
        for(Fleet c : result){
            if(c.getBrand().equalsIgnoreCase(s)){
                arr.add(c);
            }
        }
        return(arr);
    }
    public ArrayList<Fleet> searchModel(String s){
        ArrayList<Fleet> arr = new ArrayList<Fleet>();
        for(Fleet c : this.fleetCatalog){
            if(c.getModel_num().equalsIgnoreCase(s)){
                arr.add(c);
            }
        }
        return(arr);
    }
    public ArrayList<Fleet> searchModel(String s, ArrayList<Fleet> result){
        ArrayList<Fleet> arr = new ArrayList<Fleet>();
        for(Fleet c : result){
            if(c.getModel_num().equalsIgnoreCase(s)){
                arr.add(c);
            }
        }
        return(arr);
    }
    public ArrayList<Fleet> searchExpMaintainedCars(boolean b){
        ArrayList<Fleet> arr = new ArrayList<Fleet>();
        for(Fleet c : this.fleetCatalog){
            if(c.isMaintenance_certificate() == b){
                arr.add(c);
            }
        }
        return(arr);
    }
    public ArrayList<Fleet> searchCity(boolean b, String s){
        ArrayList<Fleet> arr = new ArrayList<Fleet>();
        for(Fleet c : this.fleetCatalog){
            if((c.isAvailable() == b) && (c.getAvailble_city().equalsIgnoreCase(s))){
                arr.add(c);
            }
            }
        return(arr);
    }
    public ArrayList<Fleet> searchCity(boolean b, String s, ArrayList<Fleet> result){
        ArrayList<Fleet> arr = new ArrayList<Fleet>();
        for(Fleet c : result){
            if((c.isAvailable() == b) && (c.getAvailble_city().equalsIgnoreCase(s))){
                arr.add(c);
            }
            }
        return(arr);
    }
    public ArrayList<Fleet> searchSeat(int i, int j){
        ArrayList<Fleet> arr = new ArrayList<Fleet>();
        for(Fleet c : this.fleetCatalog){
            if((c.getMin_seats()>=i) && (c.getMax_seats()<= j)){
                arr.add(c);
            }
            }
         return(arr);
            }
    public ArrayList<Fleet> searchSeat(int i, int j, ArrayList<Fleet> result){
        ArrayList<Fleet> arr = new ArrayList<Fleet>();
        for(Fleet c : result){
            if((c.getMin_seats()>=i) && (c.getMax_seats()<= j)){
                arr.add(c);
            }
            }
         return(arr);
            }
    public ArrayList<String> getAllManufacturer() {
        ArrayList<String> brand = new ArrayList<String>();
      for(Fleet c : this.getFleetCatalog()){
          if(!brand.contains(c.getBrand())) {
            brand.add(c.getBrand());  
          }
      }
      return (brand);
    }
}
