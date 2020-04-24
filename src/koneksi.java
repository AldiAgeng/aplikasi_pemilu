import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
     public static Connection koneksi;
    public static Connection GetConnection() throws SQLException{
            if (koneksi == null){
            try {
                Class.forName("org.sqlite.JDBC");   
            }
            catch (ClassNotFoundException err){
                System.out.println("Terdapat Kesalahan dalam pemanggilan"
                        + "data atau sqlite JDBC drive"+err);
                JOptionPane.showMessageDialog(null,"Salah"+err);
                
                System.exit(0);
            }
            String database= "pemilu";
            String dbURL="jdbc:sqlite:"+database;
            koneksi=DriverManager.getConnection(dbURL);
        }
    
    return koneksi;
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
