package Ejercicio_01;

import java.sql.SQLException;
import java.sql.Statement;

public class CrearTablas extends Conexion{

	public void crearTablas() {
		Statement sentencia;
		try {
			sentencia = conexion.createStatement();
			sentencia.executeUpdate("CREATE TABLE IF NOT EXISTS alumnos (nombre varchar(20) NOT NULL, apellido1 varchar(50) NOT NULL, apellido2 varchar(50) NOT NULL, fecha_nacimiento date NOT NULL, genero char)");
			System.out.println("Tabla creada con éxito!");
			sentencia.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
