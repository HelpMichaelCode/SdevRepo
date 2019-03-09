package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class Projects extends Model {

    // Properties
    @Id
    private Long projectID;
    
    @Constraints.Required
    private String projectName;

    @Constraints.Required
    private String projectDate;


    // Default Constructor
    public Projects() {
    }

    // Constructor to initialise object
    public Projects(Long projectID, String projectName, String projectDate) {
        this.projectID = projectID;
        this.projectName = projectName;
        this.projectDate = projectDate;
      //  this.employees = employees;
    }

    // Accessor methods
   
    public Long getProjectID() {
        return projectID;
    }
    public void setProjectID(Long id) {
        this.projectID = id;
    }
    public String getProjectName() {
        return projectName;
    }
    public void setName(String projectName) {
        this.projectName = projectName;
    }
    public String getDob(){
        return projectDate;
    }
    public void setDate(String projectDate){//Admin can set dates for projects
        this.projectDate = projectDate;
    }
    public static final Finder<Long, Projects> find = new Finder<>(Projects.class);

    public static final List<Projects> findAll() {
        return Projects.find.all();
     }
    //Generic query helper for entity Computer with id Long
   

    
     
}