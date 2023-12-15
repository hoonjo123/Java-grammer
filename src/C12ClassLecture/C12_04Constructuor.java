package C12ClassLecture;

public class C12_04Constructuor    {
    public static void main(String[] args) {

        Calender calender1 = new Calender("2023","12","24");
        Calender calender2 = new Calender("2023","12","24");



    }
}

class Calender {

    Calender() {

    }

    Calender(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    Calender(String year) {
        this.year = year;
    }


    Calender(String year, String month) {
        this.year = year;
        this.month = month;
    }


    private String year = "";
    private String month = "";
    private String day = "";

}
