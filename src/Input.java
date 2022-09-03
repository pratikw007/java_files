import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Array of Preemptive
        int[] arr = new int[5];
        arr[0] = 263;
        arr[1] = 24;
        arr[2] = 23;
        arr[3] = 2;
        arr[4] = 53;
        //[263,24,23,2,53,82]
        System.out.println(arr[2]);
        //input using for loops
        for (int i = 0;i < arr.length;i++){
            arr[i] = in.nextInt();
        }
        for (int num : arr){
            System.out.println(num + " "); // here num represented element of the array
        }
        System.out.println(arr[5]); //index out of bound error

    }
}
