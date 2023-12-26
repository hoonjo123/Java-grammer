package C16EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
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

        //임의로 특정시간을 만들어 내고 싶을 때 : of 메서드 사용
        LocalDate birthDay = LocalDate.of(1994,12,24);
        //일반 내장 메서드
        System.out.println(birthDay.getYear()); //1994
        System.out.println(birthDay.getMonth()); //December
        System.out.println(birthDay.getDayOfMonth()); //24


        LocalTime birthTime = LocalTime.of(10,02,19);
        System.out.println(birthTime.getHour());
        System.out.println(birthTime.getMinute());
        System.out.println(birthTime.getSecond());


        LocalDateTime birthDayTime = LocalDateTime.of(birthDay,birthTime);
        //크로노필드 enum타입사용 : 매개변수로 크로노필드를 받아 프로그램의 유연성이 향상된다.
        System.out.println(birthDayTime.get(ChronoField.YEAR)); //1994
        System.out.println(birthDayTime.get(ChronoField.MONTH_OF_YEAR)); //12

        //0은 오전, 1은 오후
        LocalTime nowtime = LocalTime.now();
        if(nowtime.get(ChronoField.AMPM_OF_DAY) == 0) {
            System.out.println("현재는 오전입니다.");
        }else{
            System.out.println("현재는 오후입니다.");
        }


        }

    }

