package sec01_selelctcontrolstatement.EX01_IfControlStatement;

public class IfControlStatement {
    public static void main(String[] args){
        int value1 = 5;
        if(value1 >3)
            System.out.println("실행 1");
        if(value1 <5)
            System.out.println("실행 2");

        boolean bool1 = true;
        boolean bool2 = false;
        if(bool1)
            System.out.println("실행 3");
        if(bool2)
            System.out.println("실행 4");

        int value2 = 5;
        if(value2 > 3)
            System.out.println("실행 5");
        else
            System.out.println("실행 6");

        System.out.println((value2 > 3) ? "실행 5" : "실행 6");
        System.out.println();

        int value3 = 85;
        if(value3 >= 70 && value3 < 80)
            System.out.println("C 학점");
        else if(value3 >= 80 && value3 < 90)
            System.out.println("B 학점");
        else if(value3 >= 90)
            System.out.println("A 학점");
        else
            System.out.println("F 학점");
    }
}
