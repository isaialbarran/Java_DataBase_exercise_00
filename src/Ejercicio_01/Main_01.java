package Ejercicio_01;

import java.io.IOException;

public class Main_01 extends Conexion{

	public static void main(String[] args) throws IOException{
		conectar();		
		CrearBD crearBD = new CrearBD();
		crearBD.crearBD();
		CrearTablas crearTablas = new CrearTablas();
		crearTablas.crearTablas();
		InsertarDatos insertarDatos = new InsertarDatos();
		insertarDatos.insertarDatos();
		MostrarDatos mostrar = new MostrarDatos();
		mostrar.mostrar();	
	}
}
