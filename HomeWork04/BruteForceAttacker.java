package cz.cvut.fel.pjv;

public class BruteForceAttacker extends Thief {

    @Override
    public void breakPassword(int sizeOfPassword) {
        if (sizeOfPassword == 0) {
            char[] try_pass = new char[sizeOfPassword];
            this.tryOpen(try_pass);
        } else {
            char[] try_pass = new char[sizeOfPassword];
            char[] i_shall_pass = new char[sizeOfPassword];
            bruteBreak(sizeOfPassword - 1, try_pass, i_shall_pass);
            this.tryOpen(i_shall_pass);
        }
    }

    public void bruteBreak(int passwordSize, char[] try_pass, char[] finished) {
        if (passwordSize >= 1) {
            for (char c : getCharacters()) {
                try_pass[passwordSize] = c;
                bruteBreak(passwordSize - 1, try_pass, finished);
            }
        } else {
            for (char c : getCharacters()) {
                try_pass[passwordSize] = c;
                if (this.tryOpen(try_pass)) {
                    int count = 0;
                    for (char d : try_pass) {
                        finished[count++] = d;
                    }
                }
            }
        }
    }
}
