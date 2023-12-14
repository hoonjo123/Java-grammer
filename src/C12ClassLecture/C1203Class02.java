package C12ClassLecture;

public class C1203Class02 {
    public static void main(String[] args) {
        Person myPerson = new Person();
        //
    //        myPerson.name = "조훈";
    //        myPerson.age = 28;
    //        myPerson.email = "johoon030@gmail.com";
    //        Person.person_total = 1;
    //        System.out.println(myPerson.whoIs());
        myPerson.setName("조훈");
        myPerson.setName("가나다라마바사아자차카타파하하하하하");
        System.out.println(myPerson.getName());

        myPerson.setAge(8);
        myPerson.setAge(28);
        System.out.println(myPerson.getAge());

        myPerson.setEmail("johoon@gmail.com");
        myPerson.setEmail("johoongmail.com");
        System.out.println(myPerson.getEmail());
//
//        Person myPerson2 = new Person();
//        //
//        myPerson2.name = "죠니";
//        myPerson2.age = 30;
//        myPerson2.email = "kcj_jo-hoon@naver.com";
//        Person.person_total = 1;
//        System.out.println(myPerson2.whoIs());
//
//        System.out.println(myPerson2.getAge());
//        System.out.println(myPerson.getEmail());
    }
}


class Person {//public 은 한개만 //public 은 다 접근가능
    //default 같은 폴더 안에서 접근가능// 지금 class는 default값이다
    //private
    private String name = "";
    private int age = 0;
    private String email = "";
    private int password = 0;
    //setter, getter 패턴

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()<10) {
            System.out.println("적절한 이름입니다");
            this.name = name;
        }else{
            System.out.println("이름이 너무 긴데요?");
        }
    }

    public void setAge(int age) {
        if(age < 20) {
            System.out.println("나이가 너무 어립니다");
        }else{
            System.out.println("적절한 나이입니다.");
            this.age = age;
        }
    }

    public void setEmail(String email) {
        if(email.contains("@")) {
            System.out.println("올바른형식입니다");
            this.email = email;
        }else{
            System.out.println("올바르지 않은 형식입니다.");
        }
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    //age 20세 미만 세팅 안되도록 -> 나이가 너무 어립니다
    //email @가 없으면 세팅 안되도록 -> 형식이 잘못됫습니다
    //name 은 10글자 이하로만 => 이름이 너무 깁니다.
//    객체 2개 세팅

//    public 이름세팅(String name){
//        if(name.length() < 10){
//            System.out.println("이름세팅 어렵습니다");
//        }else{
//            this.name = name;
//            System.out.println("이름이 너무 깁니다");
//        }
//    }
//    public 이름리턴(){
//        return this.name;
//    }
//    String whoIs() {
//        return "이름은 " + this.name + " 나이는 " + this.age + "입니다.";}

    Integer getAge() {
        return this.age;}

    String getEmail() {
        return this.email;}



}