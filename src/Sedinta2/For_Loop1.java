
/**
 * Scrie un program care afișează următoarele șiruri de numere, după citirea unei valori n de la tastatură. De această dată, folosește instrucțiunea iterativă for în implementare:
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

public class For_Loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti un numar natural n: ");

        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {

            System.out.print(i + " ");
        }
        System.out.println(" ");

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                continue;

            System.out.print(i + " ");
        }
        System.out.println(" ");

        for (int i = n; i >= 0 ; i -= 2) {
            if (i % 2 != 0)
                continue;

            System.out.print(i + " ");
        }
        System.out.println(" ");

        for (int i = 0; i <= n ; i++) {
            if (i % 5 != 0)
                continue;

            System.out.print(i + " ");
        }
        sc.close();
    }
}