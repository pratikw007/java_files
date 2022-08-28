import java.util.Scanner;
  import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
          //Q: Print Number from 1 to 5
//        System.out.println("Hello World+");
        /*
        Syntax Of Loops:
         for(initalized; condition; icrement/Decrement){

         //body
       */
//        for (int num = 0; num <= 5; num += 1){
//            System.out.println(num);
//        }
        // Q.1: Print a number from one to 20 which should be multiple o 2
//        for (int num = 0; num <= 20; num += 2){
//            System.out.println(num);
//        }

        //print a num from 1 to n
        Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for (int num = 1;num <= n; num++)                  {
                System.out.print(num +" ");
}
}
}