/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author DivyaThanigaiArasu
 */
public class VitalSigns {
    private double temprature;
    private double bloodPreassure;
    private int pulse;
    private String date;

    public double getTemprature() {
        return temprature;
    }

    public void setTemprature(double temprature) {
        this.temprature = temprature;
    }

    public double getBloodPreassure() {
        return bloodPreassure;
    }

    public void setBloodPreassure(double bloodPreassure) {
        this.bloodPreassure = bloodPreassure;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    @Override
    public String toString() {
       return this.date; 
    }
}
