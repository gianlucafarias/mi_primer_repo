package ejerciciosjava;
import java.lang.*;
import java.util.*;


public class ejercicios1 {

	public static void main(String[] args) {
		Scanner entradaDato = new Scanner(System.in);
		int par = 0, impar = 0;
		int numerousuario;
		do {
			System.out.println("Ingese un numero: ");
		numerousuario = entradaDato.nextInt();
		if (numerousuario % 2 == 0 && numerousuario != 0)
		{
			par++;
		}
		else
		{
			impar++;
		}
		
		}while (numerousuario != 0);
		System.out.println("Numero de pares: " + par);
		System.out.println("Numero de impares: " + impar);

	}


}

