package pe.cibertec.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FechaTest {

	@Test
	public void testValidarFecha1() {
		Fecha fecha = new Fecha();
		boolean expectResult = true;
		boolean result = fecha.validarFecha("2017-02-28");
		//boolean result = fecha.validarFecha("28/02/2017");
		assertEquals(expectResult, result);
	}
	
	@Test
	public void testValidarFecha2() {
		Fecha fecha = new Fecha();
		boolean expectResult = true;
		boolean result = fecha.validarFecha("2017-10-30");
		//boolean result = fecha.validarFecha("30/10/2017");
		assertEquals(expectResult, result);
	}
	
	@Test
	public void testValidarFecha_invalida() {
		Fecha fecha = new Fecha();
		boolean expectResult = false;
		boolean result = fecha.validarFecha("2017-02-31"); //31 de febrero
		//boolean result = fecha.validarFecha("30/10/2017");
		assertEquals(expectResult, result);
	}
	
	@Test
	public void testValidarFecha3() {
		Fecha fecha = new Fecha();
		boolean expectResult = false;
		boolean result = fecha.validarFecha("Holi");
		//boolean result = fecha.validarFecha("30/10/2017");
		assertEquals(expectResult, result);
	}
	
	@Test
	public void compararFechas_valida_menor_mayor(){
		Fecha fecha = new Fecha();
		boolean expectResult = true;
		boolean result = fecha.compararFechas("2017-04-10","2017-04-12");
		//boolean result = fecha.validarFecha("30/10/2017");
		assertEquals(expectResult, result);
	}
	
	@Test
	public void compararFechas_valida_iguales(){
		Fecha fecha = new Fecha();
		boolean expectResult = false;
		boolean result = fecha.compararFechas("2017-04-10","2017-04-10");
		assertEquals(expectResult, result);
	}
	
	@Test
	public void compararFechas_valida_mayor_menor(){
		Fecha fecha = new Fecha();
		boolean expectResult = false;
		boolean result = fecha.compararFechas("2017-04-15","2017-04-12");
		assertEquals(expectResult, result);
	}
	
	@Test
	public void compararFechas_primer_invalido(){
		Fecha fecha = new Fecha();
		boolean expectResult = false;
		boolean result = fecha.compararFechas("207/05/07","2017-04-12");
		assertEquals(expectResult, result);
	}
	
	@Test
	public void compararFechas_segundo_invalido(){
		Fecha fecha = new Fecha();
		boolean expectResult = false;
		boolean result = fecha.compararFechas("207/05/07","okis");
		assertEquals(expectResult, result);
	}

}
