package ch03.sec09;

public class BitshiftExample {
    public static void main(String[] args) {
        int num1 =1;
        int result1 = num1 << 3; //왼쪽 이동
        int result2 = num1 * (int) Math.pow(2,3);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        int num2 = -8;
        int result3 = num2 >> 3; //오른쪽
        int result4 = num2 / (int) Math.pow(2,3);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
    }
}
