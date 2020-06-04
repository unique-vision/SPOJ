package pl.spoj.easy.ETI06F1_609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        double r, d, result;
        final double PI = 3.141592654; //specified in the task content

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        r = Double.parseDouble(tokenizer.nextToken());
        d = Double.parseDouble(tokenizer.nextToken());
        result = -1 * ((d / 2) * (d / 2) - r * r);

        System.out.printf("%.2f", result * PI);
    }
}
