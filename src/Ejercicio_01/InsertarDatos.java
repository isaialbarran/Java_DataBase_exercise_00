package Ejercicio_01;

import java.sql.SQLException;
import java.sql.Statement;

public class InsertarDatos extends Conexion{

	public void insertarDatos() {
		Statement sentencia;
		try {
			sentencia = conexion.createStatement();
			sentencia.executeUpdate("INSERT INTO alumnos (nombre, apellido1,apellido2, fecha_nacimiento,genero) VALUES ('Sofia','Bracho','Subotich','2004-01-29','M')");
			sentencia.executeUpdate("INSERT INTO alumnos (nombre, apellido1,apellido2, fecha_nacimiento,genero) VALUES ('James','Bryan','Paul','2004-12-05','M')");
			sentencia.executeUpdate("INSERT INTO alumnos (nombre, apellido1,apellido2, fecha_nacimiento,genero) VALUES ('Patricia','C','Romina','1989-08-10','M')");
			sentencia.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
