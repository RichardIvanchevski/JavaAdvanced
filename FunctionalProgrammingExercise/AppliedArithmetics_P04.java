package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AppliedArithmetics_P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        UnaryOperator<List<Integer>> add = numbers -> numbers.stream().map(number -> number + 1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> subtract = numbers -> numbers.stream().map(number -> number - 1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> multiply = numbers -> numbers.stream().map(number -> number * 2).collect(Collectors.toList());

        Consumer<List<Integer>> printer = numbers -> numbers.forEach(number -> System.out.print(number + " "));
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    numberList = add.apply(numberList);
                    break;
                case "subtract":
                    numberList = subtract.apply(numberList);
                    break;
                case "multiply":
                    numberList = multiply.apply(numberList);
                    break;
                case "print":
                    printer.accept(numberList);
                    System.out.println();
            }
        command = scanner.nextLine();
        }

    }
}
