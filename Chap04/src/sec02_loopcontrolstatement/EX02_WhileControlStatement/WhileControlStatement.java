package sec02_loopcontrolstatement.EX02_WhileControlStatement;

public class WhileControlStatement {
    public static void main(String[] args){
        int a = 0;
        while (a < 10){
            System.out.print(a + " ");
            a++;
        }
        System.out.println();

        int c = 0;
        while (true){
            if(c>10)
                break;
            System.out.print(c + " ");
            c++;
        }
    }
}