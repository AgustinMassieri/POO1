package dominio;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

	private String nombre;
	private int edad;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getNombre(String nombre) {
		return nombre;
	}
	
	public int getEdad(int edad) {
		return edad;
	}

	public Persona (String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	private int calcularEdad(int dia, int mes, int anio) {
		
		LocalDate fechaDeNacimiento = LocalDate.of(anio, mes, dia);
		LocalDate fechaActual = LocalDate.now();
		
		Period diferenciaFechas = Period.between(fechaDeNacimiento, fechaActual);
		
		int edad = diferenciaFechas.getYears();
		
		return edad;
	}
	
	public Persona (String nombre, String fechaDeNacimiento) {
		String[] fechaNacimiento = fechaDeNacimiento.split("/");
		int dia = Integer.parseInt(fechaNacimiento[0]); 
		int mes = Integer.parseInt(fechaNacimiento[1]);
		int anio = Integer.parseInt(fechaNacimiento[2]);
		
		this.setNombre(nombre);
		this.setEdad(calcularEdad(dia,mes,anio));
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + " - Edad: " + edad;
	}
	
	
}
