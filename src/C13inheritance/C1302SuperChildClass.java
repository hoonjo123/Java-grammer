package C13inheritance;
//super() : 부모 클래스의 생성자를 의미 ,super키워드 : 부모클래스의미
public class C1302SuperChildClass extends SuperParent {
    int b;
    int a;
    C1302SuperChildClass(){
        super(100);
        a = 30;
        b = 20;
    }

    void display(){
        System.out.println(a); //30 우선권은 자식에게 있다.
        System.out.println(super.a); //100 super를 통해 부모의 변수 값을 불러온것.
        System.out.println(b); //20
    }
    public static void main(String[] args) {
        C1302SuperChildClass sc = new C1302SuperChildClass();
        sc.display();
        System.out.println(sc.a);
        System.out.println(sc.b);
    }
}

class SuperParent{
    int a;
    SuperParent(int a){
        this.a = a;
    }
}
