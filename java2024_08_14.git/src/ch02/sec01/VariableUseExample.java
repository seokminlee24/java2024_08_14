package ch02.sec01;

public class VariableUseExample {
    public static void main(String[] args) {
        // 시간과 분을 변수 선언, 3과 5 변수값 저장
        int hour = 3; 
        int minute = 5;
        
        System.out.println(hour + "시간 " + minute + "분");//3시간 5분

        // totalMinute 변수 선언, 3 * 60 + 5 연산의 값 저장
        int totalMinute = hour * 60 + minute;
        System.out.println(totalMinute + "분"); // 185분
    }
}
