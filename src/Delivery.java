import java.util.Scanner;

public class Delivery {

    static int delivery(int client) {


        if (client == 1)
            return 1;
        else {
            int minNum = client - 1;
            return client * delivery(minNum);
        }


    }
    public static void main (String[] args){

        System.out.println("Введите число клиентов: ");
        Scanner sc = new Scanner(System.in);
        int client = sc.nextInt();

        int countDel = delivery(client);
        System.out.println("Вариантов доставки " + countDel);
    }

}