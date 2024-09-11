/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.db;

/**
 *
 * @author hiruna
 */
public class DBConnection {
    private static DBConnection dbConnection;
    
    private DBConnection(){
    
    }
    
    private static DBConnection getInstance(){
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }
}
