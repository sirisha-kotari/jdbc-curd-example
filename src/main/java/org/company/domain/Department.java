package org.company.domain;

public class Department {
    private int deptId;
    private String name;
    private String description;

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Department(int deptId, String name, String description) {
        this.deptId = deptId;
        this.name = name;
        this.description = description;
    }

    public Department() {
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
