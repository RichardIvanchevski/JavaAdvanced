package comparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        String command = scanner.nextLine();

        while (!command.equals("END")){
            String[] commandParts = command.split("\\s+");
            Person person = new Person(commandParts[0],Integer.parseInt(commandParts[1]),commandParts[2]);
            personList.add(person);
            command = scanner.nextLine();
        }
        int index = Integer.parseInt(scanner.nextLine());
        Person personToCompare = personList.get(index - 1);


        int equalPeople = 0;
        int notEqualPeople = 0;

        for (Person person : personList) {
            if (person.equals(personToCompare)){
                equalPeople++;
            }else {
                notEqualPeople++;
            }
        }
        if (equalPeople > 1){
            System.out.print(equalPeople + " " + notEqualPeople + " " + personList.size());
        }else {
            System.out.println("No matches");
        }
    }
}
