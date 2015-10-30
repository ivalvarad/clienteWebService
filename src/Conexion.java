
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Iva
 */
public class Conexion {
    String cadena = "jdbc:postgresql://titanic.ecci.ucr.ac.cr/phpPgAdmin/:80/ci2413";
    String user = "eb10273";
    String pass = "eb10273";
    
    public Conexion(){
        try{
            Class.forName("org.postgresql.Driver");
            System.out.println("HICE EL CLASS.FORNAME");
            Connection conex = DriverManager.getConnection(cadena, user, pass);
            java.sql.Statement st = conex.createStatement();
            String sql = "select * from ci2413";
            ResultSet result = st.executeQuery(sql);
            while(result.next()){
                System.out.println(result.getString("nombre"));
            }
            result.close();
            st.close();
            conex.close();
        }catch(Exception exe){System.out.println("NO NOS CONECTAMOS");};
    }
    
}
