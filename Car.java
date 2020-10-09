public class Car extends Vehicle {
    
    private int qtydoors;
    private static int totalCars = 0;

    Car(String placa, String model, String cor, int qtydoors) {
        super(placa, cor, model);
        this.qtydoors = qtydoors;
        totalCars++;
    }

    public static int getTotalCars() {
        return Car.totalCars;
    }

    public int getQtyDoors() {
        return qtydoors;
    }

    public void setQtyDoors(int qtydoors) {
        this.qtydoors = qtydoors;
    }
}