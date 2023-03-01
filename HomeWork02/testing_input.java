import java.util.Scanner;

public class testing_input {
    public static void main(String[] args) {
        System.out.println(Calc.multiply(c,d));
        Scanner scanf = new Scanner(System.in);
        int counter = 0;
        boolean did_a_ten = false;
        int num = 0;
        String line_s = null;

        while (scanf.hasNextLine()) {
            did_a_ten = false;
            counter++;
            line_s = scanf.nextLine();
            // if (Integer.parseInt(line_s))
            // {
                
            // }
            num = Integer.parseInt(line_s);
            System.out.printf("%d\n", num);
            if ((counter % 10) == 0) {
                did_a_ten = true;
                System.out.printf("%d %d\n", 10, num);
            }
        }

        if (!did_a_ten) {
            System.out.printf("%d %d\n", (counter % 10), num);
        }
        scanf.close();
    }
}