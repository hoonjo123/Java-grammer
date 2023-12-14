package C12ClassLecture;

public class BankService {
    public static void main(String[] args) {
        bankaccount hun = new bankaccount();
        hun.deposit(15000000);
        hun.withdraw(1000000);
    }
}


class bankaccount {
    private String accountNumber;
    private int balacne;
    //별도의 생성자를 만들지 않으면 매개변수없는 기본생성자가 숨겨져있다.

    //예금
    public void deposit(int money){
        this.balacne += money;
        System.out.println(money + "원 입금되었습니다.");
    }
    //출금
    public void withdraw(int money){
        if(this.balacne < money) {
            System.out.println("잔액이 부족합니다.");
        }else {
            this.balacne -= money;
            System.out.println(money + "원 출금되었습니다");
        }
    }
    public int checkBalance(){
        return this.balacne;
    }
    //checkBalance(계좌잔액확인)

}