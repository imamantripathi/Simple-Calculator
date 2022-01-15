import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number1 = 0;
        int Number2 = 0;
        System.out.println("Enter the Operation, you want to do(+, -, * or /)");
        char choice = sc.next().charAt(0);
        switch (choice) {
            case '+':
                System.out.print("Enter the Value Of Number1:");
                Number1 = sc.nextInt();
                System.out.println("");
                System.out.print("Enter the Value Of Number2:");
                Number2 = sc.nextInt();
                System.out.println("");
                System.out.println(Number1 + " + " + Number2 + " = " + (Number1 + Number2));
                break;
            case '*':
                System.out.print("Enter the Value Of Number1:");
                Number1 = sc.nextInt();
                System.out.println("");
                System.out.print("Enter the Value Of Number2:");
                Number2 = sc.nextInt();
                System.out.println("");
                System.out.println(Number1 + " * " + Number2 + " = " + (Number1 * Number2));
                break;
            case '-':
                System.out.print("Enter the Value Of Number1:");
                Number1 = sc.nextInt();
                System.out.println("");
                System.out.print("Enter the Value Of Number2:");
                Number2 = sc.nextInt();
                System.out.println("");
                System.out.println(Number1 + " - " + Number2 + " = " + (Number1 - Number2));
                break;
            case '/':
                System.out.print("Enter the Value Of Number1:");
                Number1 = sc.nextInt();
                System.out.println("");
                System.out.print("Enter the Value Of Number2:");
                Number2 = sc.nextInt();
                System.out.println("");
                System.out.println(Number1 + " / " + Number2 + " = " + (Number1 / Number2));
                break;
            default:System.out.println("Wrong Input !!!!");
                break;
        }
    }
}