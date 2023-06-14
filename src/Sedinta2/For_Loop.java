
/**
 * ====================== TEMA FOR ==================
 *  Implementează un algoritm care citește de la tastatură un număr natural n și un mesaj, care poate conține spații. Programul va afișa mesajul de n ori,
 *  fiecare afișare pe câte o linie nouă și însoțită de numărul curent, ca în exemplul următor:
 *
 *  # INPUT:
 * 4
 * Programming is really fun!
 * # OUTPUT:
 * 1. Programming is really fun!
 * 2. Programming is really fun!
 * 3. Programming is really fun!
 * 4. Programming is really fun!
 **/

import java.util.Scanner;

public class For_Loop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti un mesaj m: ");
        String m = sc.nextLine();
        System.out.println("Introduceti un numar natural n: ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            System.out.println(i + "." + m);
        }
        if (n == 0) {
            System.out.println(" ");
        }
        if (n < 0) {
            System.out.println("n nu este un numar natural");
        }

        sc.close();
    }
}