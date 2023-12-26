package sec01_accessmodifier.EX03;

//import sec01_accessmodifier.EX03.pack.BB;
import sec01_accessmodifier.EX03.pack.CC;   //임포트는 가능

public class AA {
    public static void main(String[] args){
        AA a = new AA();
//        BB b = new BB();    //다른 패키지의 디폴트 클래스는 임포트 불가
//        CC c = new CC();    //임포트는 할 수 있으나 디폴트 생성자라서 호출 불가
    }
}