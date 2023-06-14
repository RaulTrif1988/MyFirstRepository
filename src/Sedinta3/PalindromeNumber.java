package sedinta03;


/** 1.
 * Un număr palindrom este un număr care este egal cu simetricul său.
 * Câteva exemple sunt: toate numerele de o cifră, 11, 222, 13431, 185581 etc.
 * Pornind de la algoritmul implementat anterior,
 * scrie un algoritm care să determine dacă un număr este palindrom sau nu. De exemplu:
 * // INPUT -> OUTPUT
 * 123 -> Nu este palindrom.
 * 12321 -> Palindrom!
 * 2222 -> Palindrom!
 * 1231-> Nu este palindrom.
 * Tips
 */
import java.util.Scanner;
public class PalindromeNumber{

    public static void main(String [] args){
        String option = " ";
        boolean status = true;

        while (status) {

            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();


            int originalNumber = number;
        int reversedNumber = 0;

        while(number != 0){
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
        }


        if(originalNumber == reversedNumber){
            System.out.println(originalNumber + " -> " + "Palindrom!");
        }
        else{
            System.out.println(originalNumber + " -> " + "Nu este palindrom.");
        }

            System.out.println("Introduceti cancel daca doriti sa inchidei programul");
            option = sc.next();

            if(option.equalsIgnoreCase("cancel")){ //cancel, Cancel, caNceL
                status = false;
                sc.close();
    }

}
    }
}