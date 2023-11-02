package fechas;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class fechas {
	
	public static final DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public static void main(String[] args) {
		
		LocalDate hoy = LocalDate.now();
		LocalDate cumple = LocalDate.of(2023, 12, 30);
		
		System.out.println("hoy es: " + hoy.format(fechaFormateada));
		System.out.println("tu cumple es: " + cumple);
		
		int dias = (int) ChronoUnit.DAYS.between(hoy, cumple);
		System.out.println("faltan " + dias + " para tu cumple.");

	}

}
