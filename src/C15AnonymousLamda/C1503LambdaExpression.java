package C15AnonymousLamda;

public class C1503LambdaExpression {
    public static void main(String[] args) {
        //실행문 두개 이상일 때에는 return 필요하다
        //실행문이 한개일때는 return 생략가능
        //매개변수를 순서로 인지하므로, 타입을 지정해줄필요는 없다.
        LambdaInterface lambda = (i,j,k) -> {
            String answer = i+j;
            return answer;
        };
        System.out.println(lambda.makeString("hello","java",0));
    }
}
interface LambdaInterface{
    String makeString(String a, String b, int c);
}