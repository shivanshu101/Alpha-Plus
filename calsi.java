import java.util.*;
public class calsi {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int a = sc.nextInt();
    System.out.println("Enter the second number: ");
    int b = sc.nextInt();
    System.out.println("Enter the operator (+, -, *, /): ");
    char operater =  sc.next().charAt(0);
    switch (operater) {
        case'+': System.out.println(a+b);
                break;
        case'-': System.out.println(a-b);
                break;
        case'*': System.out.println(a*b);
                break;
        case'/' : System.out.println(a/b);
                break;
        case'%' : System.out.println(a%b);
                break;
            }
        }
    }
