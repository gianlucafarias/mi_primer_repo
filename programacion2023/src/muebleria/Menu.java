package muebleria;
import java.util.*;
import javax.swing.*;
public class Menu {
	public void menuPrincipal(){
		String opciones[] = new String[4];
		opciones[0] = "Ingresar un mueble";
		opciones[1] = "Ingresar un telefono";
		opciones[2] = "Listado de muebles";
		opciones[3] = "Listado de telefonos";
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
	}
}
