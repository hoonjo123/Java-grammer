package C16EtcClass;

public class C1605EnumMain {
    public static void main(String[] args) {
        EnumStudents s1 = new EnumStudents();
        s1.setName("hong1");
        s1.setClassGrade(classGrade.A1);


        EnumStudents s2 = new EnumStudents();
        s1.setName("hong2");
        s1.setClassGrade(classGrade.a2);

        EnumStudents s3 = new EnumStudents();
        s1.setName("hong3");
        //타입이 여전히 String 타입이므로, 클래스변수를 사용하지 않을수도 있다.
        s1.setClassGrade(classGrade.a3);


        EnumStudents s4 = new EnumStudents();
        s4.setName("hong3");
        //String으로 세팅 불가. -> 타입까지 체크하므로
        //Enum타입 사용시에는 static final 변수와 동일한 방법으로 사용
        s4.setRole(Role.GENERAL_USER); //문자는 아니지만 문자형태의 어떤 value가 들어간당.
        s4.setStatus(Status.MASTER);
        System.out.println(s4.getRole().getClass());
        //enum값 내부에는 저장된 순서대로 0부터 인덱스값이 내부적으로 할당되어 있다.
        System.out.println(s4.getStatus().ordinal()); //인덱스번호? Master가 0번째라서 0으로 출력

    }
}

class classGrade{
    static final String A1 = "first_grade";
    static final String a2 = "second_grade";
    static final String a3 = "third_grade";
}

enum Role{
    //각 열거형 상수는 콤마로 구분하고, 상수목록끝에는 세미콜론으로 마무리.
    GENERAL_USER, ADMIN_USER, SUPER_USER;
}

enum Status{
    MASTER, GOLD, SILVER, BLONZE;
}


class EnumStudents {
    private Role role; //String 타입이 아닌 role타입을 신규로 지정했다.

    private String name;
    //소속반
    private String classGrade;

    private Status status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassGrade() {
        return classGrade;
    }

    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
