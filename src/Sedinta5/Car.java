package Sedinta5;

public class Car extends Vehicle {

    public String nameCar;
    public int numberCar;
    public String sizeCar;


    public Car(int horsePower, String color, double weight, Brands brand, double price, String nameCar, int numberCar, String sizeCar) {
        super(horsePower, color, weight, brand, price);
        this.nameCar = nameCar;
        this.numberCar = numberCar;
        this.sizeCar = sizeCar;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public int getNumberCar() {
        return numberCar;
    }

    public void setNumberCar(int numberCar) {
        this.numberCar = numberCar;
    }

    public String getSizeCar() {
        return sizeCar;
    }

    public void setSizeCar(String sizeCar) {
        this.sizeCar = sizeCar;
    }


    public String sizeCarByNameCar(){
        if(nameCar.equals("BMWX5")){
            this.sizeCar = "Very big";
        }
        else { this.sizeCar = "No information available";
        }
        return this.sizeCar;
    }

    @Override
    public String toString (){
        return super.toString() + this.nameCar + " " + this.numberCar + " " + this.sizeCar;
    }
}



