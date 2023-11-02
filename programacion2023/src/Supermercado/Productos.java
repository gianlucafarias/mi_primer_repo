package Supermercado;

import java.util.*;

public abstract class Productos {

	public static ArrayList <Productos> listaProductos = new ArrayList<Productos>();
	
	private int codigoBarra;
	private Categorias codigoCategoria;
	private String marca;
	private String descripcion;
	private double precio;
	private int stock;
	
	
	public Productos(int codigoBarra, Categorias codigoCategoria, String marca, String descripcion, double precio, int stock) {
		this.codigoBarra = codigoBarra;
		this.codigoCategoria = codigoCategoria;
		this.marca = marca;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
	}


	public int getCodigoBarra() {
		return codigoBarra;
	}


	public void setCodigoBarra(int codigoBarra) {
		this.codigoBarra = codigoBarra;
	}


	public Categorias getCodigoCategoria() {
		return codigoCategoria;
	}


	public void setCodigoCategoria(Categorias codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
