package C13inheritance;

public class C1304Protectedcase  {
    //public 은 프로젝트 전체에서 접근가능
    //protected 패키지를 벗어나더라도 상속관계인 경우면 접근가능
    //default : 피키지 내에서만 접근가능
    //private :  클래스 내에서만 접근가능

    private String st1 = "hello world";
    String st2  = "hello world";
    protected String st3 = "hello world";
    public String st4 = "hello world";
    public static void main(String[] args) {

    }
}
