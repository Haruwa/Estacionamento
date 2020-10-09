public class Vehicle {

    private String plate;
    private String color;
    private String model;

    Vehicle(String plate, String color, String model) {
        this.plate = plate;
        this.color = color;
        this.model = model;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getPlate() {
        return this.plate;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

}