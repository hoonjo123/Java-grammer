package C12ClassLecture;

public class C12_03bankpractice {
    public static void main(String[] args){
        bankaccount1 johoon = new bankaccount1();
        johoon.deposit(112440000);
        johoon.withdraw(13000);

        person myperson = new person();

        myperson.setName("조훈");


    }
}
class bankaccount1 {
    private String accountNumber;

    private int balance;

    public void deposit(int money){
        this.balance += money;
        System.out.println(money + "원 입금되었습니다.");
    }
    public void withdraw(int money){
        if(this.balance < money) {
            System.out.println("잔액이 부족합니다.");
        }else{
            this.balance -= money;
            System.out.println(money + "원 출금되었습니다.");
        }
    }
    public int checkBalance(){return this.balance;}
}

class person {
    private String name = "";
    private int age = 0;
    private String email = "";
    private int password = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()<10) {
            System.out.println("적절한 길이의 이름입니다.");
            this.name = name;
        }else{
            System.out.println("너무 긴 이름입니다.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 19){
            System.out.println("미성년자는 가입할 수 없습니다");
        }else{
            System.out.println("가입하기 적절한 나이입니다");
        }
        this.age = age;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        if(email.contains("@")) {
            System.out.println("올바른 형식의 이메일 주소입니다");
            this.email = email;
        }else{
            System.out.println("올바르지 않은 형식의 이메일 주소입니다.");
        }

    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
