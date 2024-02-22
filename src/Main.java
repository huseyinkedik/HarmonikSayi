import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        double islem = 0;
        Scanner input = new Scanner(System.in);

        //Kullanıcı girişi beklenir.
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();

        //Döngü kullanılarak işlem yaptırılır.
        for (int i = 1; i <= number; i++) {
            islem += 1.0 / i;
        }
        System.out.println("Sonuç: " + islem);
    }
}