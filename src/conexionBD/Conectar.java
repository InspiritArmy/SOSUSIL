package conexionBD;

import java.sql.*;
import javax.swing.JOptionPane;


public class Conectar {
    private Connection con;
    public Conectar() {
        con=null;
    }
    public Connection conexion(){        
        try {        
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/db_feedback", "root", "");
            JOptionPane.showMessageDialog(null, "Conexion exitosa ......");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en conexion "+e.toString());       
        }
        return con;        
    }
}
