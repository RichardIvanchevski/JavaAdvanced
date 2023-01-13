package SetsAndMapsExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements_P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] sizes = scanner.nextLine().split("\\s+");
        int firstSetSize = Integer.parseInt(sizes[0]);
        int secondSetSize = Integer.parseInt(sizes[1]);
        Set<Integer> first = new LinkedHashSet<>();
        Set<Integer> second = new LinkedHashSet<>();
        while (firstSetSize-- > 0){
            int input = Integer.parseInt(scanner.nextLine());
            first.add(input);
        }
        while (secondSetSize-- > 0){
            int input = Integer.parseInt(scanner.nextLine());
            second.add(input);
        }

        first.retainAll(second);

        for (Integer integer : first) {
            System.out.print(integer + " ");
        }

    }
}
