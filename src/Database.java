import java.sql.*;

public class Database {
    public static ResultSet getAllAttendances(Connection con) throws SQLException {
        Statement st = con.createStatement();
        String query = "select * from attendance";

        return st.executeQuery(query);
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection connection;
        String className = "com.mysql.cj.jdbc.Driver";
        String dbUrl = "jdbc:mysql://localhost:3306/login_schema";
        String dbUser = "root";
        String dbPass = "password";

        Class.forName(className);
        connection = DriverManager.getConnection(dbUrl, dbUser, dbPass);
        System.out.println("Connection Established successfully");
        return connection;
    }
}
