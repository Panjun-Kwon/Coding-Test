package BarkingDog.ch0x04.p1158;

import java.util.*;

/*
https://www.acmicpc.net/problem/1158
 */
public class Main {
    public static void main(String[] args) {
        s2();
    }

    // 2024-11-14
    private static void s1() {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        int index = K - 1;
        System.out.print("<");
        while (true) {
            if (list.size() == 1) {
                Integer last = list.remove(0);
                System.out.print(last + ">");
                break;
            }

            Integer pop = list.remove(index--);
            System.out.print(pop + ", ");

            index += K;
            index = index >= list.size() ? index % list.size() : index;
        }

        scanner.close();
    }

    // 2024-11-14
    private static void s2() {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        System.out.print("<");
        while (true) {
            if (queue.size() == 1) {
                System.out.print(queue.poll() + ">");
                break;
            }

            for (int i = 0; i < K-1; i++) {
                queue.add(queue.poll());
            }
            System.out.print(queue.poll() + ", ");
        }

        scanner.close();
    }
}

/*
// Authored by : OceanShape
// Co-authored by : -
// http://boj.kr/b7f7b82420c74d43b13c398fc6c73841
#include <bits/stdc++.h>
using namespace std;

int N, K, len = 0;

// 리스트에서 이전 노드/다음 노드를 가리키는 변수
int pre[5001];
int nxt[5001];
// 요세푸스 순열을 저장하는 변수
vector<int> v;

int main(void){
  ios::sync_with_stdio(0);
  cin.tie(0);
  cin >> N >> K;

  // 원형 연결 리스트 생성
  // 맨 처음 노드와 마지막 노드가 서로를 가리키도록 지정
  for(int i = 1; i <= N; ++i){
    pre[i] = (i == 1) ? N : i - 1;
    nxt[i] = (i == N) ? 1 : i + 1;
    ++len;
  }

  int i = 1;
  // 연결 리스트를 순회하며 순열 생성
  for(int cur = 1; len != 0; cur = nxt[cur]){
    // K 번째일 때 제거
    if(i == K){
      pre[nxt[cur]] = pre[cur];
      nxt[pre[cur]] = nxt[cur];
      v.push_back(cur);
      i = 1;
      --len;
    } else ++i;
  }

  // 요세푸스 순열 출력
  cout << "<";
  for(size_t i = 0; i < v.size(); ++i) {
    cout << v[i];
    if(i != v.size() - 1) cout << ", ";
  }
  cout << ">";
}
 */

/*
// Authored by : haneulkimdev
// Co-authored by : -
// http://boj.kr/4ef85f8d8d834deb8b8ae054d249fff9
#include <bits/stdc++.h>
using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);
  int n, k;
  cin >> n >> k;
  queue<int> Q;
  for (int i = 1; i <= n; i++) Q.push(i);
  cout << '<';
  while (!Q.empty()) {
    for (int i = 0; i < k - 1; i++) {
      Q.push(Q.front());
      Q.pop();
    }
    cout << Q.front();
    Q.pop();
    if (Q.size()) cout << ", ";
  }
  cout << '>';
}

STL queue를 이용한 풀이
 */

/*
// Authored by : seondal
// Co-authored by : BaaaaaaaaaaarkingDog
// http://boj.kr/7c7efdecb02a48a3a94ade53e278b0bc
#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int n,k;
  cin >> n >> k;
  vector <int> V, ans;
  for (int i = 1; i <= n; i++)
    V.push_back(i);

  for (int i = 0; ans.size() < n; i++){ //정답벡터에 n개의 원소가 쌓이면 종료
    if(i % k == k-1) ans.push_back(V[i]); // k번째 사람일 때
    else V.push_back(V[i]);
  }

  cout << "<";
  for(int i = 0; i < n; i++){
    if(i == n-1) cout << ans[i]; //마지막 요소는 콤마 없이 출력
    else cout << ans[i] << ", ";
  }
  cout << ">";
}

STL vector을 이용한 풀이. 매 순간 아직 제거되지 않은 원소는 제일 뒤로 보내고(V.push_back(V[i]))
제거되는 원소는 ans에 저장하고 있다가 ans가 다 채워지면 출력. 공간 복잡도가 O(K*N + N)이라는
단점이 있음.
 */