public class TryRec {
    public static void main(String[] args) {
        char[] let = { 'a', 'b' };
        char [] pass = new char[5];
        Recu(4, let, pass);
    }

    public static void Recu(int it, char[] letters, char[] pass) {
        if (it >= 1) {
            for (char c : letters) {
                pass[it] = c;
                Recu(it - 1, letters, pass);
            }
        } else {
            for (char c : letters) {
                pass[it] = c;
                System.out.println(String.valueOf(pass));
            }
        }
    }
}