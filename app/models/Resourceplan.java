package models;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created with IntelliJ IDEA.
 * User: ayond
 * Date: 04/10/12
 * Time: 17:03
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Resourceplan {
    private long id;

    @javax.persistence.Column(name = "id")
    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private int empId;

    @javax.persistence.Column(name = "empId")
    @Basic
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    private int projectId;

    @javax.persistence.Column(name = "projectId")
    @Basic
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    private String projectName;

    @javax.persistence.Column(name = "projectName")
    @Basic
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    private int week;

    @javax.persistence.Column(name = "week")
    @Basic
    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    private int occupied;

    @javax.persistence.Column(name = "occupied")
    @Basic
    public int getOccupied() {
        return occupied;
    }

    public void setOccupied(int occupied) {
        this.occupied = occupied;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Resourceplan that = (Resourceplan) o;

        if (empId != that.empId) return false;
        if (id != that.id) return false;
        if (occupied != that.occupied) return false;
        if (projectId != that.projectId) return false;
        if (week != that.week) return false;
        if (projectName != null ? !projectName.equals(that.projectName) : that.projectName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + empId;
        result = 31 * result + projectId;
        result = 31 * result + (projectName != null ? projectName.hashCode() : 0);
        result = 31 * result + week;
        result = 31 * result + occupied;
        return result;
    }

    private Employee employeeByEmpId;

    @ManyToOne
    @javax.persistence.JoinColumn(name = "empId", referencedColumnName = "empId", nullable = false)
    public Employee getEmployeeByEmpId() {
        return employeeByEmpId;
    }

    public void setEmployeeByEmpId(Employee employeeByEmpId) {
        this.employeeByEmpId = employeeByEmpId;
    }
}
