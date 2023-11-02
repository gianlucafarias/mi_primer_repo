package ejerciciosjava;
import java.util.*;

public class ejercicio5bombilla {

	public static void main(String[] args) {
		bombilla bombilla = new bombilla();
		Scanner entrada = new Scanner(System.in);
		int opcion, potencia;
		char letra;
		String color;
		boolean estadoBombilla;
		boolean flag = false;

	do {
		System.out.println("1 - ENCENDER");
		System.out.println("2 - APAGAR");
		System.out.println("3 - VER ESTADO");
		System.out.println("4 - CAMBIAR POTENCIA");
		System.out.println("5 - VER POTENCIA");
		System.out.println("6 - CAMBIAR COLOR");
		System.out.println("7 - VER COLOR");
		System.out.println("8 - RECARGAR HORAS");
		System.out.println("0 - SALIR");

		opcion = entrada.nextInt();
		entrada.nextLine();
		
		switch(opcion) {
		case 0: {
			flag = false;
			break;
		}
		case 1: {
			bombilla.SetEncender();
			break;
		}
		case 2: {
			bombilla.SetApagar();
			break;
		}
		case 3: {
			break;
			}
		case 4: {
			System.out.println("Ingrese nueva potencia: ");
			potencia = entrada.nextInt();
			bombilla.SetPotencia(potencia);
			break;
		}
		case 5: {
			potencia = bombilla.GetPotencia();
			System.out.println("La potencia de la bombilla es: " + potencia);
			break;
		}
		case 6: {
			System.out.println("Ingrese nuevo color: ");
			color = entrada.next();
			bombilla.SetColor(color);
			break;
		}
		case 7: {
			bombilla.GetColor();
			break;
		}
		case 8: {
			bombilla.SetHoras();
			break;
		}
		
		default: {
			System.out.println("OPCION INCORRECTA. REINTENTE");
			break;
		}
	}
		
		
	}while (flag == false);
	

    
}
}