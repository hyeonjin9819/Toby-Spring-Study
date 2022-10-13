package org.example;

import org.example.users.dao.ConnectionMaker;
import org.example.users.dao.DConectionMaker;
import org.example.users.dao.UserDao;
import org.example.users.entity.User;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        ConnectionMaker connectionMaker = new DConectionMaker();

        UserDao dao = new UserDao(connectionMaker);
        // ...
    }
}

public class UserDaoTest{
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        ConnectionMaker connectionMaker = new DConectionMaker();

        UserDao dao = new UserDao(connectionMaker);

    }
}