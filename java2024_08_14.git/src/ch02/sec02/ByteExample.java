package ch02.sec02;

public class ByteExample {
    public static void main(String[] args) {
        //바이트 변수 선언
        int val1 = -128;
        int val2 = -30;
        int val3 = 0;
        int val4 = 30;
        int val5 = 127;
        //int val6 = 128; 에러 허용범위 추가

        System.out.println(val1);//-128
        System.out.println(val2);//-30
        System.out.println(val3);//0
        System.out.println(val4);//30
        System.out.println(val5);//127
    }
}
