package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
        String driverClassName = "com.mysql.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://dbhost-mysql.cs.missouri.edu/cs4970sp13grp2";
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

/*To use connection pooling - comment out above and then open this bottom part. 
 * Warning: it may not work for you on babbage if Matthew has not set up the account to do so. 
 * the cool thing about connection pooling is that it works the exact same way. Above, we return the dbConnection
 * below we return cpds. You use both the exact same way in your code.
 * */

/* 
import com.mchange.v2.c3p0.*;
import java.sql.DriverManager;

public class DBConnection {

        private static DataSource dataSource;
        private static final String DRIVER_NAME;
        private static final String URL;
        private static final String UNAME;
        private static final String PWD;

        static {
                final ResourceBundle config = Resource Bundle
                                        .getBundle("props.database");
                DRIVER_NAME = config.getString("com.mysql.jdbc.Driver");
                URL = config.getString("jdbc:mysql://dbhost-mysql.cs.missouri.edu/cs4970sp13grp2?");
                UNAME = config.getString("cs4970sp13grp2");
                PWD = config.getString("4vmYGtTQVw");

                dataSource = setupDataSource();
        }

        public static Connection getOracleConnection() throws SQLException {
                return dataSource.getConnection();
        }

        private static DataSource setupDataSource() {
                ComboPooledDataSource cpds = new ComboPooleedDataSource();
                try {
                cpds.setDriverClass(DRIVER_NAME);
                } catch (PropertyVetoException e) {
                        e.printStackTrace();
                }
                cpds.setJdbcUrl(URL);
                cpds.setUser(UNAME);
                cpds.setPassword(PWD);
                cpds.setMinPoolSize(5);
                cpds.setAcquireIncrement(5);
                cpds.setMaxPoolSize(20);
                return cpds;
        }
}*/ 