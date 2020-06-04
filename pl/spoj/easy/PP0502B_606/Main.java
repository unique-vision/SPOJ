package pl.spoj.easy.PP0502B_606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
        StringTokenizer tokenizer;

        while (tests-- > 0) {
            tokenizer = new StringTokenizer(br.readLine());
            int length = Integer.parseInt(tokenizer.nextToken());
            int[] reverse = new int[length];

            while (length-- > 0) {
                reverse[length] = Integer.parseInt(tokenizer.nextToken());
            }
            while (length++ < reverse.length - 1) {
                System.out.print(reverse[length] + " ");
            }
            System.out.println();
        }
    }
}