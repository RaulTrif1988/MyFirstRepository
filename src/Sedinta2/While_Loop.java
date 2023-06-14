/**
 *    ==========================  TEMA WHILE ===============
 *
 * 1. Completează codul următor cu o singură instrucțiune (la alegere) astfel încât programul să nu mai cicleze la infinit:
 *
 * Scanner sc = new Scanner(System.in);
 * int numberOfIterations = sc.nextInt();
 *
 * while (numberOfIterations < 1000) {
 *   System.out.println("This will never end...");
 * }
 **/


import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti numberOfIterations: ");
        int numberOfIterations = sc.nextInt();


        while (numberOfIterations < 1000) {
            System.out.println("This will never end...");
            numberOfIterations++;


        }
        sc.close();
    }
}
