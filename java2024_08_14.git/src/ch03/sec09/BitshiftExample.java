package ch03.sec09;

public class BitshiftExample {
    public static void main(String[] args) {
        int num1 =1;
        int result1 = num1 << 3; //왼쪽 이동
        int result2 = num1 * (int) Math.pow(2,3);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
