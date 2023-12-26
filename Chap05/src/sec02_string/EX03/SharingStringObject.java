package sec02_string.EX03;

public class SharingStringObject {
    public static void main(String[] args) {
        String str1 = new String("안녕");
        String str2 = "안녕";
        String str3 = "안녕"; //문자열 리터럴로 생성할 때는 str2가 가리키는 객체를 공유
        String str4 = new String("안녕"); //새 객체 생성

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println(str4 == str1);
    }
}