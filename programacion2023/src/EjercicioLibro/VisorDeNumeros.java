package EjercicioLibro;

public class VisorDeNumeros {
	
	private int limite; // atributos de la clase
	private int valor;
	
	public VisorDeNumeros(int limiteMaximo) //constructor
	{
		this.limite = limiteMaximo;
		this.valor = 0;
	}
	
	public int getValor() //metodo para devolver el valor
	{
		return this.valor;
	}
	
	public void setValor(int nuevoValor) //metodo para modificar el valor de un objeto horas o minutos
	{
		if ((nuevoValor >= 0) && (nuevoValor < limite))
		{
			this.valor = nuevoValor;
		}
	}
	
	public String getValorDelVisor() //solicita el estado del atributo valor
	{
		if(this.valor < 10)
		{
			return "0" + this.valor;
		}else
		{
			return "" + this.valor;
		}
	}
	
	public void incrementar() {	
		//this.valor = (this.valor + 1) % limite;
		this.valor++;
		if (this.valor == this.limite)
			this.valor = 0;
	}
	
	
}
