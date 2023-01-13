package speedRacing_P03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int carsToInput = Integer.parseInt(scanner.nextLine());

        Map<String , Car> carMap = new LinkedHashMap<>();

        while (carsToInput-- > 0){
            String[] commandParts = scanner.nextLine().split("\\s+");
            String carName = commandParts[0];
            double fuelAmount = Double.parseDouble(commandParts[1]);
            double fuelCost = Double.parseDouble(commandParts[2]);
            Car car = new Car(carName,fuelAmount,fuelCost);
            carMap.put(carName,car);
        }
        String command = scanner.nextLine();
        while (!command.equals("End")){
            String[] commandParts = command.split("\\s+");
            Car carToDrive = carMap.get(commandParts[1]);
            int distance = Integer.parseInt(commandParts[2]);
            carToDrive.drive(distance);



            command = scanner.nextLine();
        }
       carMap.values().forEach(System.out::print);
    }
}

