package cz.cvut.fel.pjv;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab01 {

    public void homework(String[] args) {
        Scanner scanf = new Scanner(System.in);
        String operation_s = null;
        String operand1_name = null;
        String operand2_name = null;

        System.out.println("Vyber operaci (1-soucet, 2-rozdil, 3-soucin, 4-podil):");
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
                System.err.println("Chybna volba!");
                scanf.close();
                System.exit(100);
                break;
        }

        // ask user for numbers
        System.out.printf("Zadej %s: \n", operand1_name);
        double operand1 = scanf.nextDouble();
        System.out.printf("Zadej %s: \n", operand2_name);
        double operand2 = scanf.nextDouble();
        if (operand2 == 0) {
            // dividing with zero is undefined
            System.err.println("Pokus o deleni nulou!");
            scanf.close();
            System.exit(101);
        }

        System.out.println("Zadej pocet desetinnych mist: ");
        int cipher_places = scanf.nextInt();
        if (cipher_places < 0) {
            // can't have negative number of ciphers after decimal number
            System.err.println("Chyba - musi byt zadane kladne cislo!");
            scanf.close();
            System.exit(102);
        }

        // calculate result
        double result = 0;
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
                result = operand1 / operand2;
                break;
        }

        // format numbers
        String f1_result = "%."+cipher_places+"f";
        String f1_operand1 = "%."+cipher_places+"f";
        String f1_operand2 = "%."+cipher_places+"f";

        String form_result = String.format(f1_result,result);
        String form_operand1 = String.format(f1_operand1, operand1);
        String form_operand2 = String.format(f1_operand2, operand2);

        // output result
        System.out.printf("%s %s %s = %s\n", form_operand1, operation_s, form_operand2, form_result);

        scanf.close();
    }

    public void start(String[] args) {
        homework(args);
    }
}