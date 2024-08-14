package ch02.sec02;

public class IntegerLiteralExample {
    public static void main(String[] args) {
        int val1 = 0b1011; //2진수
        int val2 = 0206; //8진수
        int val3 = 365; //10진수
        int val4 = 0xB3; //16진수

        System.out.println(val1); //11
        System.out.println(val2); //134
        System.out.println(val3); //365
        System.out.println(val4); //179
    }
}
