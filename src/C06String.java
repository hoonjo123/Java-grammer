import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {
        //참조자료형 : 기본자료형을 제외한 모든 자료형
        //wrapper class : 기본형 타입에 없는 다양한 기능을 지원하기 위한 클래스
        //int와 Integer간의 형변환
//        int a = 10;
//        Integer b = new Integer( 20);
//
//        int c = b;//오토 언박싱 Integer -> int 형변환
//        int d = b.intValue(); //수동 언박싱 Integer -> int 형변환
//        Integer e = a; //오토 박싱
//        Integer f = Integer.valueOf(a);

        //String 과 Int의 형변환
//        int a = 10;
//        String st_a = Integer.toString(a); //"10"
//        int c = Integer.parseInt(st_a); // 문자 10을 숫자 10으로
//
//        List <Integer> list_a = new ArrayList<>();//참조자료형에 원시자료형을 담을때는 Wrapper class를 써야한다. ex)컬렉션프레임워크(List,set...)
//        list_a.add(10);
//        list_a.add(20);
//        list_a.add(30);
//        System.out.println(list_a); //10,20,30
//
//        String myst1 = new String("hello"); //면접관 단골질문ㄴ!
//        String myst2 = new String("hello");
//        String myst3 = "hello";
//        String myst4 = "hello";
//        String myst5 = myst1;
//        System.out.println(myst1 == myst2); //false
//        System.out.println(myst1 == myst3); //false
//        System.out.println(myst3 == myst4); //true
//        System.out.println(myst1 == myst5); //true
//
//        System.out.println(myst1.equals((myst2))); //true
//        System.out.println(myst1.equals((myst3))); //true
//        System.out.println(myst3.equals((myst4))); //true
//        System.out.println(myst1.equals((myst5))); //true
//
//        List<String> myList = new ArrayList<>();
//        myList.add("hello");
//        myList.add("hello2");
//
//        List<String>myList2 = myList;
//        myList2.add("hello myList2");
//        myList.add("hello myList1");
//        System.out.println(myList2);

        //문자열의 길이는 length();
//        String myst = "hello";
//        System.out.println(myst.length()); //5
//
        //indexof : 특정 문자열의 위치 반환 // 특정 문자열이 반복 될때 앞에 있는 문자열을 반환한다.
//        String myst2 = "hello java";
//        System.out.println(myst2.indexOf("java")); //6
//        int myst_index = myst2.indexOf("java");
//        System.out.println(myst2.indexOf("java")); //6
//
        //contains : 문자열에서 특정 문자열이 포함되어 있는지 여부를 boolean으로
//        String myst3 = "helloworld java ";
//        System.out.println(myst3.contains("java"));
//
        //charAt : 문자열에서 특정위치의 문자(char)를 리턴
//        String a = "helloworld java";
//        char myChar = a.charAt(1);
//        System.out.println(a.charAt(3)); //3번째 있는 문자는 l

        //반복문, charAt, length 를 활용한 st안에 문자 a의 개수 ㅋㅋㅋ
//        String inputString = "asdfasdfasdfasdf";
//        char target = 'a';
//        int count = countOccurrences(inputString, target);
//
//        System.out.println("'" + target + "'가 문자열에 " + count + "번 등장합니다.");
//    }
//
//        private static int countOccurrences(String str, char target) {
//            int count = 0;
//            for (int i = 0; i < str.length(); i++) {
//                if (str.charAt(i) == target) {
//                    count++;
//                }
//            }
//            return count;

//
//        String st = "abcdefabaadf";
//        char myChar = st.charAt(1);
//            System.out.println(myChar);
//            int count = 0;
//            for(int i=0; i<st.length();i++){
//                if(st.charAt(i) == 'a'){
//                    count ++;
//                }
//            }
//        System.out.println(count);
//
//            //substring(a,b) : a이상 b미만의 index를 자른다.
//        String str1 = "Hello world";
//        System.out.println(str1.substring(0,5));
//        System.out.println(str1.substring(6,str1.length()));


//        단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다
//        String s = "abcde";
//
//        if(s.length()%2==0){
//
//        }

        //trim 양쪽에 있는 공백
//        String a ="                                                                 helloworld          ";
//        String new_trimSt = a.trim();
//        System.out.println(new_trimSt);
//
//        String a = "Hello";
//        String a1 = a.;
//        String a2 = a.;
////        toUpperCase/toLowerCase
//        String s1 = "hello";
//        String s2 = s1.toUpperCase();
//        String s3 = s1.toLowerCase();
//        System.out.println(s2);
//        System.out.println(s3);
//
//        String a = "hello";
//        a += "world";
//        a += "world";
//        a += "world";
//        a += "world";
//        a += "world";
//
//        System.out.println(a);
//
////        char 에서 String 으로 형변환하기
//        char ch1 = 'a';
//        String st1 = Character.toString(ch1);
//        String str = "01abc123한글123";
////       String str = "01abc123한글123" 알파벳만 빼고 문자를 str2에 새롭게 담아줘
//        String str2 = "";
//        for(int i=0; str.length()>i;i++){
//         str.charAt(i);
//         if(str.charAt(i)>='a' && str.charAt(i)<='z'){
//         }else {
//             System.out.println(str.length());
//         }
//        }

//        문자열 my_string과 문자 letter이 매개변수로 주어집니다. my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
//     String my_string = "abcdef";
//        '특정문자제거하기
        //replace 어떤 문자를 뭘로 대체할건지 (a,b) a문자를 b문자로 대체한다.
//        String st1 = "Hello world";
//        String st2 = st1.replace("world","java");
//        String st3 = st1.replaceAll("world","java");
//        System.out.println(st3);

//        String str = "01AAAAAaBbBc123한글123";
//        String str2 = str.replaceAll("[a-z]","");//알파벳을 제거한 문장 출력하기
//        System.out.println(str2);

//        String str3 = str.replaceAll("[가-힇]","");
//        System.out.println(str3);
//        String str4 = str.replaceAll("[0-9]","");
//        System.out.println(str4);
//        String str5 = str.replaceAll("[A-za-z]","");
//        System.out.println(str5);//알파벳 전체 , 대소문자 상관없이 전부다.

//        String str6 = str.replaceAll("[A-Za-z0-9]","");
//        System.out.println(str6); //알파벳전체와 숫자까지 전부

        //Pattern 클래스
//        boolean matcher = Pattern.matches(".*[a-z].*","한글helloworld한글");
//        System.out.println(matcher);

//        전화번호 검증
//        boolean matcher2 = Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$","010-8625-3122");
//        System.out.println(matcher2);

//        이메일검증
//        boolean matcher3 = Pattern.matches("^[a-z0-9]+@[a-z]+.com$","johoon030@gmail.com");
//        System.out.println(matcher3);
//        split
//        String a = "a:b:c:d";
//        String[] stArr = a.split(":");
//        System.out.println(Arrays.toString(stArr));
//        String b = "a  b c d";
//        String[] stArr2 = b.split(" ");
//        System.out.println(Arrays.toString(stArr2));
//        String[] stArr3 = b.split("\\s+");
//        System.out.println(Arrays.toString(stArr3));

        //isEmpty와 null의 구분
//        String st1 = null;
//        String st2 = "";
//        System.out.println(st1==null); //true
//        System.out.println(st2==null); //false
//        System.out.println(st2.isEmpty());//true
//        System.out.println(st1.isEmpty()); //error - null pointer exception 발생
//
//        String[] arr = new String[5];
//        arr[0] = "hello";
//        arr[1] = "world";

//
//    }
//}
//
