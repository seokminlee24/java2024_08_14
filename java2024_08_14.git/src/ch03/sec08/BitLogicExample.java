package ch03.sec08;

public class BitLogicExample {
    public BitLogicExample() {
    }

    public static void main(String[] args) {
        System.out.println("45 & 25 = 9"); //45 & 25 = 9
        System.out.println("45 | 25 = 61"); //45 | 25 = 61
        System.out.println("45 ^ 25 = 52"); //45 ^ 25 = 52
        System.out.println("~45 = -46"); //~45 = -46
        System.out.println("-------------------------");
        byte receiveData = -120;
        int unsignedInt1 = receiveData & 255;
        System.out.println(unsignedInt1); //136
        int unsignedInt2 = Byte.toUnsignedInt(receiveData);
        System.out.println(unsignedInt2);//136
        int test = 136;
        byte btest = (byte)test;
        System.out.println(btest);//-120
    }
}
