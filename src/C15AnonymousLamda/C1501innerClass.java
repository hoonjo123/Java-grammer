package C15AnonymousLamda;

public class C1501innerClass {

    //static 내부 클래스다.
    //이 클래스는 C1501innerClass의 정적멤버처럼 활용이 된다.
    static class staticInnerClass{
        private int data;
        void display(){
            System.out.println("data값은" + data + "입니다.");
        }
    }
    public static void main(String[] args) {
        //C1501inner.staticInnerClass
    }
}


