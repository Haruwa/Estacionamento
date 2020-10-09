public class MotoController {
    private Motorcycle motorcycle;
    private MotoView view;


    public MotoController(Motorcycle motorcycle, MotoView view){
        this.motorcycle = motorcycle;
        this.view = view;
    }

    public void updateView(){
        view.printMotorcycle(motorcycle.getPlate(), motorcycle.getModel(), motorcycle.getColor());
    }


}
