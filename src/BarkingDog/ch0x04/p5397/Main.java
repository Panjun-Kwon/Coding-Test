package BarkingDog.ch0x04.p5397;

import java.util.*;

/*
https://www.acmicpc.net/problem/5397
 */
public class Main {
    public static void main(String[] args) {
        s1();
    }

    // 2024-11-14 : 런타임 에러 (ArrayIndexOutOfBounds)
    private static void s1() {
        Scanner scanner = new Scanner(System.in);

        int tcN = scanner.nextInt();
        scanner.nextLine();

        String[] strArr = new String[tcN];
        for (int i = 0; i < tcN; i++) {
            strArr[i] = scanner.nextLine();
        }

        for (int i = 0; i < strArr.length; i++) {
            List pwd = new ArrayList();
            int cursor = 0;
            for (int j = 0; j < strArr[i].length(); j++) {
                char c = strArr[i].charAt(j);
                if ((c >= 'A' && c <= 'z') || (c - '0' >= 0 && c - '0' <= 9)) {
                    pwd.add(cursor++, c);
                } else if ((c == '<') && (cursor > 0)) {
                    cursor--;
                } else if ((c == '>') && (cursor < pwd.size())) {
                    cursor++;
                } else if (c == '-') {
                    pwd.remove(--cursor);
                }
            }

            System.out.println(pwd);
        }

        scanner.close();
    }
}
