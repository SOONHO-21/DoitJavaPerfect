package sec01_final.EX02;

abstract class Aminal{
    abstract void cry();
}

class Cat extends Aminal{
    void cry(){
        System.out.println("야옹");
    }
}
class Dog extends Aminal{
    void cry(){
        System.out.println("멍멍");
    }
}
public class FinalModifier_2 {
    public static void main(String[] args){
        Aminal aminal1 = new Cat();
        Aminal aminal2 = new Dog();

        aminal1.cry();
        aminal2.cry();
    }
}