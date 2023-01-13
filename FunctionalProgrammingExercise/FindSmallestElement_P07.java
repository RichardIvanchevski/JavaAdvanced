package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class FindSmallestElement_P07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Function<List<Integer> , Integer> function = e -> {
            int min = Integer.MAX_VALUE;
            for (Integer num : list) {
                if (num < min){
                    min = num;
                }
            }
            return min;
        };
        int min = function.apply(list);
        System.out.println(list.lastIndexOf(min));

    }
}
