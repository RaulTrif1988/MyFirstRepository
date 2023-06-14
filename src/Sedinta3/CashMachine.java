/**
 3.
 * Realizează un modul simplu pentru un bancomat, care să asiste utilizatorul în efectuarea unei operațiuni de eliberare numerar. Se vor implementa următoarele etape:
 * Verificarea codului PIN: Se citește 1 număr de la tastatură reprezentând pinClient - codul PIN introdus de client și se compară cu un număr stocat intern (i.e. într-o variabilă) de aplicație pinCorect - codul PIN real al cardului. În cazul în care cele două numere coincid, se va afișa mesajul PIN corect și se va trece la etapa următoare.
 * Altfel, bancomatul va afișa mesajul PIN gresit și se va termina.
 * Verificarea sumei cerute: În cazul în care PIN-ul introdus este corect, se va trece la etapa următoare. În cadrul acesteia, se citește de la tastatură 1 număr întreg, suma, ce reprezintă suma pe care clientul dorește să o scoată de la bancomat. În cadrul algoritmului trebuie să existe și soldCont, ce reprezintă suma totală pe care clientul o are în cont. Aceasta poate fi stocată intern (i.e. într-o variabilă). Programul va afișa mesajul Tranzactie in curs de procesare dacă suma dorită nu depășește fondurile și apoi se trece la pasul următor. În caz contrar, programul va afișa mesajul „Fonduri insuficiente pentru realizarea tranzactiei“ și apoi se va termina.
 * Afișarea sumei rămase: Dacă operațiunea s-a realizat cu succes, utilizatorul este întrebat dacă dorește afișarea sumei de bani rămase în cont: Doriti afisarea noii balante a contului curent? Raspundeti cu 0 (NU) sau 1 (DA). În caz afirmativ, se va afișa un mesaj relevant cu noua valoare. Altfel, programul va afișa un mesaj de rămas bun (ex: Multumim pentru ca ati ales Banca DevBank) și se va termina.
 **/

import java.util.Scanner;

public class CashMachine{
    public static void PinVerify(){
        int pinCorrect = 1234;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please introduce your PIN: ");
        int pinClient= sc.nextInt();

        if(pinCorrect == pinClient){
            System.out.println("PIN is correct");
        }
        else{
            System.out.println("PIN is false");
            System.exit(0);
        }

    }
    public static int WithdrawMoneyandShowSaldo(){
        int AccountBalance = 5000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the amount of money you want to withdraw: ");
        int WithdrawnMoney = sc.nextInt();

        if (WithdrawnMoney <= AccountBalance){
            System.out.println("Transaction is in process");
        }
        else{
            System.out.println("You don't have enough money");
            System.exit(0);
        }

        System.out.println("So you want to know you new saldo? Please enter 0 (No) or 1 (Yes): ");
        int answer = sc.nextInt();

        if(answer == 1){
            System.out.println("You have " + (AccountBalance - WithdrawnMoney) + " Euro on your bank account");
        }
        if(answer == 0){
            System.out.println("Thank you that you used DevBank");

        }
        return (AccountBalance - WithdrawnMoney);

    }
    public static void main(String[] args) {

        PinVerify();
        System.out.println(WithdrawMoneyandShowSaldo());

    }

}