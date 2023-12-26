package sec02.EX04;

public class MultiCatch_3 {
    //catch블록을 |로 하나로 통합
    public static void main(String[] args){
        try{
            System.out.println(3/1);
            int num = Integer.parseInt("10A");
        } catch(NumberFormatException | ArithmeticException e) {
            System.out.println("예외가 발생했습니다.");
        } finally {
            System.out.println("프로그램 종료");
        }
    }
}