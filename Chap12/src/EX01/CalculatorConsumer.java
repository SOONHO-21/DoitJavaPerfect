package EX01;

public class CalculatorConsumer {
    public static void main(String[] args){
        CalculatorDummy calculatorDummy = new CalculatorDummy();
        calculatorDummy.setOprands(1, 2, 3);
        System.out.println(calculatorDummy.sum() + ", " + calculatorDummy.avg());
        
        int first = calculatorDummy.first;
        int second = calculatorDummy.second;
        int third = calculatorDummy.third;
        System.out.println(first + " " + second + " " + third);
    }
}