package BarkingDog.ch0x03.p2577;

import java.util.*;

/*
https://www.acmicpc.net/problem/2577
 */
public class Main {
    public static void main(String[] args) {
        s1();
    }

    // 2024-11-13
    private static void s1() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int m = a * b * c;

        int[] arr = new int[10];
        while (true) {
            arr[m % 10]++;

            m /= 10;
            if (m == 0) {
                break;
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }

        scanner.close();
    }
}

/*
// Authored by : BaaaaaaaaaaarkingDog
// Co-authored by : OceanShape
// http://boj.kr/fefbce1d30c9442db611909c690df1a8
#include <bits/stdc++.h>
using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);
  int A, B, C;
  cin >> A >> B >> C;
  int t=A*B*C;
  int d[10] = {};
  // 계산 결과를 자릿수별로 확인하여 저장
  while (t>0) {
    d[t%10]++;
    t/=10;
  }
  for (int i=0; i<10; ++i) cout << d[i] << '\n';
}
 */