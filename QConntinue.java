//Display all numbers enter by users except multiple of 10
import java.util.*;
public class QConntinue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("please enter your number");
            int n = sc.nextInt();

            if(n%10 == 0){
                continue;
            }
            System.out.println("number was"+ n);

        }while(true);
            
        
    }
}