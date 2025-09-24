package Semana_3.Dia_3.Database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class configDB {
    public static Connection objConnection = null;

    public static Connection openConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Users_Managment";
            String user = "root";
            String password = "qwe123";

            objConnection = (Connection) DriverManager.getConnection(url, user, password);
            System.out.println("Succesfully connection");
        } catch (ClassNotFoundException error) {
            System.out.println("driver not installed");
        }catch(SQLException error){
            System.out.println("error to conect to the database");
        }
        return objConnection;
    }
}
