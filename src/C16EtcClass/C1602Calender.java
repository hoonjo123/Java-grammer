package C16EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

public class C1602Calender {
    public static void main(String[] args) {
        //java.util 캘린더는 날짜 관련 클래스
        //1. 캘린더 클래스 - java.util패키지 안에 들어가있다.
        //2. java.time 패키지 안에 들어가 있는 .. LocalDate ~
        // 그냥 LocalDateTime 쓰면됨.

        Calendar time = Calendar.getInstance();
        System.out.println(time.getTime());
        //Fri Dec 22 17:28:44 KST 2023


    }
}
