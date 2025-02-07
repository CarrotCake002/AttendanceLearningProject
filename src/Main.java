import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection con;
        ResultSet rs;

        con = Database.getConnection();
        rs = Database.getAllAttendances(con);
        for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
            rs.next();
            System.out.println(rs.getString("date") + " - " + rs.getString("idmember") + " - " + rs.getString("present"));
        }
    }
}

