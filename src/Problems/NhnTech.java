package Problems;
/**
 * @author lee gil ho
 * 
 * 문제에 대한 재해석 
 * '지폐 종류별 1장 이상씩 환전 하였으면 좋겠다.'
 *   => 최소 모두 1장씩 환전을 해야한다. 
 * 
 * '100N 은 4장, 50N 은 4장만 환전하고 싶다.'
 *     => 100N,50N은 무조건 '4장'환전을 해야한다.
 * 
 * '1N 은 20장 이상 환전하고 싶다.'
 *   => 1N은 최소 20장을 환전해야한다.
 * 
 * '20N부터 1N까지 라운드로빈(화폐단위별 순차적으로 1장씩)으로 환전하며,'
 *   => 라운드로빈 방식으로 진행하며, 모든 단위에게 공평한 순위를 부여한다.
 * 
 * '우리돈 2,000원 이하는 잔돈으로 받고 싶다.'
 *     => 2000천원 이하가 되면 종료한다.
 * 
 * '특정단위 추가하여 100만원이 넘으면 그 단위 제외하고 다시 라운드로빈'
 *   => 돈이 0이하가 되면 다시 계산하기 전 상황으로 가야한다. 
 *
 * 문제를 풀기 위해서 사용한 알고리즘 
 * : 그리디 알고리즘 사용 
 *    => 가장 큰 단위 부터 계산하면서 환전 할 수 있는 지폐의 장수를 제한한다. 
 */
public class NhnTech {
   // 문제에서 사용될 기본단위 
   static int N = 1322;
   // 조건 에서 주어진 최소한의 장수를 빼서 금액을 줄인다. 
   static int total = 1000000 - 100 * N * 4 - 50 * N * 4 - (1 * 20) * N;
   
   /**
    * 라운드 로빈 방식의 메서드 
    * 1.먼저 금액을 뺀다
    * 2.금액에 대한 카운트를 증가시킨다.
    * 3.문제의 조건을 가지고 금액을 검사한다. 
    *   : 0이하가 되면 다시 계산해야한다. 
    * 4. 0이하 -> 금액에 대한 카운트와 현재 금액을 계산 이전의 숫자로 만든다.
    *    0이상 -> 다음의 수에 대한 계산을 진행한다.(1~4)
    * @param N20,N10,N5 : N은 기존의 N을 이용 , 100N,50N은 이미 4장씩 확보된 상태이므로 사용 불필요
    * @param cntN100,cntN50,cntN,cnt20,cntN10,cntN5 :
    */
   public void roundRobin(int N20,int N10,int N5, int cntN100, int cntN50, int cntN,int cntN20, int cntN10, int cntN5) {
      
      
      while(true) {
         
           //-----첫번째 루프
         total -= N20;
         cntN20++;

         if (total < 0) {
            cntN20--;
            total += 20 * N;
         }
         //-----첫번째 루프 끝 
         
         //-----두번째 루프
         total -= N10;
         cntN10++;

         if (total < 0) {
            cntN10--;
            total += 10 * N;
         }
         //-----두번째 루프 끝
         
         //-----세번째 루프 
         total -= N5;
         cntN5++;

         if (total < 0) {
            total += 5 * N;
            cntN5--;
         }
         //-----세번째 루프 끝
      
         //-----네번째 루프
         total -= N;
         cntN++;

         if (total < 0) {
            total += N;
            cntN--;

         }
         //-----네번째 루프 끝
         /**문제의 조건
          * '2천원 이하는 잔돈으로받고 싶어한다'
          *  조건을 이용하여 2천원 이하의 식을 반복문의 break로 사용 
          */
         
         if (total < 2000) {
            break;
         }

      }
      
      //출력값 
      System.out.println("100N :" + cntN100);
      System.out.println("50N :" + cntN50);
      System.out.println("20N :" + cntN20);
      System.out.println("10N :" + cntN10);
      System.out.println("5N :" + cntN5);
      System.out.println("1N :" + cntN);
      System.out.println("잔돈 : " + total);
   }
   
   public static void main(String args[]) {

      NhnTech nhn = new NhnTech();

      // 조건을 제외한 라운드 로빈으로 활용할 변수들
      // N은 미리선언한 N사용
      int N20 = 20 * N;
      int N10 = 10 * N;
      int N5 = 5 * N;

      // 몇장인지 카운트할 변수
      int cntN100 = 4;
      int cntN50 = 4;
      int cntN = 20;
      int cntN20 = 0;
      int cntN10 = 0;
      int cntN5 = 0;
      
      //roundRobin 방식의 메서드 호출
      nhn.roundRobin(N20, N10, N5, cntN100, cntN50, cntN, cntN20, cntN10, cntN5);
      
   }

}