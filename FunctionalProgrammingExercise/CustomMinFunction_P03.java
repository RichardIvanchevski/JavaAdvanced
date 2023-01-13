package FunctionalProgrammingExercise;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomMinFunction_P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        Function <List<Integer>,Integer> function = e -> {
            int min = Integer.MAX_VALUE;
            for (Integer num : list) {
                if (num < min){
                    min = num;
                }
            }
            return min;
        };

        int min = function.apply(list);
        System.out.println(min);
    }
}
