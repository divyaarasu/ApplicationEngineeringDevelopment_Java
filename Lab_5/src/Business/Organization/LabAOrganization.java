/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author DivyaThanigaiArasu
 */
public class LabAOrganization extends Organization {

    public LabAOrganization() {
        super(Type.Lab.getValue());
    }

   

    @Override
    public ArrayList<String> getSupportedRole() {
        ArrayList<String> roles = new ArrayList<>();
        roles.add("LabAssistant");
        return roles;
    }
    
}
