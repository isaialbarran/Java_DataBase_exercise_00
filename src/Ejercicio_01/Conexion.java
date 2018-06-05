package Ejercicio_01;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Conexion {
	static Connection conexion;
	public static void conectar() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/odoo_modulo_1?user=root&password=admin");
			System.out.println("Conexion con exito\n");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Ha habido un problema");
		}
	}
}
