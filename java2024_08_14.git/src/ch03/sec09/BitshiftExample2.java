package ch03.sec09;

public class BitshiftExample2 {
    public static void main(String[] args) {
        int value = 772;

        //우측으로 3byte 이동하고 띁 1바이트만 읽기
        byte byte1 = (byte) (value >>> 24);
        int int1 = byte1 & 255;
        System.out.println("첫 번쨰 바이트 부호 없는 값 : " + int1);

        //우측으로 2byte 이동하고 띁 1바이트만 읽기
        byte byte2 = (byte) (value >>> 16);
        int int2 = byte2 & 255;
        System.out.println("두 번쨰 바이트 부호 없는 값 : " + int2);

        //우측으로 1byte 이동하고 띁 1바이트만 읽기
        byte byte3 = (byte) (value >>> 8);
        int int3 = byte3 & 255;
        System.out.println("3 번쨰 바이트 부호 없는 값 : " + int3);

        //끝 1바이트만 읽기
        byte byte4 = (byte) value;
        int int4 = byte4 & 255;
        System.out.println("두 번쨰 바이트 부호 없는 값 : " + int4);
    }
}

