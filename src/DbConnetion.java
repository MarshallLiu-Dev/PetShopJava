import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DbConnetion {
    public Connection dbConnection() {
        
           Connection conn = null; 
           try {
                String url = "jdbc:mysql://localhost:3306/petshop?user=root7password=182357";
                conn = DriverManager.getConnection(url, url, url);

           } catch (SQLException err) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null,"Erro de Conexão DbConnection" + err.getMessage());
           }
           return conn;
    }
}
