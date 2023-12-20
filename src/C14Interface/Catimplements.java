package C14Interface;

public class Catimplements implements Animalinterface1{
    @Override
    public void makesound() {
        System.out.println("야옹야오오오오옹");
    }
}


class Catimultiimplements implements Animalinterface1, Animalinterface2{
    @Override
    public void makesound() {
        System.out.println("야옹야오오오오옹");
    }

    @Override
    public String play(String a, String b) {
        return a + "와" + b + "가 놉니다.";
    }
}
