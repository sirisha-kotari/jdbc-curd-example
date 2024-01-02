package org.company.util;

import org.apache.log4j.Logger;
import org.company.domain.Company;
import org.company.domain.Department;
import org.company.domain.Employee;
import org.company.manager.CompanyManager;

public class ModelBuilder {
    private static org.apache.log4j.Logger logger = Logger.getLogger(ModelBuilder.class);
    public static Company buildCompany(int id, String name, String location, String country) {
        Company company = new Company();
        logger.debug("Company Object created");
        company.setCompanyRegNumber(id);
        company.setName(name);
        company.setLocation(location);
        company.setCountry(country);
        return company;
    }

    public static Department buildDepartment(int id, String name, String description) {
        Department department = new Department();
        logger.debug("Department Object created");
        department.setDeptId(id);
        department.setName(name);
        department.setDescription(description);

        return department;
    }

    public static Employee buildEmployee(int empId, String empName, int deptId, String email, double sal, int CompanyRegNumber) {
        Employee employee = new Employee();
        logger.debug("Employee Object created");
        employee.setEmpId(empId);
        employee.setEmpName(empName);
        employee.setDeptId(deptId);
        employee.setEmail(email);
        employee.setSal(sal);
        employee.setCompanyRegNumber(CompanyRegNumber);

        return employee;
    }


}
