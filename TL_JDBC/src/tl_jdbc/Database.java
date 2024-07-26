

package tl_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author nducmd
 */

public class Database {
    public static Connection connectDB() throws SQLException{
        String url = "jdbc:sqlserver://NDUCMD:1433;databaseName=TL_JDBC;useUnicode=true;characterEncoding=UTF-8";
        String dbUsername = "sa";
        String dbPassword = "123";
        try{
            Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
