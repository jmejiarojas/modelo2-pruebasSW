package pe.cibertec.util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Fecha {

	// Evaluamos existencia de la fecha
	// La Fecha debe ser de la forma "dd/MM/yyyy"

	/*
	 * public boolean validarFecha(int dia, int mes, int anio) {
	 * 
	 * try { LocalDate today = LocalDate.of(dia, mes, anio); DateTimeFormatter
	 * formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	 * System.out.println(formatter.format(today)); // 01/01/2016
	 * 
	 * return true; } catch (Exception e) { return false; }
	 * 
	 * }
	 */

	public boolean validarFecha(String fecha) { // La fecha tiene que ser del
												// formato "yyyy-mm-dd"
		LocalDate date = null;
		try {
			date = LocalDate.parse(fecha);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return (date == null) ? false : true;
	}

	// Me devuelve true si la fecha1 es menor fecha2
	public boolean compararFechas(String fecha1, String fecha2) {

		boolean bandera = false;

		try {

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");

			Date date1 = sdf.parse(fecha1);
			Date date2 = sdf.parse(fecha2);

			if (date1.before(date2)) {
				bandera = true;
			} else if (date2.before(date1)) {
				bandera = false;
			} else {
				bandera = false;
			}

		} catch (Exception e) {
			//System.out.println("La fecha debe tener este formato (yyyy-mm-dd)");
			bandera = false;
		}

		return bandera;
	}
}
