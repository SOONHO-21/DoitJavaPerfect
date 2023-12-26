package sec02_loopcontrolstatement.EX01_ForControlStatement;

public class ForControlStatement {
    public static void main(String[] args){
        for(int i=0; ; i++){
            if(i>10)
                break;
            System.out.print(i + " ");
        }
        System.out.println("루프문 탈출");
    }
}