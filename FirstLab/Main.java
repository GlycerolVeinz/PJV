import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		DecimalFormat dform = new DecimalFormat();
		String operation_s = null;
		String operand1_name = null;
		String operand2_name = null;

		System.out.println("Vyberte operaci (1-soucet, 2-rozdil, 3-soucin, 4-podil):");
		int operation = scanf.nextInt();
		// prepare strings for last output
		switch (operation) {
			case 1:
				operand1_name = "scitanec";
				operand2_name = "scitanec";
				operation_s = "+";
				break;

			case 2:
				operand1_name = "mensenec";
				operand2_name = "mensitel";
				operation_s = "-";
				break;

			case 3:
				operand1_name = "cinitel";
				operand2_name = "cinitel";
				operation_s = "*";
				break;

			case 4:
				operand1_name = "delenec";
				operand2_name = "delitel";
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
		System.out.printf("Zadej %s: \n", operand1_name);
		float operand1 = scanf.nextFloat();
		System.out.printf("Zadej %s: \n", operand2_name);
		float operand2 = scanf.nextFloat();
		System.out.println("Zadej pocet desetinych mist: ");
		int cipher_places = scanf.nextInt();
		if (cipher_places < 0) {
			// can't have negative number of ciphers after decimal number
			System.err.println("Chyba - Musi byt zadane kladne cislo!");
			scanf.close();
			System.exit(102);
		}
		dform.setMinimumFractionDigits(cipher_places);
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
					// dividing with zero is undefined
					System.err.println("Pokus o deleni nulou!");
					scanf.close();
					System.exit(101);
				}

				result = operand1 / operand2;
				break;
		}

		// format numbers
		String form_result = dform.format(result);
		String form_operand1 = dform.format(operand1);
		String form_operand2 = dform.format(operand2);


		// output result
		System.out.printf("%s %s %s = %s\n", form_operand1, operation_s, form_operand2, form_result);

		scanf.close();
	}
}
