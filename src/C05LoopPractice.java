public class C05LoopPractice {
    public static void main(String[] args) {
        // 짝수의 합 계산하기
        //1~20까지 짝수의 합을 구해서 출력해봐
//        int plus = 0;
//        for(int i=0;i<21;i++){
//            if(i%2==0){
//                plus += i;
//            }
//        }
//        System.out.println(plus);

        // 숫자뒤집기
        //int로만 작성해보자
        // 1,2,3,4가 주어졌다 가정했을 때 특정변수에 4,3,2,1이 되도록  hint %10, %10 int num = 1234; , int result 4321;
//
//        int num = 1234;
//        int result = 0;
//        while(true){
//            int temp = num % 10;
//            result = result * 10 + temp;
//            num /= 10;
//            if(num==0){
//                break;
//            }
//        }
//        System.out.println(result);
//
//
//        // 최대공약수구하기
//        int a =24; int b = 36;
//        int answer = 0;
//        int Max = 0;
//        for(int i =1; i<=24; i++){
//           if (a%i==0 && b%i==0){
////               System.out.println(i);
//               if (Max < i) Max = i;
//           }
//        }
//        System.out.println(Max);

        //라벨문 활용1, target이 matrix의 i,j번째 배열에 있는지 출력하기,target을 찾으면 반복문 전체종료/처음부터 끝까지 뒤지셈
//        int[][]matrix = {{1,2,3,4},{5,6,7},{8,9},{10,11,12,13,14}};
//        int target = 11;
//        l1:
//        for(int k=0; k<matrix.length; k++){
//            for(int j=0; j<matrix[k].length; j++){
//                if (matrix[k][j] == target){
//                    System.out.println(k + "," + j + "번째에 있습니다.");
//                    break l1;
//                }
//            }
//        }
        //[약수찾기] 1~20 이 있을 때, 이 중에 약수가 5개 이상인 숫자중에 가장 작은 값을 구하시오. 불필요한 추가반복은 금지.
      int answer = 0;
      for(int i =1;i<21;i++){
          int count =0;
          for(int j=1;j<=i;j++) {
              if (i % j == 0) {
                  count++;
              }
          }
          if(count>=5){
              answer = i;
              break;
          }
      }
        System.out.println(answer);
    }
}