package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
        String driverClassName = "com.mysql.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://54.200.170.30/cs4970sp13grp2";
        String dbUser = "cs4970sp13grp2";
        String dbPwd = "4vmYGtTQVw";

        private static DBConnection dbConnection = null;

        private DBConnection() {
                try {
                        Class.forName(driverClassName);
                } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                }
        }

        public Connection getConnection() throws SQLException {
                Connection conn = null;
                conn = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
                return conn;
        }

        public static DBConnection getInstance() {
                if (dbConnection == null) {
                        dbConnection = new DBConnection();
                }
                return dbConnection;
        }
}