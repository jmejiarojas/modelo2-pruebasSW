package pe.cibertec.app;

import java.util.Scanner;

import pe.cibertec.pension.Pension;

public class PensionApp {

	public static void main(String[] args) {
		
		//Sabemos que el monto es 360 , raw data
		String numHijos;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese el numero de hijos: ");
		numHijos = scanner.nextLine();
		
		Pension pension = new Pension(360, numHijos);
		System.out.println(pension.calcularMontoPagar());
		
	}
}
