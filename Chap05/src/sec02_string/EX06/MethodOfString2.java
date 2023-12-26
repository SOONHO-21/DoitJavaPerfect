package sec02_string.EX06;

import java.util.Arrays;

public class MethodOfString2 {
    public static void main(String[] args) {
        String str1 = "Java Study";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

        System.out.println(str1.replace("Study", "공부"));
        System.out.println(str1.substring(0, 5));

        String[] strArray = "abc/def-ghi jkl".split("/|-| "); //'/'또는 '-'또는 ''(공백)으로
                                                                    //구분된 문자열 배열 반환
        System.out.println(Arrays.toString(strArray));

        System.out.println("  abc  ".trim());   //공백

        String str2 = new String("JAVA");
        String str3 = new String("Java");
        String str4 = new String("java");

        System.out.println(str2 == str3);   //번지수 비교
        System.out.println(str2.equals(str3));  //대소문자 구분
        System.out.println(str2.equalsIgnoreCase(str3));    //대소문자 무시
        System.out.println(str2.equalsIgnoreCase(str4));
    }
}