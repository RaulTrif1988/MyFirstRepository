/**
 3. Scrie un algoritm care, la fiecare pas, așteaptă un număr natural la intrare și afișează dublul numărului introdus. Programul se va termina atunci când utilizatorul introduce un număr negativ. Exemplu de rulare:
 *
 * Console
 * Introduceti un numar natural pozitiv:
 * 5
 * Dublul sau este: 10
 * Introduceti un numar natural pozitiv:
 * 2
 * Dublul sau este: 4
 * Introduceti un numar natural pozitiv:
 * 15
 * Dublul sau este: 30
 * Introduceti un numar natural pozitiv:
 * -18
 * La revedere!
 *
 **/

import java.util.Scanner;

public class While_Loop2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti un numar natural pozitiv: ");
        int n = sc.nextInt();

        while(n >= 0) {
            System.out.println(2*n);
            System.out.print("Introduceti un numar natural pozitiv: ");
            n = sc.nextInt();


            if (n < 0){
                System.out.println("La revedere!");
                break;

            }
        }
    }
}
