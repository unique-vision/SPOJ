package pl.spoj.easy.FCTRL3_496;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        String results[] = new String[]{"0 1", "0 1", "0 2", "0 6", "2 4", "2 0", "2 0", "4 0", "2 0", "8 0", "0 0"};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tests = Integer.parseInt(br.readLine());

        while(tests-- > 0) {
            int n = Integer.parseInt(br.readLine());

            if(n > 10) {
                n = 10;
            }

            System.out.println(results[n]);
        }
    }
}