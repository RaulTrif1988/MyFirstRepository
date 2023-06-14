package Sedinta6;

public class GenericPackage {

    private final String uniqueID = "12345";
    private double weight;
    private String packageName;
    private static String courierName;


    public String getUniqueID() {
        return uniqueID;
    }

    public static String getCourierName() {
        return GenericPackage.courierName;
    }

    public static void setCourierName(String courierName) {
        GenericPackage.courierName = courierName;
    }


    public String getPackageName() {
        return packageName;
    }

    public GenericPackage(String packageName, String courierName) {
        this.packageName = packageName;
        GenericPackage.courierName = courierName;
    }
    public GenericPackage(double weight, String packageName, String courierName){
        this.weight = weight;
        this.packageName = packageName;
        GenericPackage.courierName = courierName;
    }

    public double addItem (double itemWeight){
        return this.weight += itemWeight;
    }

    public boolean containsOnlyDigits(){
        for(int i = 0; i < this.uniqueID.length(); i++){
        if(!Character.isDigit(this.uniqueID.charAt(i))){
            return false;
        }
    }
        return true;
}

    //TEMA: sa se creeze metoda care verifica daca string-ul contine litere, daca da atunci intoarcem false
    public boolean containsOnlyDigitsSecond() {

        for (int i = 0; i < this.uniqueID.length(); i++) {
            if (Character.isLetter(this.uniqueID.charAt(i))) { //verificam daca elementul de pe pozitia i din string NU ESTE CIFRA, atunci intoarcem false
                return false;
            }
        }
        return true;
    }

    //numar impar: numarul care prin impartire la 2 iti da un rest diferit de 0
    //numar par: numarul care prin impartire la 2 iti da restul 0
   // numar prim: numarul care care se imparte exact (nu are rest) doar la 1 si la el insusi: 1,3,5,7,13,17,19
    public boolean numberOffOddDigitsMultiplyOfThree() {

        int contor = 0;
        int uniqueID = Integer.parseInt(this.uniqueID); //Integer este o clasa wrapper pentru valorile intregi
        //parseInt este o metoda ce converteste, transforma un string intr-un integer (valoare intreaga)
        while (uniqueID != 0) {
            int lastDigit = uniqueID % 10; //extragem ultima cifra
            if (lastDigit % 2 != 0) {
                contor++;
            }
            uniqueID /= 10;
        }
        return contor % 3 == 0;
    }

    public boolean sumDigits() {

        int sum = 0;
        int uniqueID = Integer.parseInt(this.uniqueID); //Integer este o clasa wrapper pentru valorile intregi
        //parseInt este o metoda ce converteste, transforma un string intr-un integer (valoare intreaga)
        while (uniqueID != 0) {
            int lastDigit = uniqueID % 10; //extragem ultima cifra
            sum += lastDigit;
            uniqueID /= 10;
        }
        return sum % 4 == 0;
    }
    public boolean difference() {
        for(int i =0; i<this.uniqueID.length()-1; i++ ){
            if((this.uniqueID.charAt(i) - this.uniqueID.charAt(i+1)) > 5){
                return false;
            }
        }
        return true;
    }

}
