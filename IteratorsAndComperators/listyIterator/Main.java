package ListyIterator;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        String command = input[0];
        ListyIterator listyIterator = new ListyIterator();
        while (!command.equals("END")) {

            switch (command) {
                case "Create":
                    String[] arrayParts = Arrays.copyOfRange(input, 1, input.length);
                    listyIterator = new ListyIterator(arrayParts);
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    listyIterator.print();
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "PrintAll":
                    listyIterator.printAll();
                    break;


            }
            input = scanner.nextLine().split("\\s+");
            command = input[0];
        }
    }
}
