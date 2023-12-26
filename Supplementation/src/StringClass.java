import java.util.StringTokenizer;

public class StringClass {
    public static void main(String[] args){
        String str = "java";
        char a = str.charAt(3);

        for (int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();

        //compareTo() : 해당 문자열을 인수로 전달된 문자열과 사전 편찬 순으로 비교. 대소문자 구분
        //두 문자열이 같다면 0을 반환. 해당 문자열이 인수로 전달된 문자열보다 작으면 음수를, 크면 양수를 반환
        String str1 = "abcd";
        System.out.println(str1.compareTo("Abcd"));
        System.out.println(str1.compareTo("bcde"));
        //대소문자 무시
        System.out.println(str1.compareToIgnoreCase("Abcd"));   //0

        //concat() : 해당 문자열의 뒤에 인수로 전달된 문자열을 추가한 새로운 문자열을 반환
        System.out.println(str1.concat(" Class"));

        String str2 = new String("Oracle Java");
        System.out.println("원본 문자열 : " + str2);
        System.out.println(str2.indexOf('o'));
        System.out.println(str2.indexOf('a'));
        System.out.println(str2.indexOf("Java"));
        System.out.println("indexOf() 메소드 호출 후 원본 문자열 : " + str2);

        String data1 = "홍길동&이수홍,박연수";
        String[] arr1 = data1.split("&|,");
        for (String token : arr1)
            System.out.println(token);
        System.out.println();

        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer st = new StringTokenizer(data2, "/");
        String token;
        while (st.hasMoreElements()){
            token = st.nextToken();
            System.out.println(token);
        }
        System.out.println();
    }
}