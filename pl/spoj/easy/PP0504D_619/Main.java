package pl.spoj.easy.PP0504D_619;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(reader.readLine());

        while (tests-- > 0) {
            printFloat(Float.parseFloat(reader.readLine()));
        }
    }

    static void printFloat(float number) {

        StringBuilder builder = new StringBuilder();
        String binaryString = Integer.toBinaryString(Float.floatToIntBits(number));

        int gap = 32 - binaryString.length();

        if (gap > 0) {
            while (gap-- > 0) {
                builder.append(0);
            }

        }
        builder.append(binaryString);
        String finalString = builder.toString();

        StringBuilder hexNumber = new StringBuilder();

        for (int i = 0; i < 32; i += 4) {
            int result = 0;

            if (finalString.charAt(i) == '1')
                result += 8;
            if (finalString.charAt(i + 1) == '1')
                result += 4;
            if (finalString.charAt(i + 2) == '1')
                result += 2;
            if (finalString.charAt(i + 3) == '1')
                result += 1;


            switch (result) {
                case 10:
                    hexNumber.append('a');
                    break;
                case 11:
                    hexNumber.append('b');
                    break;
                case 12:
                    hexNumber.append('c');
                    break;
                case 13:
                    hexNumber.append('d');
                    break;
                case 14:
                    hexNumber.append('e');
                    break;
                case 15:
                    hexNumber.append('f');
                    break;
                default:
                    hexNumber.append(result);
                    break;
            }
            if (i == 4 || i == 12 || i == 20) {
                hexNumber.append(" ");
            }
        }
        for (int i = 9; i >= 0; i -= 3) {
            if (hexNumber.charAt(i) == '0' && hexNumber.charAt(i + 1) == '0')
                hexNumber.deleteCharAt(i);
        }
        System.out.println(hexNumber);
    }
}