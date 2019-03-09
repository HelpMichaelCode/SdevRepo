package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Employee extends Model{
    
    @Id
    private int emp_ID;

    @Constraints.Required
    private String emp_Fname;

    @Constraints.Required
    private String emp_Lname;

    @ManyToOne
    private ProjectCategory projectCat;

    public Employee (int emp_ID, String emp_Fname, String emp_Lname){
        this.emp_ID = emp_ID;
        this.emp_Fname = emp_Fname;
        this.emp_Lname = emp_Lname;
    }
  
    public int getID(){
        return emp_ID;
    }
    public void setID(int emp_ID){
        this.emp_ID = emp_ID;
    }
    public String getFname(){
        return emp_Fname;
    }
    public void setFname(String fname){
        this.emp_Fname = fname;
    }
    public String getLname(){
        return emp_Lname;
    }
    public void setLname(String lname){
        this.emp_Lname = lname;
    }
    public ProjectCategory getProjectCat() {
        return projectCat;
    }
    public void setProjectCat(ProjectCategory projectCat) {
        this.projectCat = projectCat;
    }
   
}