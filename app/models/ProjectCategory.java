package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class ProjectCategory extends Model{
    
    @Id
    private Long id;

    @Constraints.Required
    private String name;

    //Project Category contains many employees
    @OneToMany
    private List<Employee> employee;

    ProjectCategory(){
    }

    public ProjectCategory(Long id, String name, List<Employee> employee){
        this.id = id;
        this.name = name;
        this.employee = employee;
    }

    public Long getID(){
        return id;
    }
    public void setID(Long id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public List<Employee> getEmp() {
        return employee;
    }
    
    public void setEmp (List<Employee> emp) {
        this.employee = emp;
    }

    public static Finder<Long,ProjectCategory> find = new Finder<Long,ProjectCategory>(ProjectCategory.class); 

    public static List<ProjectCategory> findAll(){
        return ProjectCategory.find.query().where().orderBy("name asc").findList();
    }

}