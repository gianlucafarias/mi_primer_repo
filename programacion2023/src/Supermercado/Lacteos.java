package Supermercado;

import java.time.LocalDate;

public class Lacteos extends Productos implements Fecha {

	private LocalDate fechafabricacion;
	private LocalDate fechaVencimiento;

	public Lacteos(int codigoBarra, Categorias codigoCategoria, String marca, String descripcion, double precio, int stock) {
		super(codigoBarra, codigoCategoria, marca, descripcion, precio, stock);
	
	}

}
