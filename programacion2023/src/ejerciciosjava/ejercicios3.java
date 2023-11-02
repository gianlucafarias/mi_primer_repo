package ejerciciosjava;
import java.util.*;

public class ejercicios3 {

	public static void main(String[] args) {
		Scanner entradaDato = new Scanner(System.in);
		int numeros[] = new int [10];
		int suma;
		for (int i = 0 ; i < 10 ; i++)
		{
			System.out.println("Ingrese un numero: ");
			numeros[i] = entradaDato.nextInt();
		}
		Arrays.sort(numeros);
		for (int numero : numeros)
		{
			System.out.println(numero);
		}
	}

}
