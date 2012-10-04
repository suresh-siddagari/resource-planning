package models;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: ayond
 * Date: 04/10/12
 * Time: 17:03
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Employee {
    private int empId;

    @javax.persistence.Column(name = "empId")
    @Id
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    private String empName;

    @javax.persistence.Column(name = "empName")
    @Basic
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    private String empType;

    @javax.persistence.Column(name = "empType")
    @Basic
    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (empId != employee.empId) return false;
        if (empName != null ? !empName.equals(employee.empName) : employee.empName != null) return false;
        if (empType != null ? !empType.equals(employee.empType) : employee.empType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empId;
        result = 31 * result + (empName != null ? empName.hashCode() : 0);
        result = 31 * result + (empType != null ? empType.hashCode() : 0);
        return result;
    }

    private Collection<Resourceplan> resourceplansByEmpId;

    @OneToMany(mappedBy = "employeeByEmpId")
    public Collection<Resourceplan> getResourceplansByEmpId() {
        return resourceplansByEmpId;
    }

    public void setResourceplansByEmpId(Collection<Resourceplan> resourceplansByEmpId) {
        this.resourceplansByEmpId = resourceplansByEmpId;
    }
}
