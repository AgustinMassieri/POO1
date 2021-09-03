package programa;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dominio.Empleado;

public class Prueba {

	public static void main(String[] args) throws IOException {

		String nombreArchivo = "empleados.dat";
		
		List<Empleado> listaDeEmpleados = new ArrayList<>();
		
		listaDeEmpleados.add(new Empleado(151800155, "Agustin", "Massieri", 1150621332));
		listaDeEmpleados.add(new Empleado(112233445, "Joaquín", "Velazquez", 1111111111));
		listaDeEmpleados.add(new Empleado(667788991, "Genaro", "Palese", 1010101010));
		listaDeEmpleados.add(new Empleado(123456789, "Nikolay", "Sawonzcyk", 1212121212));
		
		DataOutputStream archivoDeEscritura = null;
		DataInputStream archivoDeLectura = null;
		

		try {
			
			archivoDeEscritura = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(nombreArchivo)));
			
			for(Empleado empleado: listaDeEmpleados) {
				archivoDeEscritura.writeInt(empleado.getLegajo());
				archivoDeEscritura.writeUTF(empleado.getNombre());
				archivoDeEscritura.writeUTF(empleado.getApellido());
				archivoDeEscritura.writeInt(empleado.getTelefono());
			}
			
		}finally {
			if(archivoDeEscritura != null) {
				archivoDeEscritura.close();
			}
		}
		
		int legajoLeido;
		String nombreLeido;
		String apellidoLeido;
		int telefonoLeido;
		
		try {
			
			archivoDeLectura = new DataInputStream(new BufferedInputStream(new FileInputStream(nombreArchivo)));
							
			while (true) {
				legajoLeido = archivoDeLectura.readInt();
				nombreLeido = archivoDeLectura.readUTF();
				apellidoLeido = archivoDeLectura.readUTF();
				telefonoLeido = archivoDeLectura.readInt();		
				
				System.out.println(">> " + legajoLeido + "," + nombreLeido + "," + apellidoLeido + "," + telefonoLeido);
			}
			
		}catch(EOFException exception){
			
			System.out.println("\nLectura del archivo finalizada!");
			
		}finally {
			
			if(archivoDeLectura != null) {
				
				archivoDeLectura.close();
			}
		}

	}

}
