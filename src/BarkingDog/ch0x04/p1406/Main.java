package BarkingDog.ch0x04.p1406;

import java.util.*;

/*
https://www.acmicpc.net/problem/1406
 */
public class Main {
    public static void main(String[] args) {
        s1();
    }

    // 2024-11-14 : 시간 초과
    private static void s1() {
        Scanner scanner = new Scanner(System.in);

        char[] cArr = scanner.nextLine().toCharArray();
        List str = new ArrayList();
        for (char c : cArr) {
            str.add(c + "");
        }
        int cmdN = scanner.nextInt();

        int cursor = str.size();
        for (int i = 0; i < cmdN; i++) {
            String cmd = scanner.next();
            switch (cmd) {
                case "L" -> {
                    if (cursor > 0) {
                        cursor--;
                    }
                }
                case "D" -> {
                    if (cursor < str.size()) {
                        cursor++;
                    }
                }
                case "B" -> {
                    if (cursor > 0) {
                        str.remove(--cursor);
                    }
                }
                case "P" -> {
                    String s = scanner.next();
                    str.add(cursor++, s);
                }
            }
        }

        str.forEach(s -> System.out.print(s));

        scanner.close();
    }
}
