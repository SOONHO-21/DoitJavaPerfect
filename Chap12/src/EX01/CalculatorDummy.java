package EX01;

public class CalculatorDummy implements Calculatable{
    int first, second, third;
    @Override
    public void setOprands(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public int sum() {
        return first + second + third;
    }

    @Override
    public int avg() {
        return (first + second + third) / 3;
    }
}