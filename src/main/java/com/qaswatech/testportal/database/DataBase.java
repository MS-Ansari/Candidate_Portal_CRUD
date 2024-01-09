/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.testportal.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hp
 */
public class DataBase {
    private static final String DATABASE = "candidate_db";
    private static final String DBURL    = "jdbc:mysql://localhost/"+DATABASE;
    private static final String DBUSER   = "root";
    private static final String DBPASS   = "12345";

    public static Connection connectDb() {
                        Connection con = null;

        try {
                //drive registration
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
                System.out.println("Connection Successfully");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            
        }
            return con;


    }
        public static void main(String[] args) throws SQLException {
        DataBase.connectDb();
    }
}
