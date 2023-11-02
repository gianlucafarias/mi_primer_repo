package Parcial_Laboratorio;

import java.util.Scanner;

public class Alumno extends Persona {
	private int legajo;
	
	public Alumno(int edad, String nombre, int legajo) {
		super(edad, nombre);
		this.legajo = legajo;
	}
	
	public void modificarLegajo(int legajo) {
		
		this.legajo = legajo;
		System.out.println("Legajo modificado con éxito.");
	}
	
	public int verLegajo() {
		return this.legajo;
	}
}

