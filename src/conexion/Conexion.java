/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author ajuar
 */
public class Conexion {
     String user="root", pass="";
    Connection cnx = null;

    public Connection Conectar(){
    try {
    Class.forName("com.mysql.jdbc.Driver");
    cnx=DriverManager.getConnection("jdbc:mysql://localhost/Organizaciones",user,pass);
    } catch (Exception e) {
    e.printStackTrace();
    }
    return cnx;
    }

    public Connection Desconectar(){
    cnx=null;
    return cnx;
}
}
