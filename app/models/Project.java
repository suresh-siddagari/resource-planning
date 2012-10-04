package models;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: ayond
 * Date: 04/10/12
 * Time: 17:03
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Project {
    private int projectId;

    @javax.persistence.Column(name = "projectId")
    @Id
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Project project = (Project) o;

        if (projectId != project.projectId) return false;
        if (projectName != null ? !projectName.equals(project.projectName) : project.projectName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = projectId;
        result = 31 * result + (projectName != null ? projectName.hashCode() : 0);
        return result;
    }
}
