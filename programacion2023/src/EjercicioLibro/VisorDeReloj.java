package EjercicioLibro;

public class VisorDeReloj {
	
	private VisorDeNumeros horas;
	private VisorDeNumeros minutos;
	private String cadVisor;

	public VisorDeReloj() {
		this.horas = new VisorDeNumeros(24);
		this.minutos = new VisorDeNumeros(60);
		actualizarVisor();
	}
	
	public VisorDeReloj(int hora, int minuto) {
		horas = new VisorDeNumeros(24);
		minutos = new VisorDeNumeros(60);
		ponerEnHora(hora, minuto);
	}
	
	private void actualizarVisor() {
		
		cadVisor = horas.getValorDelVisor() + ":" + minutos.getValorDelVisor();
		}
	
	public void ponerEnHora(int hora, int minuto) {
		horas.setValor(hora);
		minutos.setValor(minuto);
		actualizarVisor();
	}
	
	public void ticTac() {
		minutos.incrementar();
		if (minutos.getValor() == 0){
			horas.incrementar();
		}
		actualizarVisor();
	}
	
	public String getHora() {
		return cadVisor;
	}
}