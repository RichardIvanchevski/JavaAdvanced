package SetsAndMapsExercise;

import java.sql.SQLOutput;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames_P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set <String> set = new LinkedHashSet<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0){
            String command = scanner.nextLine();
            set.add(command);
        }

        System.out.println(String.join(System.lineSeparator(), set));



    }
}
