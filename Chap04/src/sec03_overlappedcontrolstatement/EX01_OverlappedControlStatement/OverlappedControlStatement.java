package sec03_overlappedcontrolstatement.EX01_OverlappedControlStatement;

public class OverlappedControlStatement {
    public static void main(String[] args){
        int value1 = 5;
        int value2 = 3;
        if(value1 > 5){
            if (value2 < 2)
                System.out.println("실행 1");
            else
                System.out.println("실행 2");
        }
        else
            System.out.println("실행 3");

        System.out.println();

        int value3 = 2;
        switch (value3){
            case 1:
                for (int i=0; i<10; i++)
                    System.out.print(i + " ");
                break;
            case 2:
                for (int i=10; i>0; i--)
                    System.out.print(i + " ");
                break;
        }
        System.out.println();

        for(int i=0; i<3; i++){
            for(int j=0; j<5; j++){
                System.out.println(i + " " + j);
                if(i==j)
                    System.out.println("i = j");
            }
        }
    }
}