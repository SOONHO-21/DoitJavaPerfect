package sec02_string.EX04;

public class PlusOperationOfString {
    public static void main(String[] args) {
        String str1 = "안녕" + String.valueOf(1);
        System.out.println(str1);
        str1 += 1;  //String.valueOf 안 해줘도 1을 자동으로 문자열로 변환
        System.out.println(str1);
    }
}