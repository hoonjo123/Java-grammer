import java.util.Scanner;
//
//public class C04Statements {
//    public static void main(String[] args) {
        //도어락 비밀번호 1234 , 스캐너를 써서 사용자의 input값을 int로 받아서 만약에 비밀번호와 사용자의 input이 일치하면
        //"문이 열렸습니다." 일치하지 않으면 "비밀번호가 틀렸습니다."를 출력해보자
//        Scanner a10 = new Scanner(System.in);
//        System.out.println("비밀번호를 입력해주세요.");
//        int a = a10.nextInt();
//        int password = 1234;
//        if (a == 1234){
//            System.out.println("문이 열렸습니다");
//        }else{
//            System.out.println("비밀번호가 틀렸습니다.");
//        };

//        Scanner a10 = new Scanner(System.in);
//        System.out.println("비밀번호를 입력해주세요.");
//        String a = a10.nextLine();
//        String password = "0321";
//        if (a.equals(password)){
//            System.out.println("문이 열렸습니다");
//        }else{
//            System.out.println("비밀번호가 틀렸습니다.");
//        };
//
//
        //묵시적 타입변환
        //a : 97, A : 65 ,
        //사용자에게 알파벳을 아무거나 입력받고, 그 알파벳이 대문자인지 소문자인지 판별
//        "a" -> 'a'
//        System.out.println("알파벳을 입력하면 대소문자를 구별해드릴게요");
//        Scanner sc = new Scanner(System.in);
//        char johoon = sc.nextLine().charAt(0);
//        if (johoon >= 'a' && johoon <= 'z'){
//            System.out.println("소문자입니다");
//        }else if(johoon >= 'A' && johoon <= 'Z'){
//            System.out.println("대문자입니다.");
//        }else{
//            System.out.println("알파벳이 아닙니다");
//        }
//
        //버스카드
        //내 돈이 얼마 있는지를 입력
        //버스요금이 1500원이라고 가정
        //가진돈이 더 적으면 탑승할 수 없습니다.
        //더 많으면 정상처리 출력
//        //도난여부 boolean 설정 (입력x)
//        Scanner sc = new Scanner(System.in)
//        int buscard = 30000;
//        boolean IsStolen = false;
//        if(buscard >= 1500 && IsStolen==false){
//            System.out.println("정상처리");
//        }else{
//            System.out.println("탑승할 수 없습니다.");
//        }
        //사진찍어둔거 꼭 읽어보기
        //삼항연산자
//
//        Scanner a10 = new Scanner(System.in);
//        System.out.println("비밀번호를 입력해주세요.");
//        String a = a10.nextLine();
//        String password = "0321";
//        if (a.equals(password)){
//            System.out.println("문이 열렸습니다");
//        }else{
//            System.out.println("비밀번호가 틀렸습니다.");
//        }
//
//        String result = a.equals(password)? "문이 열렸습니다" : "비밀번호가 틀렸습니다";
////
        //마이머니 = 10000
        // 택시요금 10000원
        // 버스요금 3000원
        // 킥보드 2000원
        // 걸어가기 0원

//        Scanner sc = new Scanner(System.in);
//        int InMyPocket = 0;
//        if (InMyPocket >= 10000){
//            System.out.println("택시 요금은 만원입니다. 택시를 타셈요");
//        }else if(InMyPocket < 10000 && InMyPocket >= 3000){
//            System.out.println("너는 돈이 좀 모라자구나.. 버스를 타셈요");
//        }else if(InMyPocket < 3000 && InMyPocket >= 2000){
//            System.out.println("너는 그냥 킥보드 타셈 ");
//        }else{
//            System.out.println("너는 그냥 걸어가라 ㅋ");
//        }

        // switch 고객센터 출력 예제
//        원하시는 번호를 입력해주세요
//                1. 대출서비스입니다 2. 예금 3.적금
//            0.상담사연결입니다. 그외 : 잘못누르셨습니다.
//
//        System.out.println("원하시는 번호를 입력해줘");
//        int a = sc.nextInt();
//        switch(a){
//            case 1:
//                System.out.println("대출서비스입니다.");
//                break;
//            case 2:
//                System.out.println("예금입니다");
//                break;
//            case 3:
//                System.out.println("돈도 없으면서 무슨 적금이야입니다");
//                break;
//            case 0:
//                System.out.println("상담사연결데스");
//                break;
//            default :
////                System.out.println("잘못누름");
////                break;
////            }
////
//        }
//    }
//}
