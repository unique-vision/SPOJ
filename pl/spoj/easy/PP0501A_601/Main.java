package pl.spoj.easy.PP0501A_601;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(reader.readLine()), a, b;
        StringTokenizer tokenizer;

        while (tests-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            a = Integer.parseInt(tokenizer.nextToken());
            b = Integer.parseInt(tokenizer.nextToken());
            if (a >= b) {
                System.out.println(nwd(a, b));
            } else {
                System.out.println(nwd(b, a));
            }
        }
    }

    static int nwd(int a, int b) {
        int temp;
        if (a == b) {
            return a;
        } else if (a > b) {
            while (!(b <= 0)) {
                temp = a % b;
                a = b;
                b = temp;
            }
            return a;
        }
        return 0;
    }
}
