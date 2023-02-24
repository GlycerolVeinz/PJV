import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		String operation_s = null;
		String operand1_s = null;
		String operand2_s = null;

		System.out.println("Vyberte operaci (1-soucet, 2-rozdil, 3-soucin, 4-podil):");
		int operation = scanf.nextInt();
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
				System.err.println("Chybna volba");
				scanf.close();
				System.exit(100);
				break;
		}

		System.out.printf("Zadej %s: ", operand1_s);
		float operand1 = scanf.nextFloat();
		System.out.printf("Zadej %s: ", operand2_s);
		float opernad2 = scanf.nextFloat();

		scanf.close();
	}
}
