import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       int a = 0;
        int sum = 0;
        for (int i = 1; i <=5 ;i++) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter  number" +i+":");
              a = sc.nextInt();
              sum+=a;





        }

        System.out.println("The sum is: "+sum);

    }


}