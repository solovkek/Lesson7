import java.util.Scanner;
 public class Bank {

    static void pay (int sum, int credit){


        if (sum+credit<0){
            System.out.println("Кредит частично погашен, доплатите ещё, введите недостающее значение");
            Scanner sc = new Scanner(System.in);

            int sc1 = sc.nextInt();

           pay (sc1, credit+sum);

        }
        else if(sum+credit==0){
            System.out.println("Кредит погашен");
        }
        else if(sum+credit>0){
            System.out.println("Кредит полностью погашен, ваша сдача " + (sum + credit));
        }
    }

     public static void main(String[] args) {

        pay( 1000, -1200);
     }





 }



