import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers and the operator to calculate: ");
        System.out.println("Enter 1st number: ");
        double num1 = input.nextDouble();
        System.out.println("Enter an operator: ");
        String operator = input.next();
        System.out.println("Enter 2nd number: ");
        double num2 = input.nextDouble();
        System.out.println("Result: "+ calculate(num1, num2, operator));
    }

    public static double calculate(double num1, double num2, String operator){
        if (operator == "+" || operator == "plus"){
            return sum(num1, num2);
        } else if (operator == "-" || operator == "minus") {
            return difference(num1, num2);
        } else if (operator == "*" || operator == "multiply") {
            return multiplication(num1, num2);
        } else {
            return division(num1, num2);
        }
    }

    //sum function
    private static double sum(double num1, double num2) {
        return num1+num2;
    }

    //difference function
    private static double difference(double num1, double num2) {
        return num1-num2;
    }

    //multiplication function
    private static double multiplication(double num1, double num2) {
        return num1*num2;
    }

    //division
    private static double division(double num1, double num2) {
        return num1/num2;
    }


}
