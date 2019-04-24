package practicacomision1917;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Practicacomision1917 {

    public static void main(String[] args) {
Connection con;
try{
con = DriverManager.getConnection(
        "jdbc:mysql://localhost/comision1917", "root", "");

ResultSet consulta;
Statement stmt = con.createStatement();
consulta = stmt.executeQuery(
        "SELECT * FROM estudiantes");

while(consulta.next()){
    System.out.println(consulta.getString("nombre") + ",");
    System.out.println(consulta.getString("apellido"));
    System.out.println(consulta.getString("dni"));
    
}

    }catch (SQLException ex){
        System.out.println(ex);
    }
    
    }
}
