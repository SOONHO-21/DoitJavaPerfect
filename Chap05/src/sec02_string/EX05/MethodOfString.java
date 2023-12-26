package sec02_string.EX05;

import java.util.Arrays;

public class MethodOfString {
    public static void main(String[] args) {
        String str1 = "Hello Java";
        String str2 = "안녕하세요! 반갑습니다.";
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println();

        System.out.println(str1.charAt(1));
        System.out.println(str1.charAt(1));
        System.out.println();

        System.out.println(str1.indexOf('a'));
        System.out.println(str1.lastIndexOf('a'));  //뒤에서부터 a가 위치한 인덱스
        System.out.println(str1.indexOf('a',8));    //8번이 검색시작 위치
        System.out.println(str1.lastIndexOf('a', 8));//8번부터 a위치를 뒤로 검색
        System.out.println(str1.indexOf("Java"));
        System.out.println(str1.lastIndexOf("Java", 8));
        System.out.println();
        System.out.println(str2.indexOf("하세여")); //해당 문자열이 없는 경우 -1 리턴
        System.out.println(str2.lastIndexOf("하세여")); //해당 문자열이 없는 경우 -1 리턴
        System.out.println(str2.indexOf("하세요"));
        System.out.println(str2.lastIndexOf("하세요"));

        String str3 = String.valueOf(2.3);  //문자열로 변환
        String str4 = String.valueOf(false);
        String str5 = str3.concat(str4);    //문자열 연결
        System.out.println(str5);

        String str6 = "Hello Java";
        String str7 = "안녕하세요";

        byte[] array1 = str6.getBytes();    //문자열 -> byte[] 변환
        byte[] array2 = str7.getBytes();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        char[] array3 = str6.toCharArray(); //문자열 -> char[] 변환
        char[] array4 = str7.toCharArray();
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
    }
}