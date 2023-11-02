package muebleria;

import java.util.*;

class Telefono extends Articulo
{
	private String marca;
	private String modelo;
	private double peso; 
	
	
	public Telefono()
	{
		super();
		this.marca = "";
		this.modelo = "";
		this.peso = 0;
	}
	
	public Telefono(int codigo, String descripcion, double precio, int ubicacion, int stock, String marca, String modelo, double peso)
	{
		super(codigo, descripcion, precio, ubicacion, stock);
		codigoModificado(actualizarCodigo());
		this.marca = marca;
		this.modelo = modelo;
		this.peso = peso;
	}
	
	public void setMarca()
	{
		Scanner entrada = new Scanner(System.in);
		String marca;
		System.out.println("Ingrese la marca: ");
		marca = entrada.nextLine();
		this.marca = marca;
	}
	
	public void setModelo()
	{
		Scanner entrada = new Scanner(System.in);
		String modelo;
		System.out.println("Ingrese el modelo: ");
		modelo = entrada.nextLine();
		this.modelo = modelo;
	}
	
	public void getDetalle() {
		super.getDetalle();
		super.getUbicacion();
		getDetalleTelefono();
	}

	private void getDetalleTelefono() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Peso: " + this.peso);
	}
	
	public String actualizarCodigo() {
		return "T" + getCodigo();
	}
	
	public void modificarCodigo() {
		super.setCodigo();
		codigoModificado(actualizarCodigo());
	}
	
	static Telefono arregloTelefono[] = new Telefono [10];
	private static int contadorTelefono = 0;
	
	public static void crearTelefono() {
		String descripcion,material,color, marca, modelo;
		double precio, peso;
		int ubicacion, stock,codigo;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el codigo: ");
		codigo = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Ingrese el detalle: ");
		descripcion = entrada.nextLine();
		entrada.nextLine();
		System.out.println("Ingrese Material: ");
		material = entrada.nextLine();
		System.out.println("Ingrese el color: ");
		color = entrada.nextLine();
		System.out.println("Ingrese la ubicacion: ");
		ubicacion = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Ingrese el precio: ");
		precio = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Ingrese el stock: ");
		stock = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Ingrese el peso: ");
		peso = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Ingrese la marca: ");
		marca = entrada.nextLine();
		System.out.println("Ingrese el modelo: ");
		modelo = entrada.nextLine();
		
		Telefono elemento = new Telefono(codigo, descripcion, precio, ubicacion, stock, marca, modelo, peso);
		arregloTelefono[contadorTelefono] = elemento;
		contadorTelefono++;
		System.out.println("Mueble cargado");
	}
	
	public static int getTelefonos() {
		return contadorTelefono;
	}
	
	public static void listarTelefonos()
	{
		for (int i =  0; i < contadorTelefono; i++)
		{
			arregloTelefono[i].getDetalle();
		}
	}
	
}
