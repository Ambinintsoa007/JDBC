import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PsqlConnect {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/jdbc_test";
        String user = "postgres";
        String password = "1303220715";
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database");
        }
        catch (SQLException err){
            err.printStackTrace();
        } finally {
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}