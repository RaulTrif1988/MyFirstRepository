package Sedinta4;


import static Sedinta4.Limbi.SPANIOLA;


        /**
         * Tema OOP:
         * 1.1. Alege 2 obiecte de tipuri diferite și proiectează clasele aferente,
         * folosind noțiunile studiate în acest capitol. Fiecare tip de obiect (i.e. clasă) trebuie să conțină:
         * Reprezentarea stării: minim 5 câmpuri (la alegere).
         * Reprezentarea comportamentului: minim 3 acțiuni la alegere, care să fie corelate logic cu tipul obiectului.
         * Pentru fiecare clasă, definește încă o metodă, printObjectState(), care afișează starea internă a obiectelor:
         * Concret, metoda va afișa toate câmpurile obiectului, pe rând, într-un mod plăcut
         * (i.e. alături de un mesaj semnificativ pentru fiecare câmp).
         */



        //pentru formatarea codului folosim combinatia de taste: ctrl + alt + l (concomitent, in acelasi timp)
public class Tara {

    private int populatie;
    private double PIB;
    private double hdi;
    private Limbi limba;
    private String numeTara;
    private String statusTara; //camp static al clasei -> toate obiectele vor avea aceeasi valoare pentru acest camp

    public Tara(double hdi, String numeTara) {
        this.hdi = hdi;
        this.numeTara = numeTara;
        this.statusTara = " ";
    }

    public Tara(int populatie, double PIB, double hdi, Limbi limba, String numeTara) {
        this.populatie = populatie;
        this.PIB = PIB;
        this.hdi = hdi;
        this.limba = limba;
        this.numeTara = numeTara;
    }

    public int getPopulatie() {
        return populatie;
    }

    public void setPopulatie(int populatie) {
        this.populatie = populatie;
    }

    public double getPIB() {
        return PIB;
    }

    public void setPIB(double PIB) {
        this.PIB = PIB;
    }

    public double getHdi() {
        return hdi;
    }

    public void setHdi(double hdi) {
        this.hdi = hdi;
    }

    public Limbi getLimba() {
        return limba;
    }

    public void setLimba(Limbi limba) {
        this.limba = limba;
    }

    public String getNumeTara() {
        return numeTara;
    }

    public void setNumeTara(String numeTara) {
        this.numeTara = numeTara;
    }

    public String getStatusTara() {
        return statusTara;
    }

    public String updateStatus() {
        if (this.hdi >= 8.5) {
            setStatusTara("High developed");
        } else {
            setStatusTara("Not enough developed");
        }
        return this.numeTara;
    }
    public String updateStatusByLanguage() {
        if (this.limba.equals(Limbi.GERMANA)) {
            setStatusTara("ULTRA HIGH DEVELOPED");
        } else if (this.limba.equals(Limbi.ITALIANA) || this.limba.equals(SPANIOLA)) {
            setStatusTara("Medium developed");
        } else if (this.limba.equals(Limbi.ROMANA) || this.limba.equals(Limbi.ENGLEZA)) {
            setStatusTara("Normal developed");
        } else {
            setStatusTara("Volatile development");
        }
        return this.statusTara;
    }

    public void setStatusTara(String statusTara) {
        this.statusTara = statusTara;
    }

    @Override
    public String toString() {
        return this.numeTara + " " + this.hdi + " " + this.statusTara;
    }

    //cream o metoda prin care afisam valorile campurilor/atributelor obiectului la consola
    public void printObjectState() {
//        System.out.print("Apel metoda printObjectState() ");
        System.out.println("Nume tara: " + this.numeTara + "\n" + "Valoare HDI: " + this.hdi + "\n" + "Statusul tarii:  " + this.statusTara);
    }

}

class MainTara {
    public static void main(String[] args) {

        //obiectul tara de tipul clasei Tara
        //metodele se apeleaza mereu pe obiect
        //doar metodele statice se vor pe clasa, nu pe obiect
        Tara tara = new Tara(9.6, "Zimbabwe");
        tara.printObjectState();
        tara.updateStatus();
        tara.printObjectState();

        tara.setHdi(6.5);
        tara.updateStatus();
        System.out.println("Noul status: " + tara.getStatusTara());
        System.out.println("Numele tarii este: " + tara.getNumeTara());

        Oras oras = new Oras(8.6, "ROMANIA", 20000);
        System.out.println("Oras afisat: " + oras);
        oras.updateStatus();
        System.out.println("Oras afisat: " + oras);

        Tara tara2 = new Tara(2000000000, 8999999.2134 ,8.5, Limbi.ENGLEZA, "ARGENTINA");
        System.out.println(tara2.getLimba());
        tara2.updateStatusByLanguage();
        System.out.println("Status tara2: " + tara2.getStatusTara());


    }
}
