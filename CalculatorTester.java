public class CalculatorTester {
    public static void main(String[] args){
        Calculator function1 = new Calculator();
        Calculator function2 = new Calculator();

        function1.setOperandOne(10.5);
        function1.setOperation("+");
        function1.setOperandTwo(5.2);
        function1.performOperation();
        function1.getResults();

        function2.setOperandOne(20.5);
        function2.setOperation("-");
        function2.setOperandTwo(5.7);
        function2.performOperation();
        function2.getResults();
    }
}
