package ejerciciosjava;

import java.util.Scanner;

public class ejercicios2 {

	public static void main(String[] args) {
		Scanner entradaDato = new Scanner(System.in);
		int numerousuario;
		System.out.println("Ingrese un numero: ");
		numerousuario = entradaDato.nextInt();
		if (numerousuario > 0)
		{
			if (numerousuario % 2 == 0)
			{
				System.out.println("El numero " + numerousuario + " es par y Positivo");
			}
			else
				System.out.println("El numero " + numerousuario + " es impar y Positivo");
		}
		else
		{
			System.out.println("El numero " + numerousuario + " es Negativo");
		}
		
	}

}
