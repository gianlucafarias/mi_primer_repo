package Parcial_Laboratorio;

import java.util.Scanner;

public class Alumnado {

	public static void main(String[] args) {
		int opcion;
		Scanner entrada = new Scanner(System.in);
		int edad, legajo;
		String nombre;
		System.out.println("Ingrese nombre del Alumno");
		nombre = entrada.nextLine();
		System.out.println("Ingrese la edad del Alumno");
		edad = entrada.nextInt();
		System.out.println("Ingrese legajo del Alumno");
		legajo = entrada.nextInt();
		Alumno alumno1 = new Alumno(edad, nombre, legajo); // creacion objeto de tipo Alumno
		System.out.println("Alumno cargado con éxito");
		System.out.println("Nombre: " + alumno1.verNombre()); //llamada metodo get de la clase Persona
		System.out.println("Edad: " + alumno1.verEdad());  //llamada metodo get de la clase Persona
		System.out.println("Legajo: " + alumno1.verLegajo());  //llamada metodo get de la clase Alumno
		System.out.println("------------------------------");
		System.out.println("Presione 1 para modificar Legajo.");
		System.out.println("Presione 2 para modificar Nombre.");
		opcion = entrada.nextInt();
		if (opcion == 1)
		{
			System.out.println("Ingrese nuevo legajo: ");
			legajo = entrada.nextInt();
			alumno1.modificarLegajo(legajo); //llamada metodo set de la clase Alumno
		}
		else if (opcion == 2)
		{
			System.out.println("Ingrese nuevo legajo: ");
			nombre = entrada.nextLine();
			alumno1.modificarNombre(nombre); //llamada metodo get de la clase Persona
		}
	
		
	}

	
	
}
