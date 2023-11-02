package ejerciciosjava;
import java.util.Scanner;

public class bombilla {
	private boolean estado;
	private int potencia;
	private String color;
	private double horas;

	public bombilla(){
		this.estado = false;
		this.potencia = 0;
		this.color = "N/A";
		this.horas = 10;
	}
	
	public void SetEncender() {
		double tiempo;
		Scanner entrada = new Scanner(System.in);
		
		if (this.horas > 0 ) {
			//indique tiempo
			tiempo = entrada.nextDouble();
			if (this.horas >= tiempo) {
				this.estado = true;
				this.horas = this.horas - tiempo;
			}
		}
	}
	
	public void SetApagar() {
		this.estado = false;
		System.out.println("La bombilla está apagada.");
	}
	
	public boolean GetEstado() {
		return this.estado;
	}
	
	public void SetPotencia(int potencia ) {
		this.potencia = potencia;
	}
	
	public void SetColor(String color) {
		if (this.estado == true) {
			SetApagar();
		}
		this.color = color;
	}
	
	public int GetPotencia() {
		return this.potencia;
	}
	
	public void GetColor() {
		System.out.println("El color de la bombilla es " + this.color);
	}
	
	public void SetHoras() {
		double tiempo;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cuantas horas quiere recargar?");
		tiempo = entrada.nextDouble();
		this.horas = this.horas + tiempo;
		System.out.println("Se agregaron " + tiempo + " horas. quedan "+ this.horas +" horas");
	}
	
}