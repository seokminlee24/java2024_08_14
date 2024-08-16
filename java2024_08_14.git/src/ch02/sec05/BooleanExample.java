package ch02.sec05;

public class BooleanExample {
    public static void main(String[] args) {
        int money = 900;
        int busCard =  1000;
        if (money > busCard) {
            System.out.println("타고 갑니다");
        }else {
            System.out.println("돈이 부족합니다");
        }
        int x = 10;
        boolean result1 = (x == 20); //x의 값은 20인가?
        boolean result2 = (x != 20); //x의 값은 20이 아닌가?
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
