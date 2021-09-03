package programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import dominio.Empleado;

public class Prueba {

	public static void main(String[] args) throws IOException {

		String nombreArchivo = "empleados.csv";
		
		List<Empleado> listaDeEmpleados = new ArrayList<>();
		
		listaDeEmpleados.add(new Empleado(151800155, "Agustin", "Massieri", 1150621332));
		listaDeEmpleados.add(new Empleado(112233445, "Joaquín", "Velazquez", 1111111111));
		listaDeEmpleados.add(new Empleado(667788991, "Genaro", "Palese", 1010101010));
		listaDeEmpleados.add(new Empleado(123456789, "Nikolay", "Sawonzcyk", 1212121212));
		
		PrintWriter archivoDeEscritura = null;
		BufferedReader archivoDeLectura = null;
		
		String stringLeido = "";
		
		try {
			
			archivoDeEscritura = new PrintWriter(new FileWriter(nombreArchivo));
			
			for(Empleado empleado: listaDeEmpleados) {
				archivoDeEscritura.println(new String(empleado.getLegajo() + "," + empleado.getNombre() + "," + empleado.getApellido() + "," + empleado.getTelefono()));
			}
			
		}finally {
			if(archivoDeEscritura != null) {
				archivoDeEscritura.close();
			}
		}
		
		try {
			
			archivoDeLectura = new BufferedReader(new FileReader(nombreArchivo));
			
			stringLeido = archivoDeLectura.readLine();
			
			while (stringLeido != null) {
				System.out.println(">> " + stringLeido);
				stringLeido = archivoDeLectura.readLine();

			}
			
			
		}finally {
			if(archivoDeLectura != null) {
				archivoDeLectura.close();
			}
		}

	}

}
