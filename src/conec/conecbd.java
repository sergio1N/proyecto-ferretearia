package conec;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conecbd {

    Connection con;

    public conecbd() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cine", "root", "");
        } catch (Exception e) {
            System.err.println("fuck no sirve " + e);
        }
    }

    public static void main(String[] args) throws SQLException {
        conecbd cn = new conecbd();
        ResultSet rs;
        Statement st;
        try {
            st = cn.con.createStatement(); // Usar cn para acceder a la conexión
            rs = st.executeQuery("SELECT * FROM Sala");
            while (rs.next()) {
                System.out.println(rs.getInt("IDSala") + " " + rs.getString("Nombre") + " " + rs.getInt("Aforo") + " " + rs.getString("Tipo"));
            }
            cn.con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
