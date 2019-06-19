import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println("Выберите операцию + или -, или *, или /");
        String operation = scanner.nextLine();
        operation = scanner.next();
        if ("+".equals(operation)) {
            System.out.println(calculator.Sum(a, b));

        } else if ("-".equals(operation)) {
            System.out.println(calculator.Sub(a, b));

        } else if ("*".equals(operation)) {
            System.out.println(calculator.Mul(a, b));

        } else if ("/".equals(operation)) {
            System.out.println(calculator.Div(a, b));

        }
    }

    public int Sum(int a, int b){
        return  (a+b);
    }
    public int Sub(int a, int b){
        return  (a-b);
    }
    public double Mul(int a, int b){
        return  (a*b);
    }
    public double Div(int a, int b){
        return  (a/b);
    }
}
