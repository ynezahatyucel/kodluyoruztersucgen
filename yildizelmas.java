package Giris;
import java.util.Scanner;

public class yildizelmas {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int tempnumber=0, number;

        System.out.println("Bir Sayı Giriniz :");
        number = inp.nextInt();


        tempnumber = number;

        for(int i = 1;i < number; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= (2 * tempnumber - 3); z++) {
                System.out.print("*");
            }
            tempnumber--;
            System.out.println(" ");
        }
    }
}





