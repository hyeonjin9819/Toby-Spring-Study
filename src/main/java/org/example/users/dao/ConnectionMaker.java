package org.example.users.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface ConnectionMaker {
    public Connection makeConnection()  throws ClassNotFoundException, SQLException;
}