package ch02.sec11;

public class VariableScopeExample {
    public static void main(String[] args) {
        int v1 = 15;
        int v2 = v1 -10;//fix
        if (v1 > 10) {
            //int v2 = v1 -10;
            int v3 = v1 + v2 + 5; //fix
            System.out.println("v3 = " + v3);//fix
        }
        //int v3 = v1 + v2 + 5; //v2 변수를 사용할 수없어서 에러남
    }
}
