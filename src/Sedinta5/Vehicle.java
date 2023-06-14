package Sedinta5;



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

public class Vehicle {
    private int horsePower;
    private String color;

    private double weight;

    private Brands brand;

    private double price;

    private String quality;






public Vehicle (int horsePower, String color){
    this.horsePower = horsePower;
    this.color = color;
    this.quality = "UNKNOWN";
}

    public Vehicle (int horsePower, String color, double weight, Brands brand, double price) {
        this.horsePower = horsePower;
        this.color = color;
        this.weight = weight;
        this.brand = brand;
        this.price = price;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getQuality() {
        return quality;
    }

    public String qualityByBrand(){
      if (this.brand.equals(Brands.Lamborghini)){
       setQuality("Extreme high quality");
        }

      else if (this.brand.equals(Brands.Tesla)){
            setQuality("Very high quality");
    }
      else if (this.brand.equals(Brands.BMW) || this.brand.equals(Brands.Mercedes)){
            setQuality("High quality");
      }
            else if (this.brand.equals(Brands.Dacia)){
              setQuality("Medium quality");
      }
            else {
                setQuality("No information about quality");
      }
            return this.quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.horsePower + " " + this.brand + " " + this.color + " " + this.weight + " " + this.price + " " + this.quality + " ";
    }
    public void printObjectState() {

        System.out.println("horsePower: " + this.horsePower + "\n" + "brand: " + this.brand + "\n" + "color:  " + this.color + "\n" + "weight: " + this.weight + "\n" + "price: " + this.price + "\n" + "quality:  " + this.quality);
    }

}

class MainVehicle{
    public static void main(String[] args){
        // avand tip de return String pentru o metoda atunci trebuie sa o apelam intr-un System.out.println()

        Vehicle vehicle = new Vehicle(60, "yellow", 1500, Brands.BMW, 50000);
        vehicle.printObjectState(); //metoda este void, nu avem nevoie pentru apel de System.out.println()
        // vehicle.qualityByBrand();
        System.out.println(vehicle.qualityByBrand());
        vehicle.printObjectState();
        vehicle.setBrand(Brands.Lamborghini);

        // daca metoda este void atunci nu avem nevoie de System.out.println()
        //  vehicle.qualityByBrand();
        // avand tip de return String pentru o metoda atunci trebuie sa o apelam intr-un System.out.println()
        System.out.println(vehicle.qualityByBrand());
        System.out.println("Quality new: " + vehicle.getQuality());
        Vehicle vehicle1 = new Vehicle(150, "Red");
        System.out.println("Vehicle Information: " + vehicle1);


        Car car = new Car(500, "Orange", 1000, Brands.Lamborghini, 300000, "Lamborghini Aventador", 1, "Medium");
        System.out.println("Car description: " + car);
        // avand tip de return String atunci trebuie sa apelam intr-un System.out.println();
        // car.sizeCarByNameCar() -> daca apelam asa atunci nu se afiseaza rezultatul la consola!
        System.out.println("SIZE CAR BY NAME CAR:");
//        car.sizeCarByNameCar();
        System.out.println(car.sizeCarByNameCar());
        System.out.println("Car description: " + car);
        System.out.println("sizeCarByNameCar: " + car.getSizeCar());
        car.setNameCar("BMWX5");
//        car.sizeCarByNameCar();trebuie sa folosim System.out.println();
        System.out.println(car.sizeCarByNameCar());
        System.out.println("sizeCarByNameCar: " + car.getSizeCar());


    }
}



