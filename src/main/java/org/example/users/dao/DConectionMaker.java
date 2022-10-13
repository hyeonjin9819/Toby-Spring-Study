package org.example.users.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class DConectionMaker implements ConnectionMaker {
    public Connection makeConnection() throws ClassNotFoundException, SQLException{
        // 독자적인 방법으로 Connection을 생성하는 코드
    }
}
