package ch03.sec02;

public class ArithmeticOperatorExample {
    public static void main(String[] args) {
        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10L;

        int result1 = v1 + v2; //모든 피연산자는 int 타입으로 자동변환
        System.out.println("result1 = " + result1); //14
        long result2 = v1 + v2 - v4; // 모든 피연산자는 long 타입으로 자동변환 후 연산
        System.out.println("result2 = " + result2); //4
        double result3 = (double)v1/v2; // double 타입 강제 변환 후 연산
        System.out.println("result3 = " + result3);//2.5

        int result4 = v1 % v2;
        System.out.println("result4 = " + result4);//2
    }
}
