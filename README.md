    * 다시 풀어볼 : 파티 
    * (26)추가 리스트 : 1916(Boj1916dij2) , 9465(Boj9464), 1261(Boj1261dp2) 
    * (27)추가 리스트 : 1904(Boj1904dp2), 2139(Boj2139dp) ,2638(Boj2638dfs2)
    * (28)추가 리스트 : 7576(Boj7576bfs2), 11403(Boj11403floyd2)
    * (29)추가 리스트 : 2665(Boj2665dij)

2017.10.29 **,주말의 끝 일요일 ** Solution - 2665(미로 만들기)

풀이방법: 다익스트라

문제 해석

다익스트라의 일반적인 문제와 스타일이 비슷하다.
각 칸마다 지금까지 검은 벽을 지나온 개수들을 카운트 해준다. 최소화로 말이다.

풀이 방식

  1. 초기화를 진행한다. dist의 초기 값은 0으로 셋팅한다. 
  2. 우선순위 큐를 설계한다. 값의 비교가 필요하니, 3개의 값을 가진 클래스를 설계한다. 
  3. 큐에 초기화가 적용된 출발 노드를 삽입한다.
  4. 동작배열을 활용하여 상하좌우를 검색한다. 
  5. 조건을 나눈다. 1) 빈칸 2)검은색칸 이렇게 나눠서 계산한다.
  6. 빈칸일경우 이전칸과 지금칸중에 가장 검은색칸을 적게 지나온 것으로 셋팅한다.
  7. 검은칸일경우 지금의 칸을 지나는게( +1) 현재칸이 지나온 검은색칸보다 작다면 셋팅한다.
  8. 현재의 칸에 대한 방문배열값을 true로 바꾼다.
  9. while이 끝나고 값을 출력한다.

2017.10.27 **,드디어 금요일** Solution - 2638 (치즈 녹이기 ) 

풀이방법 : dfs(알면 쉽다)

2017.10.28 **,주말의 시작 토요일 ** Solution - 11403(경로 찾기)

풀이방법: floyd

문제 해석

중간의 경로로 갈 수 있다면 , 1로표시 !! —> 플로이드 힌트 
*플로이드는 각 정점까지 최단거리를 구할때 사용된다.

풀이 방식

  1. 먼저 플로이드 알고리즘을 설계한다. 
  2. 중간의 경로를 이용하여 경로를 갈 수 있다면 , 1로 치환한다.
  3. 조건을 먼저 걸어보자 map[i][j] == 0 (경로가 없다는 것이다. 우리는 이것만 대하여 검사를 할것이다.)
  4. map[i][k] + map[k][j] == 2 현재의 맵에 값들이 1이기 떄문에 양쪽의 경로 (k를 통하여 j로가는)를 더하게 되면 2가 된다.
  5. 4번의 조건을 만족하면 경로가 있다는 것이므로 map[i][j]를 0에서 1로치환한다.
 
2017.10.27 **,드디어 금요일** Solution - 2638 (치즈 녹이기 ) 

풀이방법 : dfs(알면 쉽다)


문제 해석 
2면이상 공기와 접촉 -> 녹음
내부 공기는 그냥 취급안함        
      => 1 + 2번을 보고 dfs로 확정 , Why?  겉에 있는 0만 탐색하면됨 !! 

풀이 방식 

  1. 각각의 공기를 이동배열을 활용하여 상하좌우 체크
  2. next X , next Y 의 좌표의 값이 1 —> 해당 좌표 값 ++
  3. 만약 0이라면 dfs(next X , next Y) —> dfs시작할때 -1처리 
  4. 0이 없을때까지 탐색
  5. reMap()에서 체크해보자 , 1 또는 2를 가진 값은 1면이하의 공기만 만나기 때문에 지워지지 않음
     5)의 값을 —> 원래 공기 값으로 치환 
  6. 그 외의 값 ( >3 , -1 … 들은 치즈가 녹거나 그냥 공기이기 때문에 공기 값인 ‘0’으로 치환
  7. 여기서 5)할때마다 int check++; 왜냐하면 현재 치즈가 몇개있는지 체크 필요
  8. reMap을 check==0 ( 치즈 없다잉 ) 이면 true를 반환하는 boolean 타입의 메소드로 설계
  9. for(int i = 0; !reMap(); i++) 에서 9)처럼 true를 반환하면 종료하고 i 출력
  10. 주의 할것 , 처음에 reMap() == 0 으로 했는데  , dfs하기도전에 0이 반환되서 계속 1값출력;

2017. 10. 24 **,아직도 화요일**  Update list

            1. Boj 1309 동물원  : *동적계획법* 

               : code name - boj1149dp2

               갑자기 생각나서 풀어보게된 문제이다. 아주 간단한 동적계획법 문제이다. 

               사자를 배치할때의 경우 크게 두가지로 나뉘게 된다. 

               1) N번째칸에 사자가 있는 경우

                이 같은 경우에는 N번째칸의 배치에따라 N-1번째의 칸의 배치가 결정된다. 예를들어.. 왼쪽에 있다면 오른쪽으로 or 없거나 이렇게 경우를 나눌 수 있다.

               2) N번째칸에 사자가 없는 경우 

               이 같은 경우에는 무엇이 오는 상관이없다.

               ​

               그렇다면 식을 세워보도록 하자 , 

               배열은 dp[n][3) 으로 만든다. 

               dp<n><0>은 사자가 없는 경우

               ​	=> dp<n-1><0>+dp<n-1><1>+dp<n-1><2>

               dp<n><1>사자가 왼쪽인 경우 

               ​	=> dp<n-1><0> + dp<n-1><2>

               dp<n><2>사자가 오른쪽인 경우

               ​	=> dp<n-1><0>+ dp<n-1><1>

               이 세가지의 경우를 반복한후 , 3개의 케이스를 더해서 마무리한다.

               ​

            2. Boj 1149 RGB거리 : *동적계획법*

               : code name - boj1309dp2

               1번문제와 같이 경우를 나눠서 푸는 문제이다. 

               조건을 살피면 RGB 세가지의 색깔로 칠할 수 있으며,

               이웃한거끼리는 다른 색깔이여야한다. 

               먼저, 주어진 케이스가 작으므로 손으로 작성해본다. 

               RGB,RGR,RBG,RBR

               GBR,GBG,GRB,GRG

               BRG,BRB,BGR,BGB

               쓰다가 보면 이런 생각이든다(?) 뭔가 반복적인데, 앞에 써져있는것에 따라 달리지는구나! 

               그렇기때문에 앞에 칠한 색이 R , G , B 일때의 3가지 경우로 나누어 식을세워 계산한다. 

               arr<1001><3> ,dp<N><3>앞에는 N의 숫자이며, 뒤에는 RGB 3가지의 경우를 담을 수 있다는 뜻이다. 

               식은 코드참조*

               그리고 마지막에는 Math.min 또는 최소값추출 메소드를 만들어 활용한다. 3개의 경우중 가장 작은 경우를 선택하면 된다.


             ​



