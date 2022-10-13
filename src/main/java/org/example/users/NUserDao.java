package org.example.users;

import org.example.users.dao.UserDao;

import java.sql.Connection;
import java.sql.SQLException;

public class NUserDao extends UserDao {
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        // DB 생성 코드
    }
}
