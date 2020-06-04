package pl.spoj.easy.BFN1_568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine()), temp, iterations;
        String a;
        StringBuilder sb;
        boolean isSame;

        while(tests-- > 0) {
            iterations = 0;
            a = br.readLine();
            isSame = false;

            while(!isSame) {
                sb = new StringBuilder();
                for(int i = a.length()-1; i >= 0; i--) {
                    sb.append(a.charAt(i));
                }

                if(a.equals(sb.toString())) {
                    isSame = true;
                }
                else {
                    temp = (Integer.parseInt(a) + Integer.parseInt(sb.toString()));
                    a = String.valueOf(temp);
                    iterations++;
                }
            }
            System.out.println(a + " " + iterations);
        }
    }
}