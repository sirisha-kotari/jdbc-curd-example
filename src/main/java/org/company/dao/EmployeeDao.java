package org.company.dao;

import org.apache.log4j.Logger;
import org.company.domain.Company;
import org.company.domain.Employee;
import org.company.util.ConnectionManager;
import org.company.util.QueryConstants;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.company.util.QueryConstants.*;

public class EmployeeDao {
    private static org.apache.log4j.Logger logger = Logger.getLogger(EmployeeDao .class);

    public void addEmployee(Employee employee) {
        try {
            Connection con = ConnectionManager.openConnection();
            logger.info("connection opened for addEmployee");
            PreparedStatement psmt = con.prepareStatement(QueryConstants.CREATE_EMPLOYEE_QUERY);
            //set the value of parameters
            psmt.setInt(1, employee.getEmpId());
            psmt.setString(2, employee.getEmpName());
            psmt.setInt(3, employee.getDeptId());
            psmt.setString(4, employee.getEmail());
            psmt.setDouble(5, employee.getSal());
            psmt.setInt(6, employee.getCompanyRegNumber());

            //execute..
            psmt.execute();

            logger.debug("Employee Inserted successfully");
        } catch (Exception e) {
           logger.fatal("Exception occurred while creating Company" + e.getMessage());
        }
    }

    public void updateEmployeeName(String name, int empId) {
        try {
            Connection con = ConnectionManager.openConnection();
            logger.info("connection opened for updateEmployeeName(");
            PreparedStatement psmt = con.prepareStatement(UPDATE_EMPLOYEE_NAME_QUERY);
            //set the value of parameters

            psmt.setString(1, name);
            psmt.setInt(2, empId);
            psmt.executeUpdate();
            logger.debug("Employee Name updated successfully");
        } catch (Exception e) {
            logger.fatal("Exception occurred while updating Company" + e.getMessage());
        }
    }
    public void updateEmployeeEmail(String email, int empId) {
        try {
            Connection con = ConnectionManager.openConnection();
            logger.info("connection opend for updateEmployeeEmail");
            PreparedStatement psmt = con.prepareStatement(QueryConstants.UPDATE_EMPLOYEE_EMAIL_QUERY );
            //set the value of parameters

            psmt.setString(1, email);
            psmt.setInt(2, empId);
            psmt.executeUpdate();
           logger.debug("Employee Email updated successfully");
        } catch (Exception e) {
            logger.fatal("Exception occurred while updating Company" + e.getMessage());
        }
    }
    public void updateEmployeeDepartment(int deptId, int empId) {
        try {
            Connection con = ConnectionManager.openConnection();
            logger.info("connection opend for updateEmployeeDepartment");
            PreparedStatement psmt = con.prepareStatement(QueryConstants.UPDATE_EMPLOYEE_DEPARTMENT_QUERY );
            //set the value of parameters

            psmt.setInt(1,deptId);
            psmt.setInt(2, empId);
            psmt.executeUpdate();
            logger.debug("Employee Department updated successfully");
        } catch (Exception e) {
            logger.fatal("Exception occurred while updating Company" + e.getMessage());
        }
    }
//update Employee Company
    public void updateEmployeeCompany(int companyRegNumber, int empId) {
        try {
            Connection con = ConnectionManager.openConnection();
            logger.info("connection opend for updateEmployeeCompany");
            PreparedStatement psmt = con.prepareStatement(QueryConstants.UPDATE_EMPLOYEE_COMPANY_QUERY);

            psmt.setInt(1,companyRegNumber);
            psmt.setInt(2, empId);
            psmt.executeUpdate();
            logger.debug("Employee Company updated successfully");
        } catch (Exception e) {
           logger.fatal("Exception occurred while updating Company" + e.getMessage());
        }
    }
    public void updateEmployeeSalary(double salary, int empId) {
        try {
            Connection con = ConnectionManager.openConnection();
            logger.info("connection opend for updateEmployeeSalary");
            PreparedStatement psmt = con.prepareStatement(QueryConstants.UPDATE_EMPLOYEE_SALARY_QUERY );

            psmt.setDouble(1,salary);
            psmt.setInt(2, empId);
            psmt.executeUpdate();
           logger.debug("Employee Salary updated successfully");
        } catch (Exception e) {
           logger.fatal("Exception occurred while updating Company" + e.getMessage());
        }
    }

    public void deleteEmployee(int empId) {
        try {
            Connection con = ConnectionManager.openConnection();
            logger.info("connection opend for deleteEmployee");
            PreparedStatement psmt = con.prepareStatement(DELETE_EMPLOYEE_QUERY);
            //set the value of parameters
            psmt.setInt(1, empId);

            //execute..
            psmt.executeUpdate();
           logger.debug("Employee deleted successfully");

        } catch (Exception e) {
         logger.fatal("Exception occurred while deleting employee" + e.getMessage());
        }
    }

    public List<Employee> listAllEmployees() {

        boolean f = false;
        try {
            List<Employee> employees = new ArrayList<>();
            Connection con = ConnectionManager.openConnection();
            logger.info("connection opend forlistAllEmployees");
            Statement st = con.createStatement();
            ResultSet set = st.executeQuery(QueryConstants.LIST_ALL_EMPLOYEE_QUERY);

            while (set.next()) {
                int empId = set.getInt(1);
                String empName= set.getString(2);
                int deptId = set.getInt(3);
                String email = set.getString(4);
               double sal=set.getDouble(5);
                int companyRegNumber=set.getInt(6);

                employees.add(new Employee(empId, empName,deptId,email,sal,companyRegNumber));


            }
            logger.debug("----------------------------------------------");
            return employees;
        } catch (Exception e) {
            logger.fatal("Exception occurred while listing all Companies" + e.getMessage());
        }
        return Collections.EMPTY_LIST;
    }


}
