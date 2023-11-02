package ejerciciosjava;
import EjercicioLibro.*;

public class RelojMain {

	public static void main(String[] args) {
		VisorDeReloj reloj1 = new VisorDeReloj();
		reloj1.ponerEnHora(20, 57);

		System.out.println(reloj1.getHora());

	}
}
