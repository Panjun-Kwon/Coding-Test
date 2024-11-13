package BarkingDog.ch0x03.p10808;

import java.util.*;

/*
https://www.acmicpc.net/problem/10808
 */
public class Main {
    public static void main(String[] args) {
        s1();
    }

    // 2024-11-13
    private static void s1() {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.nextLine();
        int[] arr = new int[26];

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            arr[c - 'a']++;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}

/*
// Authored by : BaaaaaaaaaaarkingDog
// Co-authored by : -
// http://boj.kr/d7178d89538a42ababf4455443e60fe2
#include <bits/stdc++.h>
using namespace std;

int freq[26];
int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);
  string s;
  cin >> s;
  for(auto c : s)
    freq[c-'a']++;
  for(int i = 0; i < 26; i++)
    cout << freq[i] << ' ';
}
 */