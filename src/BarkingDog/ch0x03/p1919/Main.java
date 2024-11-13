package BarkingDog.ch0x03.p1919;

import java.util.*;

/*
https://www.acmicpc.net/problem/1919
 */
public class Main {
    public static void main(String[] args) {
        s2();
    }

    // 2024-11-13
    private static void s1() {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        int[] arr = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            arr[s2.charAt(i) - 'a']--;
        }

        int cnt = 0;
        for (int i : arr) {
            if (i != 0) {
                cnt += Math.abs(i);
            }
        }

        System.out.println(cnt);

        scanner.close();
    }

    // 2024-11-13
    private static void s2() {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        int[][] arr = new int[2][26];
        for (int i = 0; i < s1.length(); i++) {
            arr[0][s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            arr[1][s2.charAt(i) - 'a']++;
        }

        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            cnt += Math.abs(arr[0][i] - arr[1][i]);
        }

        System.out.println(cnt);

        scanner.close();
    }
}

/*
// Authored by : twinkite
// Co-authored by : BaaaaaaaaaaarkingDog
// http://boj.kr/ae5d8d2f69f04530b4df0c591e9b07d5
#include <bits/stdc++.h>
using namespace std;

int arr[2][26], res;
string s1, s2;

int main(void){
  ios::sync_with_stdio(0);
  cin.tie(0);

  cin>>s1>>s2;
  for(char c : s1)
    arr[0][c-'a']++;

  for(char c : s2)
    arr[1][c-'a']++;

  for(int i=0; i<26; i++)
    res += abs(arr[0][i]-arr[1][i]);

  cout << res;
}
 */