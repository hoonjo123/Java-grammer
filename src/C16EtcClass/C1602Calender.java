package C16EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Locale;

public class C1602Calender {
    public static void main(String[] args) {
        //java.util 캘린더는 날짜 관련 클래스
        //1. 캘린더 클래스 - java.util패키지 안에 들어가있다.
        //2. java.time 패키지 안에 들어가 있는 .. LocalDate ~
        // 그냥 LocalDateTime 쓰면됨.

        Calendar time = Calendar.getInstance();
        System.out.println(time.getTime());
        //Fri Dec 22 17:28:44 KST 2023


        // 특정한 숫자값은 get함수의 input값으로 주어 원하는 날짜 정보를 출력할 수 있게 해준다.
        System.out.println(time.get(1)); //년도
        System.out.println(time.get(2)+1); //전산상 월 //외우기가힘들군

        System.out.println(time.get(Calendar.MONTH)+1);
        System.out.println(time.get(Calendar.YEAR));
        System.out.println(time.get(Calendar.DAY_OF_MONTH)+"일");
        System.out.println(time.get(Calendar.DAY_OF_WEEK)+"요일"); //요일
        System.out.println(time.get(Calendar.HOUR_OF_DAY)+"시"); //17시
        System.out.println(time.get(Calendar.MINUTE)+"분"); //36
        System.out.println(time.get(Calendar.SECOND)+"초"); //25


        //Java.time 패키지 : local~ 클래스
        LocalTime presentTime = LocalTime.now();
        System.out.println(presentTime); // 17:41:02.405

        LocalDate presentDate = LocalDate.now();
        System.out.println(presentDate); //2023-12-22

        LocalDateTime thisTime = LocalDateTime.now();
        System.out.println(thisTime); //2023-12-22T17:42:18.167

    }
}
