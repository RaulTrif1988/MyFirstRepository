/**
 2. Scrie o aplicație care afișează toate numerele palindrom dintr-un interval închis [left, right]. Capetele intervalului (i.e.left respectiv right) sunt 2 numere naturale care se citesc de la tastatură. Exemplu:
 *
 * // INPUT -> OUTPUT
 * 1000 2500 -> 1001 1111 1221 1331 1441 1551 1661 1771 1881 1991 2002 2112 2222 2332 2442
 *
 **/

import java.util.Scanner;

public class PalindromeNumbers {





    public static boolean isPalindrome(int n) {

        if (n < 0) {
            System.out.println("Number not valid");
            return false;
        }

        int reversedNumber = 0;



            int originalNumber = n;



            while (originalNumber > 0) {

                int remainder = originalNumber  % 10;
                reversedNumber = reversedNumber * 10 + remainder;
                originalNumber  = originalNumber  / 10;
            }
            if (n == reversedNumber) {
                return true;
            }

        return false;
    }


    public static void main(String[] args) {

        displayPalindromeNumbers();
    }


    public static void displayPalindromeNumbers () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please introduce number n of the left end of the intervall: ");
        int n = sc.nextInt();
        System.out.println("Please introduce number m of the right end of the intervall: ");
        int m = sc.nextInt();

        for (int i = n; i <= m; i++) {
            if (isPalindrome(i)) {
                System.out.println(i);
            }

        }


    }



}


