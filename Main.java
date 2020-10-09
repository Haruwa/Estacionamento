import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str_a;
        int a;
        Scanner s_numCar = new Scanner(System.in);
        System.out.println("Quantos carros serão cadastrados?");
        str_a = s_numCar.nextLine();
        a = Integer.valueOf(str_a);

        for (int i = 0; i < a; i++) {

            String strd;
            String carattr[][] = new String[a][3];
            int qtdDoors;
            Scanner s_car = new Scanner(System.in);

            System.out.println("Por favor, digite a placa do carro: \n");
            carattr[i][0] = s_car.nextLine();
            System.out.println("Por favor, digite o modelo do carro: \n");
            carattr[i][1] = s_car.nextLine();
            System.out.println("Por favor, digite a cor do carro: \n");
            carattr[i][2] = s_car.nextLine();
            System.out.println("Por favor, digite o número de portas do carro: \n");
            strd = s_car.nextLine();
            qtdDoors = Integer.valueOf(strd);

            Car car = new Car(carattr[i][0], carattr[i][1], carattr[i][2], qtdDoors);
            CarView view = new CarView();
            CarController controller = new CarController(car, view);
            controller.updateView();
        }

    }
    }