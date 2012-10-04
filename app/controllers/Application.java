package controllers;

import javax.persistence.Query;

import models.Employee;
import play.*;
import play.db.jpa.JPA;
import play.mvc.*;

import views.html.*;

import java.util.ArrayList;
import java.util.List;

public class Application extends Controller {
  
  public static Result index() {
    return ok(index.render("Your new application is ready."));
  }

  public static void employee(){

      Query objQuery= JPA.em().createQuery("select empId, empName,empType from Employee ");
      List<Object> listTempEmployees=objQuery.getResultList();

      List<Employee> listEmployees=new ArrayList<Employee>();

      for(Object tempEmp : listTempEmployees ){

            Object[] objResult=(Object[])tempEmp;
            Employee objTempEmp=new Employee();
            objTempEmp.setEmpId((Integer)objResult[0]);
            objTempEmp.setEmpName((String)objResult[1]);
            objTempEmp.setEmpType((String)objResult[2]);
            listEmployees.add(objTempEmp);
      }

      // TODO return employees as JSON

  }

}