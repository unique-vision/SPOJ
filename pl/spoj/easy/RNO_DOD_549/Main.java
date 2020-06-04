package pl.spoj.easy.RNO_DOD_549;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine()), result, numbers;
        StringTokenizer tokenizer;

        while (tests-- > 0) {
            result = 0;
            numbers = Integer.parseInt(br.readLine());
            tokenizer = new StringTokenizer(br.readLine());
            while (numbers-- > 0) {
                result += Integer.parseInt(tokenizer.nextToken());
            }
            System.out.println(result);
        }
    }
}