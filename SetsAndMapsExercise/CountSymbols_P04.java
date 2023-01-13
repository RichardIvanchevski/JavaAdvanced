package SetsAndMapsExercise;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols_P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map <Character , Integer> charCounter = new TreeMap<>();
        for (Character character: input.toCharArray()) {
            charCounter.putIfAbsent(character,0);
             int counter = charCounter.get(character);
             charCounter.put(character, counter + 1);
        }

        charCounter.entrySet().forEach(e ->{
            System.out.printf("%s: %d time/s%n",e.getKey(),e.getValue());
        });


    }
}
