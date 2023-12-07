import java.util.Scanner;

public class C06practiceday1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("비밀번호를 입력해주세요");
//            int a = sc.nextInt();
//            int password = 1324;
//            if (a == 1324) {
//                System.out.println("문이열렸습니다");
//                break;
//            } else {
//                System.out.println("비밀번호가 틀렸습니다.");
//            };
//
//        }
//
//        System.out.println("내 마음속의 비밀번호를 말해줘");
//        int b = sc.nextInt();
//        int password = 486;
//        if (b == 486){
//            System.out.println("정답이니 상을줘야겠구나");
//        }else{
//            System.out.println("틀려?내맘을 아직도몰라?");
//        };
//        while (true) {
//            System.out.println("자동차번호를 입력해주세요");
//            int c = sc.nextInt();
//            int carnumber = 6756;
//            if (c == 6756) {
//                System.out.println("정산요금은");
//                break;
//            } else {
//                System.out.println("ㅋ다시알아오세요ㅋ");
//            }
//
//        }
        int plus = 0;
        for(int i=0;i<21;i++){
            if(i%2==0){
                plus += i;
            }
        }
        System.out.println(plus);
    }
}