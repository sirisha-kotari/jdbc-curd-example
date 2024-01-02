package org.company.domain;

public class Employee {
    private int empId;
    private String empName;
    private int deptId;
    private String email;
    private double sal;

    public Employee() {
    }

    public Employee(int empId, String empName, int deptId, String email, double sal, int companyRegNumber) {
        this.empId = empId;
        this.empName = empName;
        this.deptId = deptId;
        this.email = email;
        this.sal = sal;
        this.companyRegNumber = companyRegNumber;
    }

    private int companyRegNumber;


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", deptId='" + deptId + '\'' +
                ", email='" + email + '\'' +
                ", sal=" + sal +
                ", companyRegNumber=" + companyRegNumber +
                '}';
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public int getCompanyRegNumber() {
        return companyRegNumber;
    }

    public void setCompanyRegNumber(int companyRegNumber) {
        this.companyRegNumber = companyRegNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }


}
