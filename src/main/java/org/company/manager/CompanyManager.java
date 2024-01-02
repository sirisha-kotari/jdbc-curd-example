package org.company.manager;

import org.company.dao.CompanyDao;
import org.company.dao.DepartmentDao;
import org.company.dao.EmployeeDao;
import org.company.domain.Company;
import org.company.domain.Department;
import org.company.domain.Employee;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



import java.util.List;

import static org.company.util.ModelBuilder.*;

public class CompanyManager {
    private static org.apache.log4j.Logger logger = Logger.getLogger(CompanyManager.class);


    static CompanyDao comapanyDao = new CompanyDao();
    static EmployeeDao employeeDao = new EmployeeDao();

    static DepartmentDao departmentDao = new DepartmentDao();


    public static void main(String[] args) {
        manageCompany();
        manageDepartment();
        manageEmployee();
    }

    private static void manageEmployee() {

        Employee employee1 = buildEmployee(123, "Siri", 3, "kotarisirisha520@gmail.com", 30000, 101);
        Employee employee2 = buildEmployee(124, "Saidarao", 2, "kotariSaida@gmail.com", 40000, 102);
        Employee employee3 = buildEmployee(125, "Saida", 1, "kotariSai@gmail.com", 50000, 103);
        Employee employee4 = buildEmployee(126, "Siva", 1, "papasaniSiva@gmail.com", 80000, 102);
        Employee employee5 = buildEmployee(127, "Teja", 1, "kotariTeja@gmail.com", 320000, 104);
        Employee employee6 = buildEmployee(128, "Pavani", 3, "kotaripavani@gmail.com", 130000, 101);
        Employee employee7 = buildEmployee(129, "Hari", 1, "hari@gmail.com", 90000, 101);


        employeeDao.addEmployee(employee1);
        employeeDao.addEmployee(employee2);
        employeeDao.addEmployee(employee3);
        employeeDao.addEmployee(employee4);
        employeeDao.addEmployee(employee5);
        employeeDao.addEmployee(employee6);
        employeeDao.addEmployee(employee7);

        List<Employee> employees = employeeDao.listAllEmployees();
        for (Employee employee : employees) {
          logger.debug(employee);
        }

        employeeDao.updateEmployeeCompany(103, 126);
        employeeDao.deleteEmployee(127);

        comapanyDao.deleteCompany(104);

    }

    private static void manageDepartment() {


        Department department1 = buildDepartment(1, "HR", "Human Resource Management Team");
        Department department2 = buildDepartment(2, "RMG", "Resource Management Group");
        Department department3 = buildDepartment(3, "Dev", "Development Team");
        Department department4 = buildDepartment(4, "Tester", "Software Testing Team");

        departmentDao.addDepartment(department1);
        departmentDao.addDepartment(department2);
        departmentDao.addDepartment(department3);
        departmentDao.addDepartment(department4);

        departmentDao.updateDepartmentName("Delivary Manger", 4);
        departmentDao.updateDepartmentDescription("Managing deployements", 4);
        departmentDao.deleteDepartment(4);
        List<Department> departments = departmentDao.listAllDepartments();
        for (Department department : departments) {
            logger.debug(department);
        }
    }

    private static void manageCompany() {
        Company company1 = buildCompany(101, "TCS", "Hyderabad", "India");
        Company company2 = buildCompany(102, "Wipro", "Banglore", "India");
        Company company3 = buildCompany(103, "MicroSoft", "Banglore", "India");
        Company company4 = buildCompany(104, "Infosis", "Trivendram", "India");

        comapanyDao.addCompany(company1);
        comapanyDao.addCompany(company2);
        comapanyDao.addCompany(company3);
        comapanyDao.addCompany(company4);

        comapanyDao.updateCompanyLocation("London", 101);

        List<Company> companies = comapanyDao.listAllCompanies();
        for (Company company : companies) {
            logger.debug(company);
        }

    }


}
