package FunctionalProgrammingExercise;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude_P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Collections.reverse(list);
        int divisble = Integer.parseInt(scanner.nextLine());
        Predicate <Integer> predicate = e -> e % divisble != 0;

        list.stream().filter(predicate).forEach(e ->{
            System.out.print(e + " ");
        });
    }
}
