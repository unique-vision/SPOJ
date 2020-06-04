package pl.spoj.easy.PRZEDSZK_522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
        StringTokenizer stringTokenizer;

        while (tests-- > 0) {

            stringTokenizer = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken()),
                    b = Integer.parseInt(stringTokenizer.nextToken()),
                    ab = a * b,
                    result = 0;

            if (a < b) {
                while (ab > 0) {
                    if (ab % b == 0) {
                        result = ab;
                    }
                    ab = ab - a;
                }

            } else { //b > a
                while (ab > 0) {
                    if (ab % a == 0) {
                        result = ab;
                    }
                    ab = ab - b;
                }
            }
            System.out.println(result);
        }
    }
}