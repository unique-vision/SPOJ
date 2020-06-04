package pl.spoj.easy.PRIME_T_438;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tests = Integer.parseInt(br.readLine());

        while (tests-- > 0) {

            int nr = Integer.parseInt(br.readLine());

            boolean isPrime = true;

            if (nr == 0 || nr == 1) {
                isPrime = false;
            }

            for (int i = nr / 2; i > 1; i--) {

                if (nr % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("TAK");
            } else if (!isPrime) {
                System.out.println("NIE");
            }
        }
    }
}