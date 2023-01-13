package SetsAndMapsExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook_P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map <String , String > phones = new HashMap<>();
        String command = scanner.nextLine();

        while (!command.equals("search")){
            String[] splitCommand = command.split("-");
            phones.put(splitCommand[0],splitCommand[1]);
            command = scanner.nextLine();
        }
        command = scanner.nextLine();
        while (!command.equals("stop")){
            if (phones.containsKey(command)){
                System.out.println(command + " -> " + phones.get(command));
            }else {
                System.out.println("Contact " + command + " does not exist.");
            }


            command = scanner.nextLine();
        }




    }
}
