package org.company.dao;

import org.apache.log4j.Logger;
import org.company.manager.CompanyManager;
import org.company.util.ConnectionManager;
import org.company.domain.Company;
import org.company.util.QueryConstants;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import static org.company.util.QueryConstants.*;

public class CompanyDao {

    private static org.apache.log4j.Logger logger = Logger.getLogger(CompanyDao.class);
    public void addCompany(Company company) {
        try {
            Connection con = ConnectionManager.openConnection();
            logger.info("CompanyDao::DB Connection opened for addCompany");
            PreparedStatement psmt = con.prepareStatement(QueryConstants.CREATE_COMPANY_QUERY);
                        //set the value of parameters
            psmt.setInt(1, company.getCompanyRegNumber());
            psmt.setString(2, company.getName());
            psmt.setString(3, company.getLocation());
            psmt.setString(4, company.getCountry());

            //execute..
            psmt.executeUpdate();

           logger.debug("CompanyDao::Company Inserted successfully");
        } catch (Exception e) {
            logger.fatal("CompanyDao::Exception occurred while creating Company" + e.getMessage());
        }
    }

    public void updateCompanyLocation(String toUpdate, int companyRegNumber) {
        try {
            Connection con = ConnectionManager.openConnection();
            logger.info("CompanyDao::DB Connection opened for updateComapny");
            PreparedStatement psmt = con.prepareStatement(UPDATE_COMPANY_QUERY);
            //set the value of parameters

            psmt.setString(1, toUpdate);
            psmt.setInt(2, companyRegNumber);
            psmt.executeUpdate();
            logger.debug("CompanyDao::Company updated successfully");
        } catch (Exception e) {
            logger.fatal("CompanyDao::Exception occurred while updating Company " + e.getMessage());
        }
    }

    public void deleteCompany(int companyRegNumber) {
        try {

            Connection con = ConnectionManager.openConnection();
            logger.info("CompanyDao::DB Connection opened for delete company");
            PreparedStatement pstmt = con.prepareStatement(QueryConstants.DELETE_EMPLOYEE_WITH_COMPANY_REG_NUMBER_QUERY);
            //set the value of parameters
            pstmt.setInt(1, companyRegNumber);
            pstmt.executeUpdate();
            logger.info("CompanyDao::All the Employees deleted with CompanyRegNumber" + companyRegNumber );

            PreparedStatement psmt = con.prepareStatement(QueryConstants.DELETE_COMPANY_QUERY);
            psmt.setInt(1, companyRegNumber);
            psmt.executeUpdate();
           logger.info("CompanyDao::Company deleted successfully"+ companyRegNumber );

        } catch (Exception e) {
            logger.fatal("CompanyDao::Exception occurred while deleting Company" + e.getMessage());
        }
    }

    public List<Company> listAllCompanies() {

        boolean f = false;
        try {
            List<Company> companies = new ArrayList<>();
            Connection con = ConnectionManager.openConnection();
            logger.info("CompanyDao::DB Connection openedfor list all companies");
            Statement st = con.createStatement();
            ResultSet set = st.executeQuery(LIST_ALL_COMPANIES_QUERY);

            while (set.next()) {
                int companyRegNumber = set.getInt(1);
                String name = set.getString(2);
                String location = set.getString(3);
                String country = set.getString(4);

                companies.add(new Company(companyRegNumber, name, location, country));


            }
            logger.debug("----------------------------------------------");
            return companies;
        } catch (Exception e) {
           logger.fatal("CompanyDao::Exception occurred while listing all Companies" + e.getMessage());
        }
        return Collections.EMPTY_LIST;
    }

}
