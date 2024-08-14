package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        //변수 x,y값 저장, 변수값 대입
        int x = 3;
        int y = 5;

        //x와 y값의 출력
        System.out.println("x: " + x + ", y: " + y); //x: 3, y: 5

        //temp 선언, 변수 x 대입
        int temp = x;

        //변수 x는 y값 대입
        x = y;
        //변수 y는 temp값 대입
        y = temp;
        //x와 y값의 출력
        System.out.println("x: " + x + ", y: " + y); //x: 5, y: 3

    }
}
