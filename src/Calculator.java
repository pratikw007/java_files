import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //take thr input User
        int ans = 0;
        while(true){
//            Take the operator as input
            System.out.println("Enter the operator: ");
         char op = in.next()  .trim().charAt(0);
            System.out.println();
     if (op=='+' || op=='-' || op=='/' || op=='%'){
         //input two number
         System.out.println("Enter Two Number: ");
         int num1 = in.nextInt();
         int num2 = in.nextInt();
         System.out.println();

         if (op == '+'){
             ans = num1 + num2;
         }
         if (op == '-'){
             ans = num1 - num2;
         }
         if (op == '*'){
             ans = num1 * num2;
         }
         if (op == '/'){
             ans = num1 / num2;
         }
         if (op == '%'){
             ans = num1 % num2;
         }
     }else if (op == 'x' || op == 'x'){
         break;
     }else{
         System.out.print("Inalid Operation");
     }
            System.out.println("The Ans is: "+ ans);
        }
    }

}
