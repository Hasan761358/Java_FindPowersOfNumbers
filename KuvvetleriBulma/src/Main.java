import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;

        System.out.print("Bir sayı giriniz : ");
        number = scan.nextInt();
        for (int i = 1; i <= number; i *= 4) {

                System.out.println("4'un katları :" + i);
        }
        for (int i = 1; i <= number; i *= 5) {
            System.out.println("5'in katları :" + i);

        }
    }
}