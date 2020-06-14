package pl.spoj.easy.GLUTTON_626;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(reader.readLine());
        final int MINUTES_PER_DAY = 86400;

        while (tests -- > 0) {
            int cookies = 0;
            int boxes;

            String stringInput = reader.readLine();
            String splittedInput [] = stringInput.split(" ");

            int numberOfInvitees = Integer.parseInt(splittedInput[0]);
            int cookiesInBox = Integer.parseInt(splittedInput[1]);

            for (int i = 0; i < numberOfInvitees; i++) {
                int invitedSpeed = Integer.parseInt(reader.readLine());
                cookies += MINUTES_PER_DAY / invitedSpeed;
            }

            boxes = (int)Math.ceil((double)cookies/cookiesInBox);
            System.out.println(boxes);
        }
    }
}
