package dao;

import java.sql.*;
import java.lang.Class.*;

public class ConnexionBdd {
    
    public static Connection getConnection() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
    // parametres de connexion
    String url = "jdbc:mysql://127.0.0.1/vip";
    String login = "root";
    String pass = "";
    // connexion
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    return java.sql.DriverManager.getConnection(url + "?user=" + login + "&password=" + pass);
    }
}