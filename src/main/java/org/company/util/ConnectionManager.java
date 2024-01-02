package org.company.util;

import org.apache.log4j.Logger;
import org.company.manager.CompanyManager;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
    private static org.apache.log4j.Logger logger = Logger.getLogger(ConnectionManager .class);
    public static Connection openConnection() {

        Connection con = null;
        try {

            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //create the Connection
            String user = "root"; //user of mysql
            String password = "root"; //password of mysql
            String url = "jdbc:mysql://localhost:3306/company";
            con = DriverManager.getConnection(url, user, password);
            logger.info("JDBC Connection Established");

        } catch (Exception e) {
           logger.fatal("ConnectionManager ::some issue while connecting to DB"+e.getMessage());
        }
        return con;

    }
}

