```
* 다시 풀어볼 : 파티 
* (26)추가 리스트 : 1916(Boj1916dij2) , 9465(Boj9464), 1261(Boj1261dp2) 
* (27)추가 리스트 : 1904(Boj1904dp2), 2139(Boj2139dp) ,2638(Boj2638dfs2)
* (28)추가 리스트 : 7576(Boj7576bfs2), 11403(Boj11403floyd2)
* (29)추가 리스트 : 2665(Boj2665dij)
* (29)추가 리스트 : 2156(Boj2156dp2), 1915(Boj1915dp2)
* <11월> 
* (01)추가 리스트 : 11051(Boj11051dp),2362(Boj2362dp2),1012(Boj1012dfs2)
* (02)추가 리스트 : 1699(Boj1699dp2), 1238(Boj1238dij2)
* (03)추가 리스트 : 9095, 1463, 11726, 11727
```

2017.11.03 ** 금요일 ** Solution - 11726,11727 (2Xn타일링,2)

풀이방법: 동적계획법

<br>

개인적으로 처음에 해맷다 , 일단 그리는게 너무 싫다..

돌리고 돌리고, 이상한 그림도 나오고..

마음잡고 다시 풀었을때

추가되는 것에 집중해봤다. 

예제로 2x4까지 그리면 충분히 규칙을 찾을 수 있다. 

<br>

타일의 종류는 2개가 있다. 

그리고 이것을 마지막에 배치할때 두 가지 방법이 있다. 

마지막에 일단 배치시켜보자 

앞에는 2x(N-1) , 2x(N-2) 구역만 챙기면 된다.

즉, n-1 번째에는 1x2가 하나씩 더 붙는거고 

n-2번째에는 2*1이 두개가 붙는다. 

<br>

끝이다. 

```
	dp[0] = 1;
		dp[1] = 1;
		
		for(int i = 2; i < n+1; i++) {
			
		dp[i] = dp[i-1] + 2*dp[i-2];
	    dp[i] %= 10007;
			
		}
```

<br>

**—————————————————————————————————————**

