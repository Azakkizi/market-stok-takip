import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Baglanti {
    
    Connection c;
    
    public void baglan() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/marketim");
    }
    public void baglantiKes() throws SQLException {
        c.close();
    }
}
