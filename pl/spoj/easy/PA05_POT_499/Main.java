package pl.spoj.easy.PA05_POT_499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(reader.readLine()), a, b;
        StringTokenizer tokenizer;


        while(tests-- > 0){
            tokenizer = new StringTokenizer(reader.readLine());
            a = Integer.parseInt(tokenizer.nextToken()) % 10;
            b = Integer.parseInt(tokenizer.nextToken());

            switch (a){
                case 0:
                    System.out.println(0);
                    break;
                case 1:
                    System.out.println(1);
                    break;
                case 2:
                    two(b);
                    break;
                case 3:
                    three(b);
                    break;
                case 4:
                    four(b);
                    break;
                case 5:
                    five(b);
                    break;
                case 6:
                    six(b);
                    break;
                case 7:
                    seven(b);
                    break;
                case 8:
                    eight(b);
                    break;
                case 9:
                    nine(b);
                    break;

            }
        }
    }

    private static void nine(int b) {
        switch (b % 2) {
            case 0:
                System.out.println(1);
                break;
            case 1:
                System.out.println(9);
                break;
        }
    }

    private static void eight(int b) {
        switch (b % 4){
            case 0:
                System.out.println(6);
                break;
            case 1:
                System.out.println(8);
                break;
            case 2:
                System.out.println(4);
                break;
            case 3:
                System.out.println(2);
                break;
        }
    }

    private static void seven(int b) {
        switch (b % 4){
            case 0:
                System.out.println(1);
                break;
            case 1:
                System.out.println(7);
                break;
            case 2:
                System.out.println(9);
                break;
            case 3:
                System.out.println(3);
                break;
        }
    }

    private static void six(int b) {
        System.out.println(6);
    }

    private static void five(int b) {
        System.out.println(5);
    }

    private static void four(int b) {
        switch (b % 2){
            case 0:
                System.out.println(6);
                break;
            case 1:
                System.out.println(4);
                break;
        }
    }

    private static void three(int b) {
        switch (b % 4){
            case 0:
                System.out.println(1);
                break;
            case 1:
                System.out.println(3);
                break;
            case 2:
                System.out.println(9);
                break;
            case 3:
                System.out.println(7);
                break;
        }
    }

    private static void two(int b) {
        switch (b % 4){
            case 0:
                System.out.println(6);
                break;
            case 1:
                System.out.println(2);
                break;
            case 2:
                System.out.println(4);
                break;
            case 3:
                System.out.println(8);
                break;
        }
    }
}