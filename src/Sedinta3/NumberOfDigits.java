package sedinta03;

import java.util.Scanner;

public class NumberOfDigits {


    public static int numberDigits(int n) {
        int nrDigits = 0;
        int current = n;
        while (n > 0) {
            n /= 10; //taiem o cifra din numarul nostru
            nrDigits++; //crestem numarul de cifre pe c
        }
        System.out.println("Number " + current + " has " + nrDigits + " digits");
        return nrDigits;
    }

    public static void displayNoDigits() {

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numberDigits(n));

    }

    public static void main(String[] args) {
        displayNoDigits();
    }
}
