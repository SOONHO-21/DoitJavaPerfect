package sec04_controlkeyword.EX01_BreakControlKeyword;

public class BreakControlKeyword {
    public static void main(String[] args){
        POS1: for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                if(j==2)
                    break POS1;
                System.out.println(i + ", " + j);
            }
        }

    }
}