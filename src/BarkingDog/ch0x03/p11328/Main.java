package BarkingDog.ch0x03.p11328;

import java.util.*;

/*
https://www.acmicpc.net/problem/11328
 */
public class Main {
    public static void main(String[] args) {
        s1();
    }

    // 2024-11-13 : 출력 초과 todo
    private static void s1() {
        Scanner scanner = new Scanner(System.in);

        int tc = scanner.nextInt();
        scanner.nextLine();

        String[][] strArr = new String[tc][2];
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length; j++) {
                strArr[i][j] = scanner.next();
            }
        }

        for (int i = 0; i < tc; i++) {
            int[] arr = new int[26];
            for (int j = 0; j < strArr[i][0].length(); j++) {
                arr[strArr[i][0].charAt(j) - 'a']++;
            }

            boolean flag = true;
            for (int j = 0; j < strArr[i][1].length(); j++) {
                if (arr[strArr[i][1].charAt(j) - 'a'] != 1) {
                    System.out.println("Impossible");
                    flag = false;
                }
            }

            if (flag) {
                System.out.println("Possible");
            }
        }

        scanner.close();
    }
}