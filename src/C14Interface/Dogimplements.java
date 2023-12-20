package C14Interface;

public class Dogimplements implements Animalinterface1{
    @Override
    public void makesound() {
        System.out.println("멍멍");
    }
}

class Dogimultiimplements implements Animalinterface1, Animalinterface2{
    @Override
    public void makesound() {
        System.out.println("멍멍");
    }

    @Override
    public String play(String a, String b) {
        return a + "와" + b + "가 놉니다.";
    }
}

