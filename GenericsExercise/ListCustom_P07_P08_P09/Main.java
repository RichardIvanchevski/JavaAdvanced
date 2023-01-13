package ListCustom_P07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        CustomList<String> customList = new CustomList<>();

        while (!input.equals("END")) {
            String[] commandParts = input.split("\\s+");
            String command = commandParts[0];

            switch (command) {
                case "Add":
                    customList.add(commandParts[1]);
                    break;
                case "Remove":
                    int index = Integer.parseInt(commandParts[1]);
                    customList.remove(index);
                    break;
                case "Contains":
                    System.out.println(customList.contains(commandParts[1]));
                    break;
                case "Swap":
                    int firstIndex = Integer.parseInt(commandParts[1]);
                    int secondIndex = Integer.parseInt(commandParts[2]);
                    customList.swap(firstIndex,secondIndex);
                    break;
                case "Greater":
                    System.out.println(customList.greater(commandParts[1]));
                    break;
                case "Max":
                    System.out.println(customList.max());
                    break;
                case "Min":
                    System.out.println(customList.min());
                    break;
                case "Sort":
                    Sorter.sort(customList);
                    break;
                    case "Print":
                    customList.Print();
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
