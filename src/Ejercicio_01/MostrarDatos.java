package Ejercicio_01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MostrarDatos extends Conexion{
	public void mostrar() throws IOException {
		Statement myStatment = null;

		try{
		myStatment = conexion.createStatement();
		ResultSet myResult = myStatment.executeQuery("select * from alumnos");
		while(myResult.next()){
			String nombre = myResult.getString("nombre");
			String apellido = myResult.getString("apellido1");
			Date edad = myResult.getDate("fecha_nacimiento");
			String genero = myResult.getString("genero");
			String mayor= "Si";
			
			//Parsear Date a String
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			String reportDate = df.format(edad);
	
			
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate fechaNac = LocalDate.parse(reportDate, fmt);
			LocalDate ahora = LocalDate.now();

			Period periodo = Period.between(fechaNac, ahora);			
			
			if(periodo.getYears()<18)
				mayor = "No";
			
			System.out.println(nombre + " " + apellido);
			System.out.println(periodo.getYears());
			System.out.println("Es mayor de edad? " + mayor);
			System.out.println("Genero: "+genero);
			System.out.println();
		}
		}
		catch(Exception exc){
		exc.printStackTrace();
		}
	}

}
