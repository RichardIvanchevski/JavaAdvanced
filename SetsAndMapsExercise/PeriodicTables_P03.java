package SetsAndMapsExercise;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTables_P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> treeSet = new TreeSet<>();
        while (n-- > 0){
            String[] input = scanner.nextLine().split("\\s+");
            Collections.addAll(treeSet, input);
        }


        for (String chemical : treeSet) {
            System.out.print(chemical + " ");
        }


    }
}
