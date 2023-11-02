package muebleria;

import java.util.*;


class Mueble extends Articulo
{
	private String material;
	private String color;
	private double alto, ancho, espesor;
	
	public Mueble()
	{
		super();
	}
	
	public Mueble(int codigo, String descripcion, double precio, int ubicacion, int stock, String material, String color, double alto, double ancho, double espesor){
		super(codigo, descripcion, precio, ubicacion, stock);
		codigoModificado(actualizarCodigo());
		this.material = material;
		this.color = color;
		this.alto = alto;
		this.ancho = ancho;
		this.espesor = espesor;
	}
	
	public void setMaterial()
	{
		Scanner entrada = new Scanner(System.in);
		String material;
		System.out.println("Ingrese el material: ");
		material = entrada.nextLine();
		this.material = material;
	}
	
	public void setColor()
	{
		Scanner entrada = new Scanner(System.in);
		String color;
		System.out.println("Ingrese el color: ");
		color = entrada.nextLine();
		this.color = color;
	}
	
	public void setMedidas()
	{
		Scanner entrada = new Scanner(System.in);
		double ancho, alto, espesor;
		do
		{
			System.out.println("Ingrese el alto: ");
			alto = entrada.nextDouble();
		}while (alto <= 0);
		do
		{
			System.out.println("Ingrese el ancho: ");
			ancho = entrada.nextDouble();
		}while (ancho <= 0);
		
		do
		{
			System.out.println("Ingrese el espesor: ");
			espesor = entrada.nextDouble();
		}while (espesor <= 0);
		this.alto = alto;
		this.ancho = ancho;
		this.espesor = espesor;
	}
	
	public void getDetalle()
	{
		super.getDetalle();
		super.getUbicacion();
		getDetalleMueble();
	}
	
	private void getDetalleMueble()
	{
		System.out.println("Material: " + this.material);
		System.out.println("Color: " + this.color);
		System.out.println("Medidas: " + "Alto: " + this.alto + " Ancho: " + this.ancho + " Espesor: " + this.espesor);
	}
	
	public String actualizarCodigo()
	{
		return "M" + getCodigo();
	}
	
	public void modificarCodigo()
	{
		super.setCodigo();
		codigoModificado(actualizarCodigo());
	}
		
	static Mueble arregloMueble[] = new Mueble [10];
	private static int contadorMueble = 0;

	public static void crearMueble() {
		String descripcion,material,color;
		double precio, alto,ancho,espesor;
		int ubicacion, stock,codigo;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el codigo: ");
		codigo = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Ingrese el detalle: ");
		descripcion = entrada.nextLine();
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
		System.out.println("Ingrese el alto: ");
		alto = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Ingrese el ancho: ");
		ancho = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Ingrese el espesor: ");
		espesor = entrada.nextDouble();
		entrada.nextLine();
		
		Mueble elemento = new Mueble(codigo, descripcion, precio, ubicacion, stock, material, color, alto, ancho, espesor);
		arregloMueble[contadorMueble] = elemento;
		contadorMueble++;
		System.out.println("Mueble cargado");
	}
	
	public static int getMuebles() {
		return contadorMueble;
	}
	
	public static void listarMuebles()
	{
		for (int i =  0; i < contadorMueble; i++)
		{
			arregloMueble[i].getDetalle();
		}
	}
	
}
