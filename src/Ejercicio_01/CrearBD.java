package Ejercicio_01;

import java.sql.SQLException;
import java.sql.Statement;

public class CrearBD extends Conexion{

	public void crearBD() {
		Statement sentencia;
		try {
			sentencia = conexion.createStatement();
			sentencia.executeUpdate("CREATE DATABASE IF NOT EXISTS odoo_modulo_1");
			sentencia.executeQuery("USE odoo_modulo_1");
			System.out.println("Base de datos creada con exito");
			sentencia.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
