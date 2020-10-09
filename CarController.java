public class CarController {
    private Car car;
    private CarView view;

    public CarController(Car car, CarView view) {
        this.car = car;
        this.view = view;        
    }

    public void updateView(){
        view.printCar(car.getPlate(), car.getModel(), car.getColor(), car.getQtyDoors());
    }
}
