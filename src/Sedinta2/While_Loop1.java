/**
 2. Scrie un program care afișează următoarele șiruri de numere, după citirea unei valori n de la tastatură:
 *
 * Șirul numerelor naturale până la n (inclusiv), începând cu 0, în ordine crescătoare.
 * Șirul numerelor impare până la n (inclusiv), începând cu 1, în ordine crescătoare.
 * Șirul numerelor pare de la n la 0 (inclusiv), în ordine descrescătoare.
 * Toate numerele multiplu de 5 până la n (inclusiv), începând cu 0, în ordine crescătoare.
 * Exemplu, pentru n == 10:
 *
 * Console
 * 1. 0 1 2 3 4 5 6 7 8 9 10
 * 2. 1 3 5 7 9
 * 3. 10 8 6 4 2 0
 * 4. 0 5 10
 **/

import java.util.Scanner;



public class While_Loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti un numar natural n: ");

        int n = sc.nextInt();
        int i = 0;

        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(" ");

        int j = 1;

        while (j <= n) {
            if (j % 2 == 0){
                System.out.print(" ");
            }
            else {
                System.out.print(j + " ");
            }
            j++;

        }
        System.out.println(" ");

        int k = n;

        while ( k == n || k >= 0){
            if (k % 2 == 0){
                System.out.print(k + " ");
            }
            else {
                System.out.print(" ");
            }
            k -= 2;
        }
        System.out.println(" ");

        int m = 0;

        while ( m <= n) {
            if (m % 5 == 0){
                System.out.print(m + " ");
            }
            else {
                System.out.print(" ");
            }
            m++;
        }
        sc.close();
    }
}
