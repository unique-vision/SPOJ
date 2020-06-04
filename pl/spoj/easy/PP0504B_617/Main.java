package pl.spoj.easy.PP0504B_617;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
        StringTokenizer tokenizer;

        while (tests-- > 0) {
            tokenizer = new StringTokenizer(br.readLine());
            String a = tokenizer.nextToken(),
                    b = tokenizer.nextToken();

            if (a.length() <= b.length()) {
                merge(a, b, true);
            } else merge(b, a, false);

        }
    }

    private static void merge(String a, String b, boolean order) {

        List<Character> list = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            if (order) {
                list.add(a.charAt(i));
                list.add(b.charAt(i));
            } else {
                list.add(b.charAt(i));
                list.add(a.charAt(i));
            }
        }
        for (char ch: list) {
            System.out.print(ch);
        }
        System.out.println();
    }
}