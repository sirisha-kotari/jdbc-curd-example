package org.company.domain;

public class Company {
    private String name;
    private int companyRegNumber;

    private String location;
    private String Country;

    private Employee emp;

    public Company() {

    }

    public Company(int companyRegNumber, String name, String location, String country) {
        this.name = name;
        this.companyRegNumber = companyRegNumber;
        this.location = location;
        Country = country;
    }



    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public Company(Employee emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", companyRegNumber=" + companyRegNumber +
                ", location='" + location + '\'' +
                ", Country='" + Country + '\'' +
                ", emp=" + emp +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCompanyRegNumber() {
        return companyRegNumber;
    }

    public void setCompanyRegNumber(int companyRegNumber) {
        this.companyRegNumber = companyRegNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }


}

