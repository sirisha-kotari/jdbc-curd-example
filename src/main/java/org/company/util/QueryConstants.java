package org.company.util;

public class QueryConstants {

    // Company Queries
    public static final String CREATE_COMPANY_QUERY = "insert into company(companyRegNumber,name,location,country) values (?,?,?,?);";

    public static final String UPDATE_COMPANY_QUERY = "update company set location=? where companyRegNumber=?;";
    public static final String DELETE_COMPANY_QUERY = "delete from company where companyRegNumber=?;";
    public static final String DELETE_EMPLOYEE_WITH_COMPANY_REG_NUMBER_QUERY = "DELETE FROM employee WHERE companyRegNumber=?;";
    public static final String LIST_ALL_COMPANIES_QUERY = "select * from company;";

    //
// Department Queries
    public static final String CREATE_DEPARTMENT_QUERY = "INSERT INTO department(deptId,name,description)VALUES(?,?,?);";
    public static final String UPDATE_DEPARTMENT_NAME_QUERY = "UPDATE department SET name=? where deptId=?;";
    public static final String UPDATE_DEPARTMENT_DESCRIPTION_QUERY = "UPDATE department SET description=? where deptId=?;";
    public static final String DELETE_DEPARTMENT_QUERY = "DELETE FROM department WHERE deptId=?;";
    public static final String LIST_ALL_DEPARTMENT_QUERY = "SELECT * FROM department;";

    //Employee Queries
    public static final String CREATE_EMPLOYEE_QUERY = "INSERT INTO EMPLOYEE(empId,empName,deptId,email,sal,companyRegNumber)VALUES(?,?,?,?,?,?);";
    public static final String UPDATE_EMPLOYEE_NAME_QUERY = "UPDATE employee SET name=? where empId=?;";
    public static final String UPDATE_EMPLOYEE_EMAIL_QUERY = "UPDATE employee SET email=? where empId=?;";
    public static final String UPDATE_EMPLOYEE_DEPARTMENT_QUERY = "UPDATE employee SET deptId=? where empId=?;";
    public static final String UPDATE_EMPLOYEE_COMPANY_QUERY = "UPDATE employee SET companyRegNumber=? where empId=?;";
    public static final String UPDATE_EMPLOYEE_SALARY_QUERY = "UPDATE employee SET sal=? where empId=?;";
    public static final String DELETE_EMPLOYEE_QUERY = "DELETE FROM employee WHERE empId=?;";
    public static final String LIST_ALL_EMPLOYEE_QUERY = "SELECT * FROM employee;";




}