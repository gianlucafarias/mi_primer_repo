package muebleria;

import java.util.*;

public class Deposito
{
	private String ubicacion;
	
	public Deposito()
	{
		this.ubicacion = "Sin Ubicacion";
	}
	
	public Deposito(int division)
	{
			if (division == 0 ) {
				this.ubicacion = "Vidriera";
			}
			else {
				this.ubicacion = "Deposito Nº " + division;
			}
	}
	
	public void setDeposito()
	{
		Scanner entrada = new Scanner(System.in);
		int division;
		System.out.println("Ingrese el numero de deposito (0 para vidriera): ");
		division = entrada.nextInt();
		this.ubicacion = "Deposito Nº " + division;
	}
	
	public String getDeposito()
	{
		return this.ubicacion;
	}
	
	public void setDepositoGlobal(int division)
	{
		this.ubicacion = "Deposito Nº " + division;
	}

}