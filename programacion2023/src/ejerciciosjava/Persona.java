package ejerciciosjava;
import java.util.*;

public class Persona
{
		protected String nombre;
		protected String apellido;
		private String fechaNacimiento;
		public Persona(String nombre, String apellido,String fechaNacimiento)
		{
			this.nombre = nombre;
			this.apellido = apellido;
			// GregorianCalendar fecha = new GregorianCalendar(anio, mes-1,dia);
			this.fechaNacimiento = fechaNacimiento;
		}	
		public String obtenerNombre() {
			return this.apellido + " "+ this.nombre;
		}
		
		
		public static void crearPersona() {
			
			String nombre, apellido, fechaNacimiento;
			
			Persona persona1 = new Persona("Gianluca", "Palmier", "15, 05, 1997");
		}
}

class Empleado extends Persona
{
	protected int sueldo;
	public Empleado(String nombre, String apellido, String fechaNacimiento)
	{
		super(nombre, apellido, fechaNacimento);
		this.sueldo = sueldo;
	}
	public String obtenerNombre() {
		return this.apellido + " " + this.nombre + " $" + this.sueldo;
	}
}
class Gerente extends Empleado
{
	private int sobreSueldo;	
	public Gerente(String nombre, String apellido, String fechaNacimiento, int sobreSueldo)
	{
		super(nombre, apellido, fechaNacimento);
		this.sobreSueldo = sobreSueldo;	
	}
	public String obtenerNombre()
	{
		return this.apellido + " " + this.nombre + " $" + (this.sueldo + this.sobreSueldo);
	}
}