package Sedinta4;

public class Oras extends Tara {
    private static final String numeOras = "BUCURESTI";
    private int numarConstructii;

    private String statusOras;

    public Oras(double hdi, String numeTara, int numarConstructii) {
        super(hdi, numeTara);
        this.numarConstructii = numarConstructii;
        this.statusOras = "UNKNOWN";
    }
    @Override
    public String updateStatus() {
        if(numeOras.equals("BUCURESTI")){
            this.statusOras = "High developed";
        }
        else{
            this.statusOras = "Not developed";
        }
        return this.statusOras;
    }

    //     return super.toString() ne va afisa campurile din clasa Tara, din clasa parinte
    @Override
    public String toString() {
        return super.toString() + numeOras + " " + this.numarConstructii + " " +  this.statusOras;
    }
}
