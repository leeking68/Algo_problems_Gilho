    * 다시 풀어볼 : 파티 
    * (26)추가 리스트 : 1916(Boj1916dij2) , 9465(Boj9464), 1261(Boj1261dp2) 
    * (27)추가 리스트 : 1904(Boj1904dp2), 2139(Boj2139dp) ,2638(Boj2638dfs2)
    * (28)추가 리스트 : 7576(Boj7576bfs2), 11403(Boj11403floyd2)
    * (29)추가 리스트 : 2665(Boj2665dij)
    * (29)추가 리스트 : 2156(Boj2156dp2), 1915(Boj1915dp2)
    * <11월> 
    * (01)추가 리스트 : 11051(Boj11051dp),2362(Boj2362dp2),1012(Boj1012dfs2)
    * (02)추가 리스트 : 1699(Boj1699dp2), 1238(Boj1238dij2)

2017.11.02 ** 목요일 ** Solution - 1238(파티)

풀이방법: 다익스트라



특정한 장소에 **최단시간**으로 모두 갔다오고, 그 중 가장 **오랜시간** 걸린 사람을 찾는 문제이다. 





풀이방식

문제를 읽고 두 가지 풀이가 생각났다. 

- 플로이드
- 다익스트라

처음에는 플로이드로 하면 금방할 것 같아 했는데 , 뭔가 오류가난다. 시간이 초과되고 그러는것 같다.

그래서 플로이드의 조건을 바꾸느냐? 아니면 다익스트라로 다시푸느냐...

다시하는게 빠를것 같아 다익스트라로 풀었다. 



그냥 다익스타로 하기전에 고민을 좀 더 해봤다. 

다시 생각해보면 우리는 X의 지점만 왓다리 갓다리 하면된다. 

문제에서 보면 1 -> 2 가 4인데 이것을 뒤집으면 2 -> 1이된다. 보기에는 다르겠지만 의미는 같다. 

따라서 두 가지의 방식을 사용하면된다. 

일반적인 거리배열을 이용한것과 위처럼 뒤집은 배열을 사용한것 이 결과 두개를 더하면된다. 

또한 우리는 기준이 되는 점을 알고 있기 때문에 기준점을 활용한다. 

dist[i] = map{x}{i} + d[x]를 점화식으로 세운다. 

나머지는 다른 다익스트라와 같다. (우선순위 큐쓰고,, 넣고 와일문 돌리고등.)

함수의 매개변수를 (int x, int{}{}map, int{} dist) 이렇게 받아주고 계산하면된다.(쓴 이유는 아래에 있다)

그리고 우리는 함수를 2번 호출한다. 왜냐하면 우리는 2개씩 배열을 만들것이기 떄문!

안뒤집은 배열, 뒤집은 배열, 안뒤집은 거리, 뒤집은 거리 이렇게 4개를 활용한ㄷ. 

뒤집은 것을 넣게되면 아까 말한것처럼 1->2 를 2->1로 계산할 수 있다. 

출력할때는 

dist[i] + redist[i] 하면된다. 모두 x까지 왕복한 거리들이기 떄문이다. 





: 풀다가 잣다.. 어려웡.



2017.11.02 ** 목요일 ** Solution - 1699(제곱수의 합)

풀이방법: 동적계획법



엄청 시간이 걸렸던 문제다. 

처음에 생각했던 것은 d[2-1] = d[1]+1.. 이런식으로 했었다. 

그런데 여기서 4=2의 제곱이 되니 카운트가 바껴야 하는데 그 포인트를 못구했다. 

그래서 중간에 월드시리즈 7차전을 잠깐보고 다시 문제를 풀었다. 

오늘따라 다저스 타자들이 힘이 없어 보였다..나처럼 ㅜ 



풀이방식

한번 생각해보자 , 

처음에 생각했던 방식 d[N - (N-1)] = d[N-1]+1 에 대해서 한번더 생각해보았다. 

이렇게 하다보면 d[4]일때가 1차적으로 문제가 생기는데 ,

d[4-4] = d[0]+1을 만들어 줘야하기 때문이다. 

자세히 식을 들여다보니 4 =2*2 가 된다. 그렇다면 1은 1x1이 된다는 것을 알 수 있다. 

이제 반복문에 대해서 생각을 해보았다. 

먼저 우리는 동적계획법을 할꺼고 bottom-up 방식을 사용하기 때문에 1부터 n까지 계산을

해줘야 된다. 

for(int i = 1; i < n+1; i++) 로 시작하여

for(int j = 1l; j*j<i; j++)를 만든다.  jxj < i 가 포인트인데 이유는

이렇게 하면 2의 제곱은 4부터 등장하게 되고, 처음 방식을 하면서 문제였었던 8은 

d[8-4] = d[4] +1 = d[0] +1 +1 = 2가 될 수 있다.

따라서 조건에 의해 제곱수의 범위를 잘 나눌 수 있다. (손으로 해보는 것을 추천한다.)

점화식은 간단하다.

d[i] = Math.min(d[i],d[i-j*j]+1)

여기서 답을 놓칠뻔했다. 

왜냐하면 d[i]를 초기화 해주지 않았다. d[i]의 초기화는 모두 d[i]=i로 해야된다.

이유는 모든 수는 1의 제곱으로 구성되어있기때문에, 1의 개수가 최대 개수가 된다. 



: 알고리즘은 항상 어렵다.



2017.11.01 ** 수요일 ** Solution - 1012(유기농배추)

풀이방법: dfs



문제 해석

알고보니 예전에 틀렸던 문제이다, 왜 틀렸을까..

어렵지는 않다. 

상하좌우 움직임 / dfs 만 알면된다.



풀이방식

한번 생각해보자 , 

지렁이는 움직인다. 지렁이가 이동하면서 모든 배추를 보호한다.

=> 다시말해서, 1이 모여있는 구역당 지렁이가 한마리면 된다. 



상하좌우로 움직인다. 

=> x,y가 움직일 두 개의 이동배열을 만든다. 

​	int nx = x + dx[i];

​	int ny = y + dy[i];



1일때 dfs탐색을 시작한다. 

=> map{i}{j}==1이면 탐색을 시작한다. 탐색을 시작할때마다 카운팅한다.

​			for (int i = 0; i < M ; i++) {

​				for (int j = 0; j < N ; j++) {

​					if (map[i][j] == 1&&!visited[i][j]) {

​						visited[i][j] = true;

​						dfs(i, j);

​						cnt++;

​					}

​				}

​			}

​			

방문했던것은 방문하지 않는다. (안하면 스택오버플로우)

=> 각 칸당 boolean 타입의 visited배열을 만들어 방문하면 true바꿔준다.

if (isRange(nx, ny)&& !visited[nx][ny]&&map[nx][ny]==1) {

​				visited[nx][ny] = true;

​				dfs(nx,ny);

​			}

​			

이게 전부다. 그리고 재귀해주자,



: 예전엔 왜 틀렸을까.. 중간에 10분정도 오류를 못찾았다.. 이유는..예제를 카운팅하면서 6으로 숫자를 세가지고

  왜 5가 안되는거지 하면서 고민했다. 맞다 바보다..



2017.11.01 ** 수요일 ** Solution - 11051(이항 계수2)

풀이방법: 동적계획법

문제 해석

이항 계수 문제이다. 고등학교때 수학을 배웠다면, 쉽게 생각할 수 있다.

단 .. 기억을 하고있다면 ...

역시 나는 기억하지 못하고 있었다(그래도 수학은 좀 했다 **신승범짱**!)

네이버 검색을 해서 이항계수의 공식을 보는데 이렇게 풀면 되겠구나 하는게 있었다.

n 	     n		n+1

​	+         = 

k+1       k		k+1



이 공식을 보고 풀이를 시작했다.



풀이방식

한번 생각해보자 , 

- 우리는 n과 k를 안다. 
- 두가지로 나눠져있다.

=> 두개의 경우로 나눠서 합치자! 

순열,조합을 풀다보면 항상 재귀를 떠올리게 된다. 

이것 또한 재귀적 방법으로 풀면된다. 또한 메모이제이션을 통해 효율성을 높여주면된다.

그리고 공식에서는 우측이 n+1이지만, 우리는 굳이 저렇게 할필요없다. 모든 항목을 -1해주자

이제 끝이다. 뽑기만 하면된다. 

그리고 베이스 케이스 설계를 해야되는데, 한 번 생각을 해보자, 뽑을때마다 각 케이스 별로 -1씩을 해줄것이다. 

dp {n}[k} = solution(n-1,k-1) + solution(n-1,k);  

이렇게 식을 세우게 되면 어느순간 k==n 또는 k==0이된다. 수학시간에 배웠다. nCn =1 , nC0 = 1이다.

그러면 우리는 베이스 케이스를 설계 할 수 있다.

if(n==k||k==0) return 1;

이렇게 설계하면 될 것이다.

그리고 메모이제이션

if(dp{n}{k}>0) return dp{n}{k}

이제 끝이다 ! 

이렇게 3줄이면 끝난다. 검증을 하고 싶다면 예제를 손으로 하면된다. 5분도 안걸린다. 



: 나이를 먹더니 수학을 다 까먹은 것 같다..



2017.10.31 ** 화요일 ** Solution - 1915(가장 큰 정사각형)

풀이방법: 동적계획법

문제 해석

기억난다.. 처음 풀었던 당시에 엄청 끙끙..거렸다는 것을..
알고보면 상당히 쉬운 문제이나 , 당시에 그 아이디어까지 가는데
머리가 좋지 않아서 2시간정도 걸렸던것 같다..

그 당시 풀이보다 시간복잡도가 반이나 줄어서 이렇게 포스팅하게 되었다. 
(더 익숙해졌길래 의아했는데 , 알고보니 카카오 모의테스트 였구나..)

풀이방식

처음 이 문제를 접했을때는, 무식하게 완탐하려고했다.. 그렇게 시간이 흐르고 흘러
코드를 보니 엄청 더럽고, 내가 잘못하고 있다는 것을 알게되어 생각을 더하게 되었다. 

문제를 잘보면 직관적으로 1로 이루어진 4각형이 보인다. 우리는 저 크기를 골라 내야한다. 

처음에 시도했던 방법은 왼쪽위의 끝점(0,0)부터 계산해야하나 했다. 그런데 그렇게 하다보면

어떻게 사각형을 판별해야하는지 의문이 생긴다. 

그래서 그 다음으로는 매핑되는 점을 선택해서 돌려보았다. 뭔가 사각형으로 마지막점까지 갈 수가 있어졌다. 

그렇다면 어떻게 계산을 할지 고민해보았다. 예제에 있는 사각형을 보고 좀 전에 사각형 판별법과 같이 생각해보면

판별되는 숫자를 1로 감싸고 있다. ?!-> 아 변이 2다 ..그렇다면 1은 변이 1로 생각할 수 있겠다!

그렇다면 판별되는 숫자를 2로 바꿔주면 2가 될것같다. 

다시 해석해보자면 판별되는 숫자를 기준으로 그 숫자와 나머지 3개가 같으면 +1로 증가시켜준다(정사각형이기때문에!)

하지만 잘생각해보면 0에서 -> 1도 만들어야하고 , 각각 한칸당 넓이가 1인 정사각형이다. 

그래서 3개의 공간 ( 왼쪽위 , 바로위 , 왼쪽)을 비교해서 가장 작은 수를 +1시킨다.(그래야 주위에 0이 잇을때 1인 정사각형을 만듬)
 ->map[i][j] = Math.min(map[i - 1][j - 1], Math.min(map[i - 1][j], map[i][j - 1])) + 1;
그렇게 판별되는 정사각형의 넓이를 계산하여 최대 사각형의 넓이 변수 (maxCnt)와 비교하여 마지막에 출력한다.
 ->maxCnt = maxCnt < map[i][j] ? map[i][j] : maxCnt;

: 좀 마지막에 시간이 걸렸다.. 오류가 계속났다. 왜 그런지 살펴보니 maxCnt*maxCnt가 답인데, 그냥 maxCnt만 출력했다..주의하자..


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

11. 10. 24 **,아직도 화요일**  Update list

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



