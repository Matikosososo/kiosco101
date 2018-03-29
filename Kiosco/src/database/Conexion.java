/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author Marcos
 */
import java.sql.Connection; // establecer la conexión
import java.sql.Statement;  // ejecutar querys
import java.sql.ResultSet;  // Tabla virtual MYSQL --> Select
import java.sql.DriverManager; // Obtener la conexión del Driver
import java.sql.SQLException;

public class Conexion { // General MySQL --> Trans, Autos, Juegos, 
    // Atributos

    private Connection con;
    private Statement sentencia;
    private ResultSet tablaVirtual;

    // Constructor
    // Datos necesarios:
    /*
    server  --> localhost
    user    --> root
    pass    --> 123456
    bdName  --> bd_alimentos
     */
    public Conexion(String server, String user, String pass, String bdName) throws ClassNotFoundException, SQLException {
        // Definir la URL de conexión
        // jdbc:mysql//localhost/bdName?user=root&password=
        String protocolo = "jdbc:mysql://";
        String lineaUsuario = "user=" + user;
        String lineaPass = "password=" + pass;

//        String url2 = "jdbc:mysql//"+server+"/"+bdName+"?user="+user+"&pass="+pass;
        String url = protocolo
                + server + "/"
                + bdName + "?"
                + lineaUsuario + "&"
                + lineaPass;

        System.out.println(url);

        // Cargar en tiempo de ejecución el Driver de MySQL
        Class.forName("com.mysql.jdbc.Driver");

        // Rescatar el objeto Conexión desde el Driver
        con = DriverManager.getConnection(url);
    }

    /**
     *
     * @param sql Puede ser: insert, delete, update
     */
    public void ejecutar(String sql) throws SQLException {
        // 1.- Crear la sentencia a traves de la conexión
        // Abrir la conexión
        System.out.println(sql);
        sentencia = con.createStatement();

        // 2.- ejecutar sql
        sentencia.execute(sql);

        // 3.- Cerrar la conexión --> desconectar()
        desconectar();
    }

    /**
     *
     * @param select Sentencia select
     * @return Tabla virtual del tipo ResultSet
     */
    public ResultSet ejecutarSelect(String select) throws SQLException {
        System.out.println(select);
        sentencia = con.createStatement();
        tablaVirtual = sentencia.executeQuery(select);

        return tablaVirtual;
    }

    public void desconectar() throws SQLException {
        sentencia.close();
    }

//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Conexion c = new Conexion("localhost", "root", "123456", "bd_alimentos");
//
//        String insert = "insert into alimento values(null, 'Lolipops','Savory', false)";
//
//        c.ejecutar(insert);
//    }
}
