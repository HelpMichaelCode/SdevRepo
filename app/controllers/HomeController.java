package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;
import models.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    public Result index() {
        return ok(index.render());
    }
    public Result projects(){
        List<Projects> list = Projects.findAll();// Fetches all the data objects on the data base
        return ok(projects.render(list));
    }
    public Result departments(){
        return ok(departments.render());
    }
    public Result Employee(){
        List<ProjectCategory> elist = ProjectCategory.findAll();
        return ok(Employee.render(elist));
    }
    

    
}
