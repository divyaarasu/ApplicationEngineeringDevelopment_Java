/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Organization.AdminOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabAOrganization;
import Business.UserAccount.UserAccount;
/**
 *
 * @author ran
 */
public class ConfigureABusiness {
    
    public static Business configure(){
        // Three roles: LabAssistant, Doctor, Admin
        
        Business business = Business.getInstance();
        AdminOrganization adminOrganization = new AdminOrganization();
       business.getOrganizationDirectory().getOrganizationList().add(adminOrganization);
        
        Employee employee = new Employee();
        employee.setName("Divya");
        
        
        UserAccount account = new UserAccount();
        
        account.setUsername("admin");
        account.setPassword("admin");
        account.setRole("Admin");
        account.setEmployee(employee);
        
        adminOrganization.getEmployeeDirectory().getEmployeeList().add(employee);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account);
        
        //DOCTOR
        DoctorOrganization docOrg = new DoctorOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(docOrg);
        Employee emp2 = new Employee();
        emp2.setName("Jack");        
        UserAccount account2 = new UserAccount();
        account2.setUsername("doctor");
        account2.setPassword("doctor");
        account2.setRole("Doctor");
        account2.setEmployee(emp2);
        docOrg.getEmployeeDirectory().getEmployeeList().add(emp2);
        docOrg.getUserAccountDirectory().getUserAccountList().add(account2);
        
        //Lab assistant
        LabAOrganization labOrg = new LabAOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(labOrg);
        Employee emp3 = new Employee();
        emp3.setName("Rose");        
        UserAccount account3 = new UserAccount();
        account3.setUsername("lab");
        account3.setPassword("lab");
        account3.setRole("LabAssistant");
        account3.setEmployee(emp3);
        labOrg.getEmployeeDirectory().getEmployeeList().add(emp3);
        labOrg.getUserAccountDirectory().getUserAccountList().add(account3);
        
        return business;
    }
    
}
