public class ConditonalStatment {
    public static void main(String[] args) {
     int salery = 25400;
//     if(salery >10000)
//    {
//        salery = salery + 2000;
//    } else {
//         salery = salery + 1000;
//     }
//        System.out.println(salery);
   //multiple if-else
        if (salery > 1000){
            salery  = salery + 1000;
        }
        else if (salery > 20000){
            salery += 1000;
        }
        System.out.println(salery);

    }
        }
