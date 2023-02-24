import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		DecimalFormat dform = new DecimalFormat();
		String operation_s = null;
		String operand1_s = null;
		String operand2_s = null;

		System.out.println("Vyberte operaci (1-soucet, 2-rozdil, 3-soucin, 4-podil):");
		int operation = scanf.nextInt();
		// prepare strings for last output
		switch (operation) {
			case 1:
				operand1_s = "scitanec";
				operand2_s = "scitanec";
				operation_s = "+";
				break;

			case 2:
				operand1_s = "mensenec";
				operand2_s = "mensitel";
				operation_s = "-";
				break;

			case 3:
				operand1_s = "cinitel";
				operand2_s = "cinitel";
				operation_s = "*";
				break;

			case 4:
				operand1_s = "delenec";
				operand2_s = "delitel";
				operation_s = "/";
				break;

			default:
				// exit if wrong thing is chosen
				System.err.println("Chybna volba");
				scanf.close();
				System.exit(100);
				break;
		}

		// ask user for numbers
		System.out.printf("Zadej %s: \n", operand1_s);
		float operand1 = scanf.nextFloat();
		System.out.printf("Zadej %s: \n", operand2_s);
		float operand2 = scanf.nextFloat();
		System.out.println("Zadej pocet desetinych mist: ");
		int cipher_places = scanf.nextInt();
		dform.setMaximumFractionDigits(cipher_places);

		// calculate result
		float result = 0;
		switch (operation) {
			case 1:
				result = operand1 + operand2;
				break;
			case 2:
				result = operand1 - operand2;
				break;
			case 3:
				result = operand1 * operand2;
				break;
			case 4:
				if (operand2 == 0) {
					System.exit(101);
				}
				
				result = operand1 / operand2;
				break;
		}
		scanf.close();
	}
}
