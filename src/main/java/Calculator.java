public class Calculator {
    private int num1;
    private int num2;


    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int addNumbers() {
        return num2 + num1;
    }

    public int subtractNumbers(){
        return num1 - num2;
    }

    public int multiplyNumbers(){
        return num2 * num1;
    }

    public int divideNumbers(){
        return num1 / num2;
    }
}

