package muebleria;

import java.util.*;

public class Articulo
{
	private String codigo;
	private String descripcion;
	private double precio;
	private Deposito ubicacion;
	private int stock;
	
	public Articulo()
	{
		this.codigo = "N/A";
		this.descripcion = "N/A";
		this.precio = 0;
		this.ubicacion = new Deposito();
		this.stock = 0;
	}
	
	public Articulo(int codigo, String descripcion, double precio, int ubicacion, int stock) {
		this.codigo = Integer.toString(codigo);
		this.descripcion = descripcion;
		this.precio = precio;
		this.ubicacion = new Deposito(ubicacion);
		this.stock = stock;
	}
	
	public void setCodigo()
	{
		Scanner entrada = new Scanner(System.in);
		int codigo;
		System.out.println("Ingrese el Codigo: ");
		codigo = entrada.nextInt();
		this.codigo = "" + codigo;
	}
	
	
	public void setDescripcion() {
		String descripcion;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese la descripción: ");
		descripcion = entrada.toString();
		this.descripcion = descripcion;
	}
	
	public void setPrecio()
	{
		double precio;
		Scanner entrada = new Scanner(System.in);
		do
		{
			System.out.println("Ingrese el precio (debe ser positivo): ");
			precio = entrada.nextDouble();
		}while(precio <= 0);
		this.precio = precio;
	}
	
	public void setPrecioGlobal(int opcion, double porcentaje)
	{
		if (opcion == 0)
		{
			this.precio = this.precio + (this.precio * porcentaje / 100);
		}
		else
		{
			this.precio = this.precio - (this.precio * porcentaje / 100);

		}
	}
	
	public void subirPrecioGlobal(double porcentaje)
	{
		this.precio = this.precio + (this.precio * porcentaje / 100);
	}
	
	public void bajarPrecioGlobal(double porcentaje)
	{
		this.precio = this.precio - (this.precio * porcentaje / 100);

	}

	public void setUbicacion()
	{
		this.ubicacion.setDeposito();
	}
	
	public void setUbicacionGlobal(int ubicacion)
	{
		this.ubicacion.setDepositoGlobal(ubicacion);
	}
	
	public void setStock()
	{
		int stock;
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("Ingrese la cantidad en stock: ");
			stock = entrada.nextInt();
		}while (stock <= 0);
		this.stock = stock;
	}
	
	public void getDetalle() {
		System.out.println("Codigo: " + this.codigo);
		System.out.println("Detalle: " + this.descripcion);
		System.out.println("Precio: " + this.precio);

	}
	
	public void getUbicacion() {
		System.out.println("Stock: " + this.stock);
		System.out.println("Ubicacion: " + this.ubicacion.getDeposito());
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	protected void codigoModificado(String codigo) {
		this.codigo = codigo;
	}
}