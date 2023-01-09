package google;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Person> persons = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("End")){
            String[] commandParts = input.split("\\s+");
            String name = commandParts[0];
            if (!persons.containsKey(name)){
               Person person = new Person(name,new ArrayList<>(),new ArrayList<>(),new ArrayList<>());
               persons.put(name,person);
            }
            switch (commandParts[1]){
                case "company":
                    double salary = Double.parseDouble(commandParts[4]);
                    Company company = new Company(commandParts[2],commandParts[3],salary);
                    persons.get(name).setCompany(company);
                    break;
                case "pokemon":
                    Pokemon pokemon = new Pokemon(commandParts[2],commandParts[3]);
                    persons.get(name).getPokemonList().add(pokemon);
                    break;
                case "parents":
                    Parent parent = new Parent(commandParts[2],commandParts[3]);
                    persons.get(name).getParentList().add(parent);
                    break;
                case "children":
                    Children children = new Children(commandParts[2],commandParts[3]);
                    persons.get(name).getChildrenList().add(children);
                    break;
                case "car":
                    Car car = new Car(commandParts[2],commandParts[3]);
                    persons.get(name).setCar(car);
                    break;

            }
        input = scanner.nextLine();
        }

        persons.get(scanner.nextLine()).printFormat();
    }

}
