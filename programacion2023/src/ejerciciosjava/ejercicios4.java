package ejerciciosjava;
import java.util.*;

public class ejercicios4 {
	public static void main(String[] args) {
		Scanner entradaDato = new Scanner(System.in);
		int menu = 0, num1 = 0, num2 = 0, resultado;
		do
		{
			System.out.println("1. Suma ");
			System.out.println("2. Resta ");
			System.out.println("3. Multiplicacion ");
			System.out.println("4. Division ");
			System.out.println("0. Salir ");
			
			System.out.println("Ingrese la operacion que desea realizar: ");
			menu = entradaDato.nextInt();
			switch(menu)
					{
						case 1: {
							System.out.println("------SUMA------");
							System.out.println("Ingrese un numero ");
							num1 = entradaDato.nextInt();
							System.out.println("Ingrese otro numero ");
							num2 = entradaDato.nextInt();
							System.out.println(operacionSuma(num1, num2));
							menu = otraOperacion();
							break;
						}
						case 2: {
							System.out.println("------RESTA------");
							System.out.println("Ingrese un numero ");
							num1 = entradaDato.nextInt();
							System.out.println("Ingrese otro numero ");
							num2 = entradaDato.nextInt();
							System.out.println(operacionResta(num1, num2));
							menu = otraOperacion();
							break;
						}
						case 3: {
							System.out.println("------MULTIPLICACION------");
							System.out.println("Ingrese un numero ");
							num1 = entradaDato.nextInt();
							System.out.println("Ingrese otro numero ");
							num2 = entradaDato.nextInt();
							System.out.println(operacionMultiplicacion(num1, num2));
							menu = otraOperacion();
							break;
						}
						case 4: {
							System.out.println("------DIVISION------");
							System.out.println("Ingrese un numero ");
							num1 = entradaDato.nextInt();
							System.out.println("Ingrese otro numero ");
							num2 = entradaDato.nextInt();
							System.out.println(operacionDivision(num1, num2));
							menu = otraOperacion();
							break;
						}
						case 0: {
							break;
						}
						default: 
						{
							System.out.println("Opcion incorrecta. Reintente. ");
						}
					}
		}while(menu != 0);	
		System.out.println("Chau capo.");

	}
	 static int operacionSuma(int num1, int num2) {
			int resultado;
			resultado = num1 + num2;
			return resultado;		
	}
	 static int operacionResta(int num1, int num2) {
			int resultado;
			resultado = num1 - num2;
			return resultado;		
	}
	 static int operacionMultiplicacion(int num1, int num2) {
			int resultado;
			resultado = num1 * num2;
			return resultado;		
	}
	 static double operacionDivision(int num1, int num2) {
			double resultado;
			resultado = num1 / num2;
			return resultado;		
	}
	static int otraOperacion(){
		Scanner entradaDato = new Scanner(System.in);
		int opcion;
			System.out.println("¿Desea realizar otra operación?");
			System.out.println("1. Si");
			System.out.println("0. Salir");
			
			opcion = entradaDato.nextInt();
		return opcion;

	}
}
 
