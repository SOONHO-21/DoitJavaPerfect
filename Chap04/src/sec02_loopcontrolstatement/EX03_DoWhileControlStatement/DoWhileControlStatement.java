package sec02_loopcontrolstatement.EX03_DoWhileControlStatement;

public class DoWhileControlStatement {
    public static void main(String[] args){
        int a = 0;
        do {
            System.out.print(a + " ");
            a++;
        }while (a<10);

        System.out.println();

        a = 10;
        do {
            System.out.print(a + " ");
            a--;
        }while (a>0);

        System.out.println();

        a = 0;
        do {
            System.out.print(a + " ");
            a++;
        }while (a<0);   //실행횟수 1번
    }
}