package pl.spoj.easy.FLAMASTE_506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tests = Integer.parseInt(br.readLine()), repetitions;
        StringBuilder sb;
        String string;
        Character ch;


        while (tests-- > 0) {

            sb = new StringBuilder();
            string = br.readLine();
            ch = string.charAt(0);
            sb.append(ch);
            repetitions = 0;

            for (int i = 1; i < string.length(); i++) {
                if (!ch.equals(string.charAt(i))) {
                    if (repetitions == 0) {
                        ch = string.charAt(i);
                        sb.append(ch);
                    } else if (repetitions < 2) {
                        sb.append(ch);
                        ch = string.charAt(i);
                        sb.append(ch);
                        repetitions = 0;
                    } else {
                        sb.append(repetitions + 1);
                        ch = string.charAt(i);
                        sb.append(ch);
                        repetitions = 0;
                    }

                } else if (ch.equals(string.charAt(i))) {
                    repetitions++;
                }

                if (i == string.length() - 1) {
                    if (repetitions > 1) {
                        sb.append(repetitions + 1);
                    } else if (repetitions == 1) {
                        sb.append(ch);
                    }
                }
            }
            System.out.println(sb.toString());
        }
    }
}