package org.company.dao;

import org.apache.log4j.Logger;
import org.company.domain.Company;
import org.company.domain.Department;
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

public class DepartmentDao {
    private static org.apache.log4j.Logger logger = Logger.getLogger(DepartmentDao.class);
    public void addDepartment(Department department) {
        try {
            Connection con = ConnectionManager.openConnection();
            logger.info("connection opend for add department");
            PreparedStatement psmt = con.prepareStatement(QueryConstants.CREATE_DEPARTMENT_QUERY);
            //set the value of parameters
            psmt.setInt(1, department.getDeptId());
            psmt.setString(2, department.getName());
            psmt.setString(3, department.getDescription());

                       psmt.execute();

            logger.debug("Department Inserted successfully");
        } catch (Exception e) {
            logger.fatal("Exception occurred while creating Department" + e.getMessage());
        }
    }

    public void updateDepartmentName(String toUpdate, int deptId) {
        try {
            Connection con = ConnectionManager.openConnection();
            logger.info("connection opend for updateDepartmentName");
            PreparedStatement psmt = con.prepareStatement(QueryConstants.UPDATE_DEPARTMENT_NAME_QUERY);
            //set the value of parameters

            psmt.setString(1, toUpdate);
            psmt.setInt(2, deptId);
            psmt.executeUpdate();
          logger.debug("DepartmentName updated successfully");
        } catch (Exception e) {
           logger.fatal("Exception occurred while updating Department Name" + e.getMessage());
        }
    }public void updateDepartmentDescription(String toUpdate, int deptId) {
        try {
            Connection con = ConnectionManager.openConnection();
            logger.info("connection opend for updateDepartmentDescription");
            PreparedStatement psmt = con.prepareStatement(QueryConstants.UPDATE_DEPARTMENT_DESCRIPTION_QUERY );
            //set the value of parameters

            psmt.setString(1, toUpdate);
            psmt.setInt(2, deptId);
            psmt.executeUpdate();
           logger.debug("Department Description updated successfully");
        } catch (Exception e) {
           logger.fatal("Exception occurred while updating Department Name" + e.getMessage());
        }
    }

    public void deleteDepartment(int deptId) {
        try {
            Connection con = ConnectionManager.openConnection();
            logger.info("connection opend for deleteDepartment");
            PreparedStatement psmt = con.prepareStatement(QueryConstants.DELETE_DEPARTMENT_QUERY );
            //set the value of parameters
            psmt.setInt(1, deptId);

            //execute..
            psmt.executeUpdate();
            logger.debug("Department deleted successfully");

        } catch (Exception e) {
           logger.fatal("Exception occurred while deleting department" + e.getMessage());
        }
    }

    public List<Department> listAllDepartments() {

        boolean f = false;
        try {
            List<Department> departments = new ArrayList<>();
            Connection con = ConnectionManager.openConnection();
            logger.info("connection opend for listAllDepartments");
            Statement st = con.createStatement();
            ResultSet set = st.executeQuery(QueryConstants.LIST_ALL_DEPARTMENT_QUERY);

            while (set.next()) {
                int deptId = set.getInt(1);
                String name = set.getString(2);
                String description = set.getString(3);


                departments.add(new Department(deptId, name, description));


            }
           logger.debug("----------------------------------------------");
            return departments;
        } catch (Exception e) {
            logger.fatal("Exception occurred while listing all Companies" + e.getMessage());
    }
        return Collections.EMPTY_LIST;
    }
}
