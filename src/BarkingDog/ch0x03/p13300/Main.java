package BarkingDog.ch0x03.p13300;

import java.util.*;

/*
https://www.acmicpc.net/problem/13300
 */
public class Main {
    public static void main(String[] args) {
        s2();
    }

    // 2024-11-13
    private static void s1() {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int Y = 6;
        int[] arr = new int[Y * 2];

        for (int i = 0; i < N; i++) {
            int gender = scanner.nextInt();
            int grade  = scanner.nextInt();

            arr[(gender == 0 ? 0 : Y) + (grade - 1)]++;
        }

        int cnt = 0;
        for (int i : arr) {
            cnt = cnt + (i / K) + (i % K == 0 ? 0 : 1);
        }

        System.out.println(cnt);

        scanner.close();
    }

    // 2024-11-13
    private static void s2() {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int Y = 6;
        int[][] arr = new int[2][Y];
        for (int i = 0; i < N; i++) {
            int gender = scanner.nextInt();
            int grade = scanner.nextInt();
            arr[gender][grade - 1]++;
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                cnt += (arr[i][j] / K) + (arr[i][j] % K == 0 ? 0 : 1);
            }
        }

        System.out.println(cnt);

        scanner.close();
    }
}

/*
// Authored by : OceanShape
// Co-authored by : -
// http://boj.kr/da61fda65b7d4d7c96fde827da8d1834
#include <bits/stdc++.h>
using namespace std;

int N, K, ans=0;
int s[2][7]={};  // 성별/반별 학생 수를 저장하는 배열

int main(void){
  ios::sync_with_stdio(0);
  cin.tie(0);

  cin >> N >> K;
  // 학생 수 저장
  for (int i=0; i<N; ++i) {
    int a, b;
    cin >> a >> b;
    s[a][b]++;
  }

  // 필요한 방의 개수 계산
  for (int i=0; i<2; ++i) {
    for (int j=1; j<7; ++j) {
      // 배정에 필요한 만큼 방의 개수 추가
      ans += s[i][j] / K;
      // 학생이 남을 경우, 하나의 방이 더 필요하므로 방의 개수 추가
      if (s[i][j] % K) ++ans;
    }
  }
  cout << ans;
}
 */