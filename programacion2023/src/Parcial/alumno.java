package Parcial;

public class alumno extends persona{
	private int legajo;
	private double nota;
	
	public alumno () {
		super ();
		this.legajo=0;
		this.nota= 0;
	}

	public alumno (String nombre, String apellido, int edad, int legajo, double nota){
		super(nombre,apellido,edad);
		this.legajo= legajo;
		this.nota=nota;
	}
}
