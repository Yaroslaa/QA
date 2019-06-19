import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Number a:");
        int a = scanner.nextInt();
        System.out.println("Number b:");
        int b = scanner.nextInt();
        System.out.println("Choose operation +, -, *,/:");
        String operation = new String ();
        operation = scanner.next();
        switch (operation){
            case "+":
                System.out.println(calculator.Sum(a,b));
                break;
            case "-":
                System.out.println(calculator.Substraction(a,b));
                break;
            case "*":
                calculator.Multiplication(a,b);
                break;
            case "/":
                calculator.Division(a,b);
                break;
        }

    }

    public int Sum(int a,int b){
        System.out.println("Result  "+ (a+b));
        return (a+b);
    }
    public int Substraction(int a,int b){
        System.out.println("Result  "+ (a-b));
        return (a-b);
    }
    public int Multiplication(int a,int b){
        System.out.println("Result  "+ (a*b));
        return (a*b);
    }
    public double Division(double a,double b){
        System.out.println("Result  "+ (a/b));
        return (a/b);
    }
}
