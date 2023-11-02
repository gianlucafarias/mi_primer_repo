package muebleria;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Casa_Patito {
	public static void main(String[] args) {
		String opciones[] = new String[4];
		opciones[0] = "Ingresar un MUEBLE";
		opciones[1] = "Ingresar un TELEFONO";
		opciones[2] = "Listado de MUEBLES";
		opciones[3] = "Listado de TELEFONOS";
		String respuesta = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Casa Patito :)", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
		switch(respuesta) {
		case "Ingresar un mueble":
			Mueble.crearMueble();
			break;
		case "Ingresar un telefono":
			Telefono.crearTelefono();
			break;
		case "Lisado de muebles":
			Mueble.getMuebles();
			break;
		case "Listado de Telefonos":
			Telefono.getTelefonos();
			break;
		}
		menu();
	}
	boolean flag;
	 static void menu() {
		int menu;
		boolean flag;
		Scanner entrada = new Scanner(System.in);
		do {
		System.out.println("01. Ingresar un Mueble");
		System.out.println("02. Ingresar un Telefono");
		System.out.println("03. Listar muebles");
		System.out.println("04. Listar telefonos");
		System.out.println("00. SALIR");
		menu = entrada.nextInt();
		}while(flag = true);
		
		switch(menu) {
		case 1: 
			Mueble.crearMueble();
			break;
		case 2:
			Telefono.crearTelefono();
			break;
		case 3:
			Mueble.getMuebles();
			break;
		case 4: 
			Telefono.getTelefonos();
			break;
		case 0:
			flag = false;
			break;
		}

	}
}
