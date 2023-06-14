package sedinta03;


import java.util.Scanner;

/**
 * Scrie un algoritm care citește de la tastatură un număr n și afișează toate numerele prime până la n (inclusiv),
 * începând cu 2. Modularizează implementarea algoritmului folosind două metode:
 * una care indică dacă un număr este prim sau nu
 * Hint: returnează true dacă numărul este prim și false altfel
 * alta care afișează toate numerele prime până la n (primit ca argument la apel)
 * Hint: metoda va apela funcția definită anterior
 */

public class PrimeNumbers {

    // 3 / 2 = 1 (catul)
    // 3 % 2 - restul impartirii (1)


    public static boolean isPrime(int verifcareNumar) {
        for (int i = 2; i <= verifcareNumar / 2; i++) {
            //check condition for prime number
            if (verifcareNumar % i == 0) { //verificam daca restul impartirii cu rest este 0
                //daca este 0 atunci se imparte exact la un numar, deci nu este prim
                return false; //nu este prim numarul n
            }
        }
        return true;
    }
    public static void displayPrimeNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int m = sc.nextInt();
        for (int i = 2; i <= m; i++) {
            if (isPrime(i)) {
                System.out.println(i + " este numar prim");
            }
            else{
                System.out.println(i + " nu este numar prim");
            }
        }
    }

    public static void main(String[] args) {
        displayPrimeNumbers();

        System.out.println(5 / 2); // catul -> 2
        System.out.println(5 % 2); // restul impartirii -> 1



    }


}
